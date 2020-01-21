package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExperimentRequest extends js.Object {
  /**
    * The description of the experiment.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.native
  /**
    * The name of the experiment as displayed. The name doesn't need to be unique. If DisplayName isn't specified, ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  /**
    * The name of the experiment to update.
    */
  var ExperimentName: ExperimentEntityName = js.native
}

object UpdateExperimentRequest {
  @scala.inline
  def apply(
    ExperimentName: ExperimentEntityName,
    Description: ExperimentDescription = null,
    DisplayName: ExperimentEntityName = null
  ): UpdateExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExperimentRequest]
  }
}

