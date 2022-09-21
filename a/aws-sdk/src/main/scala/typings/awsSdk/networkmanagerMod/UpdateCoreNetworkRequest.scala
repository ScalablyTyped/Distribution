package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCoreNetworkRequest extends StObject {
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: typings.awsSdk.networkmanagerMod.CoreNetworkId
  
  /**
    * The description of the update.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
}
object UpdateCoreNetworkRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId): UpdateCoreNetworkRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCoreNetworkRequest]
  }
  
  extension [Self <: UpdateCoreNetworkRequest](x: Self) {
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
