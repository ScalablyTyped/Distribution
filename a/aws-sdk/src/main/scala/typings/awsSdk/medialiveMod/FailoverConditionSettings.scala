package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailoverConditionSettings extends js.Object {
  
  /**
    * MediaLive will perform a failover if content is not detected in this input for the specified period.
    */
  var InputLossSettings: js.UndefOr[InputLossFailoverSettings] = js.native
}
object FailoverConditionSettings {
  
  @scala.inline
  def apply(): FailoverConditionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailoverConditionSettings]
  }
  
  @scala.inline
  implicit class FailoverConditionSettingsOps[Self <: FailoverConditionSettings] (val x: Self) extends AnyVal {
    
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
    def setInputLossSettings(value: InputLossFailoverSettings): Self = this.set("InputLossSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLossSettings: Self = this.set("InputLossSettings", js.undefined)
  }
}
