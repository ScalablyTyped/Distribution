package typings
package cordovaDashPluginDashBleDashCentralLib.BLECentralPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeripheralDataExtended extends PeripheralData {
  var characteristics: js.Array[PeripheralCharacteristic]
  var services: js.Array[java.lang.String]
}

object PeripheralDataExtended {
  @scala.inline
  def apply(
    advertising: stdLib.ArrayBuffer | js.Any,
    characteristics: js.Array[PeripheralCharacteristic],
    id: java.lang.String,
    name: java.lang.String,
    rssi: scala.Double,
    services: js.Array[java.lang.String]
  ): PeripheralDataExtended = {
    val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], characteristics = characteristics, id = id, name = name, rssi = rssi, services = services)
  
    __obj.asInstanceOf[PeripheralDataExtended]
  }
}

