package typings.cordovarduino.Cordovardunio

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
    baudRate: js.UndefOr[Double] = js.undefined,
    dataBits: js.UndefOr[Double] = js.undefined,
    parity: js.UndefOr[Double] = js.undefined,
    stopBits: js.UndefOr[Double] = js.undefined
  ): SerialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baudRate)) __obj.updateDynamic("baudRate")(baudRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dataBits)) __obj.updateDynamic("dataBits")(dataBits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parity)) __obj.updateDynamic("parity")(parity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stopBits)) __obj.updateDynamic("stopBits")(stopBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialOptions]
  }
}

