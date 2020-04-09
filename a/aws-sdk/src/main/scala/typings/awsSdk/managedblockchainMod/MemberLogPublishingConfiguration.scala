package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberLogPublishingConfiguration extends js.Object {
  /**
    * Configuration properties for logging events associated with a member of a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  var Fabric: js.UndefOr[MemberFabricLogPublishingConfiguration] = js.native
}

object MemberLogPublishingConfiguration {
  @scala.inline
  def apply(Fabric: MemberFabricLogPublishingConfiguration = null): MemberLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Fabric != null) __obj.updateDynamic("Fabric")(Fabric.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberLogPublishingConfiguration]
  }
}

