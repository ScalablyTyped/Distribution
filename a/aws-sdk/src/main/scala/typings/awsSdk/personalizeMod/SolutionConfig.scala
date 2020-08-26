package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolutionConfig extends js.Object {
  /**
    * Lists the hyperparameter names and ranges.
    */
  var algorithmHyperParameters: js.UndefOr[HyperParameters] = js.native
  /**
    * The AutoMLConfig object containing a list of recipes to search when AutoML is performed.
    */
  var autoMLConfig: js.UndefOr[AutoMLConfig] = js.native
  /**
    * Only events with a value greater than or equal to this threshold are used for training a model.
    */
  var eventValueThreshold: js.UndefOr[EventValueThreshold] = js.native
  /**
    * Lists the feature transformation parameters.
    */
  var featureTransformationParameters: js.UndefOr[FeatureTransformationParameters] = js.native
  /**
    * Describes the properties for hyperparameter optimization (HPO).
    */
  var hpoConfig: js.UndefOr[HPOConfig] = js.native
}

object SolutionConfig {
  @scala.inline
  def apply(): SolutionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SolutionConfig]
  }
  @scala.inline
  implicit class SolutionConfigOps[Self <: SolutionConfig] (val x: Self) extends AnyVal {
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
    def setAlgorithmHyperParameters(value: HyperParameters): Self = this.set("algorithmHyperParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithmHyperParameters: Self = this.set("algorithmHyperParameters", js.undefined)
    @scala.inline
    def setAutoMLConfig(value: AutoMLConfig): Self = this.set("autoMLConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMLConfig: Self = this.set("autoMLConfig", js.undefined)
    @scala.inline
    def setEventValueThreshold(value: EventValueThreshold): Self = this.set("eventValueThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventValueThreshold: Self = this.set("eventValueThreshold", js.undefined)
    @scala.inline
    def setFeatureTransformationParameters(value: FeatureTransformationParameters): Self = this.set("featureTransformationParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureTransformationParameters: Self = this.set("featureTransformationParameters", js.undefined)
    @scala.inline
    def setHpoConfig(value: HPOConfig): Self = this.set("hpoConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHpoConfig: Self = this.set("hpoConfig", js.undefined)
  }
  
}

