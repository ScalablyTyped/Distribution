package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongRangeType extends StObject {
  
  /**
    * The size end range (in bytes).
    */
  var EndValue: js.UndefOr[LongType] = js.undefined
  
  /**
    * The size start range (in bytes).
    */
  var StartValue: js.UndefOr[LongType] = js.undefined
}
object LongRangeType {
  
  inline def apply(): LongRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongRangeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LongRangeType] (val x: Self) extends AnyVal {
    
    inline def setEndValue(value: LongType): Self = StObject.set(x, "EndValue", value.asInstanceOf[js.Any])
    
    inline def setEndValueUndefined: Self = StObject.set(x, "EndValue", js.undefined)
    
    inline def setStartValue(value: LongType): Self = StObject.set(x, "StartValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "StartValue", js.undefined)
  }
}
