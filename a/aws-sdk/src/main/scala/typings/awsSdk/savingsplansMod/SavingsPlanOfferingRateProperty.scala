package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlanOfferingRateProperty extends StObject {
  
  /**
    * The property name.
    */
  var name: js.UndefOr[JsonSafeFilterValueString] = js.native
  
  /**
    * The property value.
    */
  var value: js.UndefOr[JsonSafeFilterValueString] = js.native
}
object SavingsPlanOfferingRateProperty {
  
  @scala.inline
  def apply(): SavingsPlanOfferingRateProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingRateProperty]
  }
  
  @scala.inline
  implicit class SavingsPlanOfferingRatePropertyMutableBuilder[Self <: SavingsPlanOfferingRateProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: JsonSafeFilterValueString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: JsonSafeFilterValueString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
