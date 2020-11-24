package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialComponentStatus extends js.Object {
  
  /**
    * If the component failed, a message describing why.
    */
  var Message: js.UndefOr[TrialComponentStatusMessage] = js.native
  
  /**
    * The status of the trial component.
    */
  var PrimaryStatus: js.UndefOr[TrialComponentPrimaryStatus] = js.native
}
object TrialComponentStatus {
  
  @scala.inline
  def apply(): TrialComponentStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialComponentStatus]
  }
  
  @scala.inline
  implicit class TrialComponentStatusOps[Self <: TrialComponentStatus] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: TrialComponentStatusMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setPrimaryStatus(value: TrialComponentPrimaryStatus): Self = this.set("PrimaryStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryStatus: Self = this.set("PrimaryStatus", js.undefined)
  }
}
