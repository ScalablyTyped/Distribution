package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalConfiguration extends StObject {
  
  /**
    * Value to set the initial audio gain for the Live Event.
    */
  var InitialAudioGain: js.UndefOr[integerMinNegative60Max60] = js.undefined
  
  /**
    * Indicates the action to take when the current input completes (e.g. end-of-file). When switchAndLoopInputs is configured the encoder will restart at the beginning of the first input.  When "none" is configured the encoder will transcode either black, a solid color, or a user specified slate images per the "Input Loss Behavior" configuration until the next input switch occurs (which is controlled through the Channel Schedule API).
    */
  var InputEndAction: js.UndefOr[GlobalConfigurationInputEndAction] = js.undefined
  
  /**
    * Settings for system actions when input is lost.
    */
  var InputLossBehavior: js.UndefOr[typings.awsSdk.medialiveMod.InputLossBehavior] = js.undefined
  
  /**
    * Indicates how MediaLive pipelines are synchronized.
  PIPELINE_LOCKING - MediaLive will attempt to synchronize the output of each pipeline to the other.
  EPOCH_LOCKING - MediaLive will attempt to synchronize the output of each pipeline to the Unix epoch.
    */
  var OutputLockingMode: js.UndefOr[GlobalConfigurationOutputLockingMode] = js.undefined
  
  /**
    * Indicates whether the rate of frames emitted by the Live encoder should be paced by its system clock (which optionally may be locked to another source via NTP) or should be locked to the clock of the source that is providing the input stream.
    */
  var OutputTimingSource: js.UndefOr[GlobalConfigurationOutputTimingSource] = js.undefined
  
  /**
    * Adjusts video input buffer for streams with very low video framerates. This is commonly set to enabled for music channels with less than one video frame per second.
    */
  var SupportLowFramerateInputs: js.UndefOr[GlobalConfigurationLowFramerateInputs] = js.undefined
}
object GlobalConfiguration {
  
  @scala.inline
  def apply(): GlobalConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalConfiguration]
  }
  
  @scala.inline
  implicit class GlobalConfigurationMutableBuilder[Self <: GlobalConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialAudioGain(value: integerMinNegative60Max60): Self = StObject.set(x, "InitialAudioGain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialAudioGainUndefined: Self = StObject.set(x, "InitialAudioGain", js.undefined)
    
    @scala.inline
    def setInputEndAction(value: GlobalConfigurationInputEndAction): Self = StObject.set(x, "InputEndAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputEndActionUndefined: Self = StObject.set(x, "InputEndAction", js.undefined)
    
    @scala.inline
    def setInputLossBehavior(value: InputLossBehavior): Self = StObject.set(x, "InputLossBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputLossBehaviorUndefined: Self = StObject.set(x, "InputLossBehavior", js.undefined)
    
    @scala.inline
    def setOutputLockingMode(value: GlobalConfigurationOutputLockingMode): Self = StObject.set(x, "OutputLockingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLockingModeUndefined: Self = StObject.set(x, "OutputLockingMode", js.undefined)
    
    @scala.inline
    def setOutputTimingSource(value: GlobalConfigurationOutputTimingSource): Self = StObject.set(x, "OutputTimingSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputTimingSourceUndefined: Self = StObject.set(x, "OutputTimingSource", js.undefined)
    
    @scala.inline
    def setSupportLowFramerateInputs(value: GlobalConfigurationLowFramerateInputs): Self = StObject.set(x, "SupportLowFramerateInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportLowFramerateInputsUndefined: Self = StObject.set(x, "SupportLowFramerateInputs", js.undefined)
  }
}
