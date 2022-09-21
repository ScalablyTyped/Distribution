package typings.awsSdk.wellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Answer extends StObject {
  
  /**
    * A list of selected choices to a question in your workload.
    */
  var ChoiceAnswers: js.UndefOr[typings.awsSdk.wellarchitectedMod.ChoiceAnswers] = js.undefined
  
  var Choices: js.UndefOr[typings.awsSdk.wellarchitectedMod.Choices] = js.undefined
  
  /**
    * The helpful resource text to be displayed.
    */
  var HelpfulResourceDisplayText: js.UndefOr[DisplayText] = js.undefined
  
  var HelpfulResourceUrl: js.UndefOr[typings.awsSdk.wellarchitectedMod.HelpfulResourceUrl] = js.undefined
  
  var ImprovementPlanUrl: js.UndefOr[typings.awsSdk.wellarchitectedMod.ImprovementPlanUrl] = js.undefined
  
  var IsApplicable: js.UndefOr[typings.awsSdk.wellarchitectedMod.IsApplicable] = js.undefined
  
  var Notes: js.UndefOr[typings.awsSdk.wellarchitectedMod.Notes] = js.undefined
  
  var PillarId: js.UndefOr[typings.awsSdk.wellarchitectedMod.PillarId] = js.undefined
  
  var QuestionDescription: js.UndefOr[typings.awsSdk.wellarchitectedMod.QuestionDescription] = js.undefined
  
  var QuestionId: js.UndefOr[typings.awsSdk.wellarchitectedMod.QuestionId] = js.undefined
  
  var QuestionTitle: js.UndefOr[typings.awsSdk.wellarchitectedMod.QuestionTitle] = js.undefined
  
  /**
    * The reason why the question is not applicable to your workload.
    */
  var Reason: js.UndefOr[AnswerReason] = js.undefined
  
  var Risk: js.UndefOr[typings.awsSdk.wellarchitectedMod.Risk] = js.undefined
  
  var SelectedChoices: js.UndefOr[typings.awsSdk.wellarchitectedMod.SelectedChoices] = js.undefined
}
object Answer {
  
  inline def apply(): Answer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Answer]
  }
  
  extension [Self <: Answer](x: Self) {
    
    inline def setChoiceAnswers(value: ChoiceAnswers): Self = StObject.set(x, "ChoiceAnswers", value.asInstanceOf[js.Any])
    
    inline def setChoiceAnswersUndefined: Self = StObject.set(x, "ChoiceAnswers", js.undefined)
    
    inline def setChoiceAnswersVarargs(value: ChoiceAnswer*): Self = StObject.set(x, "ChoiceAnswers", js.Array(value*))
    
    inline def setChoices(value: Choices): Self = StObject.set(x, "Choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesUndefined: Self = StObject.set(x, "Choices", js.undefined)
    
    inline def setChoicesVarargs(value: Choice*): Self = StObject.set(x, "Choices", js.Array(value*))
    
    inline def setHelpfulResourceDisplayText(value: DisplayText): Self = StObject.set(x, "HelpfulResourceDisplayText", value.asInstanceOf[js.Any])
    
    inline def setHelpfulResourceDisplayTextUndefined: Self = StObject.set(x, "HelpfulResourceDisplayText", js.undefined)
    
    inline def setHelpfulResourceUrl(value: HelpfulResourceUrl): Self = StObject.set(x, "HelpfulResourceUrl", value.asInstanceOf[js.Any])
    
    inline def setHelpfulResourceUrlUndefined: Self = StObject.set(x, "HelpfulResourceUrl", js.undefined)
    
    inline def setImprovementPlanUrl(value: ImprovementPlanUrl): Self = StObject.set(x, "ImprovementPlanUrl", value.asInstanceOf[js.Any])
    
    inline def setImprovementPlanUrlUndefined: Self = StObject.set(x, "ImprovementPlanUrl", js.undefined)
    
    inline def setIsApplicable(value: IsApplicable): Self = StObject.set(x, "IsApplicable", value.asInstanceOf[js.Any])
    
    inline def setIsApplicableUndefined: Self = StObject.set(x, "IsApplicable", js.undefined)
    
    inline def setNotes(value: Notes): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setPillarId(value: PillarId): Self = StObject.set(x, "PillarId", value.asInstanceOf[js.Any])
    
    inline def setPillarIdUndefined: Self = StObject.set(x, "PillarId", js.undefined)
    
    inline def setQuestionDescription(value: QuestionDescription): Self = StObject.set(x, "QuestionDescription", value.asInstanceOf[js.Any])
    
    inline def setQuestionDescriptionUndefined: Self = StObject.set(x, "QuestionDescription", js.undefined)
    
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
