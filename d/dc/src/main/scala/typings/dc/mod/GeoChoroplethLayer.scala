package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoChoroplethLayer extends StObject {
  
  var data: Any
  
  def keyAccessor(datum: Any): Any
  def keyAccessor(datum: Any, index: Double): Any
  @JSName("keyAccessor")
  var keyAccessor_Original: Accessor[Any, Any]
  
  var name: String
}
object GeoChoroplethLayer {
  
  inline def apply(data: Any, keyAccessor: (Any, /* index */ js.UndefOr[Double]) => Any, name: String): GeoChoroplethLayer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoChoroplethLayer]
  }
  
  extension [Self <: GeoChoroplethLayer](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setKeyAccessor(value: (Any, /* index */ js.UndefOr[Double]) => Any): Self = StObject.set(x, "keyAccessor", js.Any.fromFunction2(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
