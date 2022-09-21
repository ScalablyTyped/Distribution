package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWifiListOptions extends StObject {
  
  /** Wi-Fi 列表数据 */
  var wifiList: js.Array[WiFi]
}
object GetWifiListOptions {
  
  inline def apply(wifiList: js.Array[WiFi]): GetWifiListOptions = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWifiListOptions]
  }
  
  extension [Self <: GetWifiListOptions](x: Self) {
    
    inline def setWifiList(value: js.Array[WiFi]): Self = StObject.set(x, "wifiList", value.asInstanceOf[js.Any])
    
    inline def setWifiListVarargs(value: WiFi*): Self = StObject.set(x, "wifiList", js.Array(value*))
  }
}
