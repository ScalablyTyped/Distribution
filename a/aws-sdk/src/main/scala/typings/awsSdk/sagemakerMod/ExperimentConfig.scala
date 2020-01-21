package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentConfig extends js.Object {
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentConfigName] = js.native
  /**
    * Display name for the trial component.
    */
  var TrialComponentDisplayName: js.UndefOr[ExperimentConfigName] = js.native
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentConfigName] = js.native
}

object ExperimentConfig {
  @scala.inline
  def apply(
    ExperimentName: ExperimentConfigName = null,
    TrialComponentDisplayName: ExperimentConfigName = null,
    TrialName: ExperimentConfigName = null
  ): ExperimentConfig = {
    val __obj = js.Dynamic.literal()
    if (ExperimentName != null) __obj.updateDynamic("ExperimentName")(ExperimentName.asInstanceOf[js.Any])
    if (TrialComponentDisplayName != null) __obj.updateDynamic("TrialComponentDisplayName")(TrialComponentDisplayName.asInstanceOf[js.Any])
    if (TrialName != null) __obj.updateDynamic("TrialName")(TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentConfig]
  }
}

