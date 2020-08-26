package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Algorithm extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var algorithmArn: js.UndefOr[Arn] = js.native
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var algorithmImage: js.UndefOr[AlgorithmImage] = js.native
  /**
    * The date and time (in Unix time) that the algorithm was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  /**
    * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  var defaultHyperParameterRanges: js.UndefOr[DefaultHyperParameterRanges] = js.native
  /**
    * Specifies the default hyperparameters.
    */
  var defaultHyperParameters: js.UndefOr[HyperParameters] = js.native
  /**
    * Specifies the default maximum number of training jobs and parallel training jobs.
    */
  var defaultResourceConfig: js.UndefOr[ResourceConfig] = js.native
  /**
    * The date and time (in Unix time) that the algorithm was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  /**
    * The name of the algorithm.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role.
    */
  var roleArn: js.UndefOr[Arn] = js.native
  /**
    * The training input mode.
    */
  var trainingInputMode: js.UndefOr[TrainingInputMode] = js.native
}

object Algorithm {
  @scala.inline
  def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  @scala.inline
  implicit class AlgorithmOps[Self <: Algorithm] (val x: Self) extends AnyVal {
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
    def setAlgorithmArn(value: Arn): Self = this.set("algorithmArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithmArn: Self = this.set("algorithmArn", js.undefined)
    @scala.inline
    def setAlgorithmImage(value: AlgorithmImage): Self = this.set("algorithmImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithmImage: Self = this.set("algorithmImage", js.undefined)
    @scala.inline
    def setCreationDateTime(value: Date): Self = this.set("creationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDateTime: Self = this.set("creationDateTime", js.undefined)
    @scala.inline
    def setDefaultHyperParameterRanges(value: DefaultHyperParameterRanges): Self = this.set("defaultHyperParameterRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHyperParameterRanges: Self = this.set("defaultHyperParameterRanges", js.undefined)
    @scala.inline
    def setDefaultHyperParameters(value: HyperParameters): Self = this.set("defaultHyperParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultHyperParameters: Self = this.set("defaultHyperParameters", js.undefined)
    @scala.inline
    def setDefaultResourceConfig(value: ResourceConfig): Self = this.set("defaultResourceConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultResourceConfig: Self = this.set("defaultResourceConfig", js.undefined)
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = this.set("lastUpdatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedDateTime: Self = this.set("lastUpdatedDateTime", js.undefined)
    @scala.inline
    def setName(value: Name): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setTrainingInputMode(value: TrainingInputMode): Self = this.set("trainingInputMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainingInputMode: Self = this.set("trainingInputMode", js.undefined)
  }
  
}

