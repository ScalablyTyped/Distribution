package typings.chromeApps.WebView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebView element from html
  */
/** A set of data types. Missing properties are interpreted as false. */
trait ClearDataTypeSet extends js.Object {
  /** Websites' appcaches. */
  var appcache: js.UndefOr[Boolean] = js.undefined
  /**
    * The browser's cache. Note: when removing data, this clears the entire cache; it is not limited to the range you specify.
    * @since Chrome 43.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /** The partition's cookies. */
  var cookies: js.UndefOr[Boolean] = js.undefined
  /** Websites' filesystems. */
  var fileSystems: js.UndefOr[Boolean] = js.undefined
  /** Websites' IndexedDB data. */
  var indexedDB: js.UndefOr[Boolean] = js.undefined
  /** Websites' local storage data. */
  var localStorage: js.UndefOr[Boolean] = js.undefined
  /** The partition's persistent cookies. */
  var persistentCookies: js.UndefOr[Boolean] = js.undefined
  /** The partition's session cookies. */
  var sessionCookies: js.UndefOr[Boolean] = js.undefined
  /** Websites' WebSQL data. */
  var webSQL: js.UndefOr[Boolean] = js.undefined
}

object ClearDataTypeSet {
  @scala.inline
  def apply(
    appcache: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    cookies: js.UndefOr[Boolean] = js.undefined,
    fileSystems: js.UndefOr[Boolean] = js.undefined,
    indexedDB: js.UndefOr[Boolean] = js.undefined,
    localStorage: js.UndefOr[Boolean] = js.undefined,
    persistentCookies: js.UndefOr[Boolean] = js.undefined,
    sessionCookies: js.UndefOr[Boolean] = js.undefined,
    webSQL: js.UndefOr[Boolean] = js.undefined
  ): ClearDataTypeSet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appcache)) __obj.updateDynamic("appcache")(appcache.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (!js.isUndefined(fileSystems)) __obj.updateDynamic("fileSystems")(fileSystems.asInstanceOf[js.Any])
    if (!js.isUndefined(indexedDB)) __obj.updateDynamic("indexedDB")(indexedDB.asInstanceOf[js.Any])
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentCookies)) __obj.updateDynamic("persistentCookies")(persistentCookies.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionCookies)) __obj.updateDynamic("sessionCookies")(sessionCookies.asInstanceOf[js.Any])
    if (!js.isUndefined(webSQL)) __obj.updateDynamic("webSQL")(webSQL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearDataTypeSet]
  }
}

