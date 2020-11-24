package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticInputFailoverSettings extends js.Object {
  
  /**
    * This clear time defines the requirement a recovered input must meet to be considered healthy. The input must have no failover conditions for this length of time. Enter a time in milliseconds. This value is particularly important if the input_preference for the failover pair is set to PRIMARY_INPUT_PREFERRED, because after this time, MediaLive will switch back to the primary input.
    */
  var ErrorClearTimeMsec: js.UndefOr[integerMin1] = js.native
  
  /**
    * A list of failover conditions. If any of these conditions occur, MediaLive will perform a failover to the other input.
    */
  var FailoverConditions: js.UndefOr[listOfFailoverCondition] = js.native
  
  /**
    * Input preference when deciding which input to make active when a previously failed input has recovered.
    */
  var InputPreference: js.UndefOr[typings.awsSdk.medialiveMod.InputPreference] = js.native
  
  /**
    * The input ID of the secondary input in the automatic input failover pair.
    */
  var SecondaryInputId: string = js.native
}
object AutomaticInputFailoverSettings {
  
  @scala.inline
  def apply(SecondaryInputId: string): AutomaticInputFailoverSettings = {
    val __obj = js.Dynamic.literal(SecondaryInputId = SecondaryInputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomaticInputFailoverSettings]
  }
  
  @scala.inline
  implicit class AutomaticInputFailoverSettingsOps[Self <: AutomaticInputFailoverSettings] (val x: Self) extends AnyVal {
    
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
    def setSecondaryInputId(value: string): Self = this.set("SecondaryInputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorClearTimeMsec(value: integerMin1): Self = this.set("ErrorClearTimeMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorClearTimeMsec: Self = this.set("ErrorClearTimeMsec", js.undefined)
    
    @scala.inline
    def setFailoverConditionsVarargs(value: FailoverCondition*): Self = this.set("FailoverConditions", js.Array(value :_*))
    
    @scala.inline
    def setFailoverConditions(value: listOfFailoverCondition): Self = this.set("FailoverConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailoverConditions: Self = this.set("FailoverConditions", js.undefined)
    
    @scala.inline
    def setInputPreference(value: InputPreference): Self = this.set("InputPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputPreference: Self = this.set("InputPreference", js.undefined)
  }
}
