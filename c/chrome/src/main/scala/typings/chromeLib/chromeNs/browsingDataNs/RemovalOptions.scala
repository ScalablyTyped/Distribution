package typings
package chromeLib.chromeNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RemovalOptions extends js.Object {
  /**
           * Optional.
            * Since Chrome 21.
           * An object whose properties specify which origin types ought to be cleared. If this object isn't specified, it defaults to clearing only "unprotected" origins. Please ensure that you really want to remove application data before adding 'protectedWeb' or 'extensions'.
           */
  var originTypes: js.UndefOr[OriginTypes] = js.undefined
  /** Optional. Remove data accumulated on or after this date, represented in milliseconds since the epoch (accessible via the getTime method of the JavaScript Date object). If absent, defaults to 0 (which would remove all browsing data).  */
  var since: js.UndefOr[scala.Double] = js.undefined
}

