package typings.awsSdkClientPinpointBrowser.typesWriteSegmentRequestMod

import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentGroupListMod.UnmarshalledSegmentGroupList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledWriteSegmentRequest extends WriteSegmentRequest {
  /**
    * The segment dimensions attributes.
    */
  @JSName("Dimensions")
  var Dimensions_UnmarshalledWriteSegmentRequest: js.UndefOr[UnmarshalledSegmentDimensions] = js.undefined
  /**
    * A segment group, which consists of zero or more source segments, plus dimensions that are applied to those source segments. Your request can only include one segment group. Your request can include either a SegmentGroups object or a Dimensions object, but not both.
    */
  @JSName("SegmentGroups")
  var SegmentGroups_UnmarshalledWriteSegmentRequest: js.UndefOr[UnmarshalledSegmentGroupList] = js.undefined
}

object UnmarshalledWriteSegmentRequest {
  @scala.inline
  def apply(
    Dimensions: UnmarshalledSegmentDimensions = null,
    Name: String = null,
    SegmentGroups: UnmarshalledSegmentGroupList = null
  ): UnmarshalledWriteSegmentRequest = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (SegmentGroups != null) __obj.updateDynamic("SegmentGroups")(SegmentGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledWriteSegmentRequest]
  }
}

