package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkAclResult extends js.Object {
  /**
    * Information about the network ACL.
    */
  var NetworkAcl: js.UndefOr[typings.awsSdk.ec2Mod.NetworkAcl] = js.native
}

object CreateNetworkAclResult {
  @scala.inline
  def apply(NetworkAcl: NetworkAcl = null): CreateNetworkAclResult = {
    val __obj = js.Dynamic.literal()
    if (NetworkAcl != null) __obj.updateDynamic("NetworkAcl")(NetworkAcl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkAclResult]
  }
}

