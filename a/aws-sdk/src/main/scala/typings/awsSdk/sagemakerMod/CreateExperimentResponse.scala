package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExperimentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentArn] = js.native
}

object CreateExperimentResponse {
  @scala.inline
  def apply(ExperimentArn: ExperimentArn = null): CreateExperimentResponse = {
    val __obj = js.Dynamic.literal()
    if (ExperimentArn != null) __obj.updateDynamic("ExperimentArn")(ExperimentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperimentResponse]
  }
}

