package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumValue
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Description of the charge
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Display name of the charge
    */
  var displayName: String
  
  /**
    * The upper limit of the charge if the charge could occur in a range
    */
  var maximumValue: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum value of the charge if the charge is a range or the absolute value of the charge if no range is specified
    */
  var minimumValue: String
  
  /**
    * The charges that occur on a schedule indicates the frequency. Formatted according to [ISO 8601 Durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) (excludes recurrence syntax)
    */
  var period: js.UndefOr[String] = js.undefined
}
object MaximumValue {
  
  inline def apply(displayName: String, minimumValue: String): MaximumValue = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], minimumValue = minimumValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumValue]
  }
  
  extension [Self <: MaximumValue](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setMaximumValue(value: String): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    inline def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    inline def setMinimumValue(value: String): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
