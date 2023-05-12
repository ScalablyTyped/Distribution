package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDecimation extends StObject {
  
  def beforeElementsUpdate(chart: Any, args: Any, options: Any): Unit
  
  val defaults: Typeofdefaults
  
  def destroy(chart: Any): Unit
  
  val id: String
}
object TypeofDecimation {
  
  inline def apply(
    beforeElementsUpdate: (Any, Any, Any) => Unit,
    defaults: Typeofdefaults,
    destroy: Any => Unit,
    id: String
  ): TypeofDecimation = {
    val __obj = js.Dynamic.literal(beforeElementsUpdate = js.Any.fromFunction3(beforeElementsUpdate), defaults = defaults.asInstanceOf[js.Any], destroy = js.Any.fromFunction1(destroy), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDecimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDecimation] (val x: Self) extends AnyVal {
    
    inline def setBeforeElementsUpdate(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "beforeElementsUpdate", js.Any.fromFunction3(value))
    
    inline def setDefaults(value: Typeofdefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Any => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
