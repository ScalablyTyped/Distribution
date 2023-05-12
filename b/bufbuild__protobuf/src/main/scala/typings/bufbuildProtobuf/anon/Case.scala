package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.nullValue
import typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.NullValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Case extends StObject {
  
  var `case`: nullValue
  
  /**
    * Represents a null value.
    *
    * @generated from field: google.protobuf.NullValue null_value = 1;
    */
  var value: NullValue
}
object Case {
  
  inline def apply(value: NullValue): Case = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("case")("nullValue")
    __obj.asInstanceOf[Case]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Case] (val x: Self) extends AnyVal {
    
    inline def setCase(value: nullValue): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    inline def setValue(value: NullValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
