package typings.cordovaPluginBleCentral.BLECentralPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeripheralCharacteristic extends js.Object {
  var characteristic: String = js.native
  var descriptors: js.UndefOr[js.Array[_]] = js.native
  var properties: js.Array[String] = js.native
  var service: String = js.native
}

object PeripheralCharacteristic {
  @scala.inline
  def apply(characteristic: String, properties: js.Array[String], service: String): PeripheralCharacteristic = {
    val __obj = js.Dynamic.literal(characteristic = characteristic.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeripheralCharacteristic]
  }
  @scala.inline
  implicit class PeripheralCharacteristicOps[Self <: PeripheralCharacteristic] (val x: Self) extends AnyVal {
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
    def setCharacteristic(value: String): Self = this.set("characteristic", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertiesVarargs(value: String*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[String]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescriptorsVarargs(value: js.Any*): Self = this.set("descriptors", js.Array(value :_*))
    @scala.inline
    def setDescriptors(value: js.Array[_]): Self = this.set("descriptors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptors: Self = this.set("descriptors", js.undefined)
  }
  
}

