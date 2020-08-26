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
  def apply(): SegmentDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDetection]
  }
  @scala.inline
  implicit class SegmentDetectionOps[Self <: SegmentDetection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDurationMillis(value: ULong): Self = this.set("DurationMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationMillis: Self = this.set("DurationMillis", js.undefined)
    @scala.inline
    def setDurationSMPTE(value: Timecode): Self = this.set("DurationSMPTE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationSMPTE: Self = this.set("DurationSMPTE", js.undefined)
    @scala.inline
    def setEndTimecodeSMPTE(value: Timecode): Self = this.set("EndTimecodeSMPTE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimecodeSMPTE: Self = this.set("EndTimecodeSMPTE", js.undefined)
    @scala.inline
    def setEndTimestampMillis(value: Timestamp): Self = this.set("EndTimestampMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimestampMillis: Self = this.set("EndTimestampMillis", js.undefined)
    @scala.inline
    def setShotSegment(value: ShotSegment): Self = this.set("ShotSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShotSegment: Self = this.set("ShotSegment", js.undefined)
    @scala.inline
    def setStartTimecodeSMPTE(value: Timecode): Self = this.set("StartTimecodeSMPTE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimecodeSMPTE: Self = this.set("StartTimecodeSMPTE", js.undefined)
    @scala.inline
    def setStartTimestampMillis(value: Timestamp): Self = this.set("StartTimestampMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimestampMillis: Self = this.set("StartTimestampMillis", js.undefined)
    @scala.inline
    def setTechnicalCueSegment(value: TechnicalCueSegment): Self = this.set("TechnicalCueSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTechnicalCueSegment: Self = this.set("TechnicalCueSegment", js.undefined)
    @scala.inline
    def setType(value: SegmentType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

