package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.boolValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueBoolean extends StObject {
  
  var `case`: boolValue
  
  /**
    * Represents a boolean value.
    *
    * @generated from field: bool bool_value = 4;
    */
  var value: Boolean
}
object ValueBoolean {
  
  inline def apply(value: Boolean): ValueBoolean = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("case")("boolValue")
    __obj.asInstanceOf[ValueBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueBoolean] (val x: Self) extends AnyVal {
    
    inline def setCase(value: boolValue): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
