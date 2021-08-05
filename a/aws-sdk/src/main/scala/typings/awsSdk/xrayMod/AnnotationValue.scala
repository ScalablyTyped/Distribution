package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationValue extends StObject {
  
  /**
    * Value for a Boolean annotation.
    */
  var BooleanValue: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Value for a Number annotation.
    */
  var NumberValue: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * Value for a String annotation.
    */
  var StringValue: js.UndefOr[String] = js.undefined
}
object AnnotationValue {
  
  inline def apply(): AnnotationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationValue]
  }
  
  extension [Self <: AnnotationValue](x: Self) {
    
    inline def setBooleanValue(value: NullableBoolean): Self = StObject.set(x, "BooleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "BooleanValue", js.undefined)
    
    inline def setNumberValue(value: NullableDouble): Self = StObject.set(x, "NumberValue", value.asInstanceOf[js.Any])
    
    inline def setNumberValueUndefined: Self = StObject.set(x, "NumberValue", js.undefined)
    
    inline def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
  }
}
