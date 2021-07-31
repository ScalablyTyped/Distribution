package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackEvaluationResult extends StObject {
  
  /**
    * Supplementary information about how the evaluation determined the compliance. 
    */
  var Annotation: js.UndefOr[typings.awsSdk.configserviceMod.Annotation] = js.undefined
  
  /**
    * The compliance type. The allowed values are COMPLIANT and NON_COMPLIANT. 
    */
  var ComplianceType: ConformancePackComplianceType
  
  /**
    * The time when AWS Config rule evaluated AWS resource.
    */
  var ConfigRuleInvokedTime: Date
  
  var EvaluationResultIdentifier: typings.awsSdk.configserviceMod.EvaluationResultIdentifier
  
  /**
    * The time when AWS Config recorded the evaluation result. 
    */
  var ResultRecordedTime: Date
}
object ConformancePackEvaluationResult {
  
  @scala.inline
  def apply(
    ComplianceType: ConformancePackComplianceType,
    ConfigRuleInvokedTime: Date,
    EvaluationResultIdentifier: EvaluationResultIdentifier,
    ResultRecordedTime: Date
  ): ConformancePackEvaluationResult = {
    val __obj = js.Dynamic.literal(ComplianceType = ComplianceType.asInstanceOf[js.Any], ConfigRuleInvokedTime = ConfigRuleInvokedTime.asInstanceOf[js.Any], EvaluationResultIdentifier = EvaluationResultIdentifier.asInstanceOf[js.Any], ResultRecordedTime = ResultRecordedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackEvaluationResult]
  }
  
  @scala.inline
  implicit class ConformancePackEvaluationResultMutableBuilder[Self <: ConformancePackEvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: Annotation): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationUndefined: Self = StObject.set(x, "Annotation", js.undefined)
    
    @scala.inline
    def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleInvokedTime(value: Date): Self = StObject.set(x, "ConfigRuleInvokedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = StObject.set(x, "EvaluationResultIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultRecordedTime(value: Date): Self = StObject.set(x, "ResultRecordedTime", value.asInstanceOf[js.Any])
  }
}
