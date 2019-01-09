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
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_IN[keyof chrome-apps.Anon_IN] */ js.Any
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
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_DEVICE[keyof chrome-apps.Anon_DEVICE] */ js.Any
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
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_CLASS[keyof chrome-apps.Anon_CLASS] */ js.Any
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

