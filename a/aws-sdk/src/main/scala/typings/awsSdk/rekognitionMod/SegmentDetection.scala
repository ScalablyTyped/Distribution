package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentDetection extends StObject {
  
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
    * The end time of the detected segment, in milliseconds, from the start of the video. This value is rounded down.
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
    * The start time of the detected segment in milliseconds from the start of the video. This value is rounded down. For example, if the actual timestamp is 100.6667 milliseconds, Amazon Rekognition Video returns a value of 100 millis.
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
  implicit class SegmentDetectionMutableBuilder[Self <: SegmentDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationMillis(value: ULong): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    @scala.inline
    def setDurationSMPTE(value: Timecode): Self = StObject.set(x, "DurationSMPTE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationSMPTEUndefined: Self = StObject.set(x, "DurationSMPTE", js.undefined)
    
    @scala.inline
    def setEndTimecodeSMPTE(value: Timecode): Self = StObject.set(x, "EndTimecodeSMPTE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimecodeSMPTEUndefined: Self = StObject.set(x, "EndTimecodeSMPTE", js.undefined)
    
    @scala.inline
    def setEndTimestampMillis(value: Timestamp): Self = StObject.set(x, "EndTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimestampMillisUndefined: Self = StObject.set(x, "EndTimestampMillis", js.undefined)
    
    @scala.inline
    def setShotSegment(value: ShotSegment): Self = StObject.set(x, "ShotSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShotSegmentUndefined: Self = StObject.set(x, "ShotSegment", js.undefined)
    
    @scala.inline
    def setStartTimecodeSMPTE(value: Timecode): Self = StObject.set(x, "StartTimecodeSMPTE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimecodeSMPTEUndefined: Self = StObject.set(x, "StartTimecodeSMPTE", js.undefined)
    
    @scala.inline
    def setStartTimestampMillis(value: Timestamp): Self = StObject.set(x, "StartTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimestampMillisUndefined: Self = StObject.set(x, "StartTimestampMillis", js.undefined)
    
    @scala.inline
    def setTechnicalCueSegment(value: TechnicalCueSegment): Self = StObject.set(x, "TechnicalCueSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTechnicalCueSegmentUndefined: Self = StObject.set(x, "TechnicalCueSegment", js.undefined)
    
    @scala.inline
    def setType(value: SegmentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
