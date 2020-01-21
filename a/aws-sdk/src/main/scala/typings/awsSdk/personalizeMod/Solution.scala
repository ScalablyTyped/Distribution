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
  def apply(
    autoMLResult: AutoMLResult = null,
    creationDateTime: Date = null,
    datasetGroupArn: Arn = null,
    eventType: EventType = null,
    lastUpdatedDateTime: Date = null,
    latestSolutionVersion: SolutionVersionSummary = null,
    name: Name = null,
    performAutoML: js.UndefOr[scala.Boolean] = js.undefined,
    performHPO: js.UndefOr[scala.Boolean] = js.undefined,
    recipeArn: Arn = null,
    solutionArn: Arn = null,
    solutionConfig: SolutionConfig = null,
    status: Status = null
  ): Solution = {
    val __obj = js.Dynamic.literal()
    if (autoMLResult != null) __obj.updateDynamic("autoMLResult")(autoMLResult.asInstanceOf[js.Any])
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn.asInstanceOf[js.Any])
    if (eventType != null) __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (latestSolutionVersion != null) __obj.updateDynamic("latestSolutionVersion")(latestSolutionVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(performAutoML)) __obj.updateDynamic("performAutoML")(performAutoML.asInstanceOf[js.Any])
    if (!js.isUndefined(performHPO)) __obj.updateDynamic("performHPO")(performHPO.asInstanceOf[js.Any])
    if (recipeArn != null) __obj.updateDynamic("recipeArn")(recipeArn.asInstanceOf[js.Any])
    if (solutionArn != null) __obj.updateDynamic("solutionArn")(solutionArn.asInstanceOf[js.Any])
    if (solutionConfig != null) __obj.updateDynamic("solutionConfig")(solutionConfig.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Solution]
  }
}

