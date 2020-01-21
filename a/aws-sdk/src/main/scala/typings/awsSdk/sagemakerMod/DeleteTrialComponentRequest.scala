package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrialComponentRequest extends js.Object {
  /**
    * The name of the component to delete.
    */
  var TrialComponentName: ExperimentEntityName = js.native
}

object DeleteTrialComponentRequest {
  @scala.inline
  def apply(TrialComponentName: ExperimentEntityName): DeleteTrialComponentRequest = {
    val __obj = js.Dynamic.literal(TrialComponentName = TrialComponentName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTrialComponentRequest]
  }
}

