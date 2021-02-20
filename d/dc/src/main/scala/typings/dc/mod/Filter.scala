package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  def isFiltered(value: js.Any): Boolean = js.native
}
object Filter {
  
  @scala.inline
  def apply(isFiltered: js.Any => Boolean): Filter = {
    val __obj = js.Dynamic.literal(isFiltered = js.Any.fromFunction1(isFiltered))
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFiltered(value: js.Any => Boolean): Self = StObject.set(x, "isFiltered", js.Any.fromFunction1(value))
  }
}
