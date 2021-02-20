package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlanOfferingFilterElement extends StObject {
  
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanOfferingFilterAttribute] = js.native
  
  /**
    * The filter values.
    */
  var values: js.UndefOr[FilterValuesList] = js.native
}
object SavingsPlanOfferingFilterElement {
  
  @scala.inline
  def apply(): SavingsPlanOfferingFilterElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingFilterElement]
  }
  
  @scala.inline
  implicit class SavingsPlanOfferingFilterElementMutableBuilder[Self <: SavingsPlanOfferingFilterElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SavingsPlanOfferingFilterAttribute): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValues(value: FilterValuesList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: JsonSafeFilterValueString*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
