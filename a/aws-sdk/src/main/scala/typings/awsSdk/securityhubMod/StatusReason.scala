package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusReason extends js.Object {
  
  /**
    * The corresponding description for the status reason code.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A code that represents a reason for the control status. For the list of status reason codes and their meanings, see Standards-related information in the ASFF in the AWS Security Hub User Guide. 
    */
  var ReasonCode: NonEmptyString = js.native
}
object StatusReason {
  
  @scala.inline
  def apply(ReasonCode: NonEmptyString): StatusReason = {
    val __obj = js.Dynamic.literal(ReasonCode = ReasonCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusReason]
  }
  
  @scala.inline
  implicit class StatusReasonOps[Self <: StatusReason] (val x: Self) extends AnyVal {
    
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
    def setReasonCode(value: NonEmptyString): Self = this.set("ReasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
}
