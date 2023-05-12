package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.message_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescFieldMessage extends StObject {
  
  /**
    * The enum type, if it is an enum field.
    */
  val `enum`: Unit
  
  val fieldKind: message_
  
  /**
    * The map key type, if this is a map field.
    */
  val mapKey: Unit
  
  /**
    * The map value type, if this is a map field.
    */
  val mapValue: Unit
  
  /**
    * The message type, if it is a message field.
    */
  val message: DescMessage
  
  /**
    * Is the field repeated?
    */
  val repeated: Boolean
  
  /**
    * Scalar type, if it is a scalar field.
    */
  val scalar: Unit
}
object DescFieldMessage {
  
  inline def apply(`enum`: Unit, mapKey: Unit, mapValue: Unit, message: DescMessage, repeated: Boolean, scalar: Unit): DescFieldMessage = {
    val __obj = js.Dynamic.literal(fieldKind = "message", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldMessage] (val x: Self) extends AnyVal {
    
    inline def setEnum(value: Unit): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setFieldKind(value: message_): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
    
    inline def setMapKey(value: Unit): Self = StObject.set(x, "mapKey", value.asInstanceOf[js.Any])
    
    inline def setMapValue(value: Unit): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: DescMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    
    inline def setScalar(value: Unit): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
  }
}
