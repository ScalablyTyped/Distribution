package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateEvaluationResult extends StObject {
  
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
  implicit class AggregateEvaluationResultMutableBuilder[Self <: AggregateEvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setAnnotation(value: StringWithCharLimit256): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationUndefined: Self = StObject.set(x, "Annotation", js.undefined)
    
    @scala.inline
    def setAwsRegion(value: AwsRegion): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
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
  }
}
