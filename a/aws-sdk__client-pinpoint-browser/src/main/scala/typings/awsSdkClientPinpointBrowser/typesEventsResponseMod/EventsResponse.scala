package typings.awsSdkClientPinpointBrowser.typesEventsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesItemResponseMod.ItemResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsResponse extends js.Object {
  
  /**
    * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the key, and the item response as the value.
    *
    * If no item response exists, the value can also be one of the following: 202 (if the request was processed successfully) or 400 (if the payload was invalid, or required fields were missing).
    */
  var Results: js.UndefOr[StringDictionary[ItemResponse] | (Iterable[js.Tuple2[String, ItemResponse]])] = js.native
}
object EventsResponse {
  
  @scala.inline
  def apply(): EventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsResponse]
  }
  
  @scala.inline
  implicit class EventsResponseOps[Self <: EventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResults(value: StringDictionary[ItemResponse] | (Iterable[js.Tuple2[String, ItemResponse]])): Self = this.set("Results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("Results", js.undefined)
  }
}
