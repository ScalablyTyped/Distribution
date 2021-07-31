package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimecodeConfig extends StObject {
  
  /**
    * If you use an editing platform that relies on an anchor timecode, use Anchor Timecode (Anchor) to specify a timecode that will match the input video frame to the output video frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores frame rate conversion. System behavior for Anchor Timecode varies depending on your setting for Source (TimecodeSource). * If Source (TimecodeSource) is set to Specified Start (SPECIFIEDSTART), the first input frame is the specified value in Start Timecode (Start). Anchor Timecode (Anchor) and Start Timecode (Start) are used calculate output timecode. * If Source (TimecodeSource) is set to Start at 0 (ZEROBASED)  the  first frame is 00:00:00:00. * If Source (TimecodeSource) is set to Embedded (EMBEDDED), the  first frame is the timecode value on the first input frame of the input.
    */
  var Anchor: js.UndefOr[stringPattern010920405090509092] = js.undefined
  
  /**
    * Use Source (TimecodeSource) to set how timecodes are handled within this job. To make sure that your video, audio, captions, and markers are synchronized and that time-based features, such as image inserter, work correctly, choose the Timecode source option that matches your assets. All timecodes are in a 24-hour format with frame number (HH:MM:SS:FF). * Embedded (EMBEDDED) - Use the timecode that is in the input video. If no embedded timecode is in the source, the service will use Start at 0 (ZEROBASED) instead. * Start at 0 (ZEROBASED) - Set the timecode of the initial frame to 00:00:00:00. * Specified Start (SPECIFIEDSTART) - Set the timecode of the initial frame to a value other than zero. You use Start timecode (Start) to provide this value.
    */
  var Source: js.UndefOr[TimecodeSource] = js.undefined
  
  /**
    * Only use when you set Source (TimecodeSource) to Specified start (SPECIFIEDSTART). Use Start timecode (Start) to specify the timecode for the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or (HH:MM:SS;FF).
    */
  var Start: js.UndefOr[stringPattern010920405090509092] = js.undefined
  
  /**
    * Only applies to outputs that support program-date-time stamp. Use Timestamp offset (TimestampOffset) to overwrite the timecode date without affecting the time and frame number. Provide the new date as a string in the format "yyyy-mm-dd".  To use Time stamp offset, you must also enable Insert program-date-time (InsertProgramDateTime) in the output settings. For example, if the date part of your timecodes is 2002-1-25 and you want to change it to one year later, set Timestamp offset (TimestampOffset) to 2003-1-25.
    */
  var TimestampOffset: js.UndefOr[stringPattern0940191020191209301] = js.undefined
}
object TimecodeConfig {
  
  @scala.inline
  def apply(): TimecodeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimecodeConfig]
  }
  
  @scala.inline
  implicit class TimecodeConfigMutableBuilder[Self <: TimecodeConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnchor(value: stringPattern010920405090509092): Self = StObject.set(x, "Anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorUndefined: Self = StObject.set(x, "Anchor", js.undefined)
    
    @scala.inline
    def setSource(value: TimecodeSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setStart(value: stringPattern010920405090509092): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "Start", js.undefined)
    
    @scala.inline
    def setTimestampOffset(value: stringPattern0940191020191209301): Self = StObject.set(x, "TimestampOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampOffsetUndefined: Self = StObject.set(x, "TimestampOffset", js.undefined)
  }
}
