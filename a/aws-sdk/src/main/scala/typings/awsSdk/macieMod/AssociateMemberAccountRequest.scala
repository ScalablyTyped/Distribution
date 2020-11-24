package typings.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateMemberAccountRequest extends js.Object {
  
  /**
    * The ID of the AWS account that you want to associate with Amazon Macie Classic as a member account.
    */
  var memberAccountId: AWSAccountId = js.native
}
object AssociateMemberAccountRequest {
  
  @scala.inline
  def apply(memberAccountId: AWSAccountId): AssociateMemberAccountRequest = {
    val __obj = js.Dynamic.literal(memberAccountId = memberAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateMemberAccountRequest]
  }
  
  @scala.inline
  implicit class AssociateMemberAccountRequestOps[Self <: AssociateMemberAccountRequest] (val x: Self) extends AnyVal {
    
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
    def setMemberAccountId(value: AWSAccountId): Self = this.set("memberAccountId", value.asInstanceOf[js.Any])
  }
}
