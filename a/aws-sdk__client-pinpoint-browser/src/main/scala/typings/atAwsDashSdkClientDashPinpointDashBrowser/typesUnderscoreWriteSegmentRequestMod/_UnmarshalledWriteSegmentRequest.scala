package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreWriteSegmentRequestMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDimensionsMod._UnmarshalledSegmentDimensions
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupListMod._UnmarshalledSegmentGroupList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledWriteSegmentRequest extends _WriteSegmentRequest {
  /**
    * The segment dimensions attributes.
    */
  @JSName("Dimensions")
  var Dimensions__UnmarshalledWriteSegmentRequest: js.UndefOr[_UnmarshalledSegmentDimensions] = js.undefined
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
    */
  @JSName("SegmentGroups")
  var SegmentGroups__UnmarshalledWriteSegmentRequest: js.UndefOr[_UnmarshalledSegmentGroupList] = js.undefined
}

object _UnmarshalledWriteSegmentRequest {
  @scala.inline
  def apply(
    Dimensions: _UnmarshalledSegmentDimensions = null,
    Name: String = null,
    SegmentGroups: _UnmarshalledSegmentGroupList = null
  ): _UnmarshalledWriteSegmentRequest = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups)
    __obj.asInstanceOf[_UnmarshalledWriteSegmentRequest]
  }
}

