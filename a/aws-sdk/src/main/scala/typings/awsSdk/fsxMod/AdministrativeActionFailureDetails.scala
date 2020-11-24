package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdministrativeActionFailureDetails extends js.Object {
  
  /**
    * Error message providing details about the failed administrative action.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
}
object AdministrativeActionFailureDetails {
  
  @scala.inline
  def apply(): AdministrativeActionFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeActionFailureDetails]
  }
  
  @scala.inline
  implicit class AdministrativeActionFailureDetailsOps[Self <: AdministrativeActionFailureDetails] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: ErrorMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
}
