package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginServiceStatic extends StObject {
  
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
  implicit class PluginServiceStaticMutableBuilder[Self <: PluginServiceStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegister(value: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: PluginServiceGlobalRegistration with PluginServiceRegistrationOptions => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
  }
}
