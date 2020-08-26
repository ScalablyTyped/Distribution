package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteSegmentRequest extends js.Object {
  /**
    * The criteria that define the dimensions for the segment.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.native
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * The segment group to use and the dimensions to apply to the group's base segments in order to build the segment. A segment group can consist of zero or more base segments. Your request can include only one segment group.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the segment. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}

object WriteSegmentRequest {
  @scala.inline
  def apply(): WriteSegmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteSegmentRequest]
  }
  @scala.inline
  implicit class WriteSegmentRequestOps[Self <: WriteSegmentRequest] (val x: Self) extends AnyVal {
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
    def setDimensions(value: SegmentDimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSegmentGroups(value: SegmentGroupList): Self = this.set("SegmentGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentGroups: Self = this.set("SegmentGroups", js.undefined)
    @scala.inline
    def setTags(value: MapOfString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

