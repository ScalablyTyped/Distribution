package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationRecorderStatus extends js.Object {
  
  /**
    * The error code indicating that the recording failed.
    */
  var lastErrorCode: js.UndefOr[String] = js.native
  
  /**
    * The message indicating that the recording failed due to an error.
    */
  var lastErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * The time the recorder was last started.
    */
  var lastStartTime: js.UndefOr[Date] = js.native
  
  /**
    * The last (previous) status of the recorder.
    */
  var lastStatus: js.UndefOr[RecorderStatus] = js.native
  
  /**
    * The time when the status was last changed.
    */
  var lastStatusChangeTime: js.UndefOr[Date] = js.native
  
  /**
    * The time the recorder was last stopped.
    */
  var lastStopTime: js.UndefOr[Date] = js.native
  
  /**
    * The name of the configuration recorder.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether or not the recorder is currently recording.
    */
  var recording: js.UndefOr[Boolean] = js.native
}
object ConfigurationRecorderStatus {
  
  @scala.inline
  def apply(): ConfigurationRecorderStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationRecorderStatus]
  }
  
  @scala.inline
  implicit class ConfigurationRecorderStatusOps[Self <: ConfigurationRecorderStatus] (val x: Self) extends AnyVal {
    
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
    def setLastErrorCode(value: String): Self = this.set("lastErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastErrorCode: Self = this.set("lastErrorCode", js.undefined)
    
    @scala.inline
    def setLastErrorMessage(value: String): Self = this.set("lastErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastErrorMessage: Self = this.set("lastErrorMessage", js.undefined)
    
    @scala.inline
    def setLastStartTime(value: Date): Self = this.set("lastStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStartTime: Self = this.set("lastStartTime", js.undefined)
    
    @scala.inline
    def setLastStatus(value: RecorderStatus): Self = this.set("lastStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatus: Self = this.set("lastStatus", js.undefined)
    
    @scala.inline
    def setLastStatusChangeTime(value: Date): Self = this.set("lastStatusChangeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStatusChangeTime: Self = this.set("lastStatusChangeTime", js.undefined)
    
    @scala.inline
    def setLastStopTime(value: Date): Self = this.set("lastStopTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastStopTime: Self = this.set("lastStopTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRecording(value: Boolean): Self = this.set("recording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecording: Self = this.set("recording", js.undefined)
  }
}
