package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventItemResponse extends StObject {
  
  /**
    * A custom message that's returned in the response as a result of processing the event.
    */
  var Message: js.UndefOr[string] = js.undefined
  
  /**
    * The status code that's returned in the response as a result of processing the event. Possible values are: 202, for events that were accepted; and, 400, for events that weren't valid.
    */
  var StatusCode: js.UndefOr[integer] = js.undefined
}
object EventItemResponse {
  
  @scala.inline
  def apply(): EventItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventItemResponse]
  }
  
  @scala.inline
  implicit class EventItemResponseMutableBuilder[Self <: EventItemResponse] (val x: Self) extends AnyVal {
    
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
