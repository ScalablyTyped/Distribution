package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendServerDescription extends js.Object {
  /**
    * The port on which the EC2 instance is listening.
    */
  var InstancePort: js.UndefOr[typings.awsSdk.elbMod.InstancePort] = js.native
  /**
    * The names of the policies enabled for the EC2 instance.
    */
  var PolicyNames: js.UndefOr[typings.awsSdk.elbMod.PolicyNames] = js.native
}

object BackendServerDescription {
  @scala.inline
  def apply(InstancePort: js.UndefOr[InstancePort] = js.undefined, PolicyNames: PolicyNames = null): BackendServerDescription = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(InstancePort)) __obj.updateDynamic("InstancePort")(InstancePort.get.asInstanceOf[js.Any])
    if (PolicyNames != null) __obj.updateDynamic("PolicyNames")(PolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendServerDescription]
  }
}

