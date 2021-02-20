package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of devices and their state. */
@js.native
trait DeviceStates extends StObject {
  
  /** The SIM lock status if Type = Cellular and SIMPresent = True. */
  var SIMLockStatus: js.UndefOr[typings.chromeApps.chrome.networking.onc.SIMLockStatus] = js.native
  
  /** Set to the SIM present state if the device type is Cellular. */
  var SIMPresent: js.UndefOr[Boolean] = js.native
  
  /** Set if the device is enabled. True if the device is currently scanning. */
  var Scanning: js.UndefOr[Boolean] = js.native
  
  /**
    * The current state of the device.
    *
    * **Uninitialized**
    *  - Device is available but not initialized.
    * **Disabled**
    *  - Device is initialized but not enabled.
    * **Enabling**
    *  - Enabled state has been requested but has not completed.
    * **Enabled**
    *  - Device is enabled.
    * **Prohibited**
    *  - Device is prohibited.
    */
  var State: DeviceState = js.native
  
  /** The network type associated with the device (Cellular, Ethernet, WiFi, or WiMAX). */
  var Type: NetworkType = js.native
}
object DeviceStates {
  
  @scala.inline
  def apply(State: DeviceState, Type: NetworkType): DeviceStates = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceStates]
  }
  
  @scala.inline
  implicit class DeviceStatesMutableBuilder[Self <: DeviceStates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSIMLockStatus(value: SIMLockStatus): Self = StObject.set(x, "SIMLockStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIMLockStatusUndefined: Self = StObject.set(x, "SIMLockStatus", js.undefined)
    
    @scala.inline
    def setSIMPresent(value: Boolean): Self = StObject.set(x, "SIMPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSIMPresentUndefined: Self = StObject.set(x, "SIMPresent", js.undefined)
    
    @scala.inline
    def setScanning(value: Boolean): Self = StObject.set(x, "Scanning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanningUndefined: Self = StObject.set(x, "Scanning", js.undefined)
    
    @scala.inline
    def setState(value: DeviceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NetworkType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
