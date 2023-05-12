package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.`enum`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescFieldMapValueEnum extends StObject {
  
  /**
    * The enum type, if this is a map field with enum values.
    */
  val `enum`: DescEnum
  
  val kind: typings.bufbuildProtobuf.bufbuildProtobufStrings.`enum`
  
  /**
    * The message this message field uses.
    */
  val message: Unit
  
  /**
    * Scalar type, if this is a map field with scalar values.
    */
  val scalar: Unit
}
object DescFieldMapValueEnum {
  
  inline def apply(`enum`: DescEnum, message: Unit, scalar: Unit): DescFieldMapValueEnum = {
    val __obj = js.Dynamic.literal(kind = "enum", message = message.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldMapValueEnum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldMapValueEnum] (val x: Self) extends AnyVal {
    
    inline def setEnum(value: DescEnum): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setKind(value: `enum`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Unit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setScalar(value: Unit): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
  }
}
