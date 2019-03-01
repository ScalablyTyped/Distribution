package typings
package cordovarduinoLib.CordovardunioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerialOptions extends js.Object {
  /**
    * @defaultValue 9600
    */
  var baudRate: js.UndefOr[scala.Double] = js.undefined
  /**
    * @defaultValue 8
    */
  var dataBits: js.UndefOr[scala.Double] = js.undefined
  /**
    * @defaultValue 0
    */
  var parity: js.UndefOr[scala.Double] = js.undefined
  /**
    * @defaultValue 1
    */
  var stopBits: js.UndefOr[scala.Double] = js.undefined
}

object SerialOptions {
  @scala.inline
  def apply(
    baudRate: scala.Int | scala.Double = null,
    dataBits: scala.Int | scala.Double = null,
    parity: scala.Int | scala.Double = null,
    stopBits: scala.Int | scala.Double = null
  ): SerialOptions = {
    val __obj = js.Dynamic.literal()
    if (baudRate != null) __obj.updateDynamic("baudRate")(baudRate.asInstanceOf[js.Any])
    if (dataBits != null) __obj.updateDynamic("dataBits")(dataBits.asInstanceOf[js.Any])
    if (parity != null) __obj.updateDynamic("parity")(parity.asInstanceOf[js.Any])
    if (stopBits != null) __obj.updateDynamic("stopBits")(stopBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialOptions]
  }
}

