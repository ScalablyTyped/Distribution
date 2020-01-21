package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceAccessOutput extends js.Object {
  /**
    * The connection information for a fleet instance, including IP address and access credentials.
    */
  var InstanceAccess: js.UndefOr[typings.awsSdk.gameliftMod.InstanceAccess] = js.native
}

object GetInstanceAccessOutput {
  @scala.inline
  def apply(InstanceAccess: InstanceAccess = null): GetInstanceAccessOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceAccess != null) __obj.updateDynamic("InstanceAccess")(InstanceAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceAccessOutput]
  }
}

