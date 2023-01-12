package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCheckDetailsInput extends StObject {
  
  var ChoiceId: typings.awsSdk.clientsWellarchitectedMod.ChoiceId
  
  /**
    * Well-Architected Lens ARN.
    */
  var LensArn: typings.awsSdk.clientsWellarchitectedMod.LensArn
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.NextToken] = js.undefined
  
  var PillarId: typings.awsSdk.clientsWellarchitectedMod.PillarId
  
  var QuestionId: typings.awsSdk.clientsWellarchitectedMod.QuestionId
  
  var WorkloadId: typings.awsSdk.clientsWellarchitectedMod.WorkloadId
}
object ListCheckDetailsInput {
  
  inline def apply(
    ChoiceId: ChoiceId,
    LensArn: LensArn,
    PillarId: PillarId,
    QuestionId: QuestionId,
    WorkloadId: WorkloadId
  ): ListCheckDetailsInput = {
    val __obj = js.Dynamic.literal(ChoiceId = ChoiceId.asInstanceOf[js.Any], LensArn = LensArn.asInstanceOf[js.Any], PillarId = PillarId.asInstanceOf[js.Any], QuestionId = QuestionId.asInstanceOf[js.Any], WorkloadId = WorkloadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCheckDetailsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCheckDetailsInput] (val x: Self) extends AnyVal {
    
    inline def setChoiceId(value: ChoiceId): Self = StObject.set(x, "ChoiceId", value.asInstanceOf[js.Any])
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPillarId(value: PillarId): Self = StObject.set(x, "PillarId", value.asInstanceOf[js.Any])
    
    inline def setQuestionId(value: QuestionId): Self = StObject.set(x, "QuestionId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
  }
}
