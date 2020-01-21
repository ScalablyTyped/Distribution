package typings.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod

import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.SegmentGroupList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteSegmentRequest extends js.Object {
  /**
    * The segment dimensions attributes.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.undefined
  /**
    * The name of segment
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.undefined
}

object WriteSegmentRequest {
  @scala.inline
  def apply(Dimensions: SegmentDimensions = null, Name: String = null, SegmentGroups: SegmentGroupList = null): WriteSegmentRequest = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteSegmentRequest]
  }
}

