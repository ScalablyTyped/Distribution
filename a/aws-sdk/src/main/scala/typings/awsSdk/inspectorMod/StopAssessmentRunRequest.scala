package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopAssessmentRunRequest extends StObject {
  
  /**
    * The ARN of the assessment run that you want to stop.
    */
  var assessmentRunArn: Arn
  
  /**
    * An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default value), stops the AWS agent from collecting data and begins the results evaluation and the findings generation process. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.
    */
  var stopAction: js.UndefOr[StopAction] = js.undefined
}
object StopAssessmentRunRequest {
  
  inline def apply(assessmentRunArn: Arn): StopAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAssessmentRunRequest]
  }
  
  extension [Self <: StopAssessmentRunRequest](x: Self) {
    
    inline def setAssessmentRunArn(value: Arn): Self = StObject.set(x, "assessmentRunArn", value.asInstanceOf[js.Any])
    
    inline def setStopAction(value: StopAction): Self = StObject.set(x, "stopAction", value.asInstanceOf[js.Any])
    
    inline def setStopActionUndefined: Self = StObject.set(x, "stopAction", js.undefined)
  }
}
