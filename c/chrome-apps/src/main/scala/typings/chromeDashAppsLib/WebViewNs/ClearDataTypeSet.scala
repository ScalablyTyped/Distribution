package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
      * WebView element from html
     */


/** A set of data types. Missing properties are interpreted as false. */

trait ClearDataTypeSet extends js.Object {
  /** Websites' appcaches. */
  var appcache: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The browser's cache. Note: when removing data, this clears the entire cache; it is not limited to the range you specify.
           * @since Chrome 43.
           */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /** The partition's cookies. */
  var cookies: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites' filesystems. */
  var fileSystems: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites' IndexedDB data. */
  var indexedDB: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites' local storage data. */
  var localStorage: js.UndefOr[scala.Boolean] = js.undefined
  /** The partition's persistent cookies. */
  var persistentCookies: js.UndefOr[scala.Boolean] = js.undefined
  /** The partition's session cookies. */
  var sessionCookies: js.UndefOr[scala.Boolean] = js.undefined
  /** Websites' WebSQL data. */
  var webSQL: js.UndefOr[scala.Boolean] = js.undefined
}

