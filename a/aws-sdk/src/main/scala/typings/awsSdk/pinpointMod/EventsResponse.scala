package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsResponse extends StObject {
  
  /**
    * A map that contains a multipart response for each endpoint. For each item in this object, the endpoint ID is the key and the item response is the value. If no item response exists, the value can also be one of the following: 202, the request was processed successfully; or 400, the payload wasn't valid or required fields were missing.
    */
  var Results: js.UndefOr[MapOfItemResponse] = js.native
}
object EventsResponse {
  
  @scala.inline
  def apply(): EventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsResponse]
  }
  
  @scala.inline
  implicit class EventsResponseMutableBuilder[Self <: EventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: MapOfItemResponse): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
  }
}
