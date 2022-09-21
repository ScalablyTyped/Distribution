package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoreNetworkPolicyRequest extends StObject {
  
  /**
    * The alias of a core network policy 
    */
  var Alias: js.UndefOr[CoreNetworkPolicyAlias] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: typings.awsSdk.networkmanagerMod.CoreNetworkId
  
  /**
    * The ID of a core network policy version.
    */
  var PolicyVersionId: js.UndefOr[Integer] = js.undefined
}
object GetCoreNetworkPolicyRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId): GetCoreNetworkPolicyRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCoreNetworkPolicyRequest]
  }
  
  extension [Self <: GetCoreNetworkPolicyRequest](x: Self) {
    
    inline def setAlias(value: CoreNetworkPolicyAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionId(value: Integer): Self = StObject.set(x, "PolicyVersionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionIdUndefined: Self = StObject.set(x, "PolicyVersionId", js.undefined)
  }
}
