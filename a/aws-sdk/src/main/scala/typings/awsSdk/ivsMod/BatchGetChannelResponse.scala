package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetChannelResponse extends StObject {
  
  var channels: js.UndefOr[Channels] = js.undefined
  
  /**
    * Each error object is related to a specific ARN in the request.
    */
  var errors: js.UndefOr[BatchErrors] = js.undefined
}
object BatchGetChannelResponse {
  
  @scala.inline
  def apply(): BatchGetChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetChannelResponse]
  }
  
  @scala.inline
  implicit class BatchGetChannelResponseMutableBuilder[Self <: BatchGetChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: Channels): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    @scala.inline
    def setChannelsVarargs(value: Channel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: BatchErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: BatchError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
