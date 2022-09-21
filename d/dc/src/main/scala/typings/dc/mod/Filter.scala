package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  def isFiltered(value: Any): Boolean
}
object Filter {
  
  inline def apply(isFiltered: Any => Boolean): Filter = {
    val __obj = js.Dynamic.literal(isFiltered = js.Any.fromFunction1(isFiltered))
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setIsFiltered(value: Any => Boolean): Self = StObject.set(x, "isFiltered", js.Any.fromFunction1(value))
  }
}
