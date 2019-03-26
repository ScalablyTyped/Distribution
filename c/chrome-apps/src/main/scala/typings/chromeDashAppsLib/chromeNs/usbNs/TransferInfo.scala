package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferInfo extends js.Object {
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
  /** The wIndex field, see *Ibid*. */
  var index: chromeDashAppsLib.chromeNs.integer
  /** The maximum number of bytes to receive(required only by input transfers). */
  var length: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * The transfer target.
    * The target given by index must be claimed if 'interface' or 'endpoint'.
    * @see Recipient
    */
  var recipient: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_DEVICE, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.device | chromeDashAppsLib.chromeDashAppsLibStrings.interface | chromeDashAppsLib.chromeDashAppsLibStrings.endpoint | chromeDashAppsLib.chromeDashAppsLibStrings.other
    ]
  ]
  /** The bRequest field, see *Universal Serial Bus Specification Revision 1.1 § 9.3.* */
  var request: chromeDashAppsLib.chromeNs.integer
  /**
    * The request type.
    * @see RequestType
    */
  var requestType: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CLASS, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.standard | chromeDashAppsLib.chromeDashAppsLibStrings.`class` | chromeDashAppsLib.chromeDashAppsLibStrings.vendor | chromeDashAppsLib.chromeDashAppsLibStrings.reserved
    ]
  ]
  /**
    * @since Chrome 43.
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /** The wValue field, see *Ibid*. */
  var value: chromeDashAppsLib.chromeNs.integer
}

object TransferInfo {
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
    index: chromeDashAppsLib.chromeNs.integer,
    recipient: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_DEVICE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.device | chromeDashAppsLib.chromeDashAppsLibStrings.interface | chromeDashAppsLib.chromeDashAppsLibStrings.endpoint | chromeDashAppsLib.chromeDashAppsLibStrings.other
      ]
    ],
    request: chromeDashAppsLib.chromeNs.integer,
    requestType: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CLASS, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.standard | chromeDashAppsLib.chromeDashAppsLibStrings.`class` | chromeDashAppsLib.chromeDashAppsLibStrings.vendor | chromeDashAppsLib.chromeDashAppsLibStrings.reserved
      ]
    ],
    value: chromeDashAppsLib.chromeNs.integer,
    data: stdLib.ArrayBuffer = null,
    length: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    timeout: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): TransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], index = index, recipient = recipient.asInstanceOf[js.Any], request = request, requestType = requestType.asInstanceOf[js.Any], value = value)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length)
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[TransferInfo]
  }
}

