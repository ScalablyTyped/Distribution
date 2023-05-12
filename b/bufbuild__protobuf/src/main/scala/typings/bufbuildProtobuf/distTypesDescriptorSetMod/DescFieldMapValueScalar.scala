package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.scalar
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescFieldMapValueScalar extends StObject {
  
  /**
    * The enum type, if this is a map field with enum values.
    */
  val `enum`: Unit
  
  val kind: typings.bufbuildProtobuf.bufbuildProtobufStrings.scalar
  
  /**
    * The message type, if this is a map field with message values.
    */
  val message: Unit
  
  /**
    * Scalar type, if this is a map field with scalar values.
    */
  val scalar: ScalarType
}
object DescFieldMapValueScalar {
  
  inline def apply(`enum`: Unit, message: Unit, scalar: ScalarType): DescFieldMapValueScalar = {
    val __obj = js.Dynamic.literal(kind = "scalar", message = message.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldMapValueScalar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldMapValueScalar] (val x: Self) extends AnyVal {
    
    inline def setEnum(value: Unit): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setKind(value: scalar): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Unit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setScalar(value: ScalarType): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
  }
}
