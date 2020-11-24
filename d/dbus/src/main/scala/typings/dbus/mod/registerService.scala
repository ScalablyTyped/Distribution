package typings.dbus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dbus", "registerService")
@js.native
object registerService extends js.Object {
  
  def apply(busName: busType): DBusService = js.native
  def apply(busName: busType, serviceName: String): DBusService = js.native
}
