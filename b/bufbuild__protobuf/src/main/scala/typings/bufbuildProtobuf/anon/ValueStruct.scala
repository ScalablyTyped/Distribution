package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.structValue
import typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.Struct
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueStruct extends StObject {
  
  var `case`: structValue
  
  /**
    * Represents a structured value.
    *
    * @generated from field: google.protobuf.Struct struct_value = 5;
    */
  var value: Struct
}
object ValueStruct {
  
  inline def apply(value: Struct): ValueStruct = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("case")("structValue")
    __obj.asInstanceOf[ValueStruct]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueStruct] (val x: Self) extends AnyVal {
    
    inline def setCase(value: structValue): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Struct): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
