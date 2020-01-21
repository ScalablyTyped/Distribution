package typings.dbus

import typings.dbus.mod.busType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dbusStrings {
  @js.native
  sealed trait session extends busType
  
  @js.native
  sealed trait system extends busType
  
  @scala.inline
  def session: session = "session".asInstanceOf[session]
  @scala.inline
  def system: system = "system".asInstanceOf[system]
}

