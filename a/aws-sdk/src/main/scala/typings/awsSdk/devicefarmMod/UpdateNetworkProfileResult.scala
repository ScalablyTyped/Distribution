package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNetworkProfileResult extends StObject {
  
  /**
    * A list of the available network profiles.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.undefined
}
object UpdateNetworkProfileResult {
  
  inline def apply(): UpdateNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNetworkProfileResult]
  }
  
  extension [Self <: UpdateNetworkProfileResult](x: Self) {
    
    inline def setNetworkProfile(value: NetworkProfile): Self = StObject.set(x, "networkProfile", value.asInstanceOf[js.Any])
    
    inline def setNetworkProfileUndefined: Self = StObject.set(x, "networkProfile", js.undefined)
  }
}
