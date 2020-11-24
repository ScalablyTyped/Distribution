package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFrameworkConfiguration extends js.Object {
  
  /**
    *  Hyperledger Fabric configuration properties for a Managed Blockchain network that uses Hyperledger Fabric. 
    */
  var Fabric: js.UndefOr[NetworkFabricConfiguration] = js.native
}
object NetworkFrameworkConfiguration {
  
  @scala.inline
  def apply(): NetworkFrameworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFrameworkConfiguration]
  }
  
  @scala.inline
  implicit class NetworkFrameworkConfigurationOps[Self <: NetworkFrameworkConfiguration] (val x: Self) extends AnyVal {
    
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
    def setFabric(value: NetworkFabricConfiguration): Self = this.set("Fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFabric: Self = this.set("Fabric", js.undefined)
  }
}
