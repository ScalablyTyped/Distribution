package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryStatus extends js.Object {
  
  /**
    * The current state of the canary.
    */
  var State: js.UndefOr[CanaryState] = js.native
  
  /**
    * If the canary has insufficient permissions to run, this field provides more details.
    */
  var StateReason: js.UndefOr[String] = js.native
  
  /**
    * If the canary cannot run or has failed, this field displays the reason.
    */
  var StateReasonCode: js.UndefOr[CanaryStateReasonCode] = js.native
}
object CanaryStatus {
  
  @scala.inline
  def apply(): CanaryStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryStatus]
  }
  
  @scala.inline
  implicit class CanaryStatusOps[Self <: CanaryStatus] (val x: Self) extends AnyVal {
    
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
    def setState(value: CanaryState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStateReason(value: String): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
    
    @scala.inline
    def setStateReasonCode(value: CanaryStateReasonCode): Self = this.set("StateReasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateReasonCode: Self = this.set("StateReasonCode", js.undefined)
  }
}
