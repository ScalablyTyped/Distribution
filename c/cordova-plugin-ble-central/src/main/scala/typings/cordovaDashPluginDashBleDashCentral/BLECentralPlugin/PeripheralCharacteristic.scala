package typings.cordovaDashPluginDashBleDashCentral.BLECentralPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeripheralCharacteristic extends js.Object {
  var characteristic: String
  var descriptors: js.UndefOr[js.Array[_]] = js.undefined
  var properties: js.Array[String]
  var service: String
}

object PeripheralCharacteristic {
  @scala.inline
  def apply(
    characteristic: String,
    properties: js.Array[String],
    service: String,
    descriptors: js.Array[_] = null
  ): PeripheralCharacteristic = {
    val __obj = js.Dynamic.literal(characteristic = characteristic, properties = properties, service = service)
    if (descriptors != null) __obj.updateDynamic("descriptors")(descriptors)
    __obj.asInstanceOf[PeripheralCharacteristic]
  }
}

