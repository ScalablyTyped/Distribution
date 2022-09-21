package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The change description of the component.
    */
  var changeDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date that the component was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the component.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the component.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The owner of the component.
    */
  var owner: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The platform of the component.
    */
  var platform: js.UndefOr[Platform] = js.undefined
  
  /**
    * Describes the current status of the component.
    */
  var state: js.UndefOr[ComponentState] = js.undefined
  
  /**
    * The operating system (OS) version supported by the component. If the OS information is available, a prefix match is performed against the base image OS version during image recipe creation.
    */
  var supportedOsVersions: js.UndefOr[OsVersionList] = js.undefined
  
  /**
    * The tags associated with the component.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of the component denotes whether the component is used to build the image or only to test it.
    */
  var `type`: js.UndefOr[ComponentType] = js.undefined
  
  /**
    * The version of the component.
    */
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object ComponentSummary {
  
  inline def apply(): ComponentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentSummary]
  }
  
  extension [Self <: ComponentSummary](x: Self) {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setChangeDescription(value: NonEmptyString): Self = StObject.set(x, "changeDescription", value.asInstanceOf[js.Any])
    
    inline def setChangeDescriptionUndefined: Self = StObject.set(x, "changeDescription", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: NonEmptyString): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setState(value: ComponentState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportedOsVersions(value: OsVersionList): Self = StObject.set(x, "supportedOsVersions", value.asInstanceOf[js.Any])
    
    inline def setSupportedOsVersionsUndefined: Self = StObject.set(x, "supportedOsVersions", js.undefined)
    
    inline def setSupportedOsVersionsVarargs(value: OsVersion*): Self = StObject.set(x, "supportedOsVersions", js.Array(value*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: ComponentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
