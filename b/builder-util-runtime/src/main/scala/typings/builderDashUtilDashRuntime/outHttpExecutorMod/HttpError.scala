package typings.builderDashUtilDashRuntime.outHttpExecutorMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "HttpError")
@js.native
class HttpError protected () extends Error {
  def this(statusCode: Double) = this()
  def this(statusCode: Double, message: String) = this()
  def this(statusCode: Double, message: String, description: js.Any) = this()
  val description: js.Any | Null = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  val statusCode: Double = js.native
}

