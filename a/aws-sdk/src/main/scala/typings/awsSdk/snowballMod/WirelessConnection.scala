package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WirelessConnection extends js.Object {
  
  /**
    * Enables the Wi-Fi adapter on an AWS Snowcone device.
    */
  var IsWifiEnabled: js.UndefOr[Boolean] = js.native
}
object WirelessConnection {
  
  @scala.inline
  def apply(): WirelessConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WirelessConnection]
  }
  
  @scala.inline
  implicit class WirelessConnectionOps[Self <: WirelessConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsWifiEnabled(value: Boolean): Self = this.set("IsWifiEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWifiEnabled: Self = this.set("IsWifiEnabled", js.undefined)
  }
}
