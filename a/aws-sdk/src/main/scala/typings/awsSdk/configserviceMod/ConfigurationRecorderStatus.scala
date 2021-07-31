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
  var lastStartTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The last (previous) status of the recorder.
    */
  var lastStatus: js.UndefOr[RecorderStatus] = js.undefined
  
  /**
    * The time when the status was last changed.
    */
  var lastStatusChangeTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The time the recorder was last stopped.
    */
  var lastStopTime: js.UndefOr[Date] = js.undefined
  
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
  
  @scala.inline
  def apply(): ConfigurationRecorderStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRecorderStatus]
  }
  
  @scala.inline
  implicit class ConfigurationRecorderStatusMutableBuilder[Self <: ConfigurationRecorderStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastErrorCode(value: String): Self = StObject.set(x, "lastErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorCodeUndefined: Self = StObject.set(x, "lastErrorCode", js.undefined)
    
    @scala.inline
    def setLastErrorMessage(value: String): Self = StObject.set(x, "lastErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorMessageUndefined: Self = StObject.set(x, "lastErrorMessage", js.undefined)
    
    @scala.inline
    def setLastStartTime(value: Date): Self = StObject.set(x, "lastStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStartTimeUndefined: Self = StObject.set(x, "lastStartTime", js.undefined)
    
    @scala.inline
    def setLastStatus(value: RecorderStatus): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusChangeTime(value: Date): Self = StObject.set(x, "lastStatusChangeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusChangeTimeUndefined: Self = StObject.set(x, "lastStatusChangeTime", js.undefined)
    
    @scala.inline
    def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
    
    @scala.inline
    def setLastStopTime(value: Date): Self = StObject.set(x, "lastStopTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStopTimeUndefined: Self = StObject.set(x, "lastStopTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRecording(value: Boolean): Self = StObject.set(x, "recording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordingUndefined: Self = StObject.set(x, "recording", js.undefined)
  }
}
