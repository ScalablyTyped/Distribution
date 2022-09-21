package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationRecorderStatus extends StObject {
  
  /**
    * The error code indicating that the recording failed.
    */
  var lastErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The message indicating that the recording failed due to an error.
    */
  var lastErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The time the recorder was last started.
    */
  var lastStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last (previous) status of the recorder.
    */
  var lastStatus: js.UndefOr[RecorderStatus] = js.undefined
  
  /**
    * The time when the status was last changed.
    */
  var lastStatusChangeTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the recorder was last stopped.
    */
  var lastStopTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the configuration recorder.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not the recorder is currently recording.
    */
  var recording: js.UndefOr[Boolean] = js.undefined
}
object ConfigurationRecorderStatus {
  
  inline def apply(): ConfigurationRecorderStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRecorderStatus]
  }
  
  extension [Self <: ConfigurationRecorderStatus](x: Self) {
    
    inline def setLastErrorCode(value: String): Self = StObject.set(x, "lastErrorCode", value.asInstanceOf[js.Any])
    
    inline def setLastErrorCodeUndefined: Self = StObject.set(x, "lastErrorCode", js.undefined)
    
    inline def setLastErrorMessage(value: String): Self = StObject.set(x, "lastErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setLastErrorMessageUndefined: Self = StObject.set(x, "lastErrorMessage", js.undefined)
    
    inline def setLastStartTime(value: js.Date): Self = StObject.set(x, "lastStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastStartTimeUndefined: Self = StObject.set(x, "lastStartTime", js.undefined)
    
    inline def setLastStatus(value: RecorderStatus): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeTime(value: js.Date): Self = StObject.set(x, "lastStatusChangeTime", value.asInstanceOf[js.Any])
    
    inline def setLastStatusChangeTimeUndefined: Self = StObject.set(x, "lastStatusChangeTime", js.undefined)
    
    inline def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
    
    inline def setLastStopTime(value: js.Date): Self = StObject.set(x, "lastStopTime", value.asInstanceOf[js.Any])
    
    inline def setLastStopTimeUndefined: Self = StObject.set(x, "lastStopTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecording(value: Boolean): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
    
    inline def setRecordingUndefined: Self = StObject.set(x, "recording", js.undefined)
  }
}
