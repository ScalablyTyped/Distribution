package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSolutionRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
    */
  var datasetGroupArn: Arn = js.native
  
  /**
    * When your have multiple event types (using an EVENT_TYPE schema field), this parameter specifies which event type (for example, 'click' or 'like') is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.native
  
  /**
    * The name for the solution.
    */
  var name: Name = js.native
  
  /**
    * Whether to perform automated machine learning (AutoML). The default is false. For this case, you must specify recipeArn. When set to true, Amazon Personalize analyzes your training data and selects the optimal USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit recipeArn. Amazon Personalize determines the optimal recipe by running tests with different values for the hyperparameters. AutoML lengthens the training process as compared to selecting a specific recipe.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.native
  
  /**
    * Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is false. When performing AutoML, this parameter is always true and you should not set it to false.
    */
  var performHPO: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the recipe to use for model training. Only specified when performAutoML is false.
    */
  var recipeArn: js.UndefOr[Arn] = js.native
  
  /**
    * The configuration to use with the solution. When performAutoML is set to true, Amazon Personalize only evaluates the autoMLConfig section of the solution configuration.
    */
  var solutionConfig: js.UndefOr[SolutionConfig] = js.native
}
object CreateSolutionRequest {
  
  @scala.inline
  def apply(datasetGroupArn: Arn, name: Name): CreateSolutionRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSolutionRequest]
  }
  
  @scala.inline
  implicit class CreateSolutionRequestOps[Self <: CreateSolutionRequest] (val x: Self) extends AnyVal {
    
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
    def setDatasetGroupArn(value: Arn): Self = this.set("datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventType(value: EventType): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setPerformAutoML(value: PerformAutoML): Self = this.set("performAutoML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformAutoML: Self = this.set("performAutoML", js.undefined)
    
    @scala.inline
    def setPerformHPO(value: Boolean): Self = this.set("performHPO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformHPO: Self = this.set("performHPO", js.undefined)
    
    @scala.inline
    def setRecipeArn(value: Arn): Self = this.set("recipeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipeArn: Self = this.set("recipeArn", js.undefined)
    
    @scala.inline
    def setSolutionConfig(value: SolutionConfig): Self = this.set("solutionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionConfig: Self = this.set("solutionConfig", js.undefined)
  }
}
