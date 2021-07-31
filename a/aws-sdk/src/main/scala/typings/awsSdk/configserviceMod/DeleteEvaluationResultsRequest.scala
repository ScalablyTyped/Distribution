package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEvaluationResultsRequest extends StObject {
  
  /**
    * The name of the AWS Config rule for which you want to delete the evaluation results.
    */
  var ConfigRuleName: StringWithCharLimit64
}
object DeleteEvaluationResultsRequest {
  
  @scala.inline
  def apply(ConfigRuleName: StringWithCharLimit64): DeleteEvaluationResultsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEvaluationResultsRequest]
  }
  
  @scala.inline
  implicit class DeleteEvaluationResultsRequestMutableBuilder[Self <: DeleteEvaluationResultsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRuleName(value: StringWithCharLimit64): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
  }
}
