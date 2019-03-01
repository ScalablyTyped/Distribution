package typings
package chromeLib.chromeNs.browsingDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeSet extends js.Object {
  /** Optional. Websites' appcaches.  */
  var appcache: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The browser's cache. Note: when removing data, this clears the entire cache: it is not limited to the range you specify.  */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The browser's cookies.  */
  var cookies: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The browser's download list.  */
  var downloads: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Websites' file systems.  */
  var fileSystems: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The browser's stored form data.  */
  var formData: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. The browser's history.  */
  var history: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Websites' IndexedDB data.  */
  var indexedDB: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Websites' local storage data.  */
  var localStorage: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Stored passwords.  */
  var passwords: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Plugins' data.  */
  var pluginData: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Server-bound certificates.  */
  var serverBoundCertificates: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * Since Chrome 39.
    * Service Workers.
    */
  var serviceWorkers: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Websites' WebSQL data.  */
  var webSQL: js.UndefOr[scala.Boolean] = js.undefined
}

object DataTypeSet {
  @scala.inline
  def apply(
    appcache: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    cookies: js.UndefOr[scala.Boolean] = js.undefined,
    downloads: js.UndefOr[scala.Boolean] = js.undefined,
    fileSystems: js.UndefOr[scala.Boolean] = js.undefined,
    formData: js.UndefOr[scala.Boolean] = js.undefined,
    history: js.UndefOr[scala.Boolean] = js.undefined,
    indexedDB: js.UndefOr[scala.Boolean] = js.undefined,
    localStorage: js.UndefOr[scala.Boolean] = js.undefined,
    passwords: js.UndefOr[scala.Boolean] = js.undefined,
    pluginData: js.UndefOr[scala.Boolean] = js.undefined,
    serverBoundCertificates: js.UndefOr[scala.Boolean] = js.undefined,
    serviceWorkers: js.UndefOr[scala.Boolean] = js.undefined,
    webSQL: js.UndefOr[scala.Boolean] = js.undefined
  ): DataTypeSet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appcache)) __obj.updateDynamic("appcache")(appcache)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies)
    if (!js.isUndefined(downloads)) __obj.updateDynamic("downloads")(downloads)
    if (!js.isUndefined(fileSystems)) __obj.updateDynamic("fileSystems")(fileSystems)
    if (!js.isUndefined(formData)) __obj.updateDynamic("formData")(formData)
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history)
    if (!js.isUndefined(indexedDB)) __obj.updateDynamic("indexedDB")(indexedDB)
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage)
    if (!js.isUndefined(passwords)) __obj.updateDynamic("passwords")(passwords)
    if (!js.isUndefined(pluginData)) __obj.updateDynamic("pluginData")(pluginData)
    if (!js.isUndefined(serverBoundCertificates)) __obj.updateDynamic("serverBoundCertificates")(serverBoundCertificates)
    if (!js.isUndefined(serviceWorkers)) __obj.updateDynamic("serviceWorkers")(serviceWorkers)
    if (!js.isUndefined(webSQL)) __obj.updateDynamic("webSQL")(webSQL)
    __obj.asInstanceOf[DataTypeSet]
  }
}

