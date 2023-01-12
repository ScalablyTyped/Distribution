package typings.awsSdk.clientsWorkspaceswebMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateNetworkSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNetworkSettings(value: NetworkSettings): Self = StObject.set(x, "networkSettings", value.asInstanceOf[js.Any])
  }
}
