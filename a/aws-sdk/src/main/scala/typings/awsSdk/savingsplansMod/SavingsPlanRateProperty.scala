package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlanRateProperty extends StObject {
  
  /**
    * The property name.
    */
  var name: js.UndefOr[SavingsPlanRatePropertyKey] = js.undefined
  
  /**
    * The property value.
    */
  var value: js.UndefOr[JsonSafeFilterValueString] = js.undefined
}
object SavingsPlanRateProperty {
  
  inline def apply(): SavingsPlanRateProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanRateProperty]
  }
  
  extension [Self <: SavingsPlanRateProperty](x: Self) {
    
    inline def setName(value: SavingsPlanRatePropertyKey): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: JsonSafeFilterValueString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
