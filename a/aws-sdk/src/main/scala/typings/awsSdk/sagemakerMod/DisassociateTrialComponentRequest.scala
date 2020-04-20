package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTrialComponentRequest extends js.Object {
  /**
    * The name of the component to disassociate from the trial.
    */
  var TrialComponentName: ExperimentEntityName = js.native
  /**
    * The name of the trial to disassociate from.
    */
  var TrialName: ExperimentEntityName = js.native
}

object DisassociateTrialComponentRequest {
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName, TrialName: ExperimentEntityName): DisassociateTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any], TrialName = TrialName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTrialComponentRequest]
  }
}

