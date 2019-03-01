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

object ClearDataTypeSet {
  @scala.inline
  def apply(
    appcache: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    cookies: js.UndefOr[scala.Boolean] = js.undefined,
    fileSystems: js.UndefOr[scala.Boolean] = js.undefined,
    indexedDB: js.UndefOr[scala.Boolean] = js.undefined,
    localStorage: js.UndefOr[scala.Boolean] = js.undefined,
    persistentCookies: js.UndefOr[scala.Boolean] = js.undefined,
    sessionCookies: js.UndefOr[scala.Boolean] = js.undefined,
    webSQL: js.UndefOr[scala.Boolean] = js.undefined
  ): ClearDataTypeSet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appcache)) __obj.updateDynamic("appcache")(appcache)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies)
    if (!js.isUndefined(fileSystems)) __obj.updateDynamic("fileSystems")(fileSystems)
    if (!js.isUndefined(indexedDB)) __obj.updateDynamic("indexedDB")(indexedDB)
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage)
    if (!js.isUndefined(persistentCookies)) __obj.updateDynamic("persistentCookies")(persistentCookies)
    if (!js.isUndefined(sessionCookies)) __obj.updateDynamic("sessionCookies")(sessionCookies)
    if (!js.isUndefined(webSQL)) __obj.updateDynamic("webSQL")(webSQL)
    __obj.asInstanceOf[ClearDataTypeSet]
  }
}

