package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteExperimentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the experiment that is being deleted.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentArn] = js.native
}

object DeleteExperimentResponse {
  @scala.inline
  def apply(ExperimentArn: ExperimentArn = null): DeleteExperimentResponse = {
    val __obj = js.Dynamic.literal()
    if (ExperimentArn != null) __obj.updateDynamic("ExperimentArn")(ExperimentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExperimentResponse]
  }
}

