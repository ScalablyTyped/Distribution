package typings
package browserDashSyncLib.browserDashSyncMod

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
  var serveStaticOptions: js.UndefOr[serveDashStaticLib.serveDashStaticMod.ServeStaticOptions] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    baseDir: java.lang.String | js.Array[java.lang.String] = null,
    directory: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String = null,
    middleware: js.Array[MiddlewareHandler | PerRouteMiddleware] = null,
    routes: Hash[java.lang.String] = null,
    serveStaticOptions: serveDashStaticLib.serveDashStaticMod.ServeStaticOptions = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory)
    if (index != null) __obj.updateDynamic("index")(index)
    if (middleware != null) __obj.updateDynamic("middleware")(middleware)
    if (routes != null) __obj.updateDynamic("routes")(routes)
    if (serveStaticOptions != null) __obj.updateDynamic("serveStaticOptions")(serveStaticOptions)
    __obj.asInstanceOf[ServerOptions]
  }
}

