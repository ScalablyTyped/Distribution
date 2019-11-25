package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.Anon_CLASS
import typings.chromeDashApps.Anon_DEVICE
import typings.chromeDashApps.Anon_IN
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chrome.integer
import typings.chromeDashApps.chromeDashAppsStrings.`class`
import typings.chromeDashApps.chromeDashAppsStrings.device_
import typings.chromeDashApps.chromeDashAppsStrings.endpoint
import typings.chromeDashApps.chromeDashAppsStrings.in
import typings.chromeDashApps.chromeDashAppsStrings.interface
import typings.chromeDashApps.chromeDashAppsStrings.other_
import typings.chromeDashApps.chromeDashAppsStrings.out
import typings.chromeDashApps.chromeDashAppsStrings.reserved
import typings.chromeDashApps.chromeDashAppsStrings.standard
import typings.chromeDashApps.chromeDashAppsStrings.vendor
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
  var direction: ToStringLiteral[Anon_IN, String, Exclude[String, in | out]]
  /** The wIndex field, see *Ibid*. */
  var index: integer
  /** The maximum number of bytes to receive(required only by input transfers). */
  var length: js.UndefOr[integer] = js.undefined
  /**
    * The transfer target.
    * The target given by index must be claimed if 'interface' or 'endpoint'.
    * @see Recipient
    */
  var recipient: ToStringLiteral[Anon_DEVICE, String, Exclude[String, device_ | interface | endpoint | other_]]
  /** The bRequest field, see *Universal Serial Bus Specification Revision 1.1 § 9.3.* */
  var request: integer
  /**
    * The request type.
    * @see RequestType
    */
  var requestType: ToStringLiteral[Anon_CLASS, String, Exclude[String, standard | `class` | vendor | reserved]]
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
    direction: ToStringLiteral[Anon_IN, String, Exclude[String, in | out]],
    index: integer,
    recipient: ToStringLiteral[Anon_DEVICE, String, Exclude[String, device_ | interface | endpoint | other_]],
    request: integer,
    requestType: ToStringLiteral[Anon_CLASS, String, Exclude[String, standard | `class` | vendor | reserved]],
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

