package typings.cordovaDashPluginDashBleDashCentral.BLECentralPluginNs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeripheralData extends js.Object {
  var advertising: ArrayBuffer | js.Any
  var id: String
  var name: String
  var rssi: Double
}

object PeripheralData {
  @scala.inline
  def apply(advertising: ArrayBuffer | js.Any, id: String, name: String, rssi: Double): PeripheralData = {
    val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], id = id, name = name, rssi = rssi)
  
    __obj.asInstanceOf[PeripheralData]
  }
}

