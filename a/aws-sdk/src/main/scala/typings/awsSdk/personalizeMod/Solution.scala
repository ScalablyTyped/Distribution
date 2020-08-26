package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Solution extends js.Object {
  /**
    * When performAutoML is true, specifies the best recipe found.
    */
  var autoMLResult: js.UndefOr[AutoMLResult] = js.native
  /**
    * The creation date and time (in Unix time) of the solution.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The event type (for example, 'click' or 'like') that is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.native
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * Describes the latest version of the solution, including the status and the ARN.
    */
  var latestSolutionVersion: js.UndefOr[SolutionVersionSummary] = js.native
  /**
    * The name of the solution.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list specified in the solution configuration (recipeArn must not be specified). When false (the default), Amazon Personalize uses recipeArn for training.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.native
  /**
    * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.native
  /**
    * The ARN of the recipe used to create the solution.
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
    * The status of the solution. A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}

object Solution {
  @scala.inline
  def apply(): Solution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Solution]
  }
  @scala.inline
  implicit class SolutionOps[Self <: Solution] (val x: Self) extends AnyVal {
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
    def setAutoMLResult(value: AutoMLResult): Self = this.set("autoMLResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMLResult: Self = this.set("autoMLResult", js.undefined)
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
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    @scala.inline
    def setLatestSolutionVersion(value: SolutionVersionSummary): Self = this.set("latestSolutionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestSolutionVersion: Self = this.set("latestSolutionVersion", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
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
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

