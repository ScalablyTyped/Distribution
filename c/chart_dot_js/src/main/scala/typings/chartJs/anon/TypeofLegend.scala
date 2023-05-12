package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofLegend extends StObject {
  
  def afterEvent(chart: Any, args: Any): Unit
  
  def afterUpdate(chart: Any): Unit
  
  def beforeUpdate(chart: Any, _args: Any, options: Any): Unit
  
  val defaults: TypeofdefaultsAlign
  
  val descriptors: Typeofdescriptors
  
  val id: String
  
  def start(chart: Any, _args: Any, options: Any): Unit
  
  def stop(chart: Any): Unit
}
object TypeofLegend {
  
  inline def apply(
    afterEvent: (Any, Any) => Unit,
    afterUpdate: Any => Unit,
    beforeUpdate: (Any, Any, Any) => Unit,
    defaults: TypeofdefaultsAlign,
    descriptors: Typeofdescriptors,
    id: String,
    start: (Any, Any, Any) => Unit,
    stop: Any => Unit
  ): TypeofLegend = {
    val __obj = js.Dynamic.literal(afterEvent = js.Any.fromFunction2(afterEvent), afterUpdate = js.Any.fromFunction1(afterUpdate), beforeUpdate = js.Any.fromFunction3(beforeUpdate), defaults = defaults.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start = js.Any.fromFunction3(start), stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[TypeofLegend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofLegend] (val x: Self) extends AnyVal {
    
    inline def setAfterEvent(value: (Any, Any) => Unit): Self = StObject.set(x, "afterEvent", js.Any.fromFunction2(value))
    
    inline def setAfterUpdate(value: Any => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
    
    inline def setBeforeUpdate(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction3(value))
    
    inline def setDefaults(value: TypeofdefaultsAlign): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDescriptors(value: Typeofdescriptors): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStart(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    
    inline def setStop(value: Any => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
  }
}
