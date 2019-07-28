package typings.chromeDashApps.chromeNs.usbNs

import typings.chromeDashApps.Anon_IN
import typings.chromeDashApps.chromeDashAppsStrings.in
import typings.chromeDashApps.chromeDashAppsStrings.out
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.chromeDashApps.chromeNs.integer
import typings.std.ArrayBuffer
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericTransferInfo extends js.Object {
  /** The data to transmit (required only by output transfers). */
  var data: js.UndefOr[ArrayBuffer] = js.undefined
  /**
    * The transfer direction ('in' or 'out').
    * @see Direction
    */
  var direction: ToStringLiteral[Anon_IN, String, Exclude[String, in | out]]
  /** The target endpoint address. The interface containing this endpoint must be claimed. */
  var endpoint: integer
  /** The maximum number of bytes to receive (required only by input transfers). */
  var length: js.UndefOr[integer] = js.undefined
  /**
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[integer] = js.undefined
}

object GenericTransferInfo {
  @scala.inline
  def apply(
    direction: ToStringLiteral[Anon_IN, String, Exclude[String, in | out]],
    endpoint: integer,
    data: ArrayBuffer = null,
    length: js.UndefOr[integer] = js.undefined,
    timeout: js.UndefOr[integer] = js.undefined
  ): GenericTransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], endpoint = endpoint)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[GenericTransferInfo]
  }
}

