package typings.awsSdk.mediapackageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelRequest extends StObject {
  
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the Channel to update.
    */
  var Id: string
}
object UpdateChannelRequest {
  
  @scala.inline
  def apply(Id: string): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateChannelRequestMutableBuilder[Self <: UpdateChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
