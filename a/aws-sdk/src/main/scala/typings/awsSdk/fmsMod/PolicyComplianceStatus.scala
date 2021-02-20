package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyComplianceStatus extends StObject {
  
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
  implicit class PolicyComplianceStatusMutableBuilder[Self <: PolicyComplianceStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluationResults(value: EvaluationResults): Self = StObject.set(x, "EvaluationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationResultsUndefined: Self = StObject.set(x, "EvaluationResults", js.undefined)
    
    @scala.inline
    def setEvaluationResultsVarargs(value: EvaluationResult*): Self = StObject.set(x, "EvaluationResults", js.Array(value :_*))
    
    @scala.inline
    def setIssueInfoMap(value: IssueInfoMap): Self = StObject.set(x, "IssueInfoMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueInfoMapUndefined: Self = StObject.set(x, "IssueInfoMap", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: TimeStamp): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    @scala.inline
    def setMemberAccount(value: AWSAccountId): Self = StObject.set(x, "MemberAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberAccountUndefined: Self = StObject.set(x, "MemberAccount", js.undefined)
    
    @scala.inline
    def setPolicyId(value: PolicyId): Self = StObject.set(x, "PolicyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyIdUndefined: Self = StObject.set(x, "PolicyId", js.undefined)
    
    @scala.inline
    def setPolicyName(value: ResourceName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    @scala.inline
    def setPolicyOwner(value: AWSAccountId): Self = StObject.set(x, "PolicyOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyOwnerUndefined: Self = StObject.set(x, "PolicyOwner", js.undefined)
  }
}
