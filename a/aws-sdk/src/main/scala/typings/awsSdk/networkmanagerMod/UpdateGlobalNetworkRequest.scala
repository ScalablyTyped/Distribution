package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalNetworkRequest extends StObject {
  
  /**
    * A description of the global network. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of your global network.
    */
  var GlobalNetworkId: String
}
object UpdateGlobalNetworkRequest {
  
  inline def apply(GlobalNetworkId: String): UpdateGlobalNetworkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalNetworkRequest]
  }
  
  extension [Self <: UpdateGlobalNetworkRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
  }
}
