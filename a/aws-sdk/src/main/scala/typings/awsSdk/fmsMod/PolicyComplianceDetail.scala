package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyComplianceDetail extends StObject {
  
  /**
    * Indicates if over 100 resources are noncompliant with the AWS Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A timestamp that indicates when the returned information should be considered out of date.
    */
  var ExpiredAt: js.UndefOr[TimeStamp] = js.undefined
  
  /**
    * Details about problems with dependent services, such as AWS WAF or AWS Config, that are causing a resource to be noncompliant. The details include the name of the dependent service and the error message received that indicates the problem with the service.
    */
  var IssueInfoMap: js.UndefOr[typings.awsSdk.fmsMod.IssueInfoMap] = js.undefined
  
  /**
    * The AWS account ID.
    */
  var MemberAccount: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The ID of the AWS Firewall Manager policy.
    */
  var PolicyId: js.UndefOr[typings.awsSdk.fmsMod.PolicyId] = js.undefined
  
  /**
    * The AWS account that created the AWS Firewall Manager policy.
    */
  var PolicyOwner: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * An array of resources that aren't protected by the AWS WAF or Shield Advanced policy or that aren't in compliance with the security group policy.
    */
  var Violators: js.UndefOr[ComplianceViolators] = js.undefined
}
object PolicyComplianceDetail {
  
  @scala.inline
  def apply(): PolicyComplianceDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyComplianceDetail]
  }
  
  @scala.inline
  implicit class PolicyComplianceDetailMutableBuilder[Self <: PolicyComplianceDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationLimitExceeded(value: Boolean): Self = StObject.set(x, "EvaluationLimitExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationLimitExceededUndefined: Self = StObject.set(x, "EvaluationLimitExceeded", js.undefined)
    
    @scala.inline
    def setExpiredAt(value: TimeStamp): Self = StObject.set(x, "ExpiredAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiredAtUndefined: Self = StObject.set(x, "ExpiredAt", js.undefined)
    
    @scala.inline
    def setIssueInfoMap(value: IssueInfoMap): Self = StObject.set(x, "IssueInfoMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueInfoMapUndefined: Self = StObject.set(x, "IssueInfoMap", js.undefined)
    
    @scala.inline
    def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountUndefined: Self = StObject.set(x, "MemberAccount", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyOwner(value: AWSAccountId): Self = StObject.set(x, "PolicyOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyOwnerUndefined: Self = StObject.set(x, "PolicyOwner", js.undefined)
    
    @scala.inline
    def setViolators(value: ComplianceViolators): Self = StObject.set(x, "Violators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolatorsUndefined: Self = StObject.set(x, "Violators", js.undefined)
    
    @scala.inline
    def setViolatorsVarargs(value: ComplianceViolator*): Self = StObject.set(x, "Violators", js.Array(value :_*))
  }
}
