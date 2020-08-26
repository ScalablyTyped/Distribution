package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberFrameworkConfiguration extends js.Object {
  /**
    * Attributes of Hyperledger Fabric for a member on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[MemberFabricConfiguration] = js.native
}

object MemberFrameworkConfiguration {
  @scala.inline
  def apply(): MemberFrameworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberFrameworkConfiguration]
  }
  @scala.inline
  implicit class MemberFrameworkConfigurationOps[Self <: MemberFrameworkConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFabric(value: MemberFabricConfiguration): Self = this.set("Fabric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFabric: Self = this.set("Fabric", js.undefined)
  }
  
}

