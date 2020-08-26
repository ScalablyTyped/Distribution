package typings.awsSdkClientPinpointBrowser.typesSegmentsResponseMod

import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.UnmarshalledSegmentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentsResponse extends SegmentsResponse {
  /**
    * The list of segments.
    */
  @JSName("Item")
  var Item_UnmarshalledSegmentsResponse: js.UndefOr[js.Array[UnmarshalledSegmentResponse]] = js.native
}

object UnmarshalledSegmentsResponse {
  @scala.inline
  def apply(): UnmarshalledSegmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentsResponse]
  }
  @scala.inline
  implicit class UnmarshalledSegmentsResponseOps[Self <: UnmarshalledSegmentsResponse] (val x: Self) extends AnyVal {
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
    def setItemVarargs(value: UnmarshalledSegmentResponse*): Self = this.set("Item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[UnmarshalledSegmentResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
  }
  
}

