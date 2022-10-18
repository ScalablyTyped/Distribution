package typings.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnswerSummary extends StObject {
  
  /**
    * A list of selected choices to a question in your workload.
    */
  var ChoiceAnswerSummaries: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.ChoiceAnswerSummaries] = js.undefined
  
  var Choices: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Choices] = js.undefined
  
  var IsApplicable: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.IsApplicable] = js.undefined
  
  var PillarId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.PillarId] = js.undefined
  
  var QuestionId: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.QuestionId] = js.undefined
  
  var QuestionTitle: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.QuestionTitle] = js.undefined
  
  /**
    * The reason why a choice is non-applicable to a question in your workload.
    */
  var Reason: js.UndefOr[AnswerReason] = js.undefined
  
  var Risk: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.Risk] = js.undefined
  
  var SelectedChoices: js.UndefOr[typings.awsSdk.clientsWellarchitectedMod.SelectedChoices] = js.undefined
}
object AnswerSummary {
  
  inline def apply(): AnswerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnswerSummary]
  }
  
  extension [Self <: AnswerSummary](x: Self) {
    
    inline def setChoiceAnswerSummaries(value: ChoiceAnswerSummaries): Self = StObject.set(x, "ChoiceAnswerSummaries", value.asInstanceOf[js.Any])
    
    inline def setChoiceAnswerSummariesUndefined: Self = StObject.set(x, "ChoiceAnswerSummaries", js.undefined)
    
    inline def setChoiceAnswerSummariesVarargs(value: ChoiceAnswerSummary*): Self = StObject.set(x, "ChoiceAnswerSummaries", js.Array(value*))
    
    inline def setChoices(value: Choices): Self = StObject.set(x, "Choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesUndefined: Self = StObject.set(x, "Choices", js.undefined)
    
    inline def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "Choices", js.Array(value*))
    
    inline def setIsApplicable(value: IsApplicable): Self = StObject.set(x, "IsApplicable", value.asInstanceOf[js.Any])
    
    inline def setIsApplicableUndefined: Self = StObject.set(x, "IsApplicable", js.undefined)
    
    inline def setPillarId(value: PillarId): Self = StObject.set(x, "PillarId", value.asInstanceOf[js.Any])
    
    inline def setPillarIdUndefined: Self = StObject.set(x, "PillarId", js.undefined)
    
    inline def setQuestionId(value: QuestionId): Self = StObject.set(x, "QuestionId", value.asInstanceOf[js.Any])
    
    inline def setQuestionIdUndefined: Self = StObject.set(x, "QuestionId", js.undefined)
    
    inline def setQuestionTitle(value: QuestionTitle): Self = StObject.set(x, "QuestionTitle", value.asInstanceOf[js.Any])
    
    inline def setQuestionTitleUndefined: Self = StObject.set(x, "QuestionTitle", js.undefined)
    
    inline def setReason(value: AnswerReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setRisk(value: Risk): Self = StObject.set(x, "Risk", value.asInstanceOf[js.Any])
    
    inline def setRiskUndefined: Self = StObject.set(x, "Risk", js.undefined)
    
    inline def setSelectedChoices(value: SelectedChoices): Self = StObject.set(x, "SelectedChoices", value.asInstanceOf[js.Any])
    
    inline def setSelectedChoicesUndefined: Self = StObject.set(x, "SelectedChoices", js.undefined)
    
    inline def setSelectedChoicesVarargs(value: ChoiceId*): Self = StObject.set(x, "SelectedChoices", js.Array(value*))
  }
}
