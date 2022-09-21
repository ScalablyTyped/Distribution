package typings.awsSdk.migrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssessmentRequest extends StObject {
  
  /**
    *  The assessmentid returned by StartAssessment.
    */
  var id: AsyncTaskId
}
object GetAssessmentRequest {
  
  inline def apply(id: AsyncTaskId): GetAssessmentRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssessmentRequest]
  }
  
  extension [Self <: GetAssessmentRequest](x: Self) {
    
    inline def setId(value: AsyncTaskId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
