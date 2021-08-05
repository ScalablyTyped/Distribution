package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlanRateFilter extends StObject {
  
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanRateFilterName] = js.undefined
  
  /**
    * The filter values.
    */
  var values: js.UndefOr[ListOfStrings] = js.undefined
}
object SavingsPlanRateFilter {
  
  inline def apply(): SavingsPlanRateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanRateFilter]
  }
  
  extension [Self <: SavingsPlanRateFilter](x: Self) {
    
    inline def setName(value: SavingsPlanRateFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: ListOfStrings): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
