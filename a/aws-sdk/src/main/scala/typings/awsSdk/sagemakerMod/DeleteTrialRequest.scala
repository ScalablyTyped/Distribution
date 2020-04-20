package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrialRequest extends js.Object {
  /**
    * The name of the trial to delete.
    */
  var TrialName: ExperimentEntityName = js.native
}

object DeleteTrialRequest {
  @scala.inline
  def apply(TrialName: ExperimentEntityName): DeleteTrialRequest = {
    val __obj = js.Dynamic.literal(TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrialRequest]
  }
}

