package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.stringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseValue extends StObject {
  
  var `case`: stringValue
  
  /**
    * Represents a string value.
    *
    * @generated from field: string string_value = 3;
    */
  var value: String
}
object CaseValue {
  
  inline def apply(value: String): CaseValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("case")("stringValue")
    __obj.asInstanceOf[CaseValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaseValue] (val x: Self) extends AnyVal {
    
    inline def setCase(value: stringValue): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
