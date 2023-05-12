package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTitle_ extends StObject {
  
  def beforeUpdate(chart: Any, _args: Any, options: Any): Unit
  
  val defaultRoutes: TypeofdefaultRoutes
  
  val defaults: TypeofdefaultsDisplay
  
  val descriptors: TypeofdescriptorsIndexable
  
  val id: String
  
  def start(chart: Any, _args: Any, options: Any): Unit
  
  def stop(chart: Any): Unit
}
object TypeofTitle_ {
  
  inline def apply(
    beforeUpdate: (Any, Any, Any) => Unit,
    defaultRoutes: TypeofdefaultRoutes,
    defaults: TypeofdefaultsDisplay,
    descriptors: TypeofdescriptorsIndexable,
    id: String,
    start: (Any, Any, Any) => Unit,
    stop: Any => Unit
  ): TypeofTitle_ = {
    val __obj = js.Dynamic.literal(beforeUpdate = js.Any.fromFunction3(beforeUpdate), defaultRoutes = defaultRoutes.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start = js.Any.fromFunction3(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[TypeofTitle_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTitle_] (val x: Self) extends AnyVal {
    
    inline def setBeforeUpdate(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction3(value))
    
    inline def setDefaultRoutes(value: TypeofdefaultRoutes): Self = StObject.set(x, "defaultRoutes", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: TypeofdefaultsDisplay): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDescriptors(value: TypeofdescriptorsIndexable): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStart(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    
    inline def setStop(value: Any => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
