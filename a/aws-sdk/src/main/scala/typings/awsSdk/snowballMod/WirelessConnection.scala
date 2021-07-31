package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessConnection extends StObject {
  
  /**
    * Enables the Wi-Fi adapter on an AWS Snowcone device.
    */
  var IsWifiEnabled: js.UndefOr[Boolean] = js.undefined
}
object WirelessConnection {
  
  @scala.inline
  def apply(): WirelessConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WirelessConnection]
  }
  
  @scala.inline
  implicit class WirelessConnectionMutableBuilder[Self <: WirelessConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsWifiEnabled(value: Boolean): Self = StObject.set(x, "IsWifiEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsWifiEnabledUndefined: Self = StObject.set(x, "IsWifiEnabled", js.undefined)
  }
}
