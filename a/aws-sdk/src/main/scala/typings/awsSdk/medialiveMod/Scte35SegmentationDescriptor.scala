package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scte35SegmentationDescriptor extends js.Object {
  /**
    * Holds the four SCTE-35 delivery restriction parameters.
    */
  var DeliveryRestrictions: js.UndefOr[Scte35DeliveryRestrictions] = js.native
  /**
    * Corresponds to SCTE-35 segment_num. A value that is valid for the specified segmentation_type_id.
    */
  var SegmentNum: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 segmentation_event_cancel_indicator.
    */
  var SegmentationCancelIndicator: Scte35SegmentationCancelIndicator = js.native
  /**
    * Corresponds to SCTE-35 segmentation_duration. Optional. The duration for the time_signal, in 90 KHz ticks. To convert seconds to ticks, multiple the seconds by 90,000. Enter time in 90 KHz clock ticks. If you do not enter a duration, the time_signal will continue until you insert a cancellation message.
    */
  var SegmentationDuration: js.UndefOr[longMin0Max1099511627775] = js.native
  /**
    * Corresponds to SCTE-35 segmentation_event_id. 
    */
  var SegmentationEventId: longMin0Max4294967295 = js.native
  /**
    * Corresponds to SCTE-35 segmentation_type_id. One of the segmentation_type_id values listed in the SCTE-35 specification. On the console, enter the ID in decimal (for example, "52"). In the CLI, API, or an SDK, enter the ID in hex (for example, "0x34") or decimal (for example, "52").
    */
  var SegmentationTypeId: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 segmentation_upid. Enter a string containing the hexadecimal representation of the characters that make up the SCTE-35 segmentation_upid value. Must contain an even number of hex characters. Do not include spaces between each hex pair. For example, the ASCII "ADS Information" becomes hex "41445320496e666f726d6174696f6e.
    */
  var SegmentationUpid: js.UndefOr[string] = js.native
  /**
    * Corresponds to SCTE-35 segmentation_upid_type. On the console, enter one of the types listed in the SCTE-35 specification, converted to a decimal. For example, "0x0C" hex from the specification is "12" in decimal. In the CLI, API, or an SDK, enter one of the types listed in the SCTE-35 specification, in either hex (for example, "0x0C" ) or in decimal (for example, "12").
    */
  var SegmentationUpidType: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 segments_expected. A value that is valid for the specified segmentation_type_id.
    */
  var SegmentsExpected: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 sub_segment_num. A value that is valid for the specified segmentation_type_id.
    */
  var SubSegmentNum: js.UndefOr[integerMin0Max255] = js.native
  /**
    * Corresponds to SCTE-35 sub_segments_expected. A value that is valid for the specified segmentation_type_id.
    */
  var SubSegmentsExpected: js.UndefOr[integerMin0Max255] = js.native
}

object Scte35SegmentationDescriptor {
  @scala.inline
  def apply(
    SegmentationCancelIndicator: Scte35SegmentationCancelIndicator,
    SegmentationEventId: longMin0Max4294967295,
    DeliveryRestrictions: Scte35DeliveryRestrictions = null,
    SegmentNum: js.UndefOr[integerMin0Max255] = js.undefined,
    SegmentationDuration: js.UndefOr[longMin0Max1099511627775] = js.undefined,
    SegmentationTypeId: js.UndefOr[integerMin0Max255] = js.undefined,
    SegmentationUpid: string = null,
    SegmentationUpidType: js.UndefOr[integerMin0Max255] = js.undefined,
    SegmentsExpected: js.UndefOr[integerMin0Max255] = js.undefined,
    SubSegmentNum: js.UndefOr[integerMin0Max255] = js.undefined,
    SubSegmentsExpected: js.UndefOr[integerMin0Max255] = js.undefined
  ): Scte35SegmentationDescriptor = {
    val __obj = js.Dynamic.literal(SegmentationCancelIndicator = SegmentationCancelIndicator.asInstanceOf[js.Any], SegmentationEventId = SegmentationEventId.asInstanceOf[js.Any])
    if (DeliveryRestrictions != null) __obj.updateDynamic("DeliveryRestrictions")(DeliveryRestrictions.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentNum)) __obj.updateDynamic("SegmentNum")(SegmentNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentationDuration)) __obj.updateDynamic("SegmentationDuration")(SegmentationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentationTypeId)) __obj.updateDynamic("SegmentationTypeId")(SegmentationTypeId.get.asInstanceOf[js.Any])
    if (SegmentationUpid != null) __obj.updateDynamic("SegmentationUpid")(SegmentationUpid.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentationUpidType)) __obj.updateDynamic("SegmentationUpidType")(SegmentationUpidType.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentsExpected)) __obj.updateDynamic("SegmentsExpected")(SegmentsExpected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SubSegmentNum)) __obj.updateDynamic("SubSegmentNum")(SubSegmentNum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SubSegmentsExpected)) __obj.updateDynamic("SubSegmentsExpected")(SubSegmentsExpected.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scte35SegmentationDescriptor]
  }
}

