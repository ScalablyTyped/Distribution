package typings
package builderDashUtilDashRuntimeLib.outHttpExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "HttpError")
@js.native
class HttpError protected ()
  extends nodeLib.Error {
  def this(statusCode: scala.Double) = this()
  def this(statusCode: scala.Double, message: java.lang.String) = this()
  def this(statusCode: scala.Double, message: java.lang.String, description: js.Any) = this()
  val description: js.Any | scala.Null = js.native
  val statusCode: scala.Double = js.native
}

