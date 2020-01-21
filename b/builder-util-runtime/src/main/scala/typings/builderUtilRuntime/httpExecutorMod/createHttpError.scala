package typings.builderUtilRuntime.httpExecutorMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "createHttpError")
@js.native
object createHttpError extends js.Object {
  def apply(response: IncomingMessage): HttpError = js.native
  def apply(response: IncomingMessage, description: js.Any): HttpError = js.native
}

