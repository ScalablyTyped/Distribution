package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyComplianceDetail extends js.Object {
  /**
    * Indicates if over 100 resources are noncompliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.native
  /**
    * A timestamp that indicates when the returned information should be considered out of date.
    */
  var ExpiredAt: js.UndefOr[TimeStamp] = js.native
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be noncompliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typings.awsSdk.fmsMod.IssueInfoMap] = js.native
  /**
    * The AWS account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.native
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.fmsMod.PolicyId] = js.native
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.native
  /**
    * An array of resources that aren't protected by the AWS WAF or Shield Advanced policy or that aren't in compliance with the security group policy.
    */
  var Violators: js.UndefOr[ComplianceViolators] = js.native
}

object PolicyComplianceDetail {
  @scala.inline
  def apply(): PolicyComplianceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyComplianceDetail]
  }
  @scala.inline
  implicit class PolicyComplianceDetailOps[Self <: PolicyComplianceDetail] (val x: Self) extends AnyVal {
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
    def setEvaluationLimitExceeded(value: Boolean): Self = this.set("EvaluationLimitExceeded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationLimitExceeded: Self = this.set("EvaluationLimitExceeded", js.undefined)
    @scala.inline
    def setExpiredAt(value: TimeStamp): Self = this.set("ExpiredAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiredAt: Self = this.set("ExpiredAt", js.undefined)
    @scala.inline
    def setIssueInfoMap(value: IssueInfoMap): Self = this.set("IssueInfoMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssueInfoMap: Self = this.set("IssueInfoMap", js.undefined)
    @scala.inline
    def setMemberAccount(value: AWSAccountId): Self = this.set("MemberAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberAccount: Self = this.set("MemberAccount", js.undefined)
    @scala.inline
    def setPolicyId(value: PolicyId): Self = this.set("PolicyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyId: Self = this.set("PolicyId", js.undefined)
    @scala.inline
    def setPolicyOwner(value: AWSAccountId): Self = this.set("PolicyOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyOwner: Self = this.set("PolicyOwner", js.undefined)
    @scala.inline
    def setViolatorsVarargs(value: ComplianceViolator*): Self = this.set("Violators", js.Array(value :_*))
    @scala.inline
    def setViolators(value: ComplianceViolators): Self = this.set("Violators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolators: Self = this.set("Violators", js.undefined)
  }
  
}

