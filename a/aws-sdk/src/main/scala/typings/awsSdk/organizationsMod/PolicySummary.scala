package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicySummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the policy. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[PolicyArn] = js.native
  /**
    * A boolean value that indicates whether the specified policy is an AWS managed policy. If true, then you can attach the policy to roots, OUs, or accounts, but you cannot edit it.
    */
  var AwsManaged: js.UndefOr[AwsManagedPolicy] = js.native
  /**
    * The description of the policy.
    */
  var Description: js.UndefOr[PolicyDescription] = js.native
  /**
    * The unique identifier (ID) of the policy. The regex pattern for a policy ID string requires "p-" followed by from 8 to 128 lower-case letters or digits.
    */
  var Id: js.UndefOr[PolicyId] = js.native
  /**
    * The friendly name of the policy. The regex pattern that is used to validate this parameter is a string of any of the characters in the ASCII character range.
    */
  var Name: js.UndefOr[PolicyName] = js.native
  /**
    * The type of policy.
    */
  var Type: js.UndefOr[PolicyType] = js.native
}

object PolicySummary {
  @scala.inline
  def apply(): PolicySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicySummary]
  }
  @scala.inline
  implicit class PolicySummaryOps[Self <: PolicySummary] (val x: Self) extends AnyVal {
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
    def setArn(value: PolicyArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAwsManaged(value: AwsManagedPolicy): Self = this.set("AwsManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsManaged: Self = this.set("AwsManaged", js.undefined)
    @scala.inline
    def setDescription(value: PolicyDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setId(value: PolicyId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: PolicyName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setType(value: PolicyType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

