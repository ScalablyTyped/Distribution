package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QualificationRequest extends StObject {
  
  /**
    *  The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the type has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer may be empty. 
    */
  var Answer: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Qualification request, a unique identifier generated when the request was submitted. 
    */
  var QualificationRequestId: js.UndefOr[String] = js.undefined
  
  /**
    *  The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType operation. 
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The date and time the Qualification request had a status of Submitted. This is either the time the Worker submitted answers for a Qualification test, or the time the Worker requested the Qualification if the Qualification type does not have a test. 
    */
  var SubmitTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The contents of the Qualification test that was presented to the Worker, if the type has a test and the Worker has submitted answers. This value is identical to the QuestionForm associated with the Qualification type at the time the Worker requests the Qualification.
    */
  var Test: js.UndefOr[String] = js.undefined
  
  /**
    *  The ID of the Worker requesting the Qualification.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.undefined
}
object QualificationRequest {
  
  inline def apply(): QualificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualificationRequest]
  }
  
  extension [Self <: QualificationRequest](x: Self) {
    
    inline def setAnswer(value: String): Self = StObject.set(x, "Answer", value.asInstanceOf[js.Any])
    
    inline def setAnswerUndefined: Self = StObject.set(x, "Answer", js.undefined)
    
    inline def setQualificationRequestId(value: String): Self = StObject.set(x, "QualificationRequestId", value.asInstanceOf[js.Any])
    
    inline def setQualificationRequestIdUndefined: Self = StObject.set(x, "QualificationRequestId", js.undefined)
    
    inline def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    inline def setQualificationTypeIdUndefined: Self = StObject.set(x, "QualificationTypeId", js.undefined)
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
    
    inline def setTest(value: String): Self = StObject.set(x, "Test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "Test", js.undefined)
    
    inline def setWorkerId(value: CustomerId): Self = StObject.set(x, "WorkerId", value.asInstanceOf[js.Any])
    
    inline def setWorkerIdUndefined: Self = StObject.set(x, "WorkerId", js.undefined)
  }
}
