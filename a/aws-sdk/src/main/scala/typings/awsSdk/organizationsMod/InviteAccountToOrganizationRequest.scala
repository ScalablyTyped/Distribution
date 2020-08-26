package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAccountToOrganizationRequest extends js.Object {
  /**
    * Additional information that you want to include in the generated email to the recipient account owner.
    */
  var Notes: js.UndefOr[HandshakeNotes] = js.native
  /**
    * The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON object that contains the following elements:   { "Type": "ACCOUNT", "Id": "&lt; account id number &gt;" }  If you use the AWS CLI, you can submit this as a single string, similar to the following example:  --target Id=123456789012,Type=ACCOUNT  If you specify "Type": "ACCOUNT", you must provide the AWS account ID number as the Id. If you specify "Type": "EMAIL", you must specify the email address that is associated with the account.  --target Id=diego@example.com,Type=EMAIL 
    */
  var Target: HandshakeParty = js.native
}

object InviteAccountToOrganizationRequest {
  @scala.inline
  def apply(Target: HandshakeParty): InviteAccountToOrganizationRequest = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAccountToOrganizationRequest]
  }
  @scala.inline
  implicit class InviteAccountToOrganizationRequestOps[Self <: InviteAccountToOrganizationRequest] (val x: Self) extends AnyVal {
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
    def setTarget(value: HandshakeParty): Self = this.set("Target", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotes(value: HandshakeNotes): Self = this.set("Notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("Notes", js.undefined)
  }
  
}

