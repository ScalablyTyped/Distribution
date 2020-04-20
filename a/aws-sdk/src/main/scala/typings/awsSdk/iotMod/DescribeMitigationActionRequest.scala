package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMitigationActionRequest extends js.Object {
  /**
    * The friendly name that uniquely identifies the mitigation action.
    */
  var actionName: MitigationActionName = js.native
}

object DescribeMitigationActionRequest {
  @scala.inline
  def apply(actionName: MitigationActionName): DescribeMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMitigationActionRequest]
  }
}

