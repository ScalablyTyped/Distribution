package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginServiceStatic extends js.Object {
  def register(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): Unit
  def unregister(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): Unit
}

object PluginServiceStatic {
  @scala.inline
  def apply(
    register: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit,
    unregister: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit
  ): PluginServiceStatic = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
  
    __obj.asInstanceOf[PluginServiceStatic]
  }
}

