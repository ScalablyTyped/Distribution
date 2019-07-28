package typings.dbus.dbusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dbus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getBus(`type`: busType): DBusConnection = js.native
  def registerService(busName: busType, serviceName: String): DBusService = js.native
}

