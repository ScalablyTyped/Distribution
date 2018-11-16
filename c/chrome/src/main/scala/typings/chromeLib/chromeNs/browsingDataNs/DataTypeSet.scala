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

