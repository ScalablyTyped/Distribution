package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAssessmentResponse extends StObject {
  
  /**
    *  The ID of the assessment. 
    */
  var assessmentId: js.UndefOr[AsyncTaskId] = js.undefined
}
object StartAssessmentResponse {
  
  inline def apply(): StartAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAssessmentResponse]
  }
  
  extension [Self <: StartAssessmentResponse](x: Self) {
    
    inline def setAssessmentId(value: AsyncTaskId): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setAssessmentIdUndefined: Self = StObject.set(x, "assessmentId", js.undefined)
  }
}
