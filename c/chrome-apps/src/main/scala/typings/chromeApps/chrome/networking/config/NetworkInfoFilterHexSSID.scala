package typings.chromeApps.chrome.networking.config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInfoFilterHexSSID extends js.Object {
  
  /**
    * A hex-encoded byte sequence.
    */
  var HexSSID: js.UndefOr[String] = js.native
}
object NetworkInfoFilterHexSSID {
  
  @scala.inline
  def apply(): NetworkInfoFilterHexSSID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInfoFilterHexSSID]
  }
  
  @scala.inline
  implicit class NetworkInfoFilterHexSSIDOps[Self <: NetworkInfoFilterHexSSID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHexSSID(value: String): Self = this.set("HexSSID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHexSSID: Self = this.set("HexSSID", js.undefined)
  }
}
