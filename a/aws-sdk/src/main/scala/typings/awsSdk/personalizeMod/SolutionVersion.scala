package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SolutionVersion extends StObject {
  
  /**
    * The date and time (in Unix time) that this version of the solution was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group providing the training data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The event type (for example, 'click' or 'like') that is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.undefined
  
  /**
    * If training a solution version fails, the reason for the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * When true, Amazon Personalize searches for the most optimal recipe according to the solution configuration. When false (the default), Amazon Personalize uses recipeArn.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.undefined
  
  /**
    * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.undefined
  
  /**
    * The ARN of the recipe used in the solution.
    */
  var recipeArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Describes the configuration properties for the solution.
    */
  var solutionConfig: js.UndefOr[SolutionConfig] = js.undefined
  
  /**
    * The ARN of the solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the solution version. A solution version can be in one of the following states:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The time used to train the model. You are billed for the time it takes to train a model. This field is visible only after Amazon Personalize successfully trains a model.
    */
  var trainingHours: js.UndefOr[TrainingHours] = js.undefined
  
  /**
    * The scope of training used to create the solution version. The FULL option trains the solution version based on the entirety of the input solution's training data, while the UPDATE option processes only the training data that has changed since the creation of the last solution version. Choose UPDATE when you want to start recommending items added to the dataset without retraining the model.  The UPDATE option can only be used after you've created a solution version with the FULL option and the training solution uses the native-recipe-hrnn-coldstart. 
    */
  var trainingMode: js.UndefOr[TrainingMode] = js.undefined
  
  /**
    * If hyperparameter optimization was performed, contains the hyperparameter values of the best performing model.
    */
  var tunedHPOParams: js.UndefOr[TunedHPOParams] = js.undefined
}
object SolutionVersion {
  
  inline def apply(): SolutionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionVersion]
  }
  
  extension [Self <: SolutionVersion](x: Self) {
    
    inline def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setPerformAutoML(value: PerformAutoML): Self = StObject.set(x, "performAutoML", value.asInstanceOf[js.Any])
    
    inline def setPerformAutoMLUndefined: Self = StObject.set(x, "performAutoML", js.undefined)
    
    inline def setPerformHPO(value: PerformHPO): Self = StObject.set(x, "performHPO", value.asInstanceOf[js.Any])
    
    inline def setPerformHPOUndefined: Self = StObject.set(x, "performHPO", js.undefined)
    
    inline def setRecipeArn(value: Arn): Self = StObject.set(x, "recipeArn", value.asInstanceOf[js.Any])
    
    inline def setRecipeArnUndefined: Self = StObject.set(x, "recipeArn", js.undefined)
    
    inline def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionArnUndefined: Self = StObject.set(x, "solutionArn", js.undefined)
    
    inline def setSolutionConfig(value: SolutionConfig): Self = StObject.set(x, "solutionConfig", value.asInstanceOf[js.Any])
    
    inline def setSolutionConfigUndefined: Self = StObject.set(x, "solutionConfig", js.undefined)
    
    inline def setSolutionVersionArn(value: Arn): Self = StObject.set(x, "solutionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionVersionArnUndefined: Self = StObject.set(x, "solutionVersionArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrainingHours(value: TrainingHours): Self = StObject.set(x, "trainingHours", value.asInstanceOf[js.Any])
    
    inline def setTrainingHoursUndefined: Self = StObject.set(x, "trainingHours", js.undefined)
    
    inline def setTrainingMode(value: TrainingMode): Self = StObject.set(x, "trainingMode", value.asInstanceOf[js.Any])
    
    inline def setTrainingModeUndefined: Self = StObject.set(x, "trainingMode", js.undefined)
    
    inline def setTunedHPOParams(value: TunedHPOParams): Self = StObject.set(x, "tunedHPOParams", value.asInstanceOf[js.Any])
    
    inline def setTunedHPOParamsUndefined: Self = StObject.set(x, "tunedHPOParams", js.undefined)
  }
}
