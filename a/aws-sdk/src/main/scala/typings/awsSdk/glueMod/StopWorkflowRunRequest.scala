package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopWorkflowRunRequest extends js.Object {
  /**
    * The name of the workflow to stop.
    */
  var Name: NameString = js.native
  /**
    * The ID of the workflow run to stop.
    */
  var RunId: IdString = js.native
}

object StopWorkflowRunRequest {
  @scala.inline
  def apply(Name: NameString, RunId: IdString): StopWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopWorkflowRunRequest]
  }
}

