package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectWiFiOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** Wi-Fi 设备bssid */
  var BSSID: String
  
  /** Wi-Fi 设备ssid */
  var SSID: String
  
  /** Wi-Fi 设备密码 */
  var password: js.UndefOr[String] = js.undefined
}
object ConnectWiFiOptions {
  
  @scala.inline
  def apply(BSSID: String, SSID: String): ConnectWiFiOptions = {
    val __obj = js.Dynamic.literal(BSSID = BSSID.asInstanceOf[js.Any], SSID = SSID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectWiFiOptions]
  }
  
  @scala.inline
  implicit class ConnectWiFiOptionsMutableBuilder[Self <: ConnectWiFiOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSSID(value: String): Self = StObject.set(x, "BSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setSSID(value: String): Self = StObject.set(x, "SSID", value.asInstanceOf[js.Any])
  }
}
