package typings
package chromeDashAppsLib.chromeNs.webViewRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * @private
         * @template T First parameter type
         * @template K Second parameter type
         */

trait EditCookieParams[T, K] extends js.Object {
  /**
               * Filter for cookies that will be modified.
               * All empty entries are ignored.
               */
  var filter: T
  /**
               * Attributes that shall be overridden in cookies that machted the filter
               * Attributes that are set to an empty string are removed.
               */
  var modification: K
}

