package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCoreNetworkPolicyVersionResponse extends StObject {
  
  /**
    * Returns information about the deleted policy version. 
    */
  var CoreNetworkPolicy: js.UndefOr[typings.awsSdk.networkmanagerMod.CoreNetworkPolicy] = js.undefined
}
object DeleteCoreNetworkPolicyVersionResponse {
  
  inline def apply(): DeleteCoreNetworkPolicyVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCoreNetworkPolicyVersionResponse]
  }
  
  extension [Self <: DeleteCoreNetworkPolicyVersionResponse](x: Self) {
    
    inline def setCoreNetworkPolicy(value: CoreNetworkPolicy): Self = StObject.set(x, "CoreNetworkPolicy", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkPolicyUndefined: Self = StObject.set(x, "CoreNetworkPolicy", js.undefined)
  }
}
