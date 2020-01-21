package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dbus.dbusStrings.session
  - typings.dbus.dbusStrings.system
*/
trait busType extends js.Object

object busType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def session: typings.dbus.dbusStrings.session = this.cast("session")
  @scala.inline
  def system: typings.dbus.dbusStrings.system = this.cast("system")
}

