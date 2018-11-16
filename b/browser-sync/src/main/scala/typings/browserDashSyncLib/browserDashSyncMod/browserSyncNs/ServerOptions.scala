package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerOptions extends js.Object {
  /** set base directory */
  var baseDir: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** enable directory listing */
  var directory: js.UndefOr[scala.Boolean] = js.undefined
  /** set index filename */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /** configure custom middleware */
  var middleware: js.UndefOr[js.Array[MiddlewareHandler | PerRouteMiddleware]] = js.undefined
  /**
           * key-value object hash, where the key is the url to match,
           * and the value is the folder to serve (relative to your working directory)
           */
  var routes: js.UndefOr[Hash[java.lang.String]] = js.undefined
  var serveStaticOptions: js.UndefOr[serveDashStaticLib.serveDashStaticMod.serveStaticNs.ServeStaticOptions] = js.undefined
}

