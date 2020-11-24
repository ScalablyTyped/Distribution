package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginServiceStatic extends js.Object {
  
  def register(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): Unit = js.native
  
  def unregister(plugin: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions): Unit = js.native
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
  
  @scala.inline
  implicit class PluginServiceStaticOps[Self <: PluginServiceStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegister(value: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit): Self = this.set("register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit): Self = this.set("unregister", js.Any.fromFunction1(value))
  }
}
