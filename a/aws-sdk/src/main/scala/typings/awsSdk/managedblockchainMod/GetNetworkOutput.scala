package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkOutput extends StObject {
  
  /**
    * An object containing network configuration parameters.
    */
  var Network: js.UndefOr[typings.awsSdk.managedblockchainMod.Network] = js.undefined
}
object GetNetworkOutput {
  
  inline def apply(): GetNetworkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkOutput]
  }
  
  extension [Self <: GetNetworkOutput](x: Self) {
    
    inline def setNetwork(value: Network): Self = StObject.set(x, "Network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "Network", js.undefined)
  }
}
