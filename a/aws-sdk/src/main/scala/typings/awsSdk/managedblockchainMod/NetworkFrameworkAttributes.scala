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
  
  inline def apply(): NetworkFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFrameworkAttributes]
  }
  
  extension [Self <: NetworkFrameworkAttributes](x: Self) {
    
    inline def setFabric(value: NetworkFabricAttributes): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    inline def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
