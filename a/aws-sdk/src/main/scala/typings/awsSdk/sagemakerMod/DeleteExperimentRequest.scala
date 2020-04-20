package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteExperimentRequest extends js.Object {
  /**
    * The name of the experiment to delete.
    */
  var ExperimentName: ExperimentEntityName = js.native
}

object DeleteExperimentRequest {
  @scala.inline
  def apply(ExperimentName: ExperimentEntityName): DeleteExperimentRequest = {
    val __obj = js.Dynamic.literal(ExperimentName = ExperimentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExperimentRequest]
  }
}

