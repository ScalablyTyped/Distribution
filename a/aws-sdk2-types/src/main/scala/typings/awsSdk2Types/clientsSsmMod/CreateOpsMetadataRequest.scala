package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpsMetadataRequest extends StObject {
  
  /**
    * Metadata for a new Application Manager application. 
    */
  var Metadata: js.UndefOr[MetadataMap] = js.undefined
  
  /**
    * A resource ID for a new Application Manager application.
    */
  var ResourceId: OpsMetadataResourceId
  
  /**
    * Optional metadata that you assign to a resource. You can specify a maximum of five tags for an OpsMetadata object. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an OpsMetadata object to identify an environment or target Amazon Web Services Region. In this case, you could specify the following key-value pairs:    Key=Environment,Value=Production     Key=Region,Value=us-east-2   
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateOpsMetadataRequest {
  
  inline def apply(ResourceId: OpsMetadataResourceId): CreateOpsMetadataRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOpsMetadataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOpsMetadataRequest] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: MetadataMap): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setResourceId(value: OpsMetadataResourceId): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
