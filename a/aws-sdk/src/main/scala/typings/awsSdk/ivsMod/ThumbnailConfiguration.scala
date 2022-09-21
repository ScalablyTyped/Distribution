package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbnailConfiguration extends StObject {
  
  /**
    * Thumbnail recording mode. Default: INTERVAL.
    */
  var recordingMode: js.UndefOr[RecordingMode] = js.undefined
  
  /**
    * The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if recordingMode is INTERVAL. Default: 60.  Important: Setting a value for targetIntervalSeconds does not guarantee that thumbnails are generated at the specified interval. For thumbnails to be generated at the targetIntervalSeconds interval, the IDR/Keyframe value for the input video must be less than the targetIntervalSeconds value. See  Amazon IVS Streaming Configuration for information on setting IDR/Keyframe to the recommended value in video-encoder settings.
    */
  var targetIntervalSeconds: js.UndefOr[TargetIntervalSeconds] = js.undefined
}
object ThumbnailConfiguration {
  
  inline def apply(): ThumbnailConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailConfiguration]
  }
  
  extension [Self <: ThumbnailConfiguration](x: Self) {
    
    inline def setRecordingMode(value: RecordingMode): Self = StObject.set(x, "recordingMode", value.asInstanceOf[js.Any])
    
    inline def setRecordingModeUndefined: Self = StObject.set(x, "recordingMode", js.undefined)
    
    inline def setTargetIntervalSeconds(value: TargetIntervalSeconds): Self = StObject.set(x, "targetIntervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setTargetIntervalSecondsUndefined: Self = StObject.set(x, "targetIntervalSeconds", js.undefined)
  }
}
