package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkSettingsResponse extends StObject {
  
  /**
    * The network settings.
    */
  var networkSettings: js.UndefOr[NetworkSettings] = js.undefined
}
object GetNetworkSettingsResponse {
  
  inline def apply(): GetNetworkSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkSettingsResponse]
  }
  
  extension [Self <: GetNetworkSettingsResponse](x: Self) {
    
    inline def setNetworkSettings(value: NetworkSettings): Self = StObject.set(x, "networkSettings", value.asInstanceOf[js.Any])
    
    inline def setNetworkSettingsUndefined: Self = StObject.set(x, "networkSettings", js.undefined)
  }
}
