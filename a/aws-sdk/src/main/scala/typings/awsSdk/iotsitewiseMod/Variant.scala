package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variant extends StObject {
  
  /**
    * Asset property data of type Boolean (true or false).
    */
  var booleanValue: js.UndefOr[PropertyValueBooleanValue] = js.undefined
  
  /**
    * Asset property data of type double (floating point number).
    */
  var doubleValue: js.UndefOr[PropertyValueDoubleValue] = js.undefined
  
  /**
    * Asset property data of type integer (whole number).
    */
  var integerValue: js.UndefOr[PropertyValueIntegerValue] = js.undefined
  
  /**
    * Asset property data of type string (sequence of characters).
    */
  var stringValue: js.UndefOr[PropertyValueStringValue] = js.undefined
}
object Variant {
  
  inline def apply(): Variant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variant]
  }
  
  extension [Self <: Variant](x: Self) {
    
    inline def setBooleanValue(value: PropertyValueBooleanValue): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDoubleValue(value: PropertyValueDoubleValue): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setIntegerValue(value: PropertyValueIntegerValue): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setStringValue(value: PropertyValueStringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
