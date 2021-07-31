package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointItemResponse extends StObject {
  
  /**
    * The custom message that's returned in the response as a result of processing the endpoint data.
    */
  var Message: js.UndefOr[string] = js.undefined
  
  /**
    * The status code that's returned in the response as a result of processing the endpoint data.
    */
  var StatusCode: js.UndefOr[integer] = js.undefined
}
object EndpointItemResponse {
  
  @scala.inline
  def apply(): EndpointItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointItemResponse]
  }
  
  @scala.inline
  implicit class EndpointItemResponseMutableBuilder[Self <: EndpointItemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setStatusCode(value: integer): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
  }
}
