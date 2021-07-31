package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetWifiList extends StObject {
  
  /** Wi-Fi 设备bssid */
  var BSSID: String
  
  /** Wi-Fi 设备ssid */
  var SSID: String
  
  /** Wi-Fi 设备密码 */
  var password: String
}
object SetWifiList {
  
  @scala.inline
  def apply(BSSID: String, SSID: String, password: String): SetWifiList = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWifiList]
  }
  
  @scala.inline
  implicit class SetWifiListMutableBuilder[Self <: SetWifiList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
  }
}
