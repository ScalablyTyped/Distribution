package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkflowRequest extends js.Object {
  /**
    * Name of the workflow to be deleted.
    */
  var Name: NameString = js.native
}

object DeleteWorkflowRequest {
  @scala.inline
  def apply(Name: NameString): DeleteWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteWorkflowRequest]
  }
}

