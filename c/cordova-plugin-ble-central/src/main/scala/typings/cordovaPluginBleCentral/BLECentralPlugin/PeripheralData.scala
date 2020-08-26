package typings.cordovaPluginBleCentral.BLECentralPlugin

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeripheralData extends js.Object {
  var advertising: ArrayBuffer | js.Any = js.native
  var id: String = js.native
  var name: String = js.native
  var rssi: Double = js.native
}

object PeripheralData {
  @scala.inline
  def apply(advertising: ArrayBuffer | js.Any, id: String, name: String, rssi: Double): PeripheralData = {
    val __obj = js.Dynamic.literal(advertising = advertising.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeripheralData]
  }
  @scala.inline
  implicit class PeripheralDataOps[Self <: PeripheralData] (val x: Self) extends AnyVal {
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
    def setAdvertising(value: ArrayBuffer | js.Any): Self = this.set("advertising", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRssi(value: Double): Self = this.set("rssi", value.asInstanceOf[js.Any])
  }
  
}

