package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateRangeType extends StObject {
  
  /**
    * Timestamp range end value (in epochs).
    */
  var EndValue: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Timestamp range start value (in epochs)
    */
  var StartValue: js.UndefOr[js.Date] = js.undefined
}
object DateRangeType {
  
  inline def apply(): DateRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateRangeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateRangeType] (val x: Self) extends AnyVal {
    
    inline def setEndValue(value: js.Date): Self = StObject.set(x, "EndValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "EndValue", js.undefined)
    
    inline def setStartValue(value: js.Date): Self = StObject.set(x, "StartValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "StartValue", js.undefined)
  }
}
