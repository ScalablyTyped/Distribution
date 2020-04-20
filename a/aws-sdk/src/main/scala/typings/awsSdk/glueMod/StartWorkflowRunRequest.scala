package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartWorkflowRunRequest extends js.Object {
  /**
    * The name of the workflow to start.
    */
  var Name: NameString = js.native
}

object StartWorkflowRunRequest {
  @scala.inline
  def apply(Name: NameString): StartWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartWorkflowRunRequest]
  }
}

