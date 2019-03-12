package typings
package builderDashUtilDashRuntimeLib.outHttpExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util-runtime/out/httpExecutor", "HttpError")
@js.native
class HttpError protected ()
  extends stdLib.Error {
  def this(statusCode: scala.Double) = this()
  def this(statusCode: scala.Double, message: java.lang.String) = this()
  def this(statusCode: scala.Double, message: java.lang.String, description: js.Any) = this()
  val description: js.Any | scala.Null = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  val statusCode: scala.Double = js.native
}

