package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentDetection extends js.Object {
  /**
    * The duration of the detected segment in milliseconds. 
    */
  var DurationMillis: js.UndefOr[ULong] = js.native
  /**
    * The duration of the timecode for the detected segment in SMPTE format.
    */
  var DurationSMPTE: js.UndefOr[Timecode] = js.native
  /**
    * The frame-accurate SMPTE timecode, from the start of a video, for the end of a detected segment. EndTimecode is in HH:MM:SS:fr format (and ;fr for drop frame-rates).
    */
  var EndTimecodeSMPTE: js.UndefOr[Timecode] = js.native
  /**
    * The end time of the detected segment, in milliseconds, from the start of the video.
    */
  var EndTimestampMillis: js.UndefOr[Timestamp] = js.native
  /**
    * If the segment is a shot detection, contains information about the shot detection.
    */
  var ShotSegment: js.UndefOr[typings.awsSdk.rekognitionMod.ShotSegment] = js.native
  /**
    * The frame-accurate SMPTE timecode, from the start of a video, for the start of a detected segment. StartTimecode is in HH:MM:SS:fr format (and ;fr for drop frame-rates). 
    */
  var StartTimecodeSMPTE: js.UndefOr[Timecode] = js.native
  /**
    * The start time of the detected segment in milliseconds from the start of the video.
    */
  var StartTimestampMillis: js.UndefOr[Timestamp] = js.native
  /**
    * If the segment is a technical cue, contains information about the technical cue.
    */
  var TechnicalCueSegment: js.UndefOr[typings.awsSdk.rekognitionMod.TechnicalCueSegment] = js.native
  /**
    * The type of the segment. Valid values are TECHNICAL_CUE and SHOT.
    */
  var Type: js.UndefOr[SegmentType] = js.native
}

object SegmentDetection {
  @scala.inline
  def apply(
    DurationMillis: js.UndefOr[ULong] = js.undefined,
    DurationSMPTE: Timecode = null,
    EndTimecodeSMPTE: Timecode = null,
    EndTimestampMillis: js.UndefOr[Timestamp] = js.undefined,
    ShotSegment: ShotSegment = null,
    StartTimecodeSMPTE: Timecode = null,
    StartTimestampMillis: js.UndefOr[Timestamp] = js.undefined,
    TechnicalCueSegment: TechnicalCueSegment = null,
    Type: SegmentType = null
  ): SegmentDetection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DurationMillis)) __obj.updateDynamic("DurationMillis")(DurationMillis.get.asInstanceOf[js.Any])
    if (DurationSMPTE != null) __obj.updateDynamic("DurationSMPTE")(DurationSMPTE.asInstanceOf[js.Any])
    if (EndTimecodeSMPTE != null) __obj.updateDynamic("EndTimecodeSMPTE")(EndTimecodeSMPTE.asInstanceOf[js.Any])
    if (!js.isUndefined(EndTimestampMillis)) __obj.updateDynamic("EndTimestampMillis")(EndTimestampMillis.get.asInstanceOf[js.Any])
    if (ShotSegment != null) __obj.updateDynamic("ShotSegment")(ShotSegment.asInstanceOf[js.Any])
    if (StartTimecodeSMPTE != null) __obj.updateDynamic("StartTimecodeSMPTE")(StartTimecodeSMPTE.asInstanceOf[js.Any])
    if (!js.isUndefined(StartTimestampMillis)) __obj.updateDynamic("StartTimestampMillis")(StartTimestampMillis.get.asInstanceOf[js.Any])
    if (TechnicalCueSegment != null) __obj.updateDynamic("TechnicalCueSegment")(TechnicalCueSegment.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentDetection]
  }
}

