package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SolutionVersion extends js.Object {
  
  /**
    * The date and time (in Unix time) that this version of the solution was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group providing the training data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  
  /**
    * The event type (for example, 'click' or 'like') that is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.native
  
  /**
    * If training a solution version fails, the reason for the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  
  /**
    * When true, Amazon Personalize searches for the most optimal recipe according to the solution configuration. When false (the default), Amazon Personalize uses recipeArn.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.native
  
  /**
    * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.native
  
  /**
    * The ARN of the recipe used in the solution.
    */
  var recipeArn: js.UndefOr[Arn] = js.native
  
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.native
  
  /**
    * Describes the configuration properties for the solution.
    */
  var solutionConfig: js.UndefOr[SolutionConfig] = js.native
  
  /**
    * The ARN of the solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  
  /**
    * The status of the solution version. A solution version can be in one of the following states:   CREATE PENDING   CREATE IN_PROGRESS   ACTIVE   CREATE FAILED  
    */
  var status: js.UndefOr[Status] = js.native
  
  /**
    * The time used to train the model. You are billed for the time it takes to train a model. This field is visible only after Amazon Personalize successfully trains a model.
    */
  var trainingHours: js.UndefOr[TrainingHours] = js.native
  
  /**
    * The scope of training used to create the solution version. The FULL option trains the solution version based on the entirety of the input solution's training data, while the UPDATE option processes only the training data that has changed since the creation of the last solution version. Choose UPDATE when you want to start recommending items added to the dataset without retraining the model.  The UPDATE option can only be used after you've created a solution version with the FULL option and the training solution uses the native-recipe-hrnn-coldstart. 
    */
  var trainingMode: js.UndefOr[TrainingMode] = js.native
  
  /**
    * If hyperparameter optimization was performed, contains the hyperparameter values of the best performing model.
    */
  var tunedHPOParams: js.UndefOr[TunedHPOParams] = js.native
}
object SolutionVersion {
  
  @scala.inline
  def apply(): SolutionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionVersion]
  }
  
  @scala.inline
  implicit class SolutionVersionOps[Self <: SolutionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetGroupArn: Self = this.set("datasetGroupArn", js.undefined)
    
    @scala.inline
    def setEventType(value: EventType): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setPerformAutoML(value: PerformAutoML): Self = this.set("performAutoML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformAutoML: Self = this.set("performAutoML", js.undefined)
    
    @scala.inline
    def setPerformHPO(value: PerformHPO): Self = this.set("performHPO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformHPO: Self = this.set("performHPO", js.undefined)
    
    @scala.inline
    def setRecipeArn(value: Arn): Self = this.set("recipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeArn: Self = this.set("recipeArn", js.undefined)
    
    @scala.inline
    def setSolutionArn(value: Arn): Self = this.set("solutionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionArn: Self = this.set("solutionArn", js.undefined)
    
    @scala.inline
    def setSolutionConfig(value: SolutionConfig): Self = this.set("solutionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionConfig: Self = this.set("solutionConfig", js.undefined)
    
    @scala.inline
    def setSolutionVersionArn(value: Arn): Self = this.set("solutionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionVersionArn: Self = this.set("solutionVersionArn", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTrainingHours(value: TrainingHours): Self = this.set("trainingHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingHours: Self = this.set("trainingHours", js.undefined)
    
    @scala.inline
    def setTrainingMode(value: TrainingMode): Self = this.set("trainingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingMode: Self = this.set("trainingMode", js.undefined)
    
    @scala.inline
    def setTunedHPOParams(value: TunedHPOParams): Self = this.set("tunedHPOParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTunedHPOParams: Self = this.set("tunedHPOParams", js.undefined)
  }
}
