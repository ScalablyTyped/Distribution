package typings.browserSync.mod

import typings.serveStatic.mod.ServeStaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  /** set base directory */
  var baseDir: js.UndefOr[String | js.Array[String]] = js.undefined
  /** enable directory listing */
  var directory: js.UndefOr[Boolean] = js.undefined
  /** set index filename */
  var index: js.UndefOr[String] = js.undefined
  /** configure custom middleware */
  var middleware: js.UndefOr[js.Array[MiddlewareHandler | PerRouteMiddleware]] = js.undefined
  /**
    * key-value object hash, where the key is the url to match,
    * and the value is the folder to serve (relative to your working directory)
    */
  var routes: js.UndefOr[Hash[String]] = js.undefined
  var serveStaticOptions: js.UndefOr[ServeStaticOptions] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    baseDir: String | js.Array[String] = null,
    directory: js.UndefOr[Boolean] = js.undefined,
    index: String = null,
    middleware: js.Array[MiddlewareHandler | PerRouteMiddleware] = null,
    routes: Hash[String] = null,
    serveStaticOptions: ServeStaticOptions = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (serveStaticOptions != null) __obj.updateDynamic("serveStaticOptions")(serveStaticOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

