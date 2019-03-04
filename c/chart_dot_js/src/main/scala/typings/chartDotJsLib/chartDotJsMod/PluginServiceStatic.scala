package typings
package chartDotJsLib.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginServiceStatic extends js.Object {
  def register(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): scala.Unit
  def unregister(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): scala.Unit
}

object PluginServiceStatic {
  @scala.inline
  def apply(
    register: js.Function1[PluginServiceGlobalRegistration with PluginServiceRegistrationOptions, scala.Unit],
    unregister: js.Function1[PluginServiceGlobalRegistration with PluginServiceRegistrationOptions, scala.Unit]
  ): PluginServiceStatic = {
    val __obj = js.Dynamic.literal(register = register, unregister = unregister)
  
    __obj.asInstanceOf[PluginServiceStatic]
  }
}

