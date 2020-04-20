package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMitigationActionRequest extends js.Object {
  /**
    * The name of the mitigation action that you want to delete.
    */
  var actionName: MitigationActionName = js.native
}

object DeleteMitigationActionRequest {
  @scala.inline
  def apply(actionName: MitigationActionName): DeleteMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMitigationActionRequest]
  }
}

