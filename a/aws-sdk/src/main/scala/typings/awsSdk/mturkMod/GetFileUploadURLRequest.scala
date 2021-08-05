package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFileUploadURLRequest extends StObject {
  
  /**
    * The ID of the assignment that contains the question with a FileUploadAnswer.
    */
  var AssignmentId: EntityId
  
  /**
    * The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
    */
  var QuestionIdentifier: String
}
object GetFileUploadURLRequest {
  
  inline def apply(AssignmentId: EntityId, QuestionIdentifier: String): GetFileUploadURLRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any], QuestionIdentifier = QuestionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileUploadURLRequest]
  }
  
  extension [Self <: GetFileUploadURLRequest](x: Self) {
    
    inline def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdentifier(value: String): Self = StObject.set(x, "QuestionIdentifier", value.asInstanceOf[js.Any])
  }
}
