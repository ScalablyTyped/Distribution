package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCoreNetworkResponse extends StObject {
  
  /**
    * Returns details about a core network.
    */
  var CoreNetwork: js.UndefOr[typings.awsSdk.networkmanagerMod.CoreNetwork] = js.undefined
}
object CreateCoreNetworkResponse {
  
  inline def apply(): CreateCoreNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCoreNetworkResponse]
  }
  
  extension [Self <: CreateCoreNetworkResponse](x: Self) {
    
    inline def setCoreNetwork(value: CoreNetwork): Self = StObject.set(x, "CoreNetwork", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkUndefined: Self = StObject.set(x, "CoreNetwork", js.undefined)
  }
}
