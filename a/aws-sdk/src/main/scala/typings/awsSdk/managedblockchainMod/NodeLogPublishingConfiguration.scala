package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeLogPublishingConfiguration extends js.Object {
  /**
    * Configuration properties for logging events associated with a node that is owned by a member of a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  var Fabric: js.UndefOr[NodeFabricLogPublishingConfiguration] = js.native
}

object NodeLogPublishingConfiguration {
  @scala.inline
  def apply(Fabric: NodeFabricLogPublishingConfiguration = null): NodeLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Fabric != null) __obj.updateDynamic("Fabric")(Fabric.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeLogPublishingConfiguration]
  }
}

