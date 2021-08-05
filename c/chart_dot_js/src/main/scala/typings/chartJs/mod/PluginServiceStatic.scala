package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginServiceStatic extends StObject {
  
  def register(plugin: PluginServiceGlobalRegistration & PluginServiceRegistrationOptions): Unit
  
  def unregister(plugin: PluginServiceGlobalRegistration & PluginServiceRegistrationOptions): Unit
}
object PluginServiceStatic {
  
  inline def apply(
    register: PluginServiceGlobalRegistration & PluginServiceRegistrationOptions => Unit,
    unregister: PluginServiceGlobalRegistration & PluginServiceRegistrationOptions => Unit
  ): PluginServiceStatic = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register), unregister = js.Any.fromFunction1(unregister))
    __obj.asInstanceOf[PluginServiceStatic]
  }
  
  extension [Self <: PluginServiceStatic](x: Self) {
    
    inline def setRegister(value: PluginServiceGlobalRegistration & PluginServiceRegistrationOptions => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
    
    inline def setUnregister(value: PluginServiceGlobalRegistration & PluginServiceRegistrationOptions => Unit): Self = StObject.set(x, "unregister", js.Any.fromFunction1(value))
  }
}
