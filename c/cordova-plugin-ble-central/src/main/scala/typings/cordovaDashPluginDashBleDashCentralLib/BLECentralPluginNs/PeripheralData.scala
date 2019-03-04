package typings
package cordovaDashPluginDashBleDashCentralLib.BLECentralPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeripheralData extends js.Object {
  var advertising: stdLib.ArrayBuffer | js.Any
  var id: java.lang.String
  var name: java.lang.String
  var rssi: scala.Double
}

object PeripheralData {
  @scala.inline
  def apply(
    advertising: stdLib.ArrayBuffer | js.Any,
    id: java.lang.String,
    name: java.lang.String,
    rssi: scala.Double
  ): PeripheralData = {
    val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], id = id, name = name, rssi = rssi)
  
    __obj.asInstanceOf[PeripheralData]
  }
}

