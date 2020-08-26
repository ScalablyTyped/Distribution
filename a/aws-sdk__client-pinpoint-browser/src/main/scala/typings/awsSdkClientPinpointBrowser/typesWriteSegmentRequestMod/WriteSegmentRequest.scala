package typings.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod

import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteSegmentRequest extends js.Object {
  /**
    * The segment dimensions attributes.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.native
  /**
    * The name of segment
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSegmentGroups(value: SegmentGroupList): Self = this.set("SegmentGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentGroups: Self = this.set("SegmentGroups", js.undefined)
  }
  
}

