package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InfrastructureConfigurationSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration.
    */
  var arn: js.UndefOr[ImageBuilderArn] = js.undefined
  
  /**
    * The date on which the infrastructure configuration was created.
    */
  var dateCreated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The date on which the infrastructure configuration was last updated.
    */
  var dateUpdated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the infrastructure configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the infrastructure configuration.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The tags attached to the image created by Image Builder.
    */
  var resourceTags: js.UndefOr[ResourceTagMap] = js.undefined
  
  /**
    * The tags of the infrastructure configuration.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object InfrastructureConfigurationSummary {
  
  inline def apply(): InfrastructureConfigurationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfrastructureConfigurationSummary]
  }
  
  extension [Self <: InfrastructureConfigurationSummary](x: Self) {
    
    inline def setArn(value: ImageBuilderArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDateCreated(value: DateTime): Self = StObject.set(x, "dateCreated", value.asInstanceOf[js.Any])
    
    inline def setDateCreatedUndefined: Self = StObject.set(x, "dateCreated", js.undefined)
    
    inline def setDateUpdated(value: DateTime): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setDateUpdatedUndefined: Self = StObject.set(x, "dateUpdated", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceTags(value: ResourceTagMap): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
