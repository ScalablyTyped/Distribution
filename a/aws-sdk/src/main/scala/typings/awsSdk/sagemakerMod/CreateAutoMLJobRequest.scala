package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAutoMLJobRequest extends js.Object {
  /**
    * Contains CompletionCriteria and SecurityConfig.
    */
  var AutoMLJobConfig: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobConfig] = js.native
  /**
    * Identifies an AutoPilot job. Must be unique to your account and is case-insensitive.
    */
  var AutoMLJobName: typings.awsSdk.sagemakerMod.AutoMLJobName = js.native
  /**
    * Defines the job's objective. You provide a MetricName and AutoML will infer minimize or maximize. If this is not provided, the most commonly used ObjectiveMetric for problem type will be selected.
    */
  var AutoMLJobObjective: js.UndefOr[typings.awsSdk.sagemakerMod.AutoMLJobObjective] = js.native
  /**
    * This will generate possible candidates without training a model. A candidate is a combination of data preprocessors, algorithms, and algorithm parameter settings.
    */
  var GenerateCandidateDefinitionsOnly: js.UndefOr[typings.awsSdk.sagemakerMod.GenerateCandidateDefinitionsOnly] = js.native
  /**
    * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV.
    */
  var InputDataConfig: AutoMLInputDataConfig = js.native
  /**
    * Similar to OutputDataConfig supported by Tuning. Format(s) supported: CSV.
    */
  var OutputDataConfig: AutoMLOutputDataConfig = js.native
  /**
    * Defines the kind of preprocessing and algorithms intended for the candidates. Options include: BinaryClassification, MulticlassClassification, and Regression.
    */
  var ProblemType: js.UndefOr[typings.awsSdk.sagemakerMod.ProblemType] = js.native
  /**
    * The ARN of the role that will be used to access the data.
    */
  var RoleArn: typings.awsSdk.sagemakerMod.RoleArn = js.native
  /**
    * Each tag consists of a key and an optional value. Tag keys must be unique per resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateAutoMLJobRequest {
  @scala.inline
  def apply(
    AutoMLJobName: AutoMLJobName,
    InputDataConfig: AutoMLInputDataConfig,
    OutputDataConfig: AutoMLOutputDataConfig,
    RoleArn: RoleArn,
    AutoMLJobConfig: AutoMLJobConfig = null,
    AutoMLJobObjective: AutoMLJobObjective = null,
    GenerateCandidateDefinitionsOnly: js.UndefOr[scala.Boolean] = js.undefined,
    ProblemType: ProblemType = null,
    Tags: TagList = null
  ): CreateAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (AutoMLJobConfig != null) __obj.updateDynamic("AutoMLJobConfig")(AutoMLJobConfig.asInstanceOf[js.Any])
    if (AutoMLJobObjective != null) __obj.updateDynamic("AutoMLJobObjective")(AutoMLJobObjective.asInstanceOf[js.Any])
    if (!js.isUndefined(GenerateCandidateDefinitionsOnly)) __obj.updateDynamic("GenerateCandidateDefinitionsOnly")(GenerateCandidateDefinitionsOnly.asInstanceOf[js.Any])
    if (ProblemType != null) __obj.updateDynamic("ProblemType")(ProblemType.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobRequest]
  }
}

