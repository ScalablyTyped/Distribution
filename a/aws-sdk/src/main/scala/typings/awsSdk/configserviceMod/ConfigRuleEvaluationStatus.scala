package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigRuleEvaluationStatus extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Config rule.
    */
  var ConfigRuleArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the AWS Config rule.
    */
  var ConfigRuleId: js.UndefOr[String] = js.native
  
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRuleName] = js.native
  
  /**
    * The time that you first activated the AWS Config rule.
    */
  var FirstActivatedTime: js.UndefOr[Date] = js.native
  
  /**
    * Indicates whether AWS Config has evaluated your resources against the rule at least once.    true - AWS Config has evaluated your AWS resources against the rule at least once.    false - AWS Config has not once finished evaluating your AWS resources against the rule.  
    */
  var FirstEvaluationStarted: js.UndefOr[Boolean] = js.native
  
  /**
    * The time that you last turned off the AWS Config rule.
    */
  var LastDeactivatedTime: js.UndefOr[Date] = js.native
  
  /**
    * The error code that AWS Config returned when the rule last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.native
  
  /**
    * The error message that AWS Config returned when the rule last failed.
    */
  var LastErrorMessage: js.UndefOr[String] = js.native
  
  /**
    * The time that AWS Config last failed to evaluate your AWS resources against the rule.
    */
  var LastFailedEvaluationTime: js.UndefOr[Date] = js.native
  
  /**
    * The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
    */
  var LastFailedInvocationTime: js.UndefOr[Date] = js.native
  
  /**
    * The time that AWS Config last successfully evaluated your AWS resources against the rule.
    */
  var LastSuccessfulEvaluationTime: js.UndefOr[Date] = js.native
  
  /**
    * The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
    */
  var LastSuccessfulInvocationTime: js.UndefOr[Date] = js.native
}
object ConfigRuleEvaluationStatus {
  
  @scala.inline
  def apply(): ConfigRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRuleEvaluationStatus]
  }
  
  @scala.inline
  implicit class ConfigRuleEvaluationStatusMutableBuilder[Self <: ConfigRuleEvaluationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRuleArn(value: String): Self = StObject.set(x, "ConfigRuleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleArnUndefined: Self = StObject.set(x, "ConfigRuleArn", js.undefined)
    
    @scala.inline
    def setConfigRuleId(value: String): Self = StObject.set(x, "ConfigRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleIdUndefined: Self = StObject.set(x, "ConfigRuleId", js.undefined)
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleNameUndefined: Self = StObject.set(x, "ConfigRuleName", js.undefined)
    
    @scala.inline
    def setFirstActivatedTime(value: Date): Self = StObject.set(x, "FirstActivatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstActivatedTimeUndefined: Self = StObject.set(x, "FirstActivatedTime", js.undefined)
    
    @scala.inline
    def setFirstEvaluationStarted(value: Boolean): Self = StObject.set(x, "FirstEvaluationStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstEvaluationStartedUndefined: Self = StObject.set(x, "FirstEvaluationStarted", js.undefined)
    
    @scala.inline
    def setLastDeactivatedTime(value: Date): Self = StObject.set(x, "LastDeactivatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDeactivatedTimeUndefined: Self = StObject.set(x, "LastDeactivatedTime", js.undefined)
    
    @scala.inline
    def setLastErrorCode(value: String): Self = StObject.set(x, "LastErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorCodeUndefined: Self = StObject.set(x, "LastErrorCode", js.undefined)
    
    @scala.inline
    def setLastErrorMessage(value: String): Self = StObject.set(x, "LastErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastErrorMessageUndefined: Self = StObject.set(x, "LastErrorMessage", js.undefined)
    
    @scala.inline
    def setLastFailedEvaluationTime(value: Date): Self = StObject.set(x, "LastFailedEvaluationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFailedEvaluationTimeUndefined: Self = StObject.set(x, "LastFailedEvaluationTime", js.undefined)
    
    @scala.inline
    def setLastFailedInvocationTime(value: Date): Self = StObject.set(x, "LastFailedInvocationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFailedInvocationTimeUndefined: Self = StObject.set(x, "LastFailedInvocationTime", js.undefined)
    
    @scala.inline
    def setLastSuccessfulEvaluationTime(value: Date): Self = StObject.set(x, "LastSuccessfulEvaluationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfulEvaluationTimeUndefined: Self = StObject.set(x, "LastSuccessfulEvaluationTime", js.undefined)
    
    @scala.inline
    def setLastSuccessfulInvocationTime(value: Date): Self = StObject.set(x, "LastSuccessfulInvocationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfulInvocationTimeUndefined: Self = StObject.set(x, "LastSuccessfulInvocationTime", js.undefined)
  }
}
