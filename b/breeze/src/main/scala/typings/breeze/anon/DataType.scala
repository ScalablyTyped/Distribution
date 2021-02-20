package typings.breeze.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataType extends StObject {
  
  var dataType: js.UndefOr[typings.breeze.breeze.DataType] = js.native
  
  var isLiteral: js.UndefOr[Boolean] = js.native
  
  var value: js.Any = js.native
}
object DataType {
  
  @scala.inline
  def apply(value: js.Any): DataType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  @scala.inline
  implicit class DataTypeMutableBuilder[Self <: DataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: typings.breeze.breeze.DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setIsLiteral(value: Boolean): Self = StObject.set(x, "isLiteral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLiteralUndefined: Self = StObject.set(x, "isLiteral", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
