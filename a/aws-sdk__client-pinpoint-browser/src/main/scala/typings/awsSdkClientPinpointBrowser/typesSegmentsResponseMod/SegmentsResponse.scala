package typings.awsSdkClientPinpointBrowser.typesSegmentsResponseMod

import typings.awsSdkClientPinpointBrowser.typesSegmentResponseMod.SegmentResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentsResponse extends js.Object {
  /**
    * The list of segments.
    */
  var Item: js.UndefOr[js.Array[SegmentResponse] | Iterable[SegmentResponse]] = js.native
  /**
    * An identifier used to retrieve the next page of results. The token is null if no additional pages exist.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object SegmentsResponse {
  @scala.inline
  def apply(): SegmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentsResponse]
  }
  @scala.inline
  implicit class SegmentsResponseOps[Self <: SegmentsResponse] (val x: Self) extends AnyVal {
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
    def setItemVarargs(value: SegmentResponse*): Self = this.set("Item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[SegmentResponse] | Iterable[SegmentResponse]): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("Item", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

