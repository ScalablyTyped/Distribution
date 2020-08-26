package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentsResponse extends js.Object {
  /**
    * An array of responses, one for each segment that's associated with the application (Segments resource) or each version of a segment that's associated with the application (Segment Versions resource).
    */
  var Item: ListOfSegmentResponse = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object SegmentsResponse {
  @scala.inline
  def apply(Item: ListOfSegmentResponse): SegmentsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
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
    def setItem(value: ListOfSegmentResponse): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

