package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResult extends StObject {
  
  /**
    * Describes an Amazon Web Services account's compliance with the Firewall Manager policy.
    */
  var ComplianceStatus: js.UndefOr[PolicyComplianceStatusType] = js.undefined
  
  /**
    * Indicates that over 100 resources are noncompliant with the Firewall Manager policy.
    */
  var EvaluationLimitExceeded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of resources that are noncompliant with the specified policy. For WAF and Shield Advanced policies, a resource is considered noncompliant if it is not associated with the policy. For security group policies, a resource is considered noncompliant if it doesn't comply with the rules of the policy and remediation is disabled or not possible.
    */
  var ViolatorCount: js.UndefOr[ResourceCount] = js.undefined
}
object EvaluationResult {
  
  inline def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  
  extension [Self <: EvaluationResult](x: Self) {
    
    inline def setComplianceStatus(value: PolicyComplianceStatusType): Self = StObject.set(x, "ComplianceStatus", value.asInstanceOf[js.Any])
    
    inline def setComplianceStatusUndefined: Self = StObject.set(x, "ComplianceStatus", js.undefined)
    
    inline def setEvaluationLimitExceeded(value: Boolean): Self = StObject.set(x, "EvaluationLimitExceeded", value.asInstanceOf[js.Any])
    
    inline def setEvaluationLimitExceededUndefined: Self = StObject.set(x, "EvaluationLimitExceeded", js.undefined)
    
    inline def setViolatorCount(value: ResourceCount): Self = StObject.set(x, "ViolatorCount", value.asInstanceOf[js.Any])
    
    inline def setViolatorCountUndefined: Self = StObject.set(x, "ViolatorCount", js.undefined)
  }
}
