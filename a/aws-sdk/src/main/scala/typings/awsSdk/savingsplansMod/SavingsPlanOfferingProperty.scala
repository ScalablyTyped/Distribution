package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlanOfferingProperty extends StObject {
  
  /**
    * The property name.
    */
  var name: js.UndefOr[SavingsPlanOfferingPropertyKey] = js.undefined
  
  /**
    * The property value.
    */
  var value: js.UndefOr[JsonSafeFilterValueString] = js.undefined
}
object SavingsPlanOfferingProperty {
  
  @scala.inline
  def apply(): SavingsPlanOfferingProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingProperty]
  }
  
  @scala.inline
  implicit class SavingsPlanOfferingPropertyMutableBuilder[Self <: SavingsPlanOfferingProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SavingsPlanOfferingPropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: JsonSafeFilterValueString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
