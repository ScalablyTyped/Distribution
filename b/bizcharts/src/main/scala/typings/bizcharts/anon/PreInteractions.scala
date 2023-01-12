package typings.bizcharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreInteractions extends StObject {
  
  var filter: js.Array[Any]
  
  var preInteractions: js.Array[Any]
  
  var visible: Boolean
}
object PreInteractions {
  
  inline def apply(filter: js.Array[Any], preInteractions: js.Array[Any], visible: Boolean): PreInteractions = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], preInteractions = preInteractions.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreInteractions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreInteractions] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: js.Array[Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterVarargs(value: Any*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setPreInteractions(value: js.Array[Any]): Self = StObject.set(x, "preInteractions", value.asInstanceOf[js.Any])
    
    inline def setPreInteractionsVarargs(value: Any*): Self = StObject.set(x, "preInteractions", js.Array(value*))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
