package typings.compression.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compression", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns the compression middleware using the given `options`. The middleware will attempt to compress response bodies
    * for all request that traverse through the middleware, based on the given `options`.
    *
    * This middleware will never compress responses that include a `Cache-Control` header with the `no-transform` directive,
    * as compressing will transform the body.
    *
    * @see {@link https://github.com/expressjs/compression#compressionoptions|`compression([options]) documentation`}
    */
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  def apply(options: CompressionOptions): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

