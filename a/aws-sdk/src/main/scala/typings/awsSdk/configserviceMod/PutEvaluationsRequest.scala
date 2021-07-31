package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEvaluationsRequest extends StObject {
  
  /**
    * The assessments that the AWS Lambda function performs. Each evaluation identifies an AWS resource and indicates whether it complies with the AWS Config rule that invokes the AWS Lambda function.
    */
  var Evaluations: js.UndefOr[typings.awsSdk.configserviceMod.Evaluations] = js.undefined
  
  /**
    * An encrypted token that associates an evaluation with an AWS Config rule. Identifies the rule and the event that triggered the evaluation.
    */
  var ResultToken: String
  
  /**
    * Use this parameter to specify a test run for PutEvaluations. You can verify whether your AWS Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and evaluation results are not sent to AWS Config.  When TestMode is true, PutEvaluations doesn't require a valid value for the ResultToken parameter, but the value cannot be null. 
    */
  var TestMode: js.UndefOr[Boolean] = js.undefined
}
object PutEvaluationsRequest {
  
  @scala.inline
  def apply(ResultToken: String): PutEvaluationsRequest = {
    val __obj = js.Dynamic.literal(ResultToken = ResultToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEvaluationsRequest]
  }
  
  @scala.inline
  implicit class PutEvaluationsRequestMutableBuilder[Self <: PutEvaluationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvaluations(value: Evaluations): Self = StObject.set(x, "Evaluations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationsUndefined: Self = StObject.set(x, "Evaluations", js.undefined)
    
    @scala.inline
    def setEvaluationsVarargs(value: Evaluation*): Self = StObject.set(x, "Evaluations", js.Array(value :_*))
    
    @scala.inline
    def setResultToken(value: String): Self = StObject.set(x, "ResultToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestMode(value: Boolean): Self = StObject.set(x, "TestMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestModeUndefined: Self = StObject.set(x, "TestMode", js.undefined)
  }
}
