package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFrameworkAttributes extends StObject {
  
  /**
    * Attributes of Hyperledger Fabric for a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[NetworkFabricAttributes] = js.undefined
}
object NetworkFrameworkAttributes {
  
  @scala.inline
  def apply(): NetworkFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFrameworkAttributes]
  }
  
  @scala.inline
  implicit class NetworkFrameworkAttributesMutableBuilder[Self <: NetworkFrameworkAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFabric(value: NetworkFabricAttributes): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
