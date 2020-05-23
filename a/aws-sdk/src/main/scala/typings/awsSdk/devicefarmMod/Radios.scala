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
  def apply(
    bluetooth: js.UndefOr[Boolean] = js.undefined,
    gps: js.UndefOr[Boolean] = js.undefined,
    nfc: js.UndefOr[Boolean] = js.undefined,
    wifi: js.UndefOr[Boolean] = js.undefined
  ): Radios = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bluetooth)) __obj.updateDynamic("bluetooth")(bluetooth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gps)) __obj.updateDynamic("gps")(gps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nfc)) __obj.updateDynamic("nfc")(nfc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wifi)) __obj.updateDynamic("wifi")(wifi.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radios]
  }
}

