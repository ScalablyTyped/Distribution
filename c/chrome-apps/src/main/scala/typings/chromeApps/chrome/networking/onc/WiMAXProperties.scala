package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WiMAXProperties[M /* <: ManagedObject */, B] extends StObject {
  
  /** Whether the network should be connected automatically. */
  var AutoConnect: js.UndefOr[B] = js.undefined
  
  /** The network EAP properties. */
  var EAP: js.UndefOr[EAPProperties] = js.undefined
  
  /** The network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.undefined
}
object WiMAXProperties {
  
  @scala.inline
  def apply[M /* <: ManagedObject */, B](): WiMAXProperties[M, B] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WiMAXProperties[M, B]]
  }
  
  @scala.inline
  implicit class WiMAXPropertiesMutableBuilder[Self <: WiMAXProperties[?, ?], M /* <: ManagedObject */, B] (val x: Self & (WiMAXProperties[M, B])) extends AnyVal {
    
    @scala.inline
    def setAutoConnect(value: B): Self = StObject.set(x, "AutoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConnectUndefined: Self = StObject.set(x, "AutoConnect", js.undefined)
    
    @scala.inline
    def setEAP(value: EAPProperties): Self = StObject.set(x, "EAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEAPUndefined: Self = StObject.set(x, "EAP", js.undefined)
    
    @scala.inline
    def setSignalStrength(value: integer): Self = StObject.set(x, "SignalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrengthUndefined: Self = StObject.set(x, "SignalStrength", js.undefined)
  }
}
