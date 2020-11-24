package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlobalConfiguration extends js.Object {
  
  /**
    * Value to set the initial audio gain for the Live Event.
    */
  var InitialAudioGain: js.UndefOr[integerMinNegative60Max60] = js.native
  
  /**
    * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is configured the encoder will restart at the beginning of the first input.  When "none" is configured the encoder will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior" configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
    */
  var InputEndAction: js.UndefOr[GlobalConfigurationInputEndAction] = js.native
  
  /**
    * Settings for system actions when input is lost.
    */
  var InputLossBehavior: js.UndefOr[typings.awsSdk.medialiveMod.InputLossBehavior] = js.native
  
  /**
    * Indicates how MediaLive pipelines are synchronized.
  PIPELINE_LOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other.
  EPOCH_LOCKING - MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
    */
  var OutputLockingMode: js.UndefOr[GlobalConfigurationOutputLockingMode] = js.native
  
  /**
    * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which optionally may be locked to another source via NTP) or should be locked to the clock of the source that is providing the input stream.
    */
  var OutputTimingSource: js.UndefOr[GlobalConfigurationOutputTimingSource] = js.native
  
  /**
    * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music channels with less than one video frame per second.
    */
  var SupportLowFramerateInputs: js.UndefOr[GlobalConfigurationLowFramerateInputs] = js.native
}
object GlobalConfiguration {
  
  @scala.inline
  def apply(): GlobalConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalConfiguration]
  }
  
  @scala.inline
  implicit class GlobalConfigurationOps[Self <: GlobalConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInitialAudioGain(value: integerMinNegative60Max60): Self = this.set("InitialAudioGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialAudioGain: Self = this.set("InitialAudioGain", js.undefined)
    
    @scala.inline
    def setInputEndAction(value: GlobalConfigurationInputEndAction): Self = this.set("InputEndAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputEndAction: Self = this.set("InputEndAction", js.undefined)
    
    @scala.inline
    def setInputLossBehavior(value: InputLossBehavior): Self = this.set("InputLossBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLossBehavior: Self = this.set("InputLossBehavior", js.undefined)
    
    @scala.inline
    def setOutputLockingMode(value: GlobalConfigurationOutputLockingMode): Self = this.set("OutputLockingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputLockingMode: Self = this.set("OutputLockingMode", js.undefined)
    
    @scala.inline
    def setOutputTimingSource(value: GlobalConfigurationOutputTimingSource): Self = this.set("OutputTimingSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputTimingSource: Self = this.set("OutputTimingSource", js.undefined)
    
    @scala.inline
    def setSupportLowFramerateInputs(value: GlobalConfigurationLowFramerateInputs): Self = this.set("SupportLowFramerateInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportLowFramerateInputs: Self = this.set("SupportLowFramerateInputs", js.undefined)
  }
}
