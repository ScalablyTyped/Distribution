package typings.awsSdkClientPinpointBrowser.typesEventsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesItemResponseMod.UnmarshalledItemResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEventsResponse extends EventsResponse {
  /**
    * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the key, and the item response as the value.
    *
    * If no item response exists, the value can also be one of the following: 202 (if the request was processed successfully) or 400 (if the payload was invalid, or required fields were missing).
    */
  @JSName("Results")
  var Results_UnmarshalledEventsResponse: js.UndefOr[StringDictionary[UnmarshalledItemResponse]] = js.native
}

object UnmarshalledEventsResponse {
  @scala.inline
  def apply(): UnmarshalledEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEventsResponse]
  }
  @scala.inline
  implicit class UnmarshalledEventsResponseOps[Self <: UnmarshalledEventsResponse] (val x: Self) extends AnyVal {
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
    def setResults(value: StringDictionary[UnmarshalledItemResponse]): Self = this.set("Results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("Results", js.undefined)
  }
  
}

