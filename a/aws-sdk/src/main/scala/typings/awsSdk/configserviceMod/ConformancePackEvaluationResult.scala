package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConformancePackEvaluationResult extends js.Object {
  
  /**
    * Supplementary information about how the evaluation determined the compliance. 
    */
  var Annotation: js.UndefOr[typings.awsSdk.configserviceMod.Annotation] = js.native
  
  /**
    * The compliance type. The allowed values are COMPLIANT and NON_COMPLIANT. 
    */
  var ComplianceType: ConformancePackComplianceType = js.native
  
  /**
    * The time when AWS Config rule evaluated AWS resource.
    */
  var ConfigRuleInvokedTime: Date = js.native
  
  var EvaluationResultIdentifier: typings.awsSdk.configserviceMod.EvaluationResultIdentifier = js.native
  
  /**
    * The time when AWS Config recorded the evaluation result. 
    */
  var ResultRecordedTime: Date = js.native
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
  implicit class ConformancePackEvaluationResultOps[Self <: ConformancePackEvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComplianceType(value: ConformancePackComplianceType): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleInvokedTime(value: Date): Self = this.set("ConfigRuleInvokedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = this.set("EvaluationResultIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultRecordedTime(value: Date): Self = this.set("ResultRecordedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotation(value: Annotation): Self = this.set("Annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotation: Self = this.set("Annotation", js.undefined)
  }
}
