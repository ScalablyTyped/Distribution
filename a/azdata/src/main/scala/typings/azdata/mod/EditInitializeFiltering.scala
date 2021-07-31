package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditInitializeFiltering extends StObject {
  
  var LimitResults: js.UndefOr[Double] = js.undefined
}
object EditInitializeFiltering {
  
  @scala.inline
  def apply(): EditInitializeFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditInitializeFiltering]
  }
  
  @scala.inline
  implicit class EditInitializeFilteringMutableBuilder[Self <: EditInitializeFiltering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimitResults(value: Double): Self = StObject.set(x, "LimitResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitResultsUndefined: Self = StObject.set(x, "LimitResults", js.undefined)
  }
}
