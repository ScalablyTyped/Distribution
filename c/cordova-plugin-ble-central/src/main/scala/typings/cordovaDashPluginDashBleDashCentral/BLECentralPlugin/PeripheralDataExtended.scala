package typings.cordovaDashPluginDashBleDashCentral.BLECentralPlugin

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeripheralDataExtended extends PeripheralData {
  var characteristics: js.Array[PeripheralCharacteristic]
  var services: js.Array[String]
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
}

