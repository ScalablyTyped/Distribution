package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberFrameworkConfiguration extends StObject {
  
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
  implicit class MemberFrameworkConfigurationMutableBuilder[Self <: MemberFrameworkConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFabric(value: MemberFabricConfiguration): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
