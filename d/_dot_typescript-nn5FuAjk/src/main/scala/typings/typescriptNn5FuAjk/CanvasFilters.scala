package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasFilters extends StObject {
  
  var filter: java.lang.String
}
object CanvasFilters {
  
  inline def apply(filter: java.lang.String): CanvasFilters = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasFilters]
  }
  
  extension [Self <: CanvasFilters](x: Self) {
    
    inline def setFilter(value: java.lang.String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
  }
}
