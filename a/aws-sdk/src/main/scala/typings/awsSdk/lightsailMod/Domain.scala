package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the domain recordset (e.g., arn:aws:lightsail:global:123456789101:Domain/824cede0-abc7-4f84-8dbc-12345EXAMPLE).
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date when the domain recordset was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  
  /**
    * An array of key-value pairs containing information about the domain entries.
    */
  var domainEntries: js.UndefOr[DomainEntryList] = js.undefined
  
  /**
    * The AWS Region and Availability Zones where the domain recordset was created.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * The name of the domain.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The resource type. 
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The support code. Include this code in your email to support when you have questions about an instance or another resource in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object Domain {
  
  inline def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  extension [Self <: Domain](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDomainEntries(value: DomainEntryList): Self = StObject.set(x, "domainEntries", value.asInstanceOf[js.Any])
    
    inline def setDomainEntriesUndefined: Self = StObject.set(x, "domainEntries", js.undefined)
    
    inline def setDomainEntriesVarargs(value: DomainEntry*): Self = StObject.set(x, "domainEntries", js.Array(value :_*))
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    inline def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
