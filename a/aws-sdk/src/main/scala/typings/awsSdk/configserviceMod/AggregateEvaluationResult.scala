package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateEvaluationResult extends js.Object {
  
  /**
    * The 12-digit account ID of the source account.
    */
  var AccountId: js.UndefOr[typings.awsSdk.configserviceMod.AccountId] = js.native
  
  /**
    * Supplementary information about how the agrregate evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.native
  
  /**
    * The source region from where the data is aggregated.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.configserviceMod.AwsRegion] = js.native
  
  /**
    * The resource compliance status. For the AggregationEvaluationResult data type, AWS Config supports only the COMPLIANT and NON_COMPLIANT. AWS Config does not support the NOT_APPLICABLE and INSUFFICIENT_DATA value.
    */
  var ComplianceType: js.UndefOr[typings.awsSdk.configserviceMod.ComplianceType] = js.native
  
  /**
    * The time when the AWS Config rule evaluated the AWS resource.
    */
  var ConfigRuleInvokedTime: js.UndefOr[Date] = js.native
  
  /**
    * Uniquely identifies the evaluation result.
    */
  var EvaluationResultIdentifier: js.UndefOr[typings.awsSdk.configserviceMod.EvaluationResultIdentifier] = js.native
  
  /**
    * The time when AWS Config recorded the aggregate evaluation result.
    */
  var ResultRecordedTime: js.UndefOr[Date] = js.native
}
object AggregateEvaluationResult {
  
  @scala.inline
  def apply(): AggregateEvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateEvaluationResult]
  }
  
  @scala.inline
  implicit class AggregateEvaluationResultOps[Self <: AggregateEvaluationResult] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setAnnotation(value: StringWithCharLimit256): Self = this.set("Annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotation: Self = this.set("Annotation", js.undefined)
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRegion: Self = this.set("AwsRegion", js.undefined)
    
    @scala.inline
    def setComplianceType(value: ComplianceType): Self = this.set("ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComplianceType: Self = this.set("ComplianceType", js.undefined)
    
    @scala.inline
    def setConfigRuleInvokedTime(value: Date): Self = this.set("ConfigRuleInvokedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigRuleInvokedTime: Self = this.set("ConfigRuleInvokedTime", js.undefined)
    
    @scala.inline
    def setEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = this.set("EvaluationResultIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationResultIdentifier: Self = this.set("EvaluationResultIdentifier", js.undefined)
    
    @scala.inline
    def setResultRecordedTime(value: Date): Self = this.set("ResultRecordedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultRecordedTime: Self = this.set("ResultRecordedTime", js.undefined)
  }
}
