package typings
package builderDashUtilLib.outDebugLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/DebugLogger", "DebugLogger")
@js.native
class DebugLogger () extends js.Object {
  def this(isEnabled: scala.Boolean) = this()
  val data: js.Any = js.native
  val isEnabled: scala.Boolean = js.native
  def add(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def save(file: java.lang.String): js.Promise[scala.Unit] = js.native
}

