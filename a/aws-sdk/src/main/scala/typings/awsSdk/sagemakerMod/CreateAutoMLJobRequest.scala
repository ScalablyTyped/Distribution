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
    * Similar to InputDataConfig supported by Tuning. Format(s) supported: CSV. Minimum of 1000 rows.
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
    RoleArn: RoleArn
  ): CreateAutoMLJobRequest = {
    val __obj = js.Dynamic.literal(AutoMLJobName = AutoMLJobName.asInstanceOf[js.Any], InputDataConfig = InputDataConfig.asInstanceOf[js.Any], OutputDataConfig = OutputDataConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoMLJobRequest]
  }
  @scala.inline
  implicit class CreateAutoMLJobRequestOps[Self <: CreateAutoMLJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoMLJobName(value: AutoMLJobName): Self = this.set("AutoMLJobName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputDataConfigVarargs(value: AutoMLChannel*): Self = this.set("InputDataConfig", js.Array(value :_*))
    @scala.inline
    def setInputDataConfig(value: AutoMLInputDataConfig): Self = this.set("InputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputDataConfig(value: AutoMLOutputDataConfig): Self = this.set("OutputDataConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoMLJobConfig(value: AutoMLJobConfig): Self = this.set("AutoMLJobConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMLJobConfig: Self = this.set("AutoMLJobConfig", js.undefined)
    @scala.inline
    def setAutoMLJobObjective(value: AutoMLJobObjective): Self = this.set("AutoMLJobObjective", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMLJobObjective: Self = this.set("AutoMLJobObjective", js.undefined)
    @scala.inline
    def setGenerateCandidateDefinitionsOnly(value: GenerateCandidateDefinitionsOnly): Self = this.set("GenerateCandidateDefinitionsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateCandidateDefinitionsOnly: Self = this.set("GenerateCandidateDefinitionsOnly", js.undefined)
    @scala.inline
    def setProblemType(value: ProblemType): Self = this.set("ProblemType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProblemType: Self = this.set("ProblemType", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

