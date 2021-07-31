package typings.blipSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object BlipSdk {
    
    object Extensions {
      
      @js.native
      trait ArtificialIntelligence extends StObject {
        
        def analyse(analysis: js.Object): js.Promise[js.Object] = js.native
        
        // Content Assistant
        def analyseContent(analysis: js.Object): js.Promise[js.Object] = js.native
        
        def analyseWordSet(analysis: js.Object): js.Promise[js.Object] = js.native
        
        def deleteAnalytics(id: String): js.Promise[js.Object] = js.native
        
        def deleteContent(id: String): js.Promise[js.Object] = js.native
        
        def deleteEntities(): js.Promise[js.Object] = js.native
        
        def deleteEntity(id: String): js.Promise[js.Object] = js.native
        
        def deleteIntent(id: String): js.Promise[js.Object] = js.native
        
        def deleteIntentAnswer(id: String, answerId: String): js.Promise[js.Object] = js.native
        
        def deleteIntentQuestion(id: String, questionId: String): js.Promise[js.Object] = js.native
        
        def deleteIntents(): js.Promise[js.Object] = js.native
        
        def deleteWordSet(id: String): js.Promise[js.Object] = js.native
        
        // Analysis
        def getAnalysis(
          skip: js.UndefOr[Double],
          take: js.UndefOr[Double],
          ascending: js.UndefOr[Boolean],
          filter: js.UndefOr[String],
          intents: js.UndefOr[js.Array[String]],
          feedbacks: js.UndefOr[js.Array[String]],
          source: js.UndefOr[String],
          beginDate: js.UndefOr[String],
          endDate: js.UndefOr[String],
          minScore: js.UndefOr[String],
          maxScore: js.UndefOr[String]
        ): js.Promise[js.Object] = js.native
        
        // Analytics (Confusion Matrix)
        def getAnalytics(): js.Promise[js.Object] = js.native
        def getAnalytics(id: String): js.Promise[js.Object] = js.native
        
        def getContent(id: String): js.Promise[js.Object] = js.native
        
        def getContents(
          skip: js.UndefOr[Double],
          take: js.UndefOr[Double],
          ascending: js.UndefOr[Boolean],
          intents: js.UndefOr[js.Array[String]],
          entities: js.UndefOr[js.Array[String]],
          text: js.UndefOr[String],
          beginDate: js.UndefOr[String],
          endDate: js.UndefOr[String]
        ): js.Promise[js.Array[js.Object]] = js.native
        
        def getEntities(): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Double): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Double, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Double, take: Double, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Double, take: Double, ascending: Boolean, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Double, take: Double, ascending: Unit, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Double, take: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Double, take: Unit, ascending: Boolean, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Double, take: Unit, ascending: Unit, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Unit, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Unit, take: Double, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Unit, take: Double, ascending: Boolean, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Unit, take: Double, ascending: Unit, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Unit, take: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Unit, take: Unit, ascending: Boolean, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getEntities(skip: Unit, take: Unit, ascending: Unit, name: String): js.Promise[js.Array[js.Object]] = js.native
        
        // Entity
        def getEntity(id: String): js.Promise[js.Object] = js.native
        
        // Intents
        def getIntent(id: String): js.Promise[js.Object] = js.native
        def getIntent(id: String, deep: Boolean): js.Promise[js.Object] = js.native
        
        // Answers
        def getIntentAnswers(): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: String): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: String, skip: Double): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: String, skip: Double, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: String, skip: Double, take: Double, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: String, skip: Double, take: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: String, skip: Unit, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: String, skip: Unit, take: Double, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: String, skip: Unit, take: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: Unit, skip: Double): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: Unit, skip: Double, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: Unit, skip: Double, take: Double, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: Unit, skip: Double, take: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: Unit, skip: Unit, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: Unit, skip: Unit, take: Double, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntentAnswers(id: Unit, skip: Unit, take: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        
        // Questions
        def getIntentQuestions(id: String): js.Promise[js.Array[js.Object]] = js.native
        
        def getIntents(): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Double, deep: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Double, deep: Boolean, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Double, deep: Boolean, name: String, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Double, deep: Boolean, name: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Double, deep: Unit, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Double, deep: Unit, name: String, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Double, deep: Unit, name: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Unit, deep: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Unit, deep: Boolean, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Unit, deep: Boolean, name: String, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Unit, deep: Boolean, name: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Unit, deep: Unit, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Unit, deep: Unit, name: String, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Double, take: Unit, deep: Unit, name: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Double, deep: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Double, deep: Boolean, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Double, deep: Boolean, name: String, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Double, deep: Boolean, name: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Double, deep: Unit, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Double, deep: Unit, name: String, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Double, deep: Unit, name: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Unit, deep: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Unit, deep: Boolean, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Unit, deep: Boolean, name: String, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Unit, deep: Boolean, name: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Unit, deep: Unit, name: String): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Unit, deep: Unit, name: String, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getIntents(skip: Unit, take: Unit, deep: Unit, name: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        
        // Model
        def getModel(id: String): js.Promise[js.Object] = js.native
        
        def getModelSummary(): js.Promise[js.Object] = js.native
        
        def getModels(): js.Promise[js.Array[js.Object]] = js.native
        def getModels(skip: Double): js.Promise[js.Array[js.Object]] = js.native
        def getModels(skip: Double, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getModels(skip: Double, take: Double, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getModels(skip: Double, take: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getModels(skip: Unit, take: Double): js.Promise[js.Array[js.Object]] = js.native
        def getModels(skip: Unit, take: Double, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        def getModels(skip: Unit, take: Unit, ascending: Boolean): js.Promise[js.Array[js.Object]] = js.native
        
        // Word Set
        def getWordSet(id: String): js.Promise[js.Object] = js.native
        def getWordSet(id: String, deep: Boolean): js.Promise[js.Object] = js.native
        
        def getWordSets(): js.Promise[js.Array[js.Object]] = js.native
        def getWordSets(deep: Boolean): js.Promise[js.Array[js.Object]] = js.native
        
        def matchContent(combination: js.Object): js.Promise[js.Object] = js.native
        
        def mergeIntent(intent: js.Object): js.Promise[js.Object] = js.native
        
        def mergeIntents(intents: js.Array[js.Object]): js.Promise[js.Object] = js.native
        
        def publishModel(id: String): js.Promise[js.Object] = js.native
        
        def setAnalysesFeedback(analyses: js.Array[js.Object]): js.Promise[js.Object] = js.native
        
        def setAnalysisByEmail(
          emailAndFilter: js.Object,
          intents: js.UndefOr[js.Array[String]],
          feedbacks: js.UndefOr[js.Array[String]],
          source: js.UndefOr[String],
          beginDate: js.UndefOr[String],
          endDate: js.UndefOr[String],
          minScore: js.UndefOr[String],
          maxScore: js.UndefOr[String]
        ): js.Promise[js.Object] = js.native
        
        def setAnalysisFeedback(id: String, analysisFeedback: js.Object): js.Promise[js.Object] = js.native
        
        def setAnalytics(confusionMatrix: js.Object): js.Promise[js.Object] = js.native
        
        def setContent(content: js.Object): js.Promise[js.Object] = js.native
        
        def setContentCombination(id: String, combination: js.Object): js.Promise[js.Object] = js.native
        
        def setContentCombinations(id: String, combinations: js.Array[js.Object]): js.Promise[js.Object] = js.native
        
        def setContentResult(id: String, content: js.Object): js.Promise[js.Object] = js.native
        
        def setEntity(entity: js.Object): js.Promise[js.Object] = js.native
        
        def setIntent(intent: js.Object): js.Promise[js.Object] = js.native
        
        def setIntentAnswers(id: String, answers: js.Array[js.Object]): js.Promise[js.Object] = js.native
        
        def setIntentQuestions(id: String, questions: js.Array[js.Object]): js.Promise[js.Object] = js.native
        
        def setIntents(intents: js.Array[js.Object]): js.Promise[js.Object] = js.native
        
        def setWordSet(wordSet: js.Object): js.Promise[js.Object] = js.native
        
        def setWordSetResource(id: String, resource: js.Array[js.Object]): js.Promise[js.Object] = js.native
        
        def trainModel(): js.Promise[js.Object] = js.native
      }
    }
  }
}
