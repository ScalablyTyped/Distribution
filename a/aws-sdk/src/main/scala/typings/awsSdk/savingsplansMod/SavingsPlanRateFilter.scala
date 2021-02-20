package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlanRateFilter extends StObject {
  
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanRateFilterName] = js.native
  
  /**
    * The filter values.
    */
  var values: js.UndefOr[ListOfStrings] = js.native
}
object SavingsPlanRateFilter {
  
  @scala.inline
  def apply(): SavingsPlanRateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanRateFilter]
  }
  
  @scala.inline
  implicit class SavingsPlanRateFilterMutableBuilder[Self <: SavingsPlanRateFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SavingsPlanRateFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValues(value: ListOfStrings): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
