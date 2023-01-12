package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnswerInput extends StObject {
  
  var LensAlias: typings.awsSdk.clientsWellarchitectedMod.LensAlias
  
  var MilestoneNumber: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MilestoneNumber] = js.undefined
  
  var QuestionId: typings.awsSdk.clientsWellarchitectedMod.QuestionId
  
  var WorkloadId: typings.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object GetAnswerInput {
  
  inline def apply(LensAlias: LensAlias, QuestionId: QuestionId, WorkloadId: WorkloadId): GetAnswerInput = {
    val __obj = js.Dynamic.literal(LensAlias = LensAlias.asInstanceOf[js.Any], QuestionId = QuestionId.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnswerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAnswerInput] (val x: Self) extends AnyVal {
    
    inline def setLensAlias(value: LensAlias): Self = StObject.set(x, "LensAlias", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumber(value: MilestoneNumber): Self = StObject.set(x, "MilestoneNumber", value.asInstanceOf[js.Any])
    
    inline def setMilestoneNumberUndefined: Self = StObject.set(x, "MilestoneNumber", js.undefined)
    
    inline def setQuestionId(value: QuestionId): Self = StObject.set(x, "QuestionId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
