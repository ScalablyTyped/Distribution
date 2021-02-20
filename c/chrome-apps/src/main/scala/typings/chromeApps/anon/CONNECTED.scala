package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.Connected_
import typings.chromeApps.chromeAppsStrings.Connecting_
import typings.chromeApps.chromeAppsStrings.Disconnected_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CONNECTED extends StObject {
  
  var CONNECTED: Connected_ = js.native
  
  var CONNECTING: Connecting_ = js.native
  
  var DISCONNECTED: Disconnected_ = js.native
}
object CONNECTED {
  
  @scala.inline
  def apply(CONNECTED: Connected_, CONNECTING: Connecting_, DISCONNECTED: Disconnected_): CONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], CONNECTING = CONNECTING.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONNECTED]
  }
  
  @scala.inline
  implicit class CONNECTEDMutableBuilder[Self <: CONNECTED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCONNECTED(value: Connected_): Self = StObject.set(x, "CONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONNECTING(value: Connecting_): Self = StObject.set(x, "CONNECTING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISCONNECTED(value: Disconnected_): Self = StObject.set(x, "DISCONNECTED", value.asInstanceOf[js.Any])
  }
}
