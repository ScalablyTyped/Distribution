package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyComplianceStatus extends js.Object {
  /**
    * An array of EvaluationResult objects.
    */
  var EvaluationResults: js.UndefOr[typings.awsSdk.fmsMod.EvaluationResults] = js.native
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be noncompliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typings.awsSdk.fmsMod.IssueInfoMap] = js.native
  /**
    * Timestamp of the last update to the EvaluationResult objects.
    */
  var LastUpdated: js.UndefOr[TimeStamp] = js.native
  /**
    * The member account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.native
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.fmsMod.PolicyId] = js.native
  /**
    * The name of the AWS Firewall Manager policy.
    */
  var PolicyName: js.UndefOr[ResourceName] = js.native
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.native
}

object PolicyComplianceStatus {
  @scala.inline
  def apply(): PolicyComplianceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyComplianceStatus]
  }
  @scala.inline
  implicit class PolicyComplianceStatusOps[Self <: PolicyComplianceStatus] (val x: Self) extends AnyVal {
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
    def setEvaluationResultsVarargs(value: EvaluationResult*): Self = this.set("EvaluationResults", js.Array(value :_*))
    @scala.inline
    def setEvaluationResults(value: EvaluationResults): Self = this.set("EvaluationResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationResults: Self = this.set("EvaluationResults", js.undefined)
    @scala.inline
    def setIssueInfoMap(value: IssueInfoMap): Self = this.set("IssueInfoMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssueInfoMap: Self = this.set("IssueInfoMap", js.undefined)
    @scala.inline
    def setLastUpdated(value: TimeStamp): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    @scala.inline
    def setMemberAccount(value: AWSAccountId): Self = this.set("MemberAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberAccount: Self = this.set("MemberAccount", js.undefined)
    @scala.inline
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyId: Self = this.set("PolicyId", js.undefined)
    @scala.inline
    def setPolicyName(value: ResourceName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyName: Self = this.set("PolicyName", js.undefined)
    @scala.inline
    def setPolicyOwner(value: AWSAccountId): Self = this.set("PolicyOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyOwner: Self = this.set("PolicyOwner", js.undefined)
  }
  
}

