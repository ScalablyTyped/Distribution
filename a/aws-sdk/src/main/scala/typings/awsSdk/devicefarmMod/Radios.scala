package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Radios extends StObject {
  
  /**
    * True if Bluetooth is enabled at the beginning of the test. Otherwise, false.
    */
  var bluetooth: js.UndefOr[Boolean] = js.native
  
  /**
    * True if GPS is enabled at the beginning of the test. Otherwise, false.
    */
  var gps: js.UndefOr[Boolean] = js.native
  
  /**
    * True if NFC is enabled at the beginning of the test. Otherwise, false.
    */
  var nfc: js.UndefOr[Boolean] = js.native
  
  /**
    * True if Wi-Fi is enabled at the beginning of the test. Otherwise, false.
    */
  var wifi: js.UndefOr[Boolean] = js.native
}
object Radios {
  
  @scala.inline
  def apply(): Radios = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radios]
  }
  
  @scala.inline
  implicit class RadiosMutableBuilder[Self <: Radios] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBluetooth(value: Boolean): Self = StObject.set(x, "bluetooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothUndefined: Self = StObject.set(x, "bluetooth", js.undefined)
    
    @scala.inline
    def setGps(value: Boolean): Self = StObject.set(x, "gps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGpsUndefined: Self = StObject.set(x, "gps", js.undefined)
    
    @scala.inline
    def setNfc(value: Boolean): Self = StObject.set(x, "nfc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNfcUndefined: Self = StObject.set(x, "nfc", js.undefined)
    
    @scala.inline
    def setWifi(value: Boolean): Self = StObject.set(x, "wifi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiUndefined: Self = StObject.set(x, "wifi", js.undefined)
  }
}
