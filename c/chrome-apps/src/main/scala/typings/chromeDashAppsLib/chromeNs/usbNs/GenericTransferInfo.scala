package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericTransferInfo extends js.Object {
  /** The data to transmit (required only by output transfers). */
  var data: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  /**
    * The transfer direction ('in' or 'out').
    * @see Direction
    */
  var direction: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_IN, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.in | chromeDashAppsLib.chromeDashAppsLibStrings.out
    ]
  ]
  /** The target endpoint address. The interface containing this endpoint must be claimed. */
  var endpoint: chromeDashAppsLib.chromeNs.integer
  /** The maximum number of bytes to receive (required only by input transfers). */
  var length: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object GenericTransferInfo {
  @scala.inline
  def apply(
    direction: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_IN, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.in | chromeDashAppsLib.chromeDashAppsLibStrings.out
      ]
    ],
    endpoint: chromeDashAppsLib.chromeNs.integer,
    data: stdLib.ArrayBuffer = null,
    length: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    timeout: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): GenericTransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], endpoint = endpoint)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[GenericTransferInfo]
  }
}

