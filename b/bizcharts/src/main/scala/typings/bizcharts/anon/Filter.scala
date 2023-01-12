package typings.bizcharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  var filter: js.Array[Any]
  
  var interactions: js.Array[Any]
  
  var placeholder: Boolean
  
  var visible: Boolean
}
object Filter {
  
  inline def apply(filter: js.Array[Any], interactions: js.Array[Any], placeholder: Boolean, visible: Boolean): Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: js.Array[Any]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterVarargs(value: Any*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setInteractions(value: js.Array[Any]): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setInteractionsVarargs(value: Any*): Self = StObject.set(x, "interactions", js.Array(value*))
    
    inline def setPlaceholder(value: Boolean): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
