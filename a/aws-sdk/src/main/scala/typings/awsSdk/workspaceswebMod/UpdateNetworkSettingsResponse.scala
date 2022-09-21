package typings.awsSdk.workspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateNetworkSettingsResponse extends StObject {
  
  /**
    * The network settings.
    */
  var networkSettings: NetworkSettings
}
object UpdateNetworkSettingsResponse {
  
  inline def apply(networkSettings: NetworkSettings): UpdateNetworkSettingsResponse = {
    val __obj = js.Dynamic.literal(networkSettings = networkSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNetworkSettingsResponse]
  }
  
  extension [Self <: UpdateNetworkSettingsResponse](x: Self) {
    
    inline def setNetworkSettings(value: NetworkSettings): Self = StObject.set(x, "networkSettings", value.asInstanceOf[js.Any])
  }
}
