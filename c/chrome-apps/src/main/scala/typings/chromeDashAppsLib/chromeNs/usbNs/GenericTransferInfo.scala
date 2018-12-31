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
      /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_IN[keyof chrome-apps.Anon_IN] */ js.Any
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

