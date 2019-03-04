package typings
package cordovaDashPluginDashBleDashCentralLib.BLECentralPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeripheralCharacteristic extends js.Object {
  var characteristic: java.lang.String
  var descriptors: js.UndefOr[js.Array[_]] = js.undefined
  var properties: js.Array[java.lang.String]
  var service: java.lang.String
}

object PeripheralCharacteristic {
  @scala.inline
  def apply(
    characteristic: java.lang.String,
    properties: js.Array[java.lang.String],
    service: java.lang.String,
    descriptors: js.Array[_] = null
  ): PeripheralCharacteristic = {
    val __obj = js.Dynamic.literal(characteristic = characteristic, properties = properties, service = service)
    if (descriptors != null) __obj.updateDynamic("descriptors")(descriptors)
    __obj.asInstanceOf[PeripheralCharacteristic]
  }
}

