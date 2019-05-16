package typings
package dbusLib.dbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dbus", "DBusError")
@js.native
class DBusError protected ()
  extends stdLib.Error {
  def this(name: java.lang.String, message: java.lang.String) = this()
  val dbusName: java.lang.String = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

