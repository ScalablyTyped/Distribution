package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityTimedOutEventDetails extends js.Object {
  
  /**
    * A more detailed explanation of the cause of the timeout.
    */
  var cause: js.UndefOr[SensitiveCause] = js.native
  
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.native
}
object ActivityTimedOutEventDetails {
  
  @scala.inline
  def apply(): ActivityTimedOutEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityTimedOutEventDetails]
  }
  
  @scala.inline
  implicit class ActivityTimedOutEventDetailsOps[Self <: ActivityTimedOutEventDetails] (val x: Self) extends AnyVal {
    
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
    def setCause(value: SensitiveCause): Self = this.set("cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    
    @scala.inline
    def setError(value: SensitiveError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
