package typings.cordovaPluginBleCentral.BLECentralPlugin

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeripheralDataExtended extends PeripheralData {
  
  var characteristics: js.Array[PeripheralCharacteristic] = js.native
  
  var services: js.Array[String] = js.native
}
object PeripheralDataExtended {
  
  @scala.inline
  def apply(
    advertising: ArrayBuffer | js.Any,
    characteristics: js.Array[PeripheralCharacteristic],
    id: String,
    name: String,
    rssi: Double,
    services: js.Array[String]
  ): PeripheralDataExtended = {
    val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], characteristics = characteristics.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeripheralDataExtended]
  }
  
  @scala.inline
  implicit class PeripheralDataExtendedOps[Self <: PeripheralDataExtended] (val x: Self) extends AnyVal {
    
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
    def setCharacteristicsVarargs(value: PeripheralCharacteristic*): Self = this.set("characteristics", js.Array(value :_*))
    
    @scala.inline
    def setCharacteristics(value: js.Array[PeripheralCharacteristic]): Self = this.set("characteristics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesVarargs(value: String*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
  }
}
