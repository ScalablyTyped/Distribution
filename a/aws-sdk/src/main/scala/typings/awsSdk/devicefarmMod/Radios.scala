package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Radios extends js.Object {
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
  implicit class RadiosOps[Self <: Radios] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBluetooth(value: Boolean): Self = this.set("bluetooth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBluetooth: Self = this.set("bluetooth", js.undefined)
    @scala.inline
    def setGps(value: Boolean): Self = this.set("gps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGps: Self = this.set("gps", js.undefined)
    @scala.inline
    def setNfc(value: Boolean): Self = this.set("nfc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNfc: Self = this.set("nfc", js.undefined)
    @scala.inline
    def setWifi(value: Boolean): Self = this.set("wifi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWifi: Self = this.set("wifi", js.undefined)
  }
  
}

