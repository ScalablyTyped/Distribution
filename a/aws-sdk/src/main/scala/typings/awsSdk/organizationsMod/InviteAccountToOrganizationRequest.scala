package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InviteAccountToOrganizationRequest extends js.Object {
  
  /**
    * Additional information that you want to include in the generated email to the recipient account owner.
    */
  var Notes: js.UndefOr[HandshakeNotes] = js.native
  
  /**
    * A list of tags that you want to attach to the account when it becomes a member of the organization. For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to null. For more information about tagging, see Tagging AWS Organizations resources in the AWS Organizations User Guide.  Any tags in the request are checked for compliance with any applicable tag policies when the request is made. The request is rejected if the tags in the request don't match the requirements of the policy at that time. Tag policy compliance is  not  checked again when the invitation is accepted and the tags are actually attached to the account. That means that if the tag policy changes between the invitation and the acceptance, then that tags could potentially be non-compliant.   If any one of the tags is invalid or if you exceed the allowed number of tags for an account, then the entire request fails and invitations are not sent. 
    */
  var Tags: js.UndefOr[typings.awsSdk.organizationsMod.Tags] = js.native
  
  /**
    * The identifier (ID) of the AWS account that you want to invite to join your organization. This is a JSON object that contains the following elements:  { "Type": "ACCOUNT", "Id": "&lt; account id number &gt;" }  If you use the AWS CLI, you can submit this as a single string, similar to the following example:  --target Id=123456789012,Type=ACCOUNT  If you specify "Type": "ACCOUNT", you must provide the AWS account ID number as the Id. If you specify "Type": "EMAIL", you must specify the email address that is associated with the account.  --target Id=diego@example.com,Type=EMAIL 
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
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
