package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopAssessmentRequest extends StObject {
  
  /**
    *  The assessmentId returned by StartAssessment. 
    */
  var assessmentId: AsyncTaskId
}
object StopAssessmentRequest {
  
  inline def apply(assessmentId: AsyncTaskId): StopAssessmentRequest = {
    val __obj = js.Dynamic.literal(assessmentId = assessmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAssessmentRequest]
  }
  
  extension [Self <: StopAssessmentRequest](x: Self) {
    
    inline def setAssessmentId(value: AsyncTaskId): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
  }
}
