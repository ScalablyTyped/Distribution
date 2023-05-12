package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.message_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescFieldMapValueMessage extends StObject {
  
  /**
    * The enum type, if this is a map field with enum values.
    */
  val `enum`: Unit
  
  val kind: message_
  
  /**
    * The message type, if this is a map field with message values.
    */
  val message: DescMessage
  
  /**
    * Scalar type, if this is a map field with scalar values.
    */
  val scalar: Unit
}
object DescFieldMapValueMessage {
  
  inline def apply(`enum`: Unit, message: DescMessage, scalar: Unit): DescFieldMapValueMessage = {
    val __obj = js.Dynamic.literal(kind = "message", message = message.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldMapValueMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldMapValueMessage] (val x: Self) extends AnyVal {
    
    inline def setEnum(value: Unit): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setKind(value: message_): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: DescMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setScalar(value: Unit): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
  }
}
