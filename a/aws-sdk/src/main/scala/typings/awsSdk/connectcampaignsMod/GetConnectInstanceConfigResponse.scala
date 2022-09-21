package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectInstanceConfigResponse extends StObject {
  
  var connectInstanceConfig: js.UndefOr[InstanceConfig] = js.undefined
}
object GetConnectInstanceConfigResponse {
  
  inline def apply(): GetConnectInstanceConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectInstanceConfigResponse]
  }
  
  extension [Self <: GetConnectInstanceConfigResponse](x: Self) {
    
    inline def setConnectInstanceConfig(value: InstanceConfig): Self = StObject.set(x, "connectInstanceConfig", value.asInstanceOf[js.Any])
    
    inline def setConnectInstanceConfigUndefined: Self = StObject.set(x, "connectInstanceConfig", js.undefined)
  }
}
