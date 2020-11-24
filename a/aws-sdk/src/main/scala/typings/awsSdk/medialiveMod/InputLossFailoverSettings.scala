package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputLossFailoverSettings extends js.Object {
  
  /**
    * The amount of time (in milliseconds) that no input is detected. After that time, an input failover will occur.
    */
  var InputLossThresholdMsec: js.UndefOr[integerMin100] = js.native
}
object InputLossFailoverSettings {
  
  @scala.inline
  def apply(): InputLossFailoverSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLossFailoverSettings]
  }
  
  @scala.inline
  implicit class InputLossFailoverSettingsOps[Self <: InputLossFailoverSettings] (val x: Self) extends AnyVal {
    
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
    def setInputLossThresholdMsec(value: integerMin100): Self = this.set("InputLossThresholdMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLossThresholdMsec: Self = this.set("InputLossThresholdMsec", js.undefined)
  }
}
