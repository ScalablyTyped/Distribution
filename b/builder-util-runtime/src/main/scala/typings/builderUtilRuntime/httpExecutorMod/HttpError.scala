package typings.builderUtilRuntime.httpExecutorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "HttpError")
@js.native
class HttpError protected () extends Error {
  def this(statusCode: Double) = this()
  def this(statusCode: Double, message: String) = this()
  def this(statusCode: Double, message: js.UndefOr[scala.Nothing], description: js.Any) = this()
  def this(statusCode: Double, message: String, description: js.Any) = this()
  val description: js.Any | Null = js.native
  val statusCode: Double = js.native
}

