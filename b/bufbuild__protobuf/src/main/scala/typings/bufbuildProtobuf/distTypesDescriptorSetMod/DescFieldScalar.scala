package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.scalar
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescFieldScalar extends StObject {
  
  /**
    * The enum type, if it is an enum field.
    */
  val `enum`: Unit
  
  val fieldKind: typings.bufbuildProtobuf.bufbuildProtobufStrings.scalar
  
  /**
    * Return the default value specified in the protobuf source.
    * Only valid for proto2 syntax.
    */
  def getDefaultValue(): js.UndefOr[Double | Boolean | String | js.BigInt | js.typedarray.Uint8Array]
  
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
  val message: Unit
  
  /**
    * Is the field repeated?
    */
  val repeated: Boolean
  
  /**
    * Scalar type, if it is a scalar field.
    */
  val scalar: ScalarType
}
object DescFieldScalar {
  
  inline def apply(
    `enum`: Unit,
    getDefaultValue: () => js.UndefOr[Double | Boolean | String | js.BigInt | js.typedarray.Uint8Array],
    mapKey: Unit,
    mapValue: Unit,
    message: Unit,
    repeated: Boolean,
    scalar: ScalarType
  ): DescFieldScalar = {
    val __obj = js.Dynamic.literal(fieldKind = "scalar", getDefaultValue = js.Any.fromFunction0(getDefaultValue), mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldScalar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldScalar] (val x: Self) extends AnyVal {
    
    inline def setEnum(value: Unit): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setFieldKind(value: scalar): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
    
    inline def setGetDefaultValue(value: () => js.UndefOr[Double | Boolean | String | js.BigInt | js.typedarray.Uint8Array]): Self = StObject.set(x, "getDefaultValue", js.Any.fromFunction0(value))
    
    inline def setMapKey(value: Unit): Self = StObject.set(x, "mapKey", value.asInstanceOf[js.Any])
    
    inline def setMapValue(value: Unit): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Unit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    
    inline def setScalar(value: ScalarType): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
  }
}
