package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeFrameworkAttributes extends js.Object {
  /**
    * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[NodeFabricAttributes] = js.native
}

object NodeFrameworkAttributes {
  @scala.inline
  def apply(Fabric: NodeFabricAttributes = null): NodeFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    if (Fabric != null) __obj.updateDynamic("Fabric")(Fabric.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeFrameworkAttributes]
  }
}

