package typings.dbus.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dbus", "DBusError")
@js.native
class DBusError protected () extends Error {
  def this(name: String, message: String) = this()
  val dbusName: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

