package typings.chromeApps.chrome.networking.onc

import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellularBase extends StObject {
  
  /** Carrier account activation state. */
  var ActivationState: js.UndefOr[ActivationStateType] = js.undefined
  
  /** If the modem is registered on a network, the network technology currently in use. */
  var NetworkTechnology: js.UndefOr[String] = js.undefined
  
  /** The roaming state of the cellular modem on the current network. */
  var RoamingState: js.UndefOr[String] = js.undefined
  
  /** Whether a SIM card is present. */
  var SIMPresent: js.UndefOr[Boolean] = js.undefined
  
  /** The current network signal strength. */
  var SignalStrength: js.UndefOr[integer] = js.undefined
}
object CellularBase {
  
  @scala.inline
  def apply(): CellularBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellularBase]
  }
  
  @scala.inline
  implicit class CellularBaseMutableBuilder[Self <: CellularBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationState(value: ActivationStateType): Self = StObject.set(x, "ActivationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationStateUndefined: Self = StObject.set(x, "ActivationState", js.undefined)
    
    @scala.inline
    def setNetworkTechnology(value: String): Self = StObject.set(x, "NetworkTechnology", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkTechnologyUndefined: Self = StObject.set(x, "NetworkTechnology", js.undefined)
    
    @scala.inline
    def setRoamingState(value: String): Self = StObject.set(x, "RoamingState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoamingStateUndefined: Self = StObject.set(x, "RoamingState", js.undefined)
    
    @scala.inline
    def setSIMPresent(value: Boolean): Self = StObject.set(x, "SIMPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIMPresentUndefined: Self = StObject.set(x, "SIMPresent", js.undefined)
    
    @scala.inline
    def setSignalStrength(value: integer): Self = StObject.set(x, "SignalStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStrengthUndefined: Self = StObject.set(x, "SignalStrength", js.undefined)
  }
}
