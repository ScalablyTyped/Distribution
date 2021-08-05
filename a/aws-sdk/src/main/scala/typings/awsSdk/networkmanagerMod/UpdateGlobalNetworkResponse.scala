package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalNetworkResponse extends StObject {
  
  /**
    * Information about the global network object.
    */
  var GlobalNetwork: js.UndefOr[typings.awsSdk.networkmanagerMod.GlobalNetwork] = js.undefined
}
object UpdateGlobalNetworkResponse {
  
  inline def apply(): UpdateGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalNetworkResponse]
  }
  
  extension [Self <: UpdateGlobalNetworkResponse](x: Self) {
    
    inline def setGlobalNetwork(value: GlobalNetwork): Self = StObject.set(x, "GlobalNetwork", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkUndefined: Self = StObject.set(x, "GlobalNetwork", js.undefined)
  }
}
