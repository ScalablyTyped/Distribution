package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetPropertyVariant extends StObject {
  
  /**
    * The asset property value is a Boolean value that must be 'TRUE' or 'FALSE'. You must use an expression, and the evaluated result should be a Boolean value.
    */
  var booleanValue: js.UndefOr[AssetPropertyBooleanValue] = js.undefined
  
  /**
    * The asset property value is a double. You must use an expression, and the evaluated result should be a double.
    */
  var doubleValue: js.UndefOr[AssetPropertyDoubleValue] = js.undefined
  
  /**
    * The asset property value is an integer. You must use an expression, and the evaluated result should be an integer.
    */
  var integerValue: js.UndefOr[AssetPropertyIntegerValue] = js.undefined
  
  /**
    * The asset property value is a string. You must use an expression, and the evaluated result should be a string.
    */
  var stringValue: js.UndefOr[AssetPropertyStringValue] = js.undefined
}
object AssetPropertyVariant {
  
  inline def apply(): AssetPropertyVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetPropertyVariant]
  }
  
  extension [Self <: AssetPropertyVariant](x: Self) {
    
    inline def setBooleanValue(value: AssetPropertyBooleanValue): Self = StObject.set(x, "booleanValue", value.asInstanceOf[js.Any])
    
    inline def setBooleanValueUndefined: Self = StObject.set(x, "booleanValue", js.undefined)
    
    inline def setDoubleValue(value: AssetPropertyDoubleValue): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
    
    inline def setDoubleValueUndefined: Self = StObject.set(x, "doubleValue", js.undefined)
    
    inline def setIntegerValue(value: AssetPropertyIntegerValue): Self = StObject.set(x, "integerValue", value.asInstanceOf[js.Any])
    
    inline def setIntegerValueUndefined: Self = StObject.set(x, "integerValue", js.undefined)
    
    inline def setStringValue(value: AssetPropertyStringValue): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
    
    inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
  }
}
