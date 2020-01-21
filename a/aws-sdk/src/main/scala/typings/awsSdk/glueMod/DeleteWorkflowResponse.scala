package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkflowResponse extends js.Object {
  /**
    * Name of the workflow specified in input.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object DeleteWorkflowResponse {
  @scala.inline
  def apply(Name: NameString = null): DeleteWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkflowResponse]
  }
}

