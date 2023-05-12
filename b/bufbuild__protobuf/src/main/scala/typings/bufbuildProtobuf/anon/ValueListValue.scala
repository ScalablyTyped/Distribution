package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.listValue
import typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueListValue extends StObject {
  
  var `case`: listValue
  
  /**
    * Represents a repeated `Value`.
    *
    * @generated from field: google.protobuf.ListValue list_value = 6;
    */
  var value: ListValue
}
object ValueListValue {
  
  inline def apply(value: ListValue): ValueListValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("case")("listValue")
    __obj.asInstanceOf[ValueListValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueListValue] (val x: Self) extends AnyVal {
    
    inline def setCase(value: listValue): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ListValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
