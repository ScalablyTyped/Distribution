package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberLogPublishingConfiguration extends js.Object {
  
  /**
    * Configuration properties for logging events associated with a member of a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  var Fabric: js.UndefOr[MemberFabricLogPublishingConfiguration] = js.native
}
object MemberLogPublishingConfiguration {
  
  @scala.inline
  def apply(): MemberLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberLogPublishingConfiguration]
  }
  
  @scala.inline
  implicit class MemberLogPublishingConfigurationOps[Self <: MemberLogPublishingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setFabric(value: MemberFabricLogPublishingConfiguration): Self = this.set("Fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFabric: Self = this.set("Fabric", js.undefined)
  }
}
