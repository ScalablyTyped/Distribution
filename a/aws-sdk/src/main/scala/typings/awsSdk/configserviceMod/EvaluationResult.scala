package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvaluationResult extends StObject {
  
  /**
    * Supplementary information about how the evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.undefined
  
  /**
    * Indicates whether the AWS resource complies with the AWS Config rule that evaluated it. For the EvaluationResult data type, AWS Config supports only the COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE values. AWS Config does not support the INSUFFICIENT_DATA value for the EvaluationResult data type.
    */
  var ComplianceType: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceType] = js.undefined
  
  /**
    * The time when the AWS Config rule evaluated the AWS resource.
    */
  var ConfigRuleInvokedTime: js.UndefOr[Date] = js.undefined
  
  /**
    * Uniquely identifies the evaluation result.
    */
  var EvaluationResultIdentifier: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResultIdentifier] = js.undefined
  
  /**
    * The time when AWS Config recorded the evaluation result.
    */
  var ResultRecordedTime: js.UndefOr[Date] = js.undefined
  
  /**
    * An encrypted token that associates an evaluation with an AWS Config rule. The token identifies the rule, the AWS resource being evaluated, and the event that triggered the evaluation.
    */
  var ResultToken: js.UndefOr[String] = js.undefined
}
object EvaluationResult {
  
  @scala.inline
  def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  
  @scala.inline
  implicit class EvaluationResultMutableBuilder[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: StringWithCharLimit256): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationUndefined: Self = StObject.set(x, "Annotation", js.undefined)
    
    @scala.inline
    def setComplianceType(value: ComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceTypeUndefined: Self = StObject.set(x, "ComplianceType", js.undefined)
    
    @scala.inline
    def setConfigRuleInvokedTime(value: Date): Self = StObject.set(x, "ConfigRuleInvokedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleInvokedTimeUndefined: Self = StObject.set(x, "ConfigRuleInvokedTime", js.undefined)
    
    @scala.inline
    def setEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = StObject.set(x, "EvaluationResultIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationResultIdentifierUndefined: Self = StObject.set(x, "EvaluationResultIdentifier", js.undefined)
    
    @scala.inline
    def setResultRecordedTime(value: Date): Self = StObject.set(x, "ResultRecordedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultRecordedTimeUndefined: Self = StObject.set(x, "ResultRecordedTime", js.undefined)
    
    @scala.inline
    def setResultToken(value: String): Self = StObject.set(x, "ResultToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultTokenUndefined: Self = StObject.set(x, "ResultToken", js.undefined)
  }
}
