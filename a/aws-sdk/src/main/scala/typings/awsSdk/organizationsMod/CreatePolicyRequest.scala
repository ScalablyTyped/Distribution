package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyRequest extends js.Object {
  /**
    * The policy text content to add to the new policy. The text that you supply must adhere to the rules of the policy type you specify in the Type parameter.
    */
  var Content: PolicyContent = js.native
  /**
    * An optional description to assign to the policy.
    */
  var Description: PolicyDescription = js.native
  /**
    * The friendly name to assign to the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: PolicyName = js.native
  /**
    * The type of policy to create. You can specify one of the following values:    AISERVICES_OPT_OUT_POLICY     BACKUP_POLICY     SERVICE_CONTROL_POLICY     TAG_POLICY   
    */
  var Type: PolicyType = js.native
}

object CreatePolicyRequest {
  @scala.inline
  def apply(Content: PolicyContent, Description: PolicyDescription, Name: PolicyName, Type: PolicyType): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyRequest]
  }
  @scala.inline
  implicit class CreatePolicyRequestOps[Self <: CreatePolicyRequest] (val x: Self) extends AnyVal {
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
    def setContent(value: PolicyContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: PolicyDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: PolicyName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PolicyType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

