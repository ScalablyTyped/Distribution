package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  var dataType: js.UndefOr[typings.breeze.breeze.DataType] = js.undefined
  
  var isLiteral: js.UndefOr[Boolean] = js.undefined
  
  var value: Any
}
object DataType {
  
  inline def apply(value: Any): DataType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  extension [Self <: DataType](x: Self) {
    
    inline def setDataType(value: typings.breeze.breeze.DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setIsLiteral(value: Boolean): Self = StObject.set(x, "isLiteral", value.asInstanceOf[js.Any])
    
    inline def setIsLiteralUndefined: Self = StObject.set(x, "isLiteral", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
