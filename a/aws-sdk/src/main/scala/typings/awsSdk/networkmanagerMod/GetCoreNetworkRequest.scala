package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoreNetworkRequest extends StObject {
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: typings.awsSdk.networkmanagerMod.CoreNetworkId
}
object GetCoreNetworkRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId): GetCoreNetworkRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCoreNetworkRequest]
  }
  
  extension [Self <: GetCoreNetworkRequest](x: Self) {
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
  }
}
