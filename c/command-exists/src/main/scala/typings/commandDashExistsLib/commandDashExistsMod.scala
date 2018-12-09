package typings
package commandDashExistsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("command-exists", JSImport.Namespace)
@js.native
object commandDashExistsMod extends js.Object {
  def apply(commandName: java.lang.String): js.Promise[java.lang.String] = js.native
  def apply(
    commandName: java.lang.String,
    cb: js.Function2[/* error */ scala.Null, /* exists */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def sync(commandName: java.lang.String): scala.Boolean = js.native
}

