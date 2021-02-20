package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HumanLoopActivationOutput extends StObject {
  
  /**
    * Shows the result of condition evaluations, including those conditions which activated a human review.
    */
  var HumanLoopActivationConditionsEvaluationResults: js.UndefOr[typings.awsSdk.rekognitionMod.HumanLoopActivationConditionsEvaluationResults] = js.native
  
  /**
    * Shows if and why human review was needed.
    */
  var HumanLoopActivationReasons: js.UndefOr[typings.awsSdk.rekognitionMod.HumanLoopActivationReasons] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the HumanLoop created.
    */
  var HumanLoopArn: js.UndefOr[typings.awsSdk.rekognitionMod.HumanLoopArn] = js.native
}
object HumanLoopActivationOutput {
  
  @scala.inline
  def apply(): HumanLoopActivationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HumanLoopActivationOutput]
  }
  
  @scala.inline
  implicit class HumanLoopActivationOutputMutableBuilder[Self <: HumanLoopActivationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHumanLoopActivationConditionsEvaluationResults(value: HumanLoopActivationConditionsEvaluationResults): Self = StObject.set(x, "HumanLoopActivationConditionsEvaluationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopActivationConditionsEvaluationResultsUndefined: Self = StObject.set(x, "HumanLoopActivationConditionsEvaluationResults", js.undefined)
    
    @scala.inline
    def setHumanLoopActivationReasons(value: HumanLoopActivationReasons): Self = StObject.set(x, "HumanLoopActivationReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopActivationReasonsUndefined: Self = StObject.set(x, "HumanLoopActivationReasons", js.undefined)
    
    @scala.inline
    def setHumanLoopActivationReasonsVarargs(value: HumanLoopActivationReason*): Self = StObject.set(x, "HumanLoopActivationReasons", js.Array(value :_*))
    
    @scala.inline
    def setHumanLoopArn(value: HumanLoopArn): Self = StObject.set(x, "HumanLoopArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopArnUndefined: Self = StObject.set(x, "HumanLoopArn", js.undefined)
  }
}
