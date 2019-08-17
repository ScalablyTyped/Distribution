package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreWriteSegmentRequestMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDimensionsMod._SegmentDimensions
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupListMod._SegmentGroupList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _WriteSegmentRequest extends js.Object {
  /**
    * The segment dimensions attributes.
    */
  var Dimensions: js.UndefOr[_SegmentDimensions] = js.undefined
  /**
    * The name of segment
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
    */
  var SegmentGroups: js.UndefOr[_SegmentGroupList] = js.undefined
}

object _WriteSegmentRequest {
  @scala.inline
  def apply(
    Dimensions: _SegmentDimensions = null,
    Name: String = null,
    SegmentGroups: _SegmentGroupList = null
  ): _WriteSegmentRequest = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups)
    __obj.asInstanceOf[_WriteSegmentRequest]
  }
}

