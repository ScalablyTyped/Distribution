package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterInstanceResult extends js.Object {
  /**
    * The registered instance's AWS OpsWorks Stacks ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
}

object RegisterInstanceResult {
  @scala.inline
  def apply(InstanceId: String = null): RegisterInstanceResult = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterInstanceResult]
  }
}

