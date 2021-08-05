package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelRequest extends StObject {
  
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the Channel. The ID must be unique within the region and it
  cannot be changed after a Channel is created.
    */
  var Id: string
  
  var Tags: js.UndefOr[typings.awsSdk.mediapackageMod.Tags] = js.undefined
}
object CreateChannelRequest {
  
  inline def apply(Id: string): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelRequest]
  }
  
  extension [Self <: CreateChannelRequest](x: Self) {
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
