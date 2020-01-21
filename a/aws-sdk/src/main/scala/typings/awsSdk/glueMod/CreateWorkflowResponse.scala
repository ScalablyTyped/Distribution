package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkflowResponse extends js.Object {
  /**
    * The name of the workflow which was provided as part of the request.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object CreateWorkflowResponse {
  @scala.inline
  def apply(Name: NameString = null): CreateWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkflowResponse]
  }
}

