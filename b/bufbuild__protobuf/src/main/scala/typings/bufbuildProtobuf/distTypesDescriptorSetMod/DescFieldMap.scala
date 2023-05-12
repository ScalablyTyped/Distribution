package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`false`
import typings.bufbuildProtobuf.bufbuildProtobufStrings.map
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.BYTES
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.DOUBLE
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.FLOAT
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescFieldMap extends StObject {
  
  /**
    * The enum type, if it is an enum field.
    */
  val `enum`: Unit
  
  val fieldKind: map
  
  /**
    * The map key type, if this is a map field.
    */
  val mapKey: Exclude[ScalarType, FLOAT | DOUBLE | BYTES]
  
  /**
    * The map value type, if this is a map field.
    */
  val mapValue: DescFieldMapValueEnum | DescFieldMapValueMessage | DescFieldMapValueScalar
  
  /**
    * The message type, if it is a message field.
    */
  val message: Unit
  
  /**
    * Is the field repeated?
    */
  val repeated: `false`
  
  /**
    * Scalar type, if it is a scalar field.
    */
  val scalar: Unit
}
object DescFieldMap {
  
  inline def apply(
    `enum`: Unit,
    mapKey: Exclude[ScalarType, FLOAT | DOUBLE | BYTES],
    mapValue: DescFieldMapValueEnum | DescFieldMapValueMessage | DescFieldMapValueScalar,
    message: Unit,
    scalar: Unit
  ): DescFieldMap = {
    val __obj = js.Dynamic.literal(fieldKind = "map", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repeated = false, scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldMap] (val x: Self) extends AnyVal {
    
    inline def setEnum(value: Unit): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setFieldKind(value: map): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
    
    inline def setMapKey(value: Exclude[ScalarType, FLOAT | DOUBLE | BYTES]): Self = StObject.set(x, "mapKey", value.asInstanceOf[js.Any])
    
    inline def setMapValue(value: DescFieldMapValueEnum | DescFieldMapValueMessage | DescFieldMapValueScalar): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Unit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRepeated(value: `false`): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    
    inline def setScalar(value: Unit): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
  }
}
