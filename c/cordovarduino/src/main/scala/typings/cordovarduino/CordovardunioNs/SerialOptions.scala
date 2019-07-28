package typings.cordovarduino.CordovardunioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialOptions extends js.Object {
  /**
    * @defaultValue 9600
    */
  var baudRate: js.UndefOr[Double] = js.undefined
  /**
    * @defaultValue 8
    */
  var dataBits: js.UndefOr[Double] = js.undefined
  /**
    * @defaultValue 0
    */
  var parity: js.UndefOr[Double] = js.undefined
  /**
    * @defaultValue 1
    */
  var stopBits: js.UndefOr[Double] = js.undefined
}

object SerialOptions {
  @scala.inline
  def apply(
    baudRate: Int | Double = null,
    dataBits: Int | Double = null,
    parity: Int | Double = null,
    stopBits: Int | Double = null
  ): SerialOptions = {
    val __obj = js.Dynamic.literal()
    if (baudRate != null) __obj.updateDynamic("baudRate")(baudRate.asInstanceOf[js.Any])
    if (dataBits != null) __obj.updateDynamic("dataBits")(dataBits.asInstanceOf[js.Any])
    if (parity != null) __obj.updateDynamic("parity")(parity.asInstanceOf[js.Any])
    if (stopBits != null) __obj.updateDynamic("stopBits")(stopBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialOptions]
  }
}

