package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EBSFilter extends StObject {
  
  /**
    * The name of the filter. Specify Finding to return recommendations with a specific finding classification (for example, NotOptimized).
    */
  var name: js.UndefOr[EBSFilterName] = js.undefined
  
  /**
    * The value of the filter. The valid values are Optimized, or NotOptimized.
    */
  var values: js.UndefOr[FilterValues] = js.undefined
}
object EBSFilter {
  
  inline def apply(): EBSFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSFilter]
  }
  
  extension [Self <: EBSFilter](x: Self) {
    
    inline def setName(value: EBSFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
