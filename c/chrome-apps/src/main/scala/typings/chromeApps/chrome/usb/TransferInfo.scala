package typings.chromeApps.chrome.usb

import typings.chromeApps.AnonCLASS
import typings.chromeApps.AnonDEVICE
import typings.chromeApps.AnonIN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.CLASS
import typings.chromeApps.chromeAppsStrings.DEVICE
import typings.chromeApps.chromeAppsStrings.ENDPOINT
import typings.chromeApps.chromeAppsStrings.IN
import typings.chromeApps.chromeAppsStrings.INTERFACE
import typings.chromeApps.chromeAppsStrings.OTHER
import typings.chromeApps.chromeAppsStrings.OUT
import typings.chromeApps.chromeAppsStrings.RESERVED
import typings.chromeApps.chromeAppsStrings.STANDARD
import typings.chromeApps.chromeAppsStrings.VENDOR
import typings.chromeApps.chromeAppsStrings.class_
import typings.chromeApps.chromeAppsStrings.device__
import typings.chromeApps.chromeAppsStrings.endpoint_
import typings.chromeApps.chromeAppsStrings.in_
import typings.chromeApps.chromeAppsStrings.interface_
import typings.chromeApps.chromeAppsStrings.other_
import typings.chromeApps.chromeAppsStrings.out_
import typings.chromeApps.chromeAppsStrings.reserved_
import typings.chromeApps.chromeAppsStrings.standard_
import typings.chromeApps.chromeAppsStrings.vendor_
import typings.std.ArrayBuffer
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferInfo extends js.Object {
  /** The data to transmit (required only by output transfers). */
  var data: js.UndefOr[ArrayBuffer] = js.undefined
  /**
    * The transfer direction ('in' or 'out').
    * @see Direction
    */
  var direction: ToStringLiteral[AnonIN, IN | OUT, Exclude[IN | OUT, in_ | out_]]
  /** The wIndex field, see *Ibid*. */
  var index: integer
  /** The maximum number of bytes to receive(required only by input transfers). */
  var length: js.UndefOr[integer] = js.undefined
  /**
    * The transfer target.
    * The target given by index must be claimed if 'interface' or 'endpoint'.
    * @see Recipient
    */
  var recipient: ToStringLiteral[
    AnonDEVICE, 
    DEVICE | INTERFACE | ENDPOINT | OTHER, 
    Exclude[DEVICE | INTERFACE | ENDPOINT | OTHER, device__ | interface_ | endpoint_ | other_]
  ]
  /** The bRequest field, see *Universal Serial Bus Specification Revision 1.1 § 9.3.* */
  var request: integer
  /**
    * The request type.
    * @see RequestType
    */
  var requestType: ToStringLiteral[
    AnonCLASS, 
    STANDARD | CLASS | VENDOR | RESERVED, 
    Exclude[STANDARD | CLASS | VENDOR | RESERVED, standard_ | class_ | vendor_ | reserved_]
  ]
  /**
    * @since Chrome 43.
    * Request timeout (in milliseconds).
    * The default value 0 indicates no timeout.
    * @default 0
    */
  var timeout: js.UndefOr[integer] = js.undefined
  /** The wValue field, see *Ibid*. */
  var value: integer
}

object TransferInfo {
  @scala.inline
  def apply(
    direction: ToStringLiteral[AnonIN, IN | OUT, Exclude[IN | OUT, in_ | out_]],
    index: integer,
    recipient: ToStringLiteral[
      AnonDEVICE, 
      DEVICE | INTERFACE | ENDPOINT | OTHER, 
      Exclude[DEVICE | INTERFACE | ENDPOINT | OTHER, device__ | interface_ | endpoint_ | other_]
    ],
    request: integer,
    requestType: ToStringLiteral[
      AnonCLASS, 
      STANDARD | CLASS | VENDOR | RESERVED, 
      Exclude[STANDARD | CLASS | VENDOR | RESERVED, standard_ | class_ | vendor_ | reserved_]
    ],
    value: integer,
    data: ArrayBuffer = null,
    length: Int | Double = null,
    timeout: Int | Double = null
  ): TransferInfo = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInfo]
  }
}

