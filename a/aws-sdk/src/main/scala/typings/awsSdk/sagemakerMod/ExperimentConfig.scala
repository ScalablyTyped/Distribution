package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExperimentConfig extends js.Object {
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * Display name for the trial component.
    */
  var TrialComponentDisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
}

object ExperimentConfig {
  @scala.inline
  def apply(
    ExperimentName: ExperimentEntityName = null,
    TrialComponentDisplayName: ExperimentEntityName = null,
    TrialName: ExperimentEntityName = null
  ): ExperimentConfig = {
    val __obj = js.Dynamic.literal()
    if (ExperimentName != null) __obj.updateDynamic("ExperimentName")(ExperimentName.asInstanceOf[js.Any])
    if (TrialComponentDisplayName != null) __obj.updateDynamic("TrialComponentDisplayName")(TrialComponentDisplayName.asInstanceOf[js.Any])
    if (TrialName != null) __obj.updateDynamic("TrialName")(TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExperimentConfig]
  }
}

