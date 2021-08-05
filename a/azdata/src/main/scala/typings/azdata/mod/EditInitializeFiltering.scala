package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditInitializeFiltering extends StObject {
  
  var LimitResults: js.UndefOr[Double] = js.undefined
}
object EditInitializeFiltering {
  
  inline def apply(): EditInitializeFiltering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditInitializeFiltering]
  }
  
  extension [Self <: EditInitializeFiltering](x: Self) {
    
    inline def setLimitResults(value: Double): Self = StObject.set(x, "LimitResults", value.asInstanceOf[js.Any])
    
    inline def setLimitResultsUndefined: Self = StObject.set(x, "LimitResults", js.undefined)
  }
}
