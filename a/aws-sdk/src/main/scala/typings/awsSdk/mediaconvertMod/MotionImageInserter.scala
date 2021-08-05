package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionImageInserter extends StObject {
  
  /**
    * If your motion graphic asset is a .mov file, keep this setting unspecified. If your motion graphic asset is a series of .png files, specify the frame rate of the overlay in frames per second, as a fraction. For example, specify 24 fps as 24/1. Make sure that the number of images in your series matches the frame rate and your intended overlay duration. For example, if you want a 30-second overlay at 30 fps, you should have 900 .png images. This overlay frame rate doesn't need to match the frame rate of the underlying video.
    */
  var Framerate: js.UndefOr[MotionImageInsertionFramerate] = js.undefined
  
  /**
    * Specify the .mov file or series of .png files that you want to overlay on your video. For .png files, provide the file name of the first file in the series. Make sure that the names of the .png files end with sequential numbers that specify the order that they are played in. For example, overlay_000.png, overlay_001.png, overlay_002.png, and so on. The sequence must start at zero, and each image file name must have the same number of digits. Pad your initial file names with enough zeros to complete the sequence. For example, if the first image is overlay_0.png, there can be only 10 images in the sequence, with the last image being overlay_9.png. But if the first image is overlay_00.png, there can be 100 images in the sequence.
    */
  var Input: js.UndefOr[stringMin14Max1285PatternS3Mov09PngHttpsMov09Png] = js.undefined
  
  /**
    * Choose the type of motion graphic asset that you are providing for your overlay. You can choose either a .mov file or a series of .png files.
    */
  var InsertionMode: js.UndefOr[MotionImageInsertionMode] = js.undefined
  
  /**
    * Use Offset to specify the placement of your motion graphic overlay on the video frame. Specify in pixels, from the upper-left corner of the frame. If you don't specify an offset, the service scales your overlay to the full size of the frame. Otherwise, the service inserts the overlay at its native resolution and scales the size up or down with any video scaling.
    */
  var Offset: js.UndefOr[MotionImageInsertionOffset] = js.undefined
  
  /**
    * Specify whether your motion graphic overlay repeats on a loop or plays only once.
    */
  var Playback: js.UndefOr[MotionImagePlayback] = js.undefined
  
  /**
    * Specify when the motion overlay begins. Use timecode format (HH:MM:SS:FF or HH:MM:SS;FF). Make sure that the timecode you provide here takes into account how you have set up your timecode configuration under both job settings and input settings. The simplest way to do that is to set both to start at 0. If you need to set up your job to follow timecodes embedded in your source that don't start at zero, make sure that you specify a start time that is after the first embedded timecode. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/setting-up-timecode.html Find job-wide and input timecode configuration settings in your JSON job settings specification at settings>timecodeConfig>source and settings>inputs>timecodeSource.
    */
  var StartTime: js.UndefOr[stringMin11Max11Pattern01D20305D205D] = js.undefined
}
object MotionImageInserter {
  
  inline def apply(): MotionImageInserter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionImageInserter]
  }
  
  extension [Self <: MotionImageInserter](x: Self) {
    
    inline def setFramerate(value: MotionImageInsertionFramerate): Self = StObject.set(x, "Framerate", value.asInstanceOf[js.Any])
    
    inline def setFramerateUndefined: Self = StObject.set(x, "Framerate", js.undefined)
    
    inline def setInput(value: stringMin14Max1285PatternS3Mov09PngHttpsMov09Png): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setInsertionMode(value: MotionImageInsertionMode): Self = StObject.set(x, "InsertionMode", value.asInstanceOf[js.Any])
    
    inline def setInsertionModeUndefined: Self = StObject.set(x, "InsertionMode", js.undefined)
    
    inline def setOffset(value: MotionImageInsertionOffset): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "Offset", js.undefined)
    
    inline def setPlayback(value: MotionImagePlayback): Self = StObject.set(x, "Playback", value.asInstanceOf[js.Any])
    
    inline def setPlaybackUndefined: Self = StObject.set(x, "Playback", js.undefined)
    
    inline def setStartTime(value: stringMin11Max11Pattern01D20305D205D): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
