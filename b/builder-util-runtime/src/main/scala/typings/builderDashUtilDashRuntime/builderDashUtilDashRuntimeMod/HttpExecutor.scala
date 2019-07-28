package typings.builderDashUtilDashRuntime.builderDashUtilDashRuntimeMod

import typings.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime", "HttpExecutor")
@js.native
abstract class HttpExecutor[REQUEST] ()
  extends typings.builderDashUtilDashRuntime.outHttpExecutorMod.HttpExecutor[REQUEST]

/* static members */
@JSImport("builder-util-runtime", "HttpExecutor")
@js.native
object HttpExecutor extends js.Object {
  def prepareRedirectUrlOptions(redirectUrl: String, options: RequestOptions): RequestOptions = js.native
}

