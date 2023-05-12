package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufBooleans.`false`
import typings.bufbuildProtobuf.bufbuildProtobufStrings.field
import typings.bufbuildProtobuf.bufbuildProtobufStrings.map
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescComments
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescFieldMapValueEnum
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescFieldMapValueMessage
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescFieldMapValueScalar
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.BYTES
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.DOUBLE
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.FLOAT
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescFieldMap & @bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescFieldCommon & {  kind :'field',  readonly parent :@bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescMessage} */
trait DescFieldMapDescFieldComm
  extends StObject
     with DescField {
  
  /**
    * Return a string that (closely) matches the definition of the field in the
    * protobuf source.
    */
  def declarationString(): String
  
  /**
    * Marked as deprecated in the protobuf source.
    */
  val deprecated: Boolean
  
  /**
    * The enum type, if it is an enum field.
    */
  val `enum`: Unit
  
  val fieldKind: map
  
  /**
    * Get comments on the element in the protobuf source.
    */
  def getComments(): DescComments
  
  /**
    * A user-defined name for the JSON format, set with the field option
    * [json_name="foo"].
    */
  val jsonName: js.UndefOr[String] = js.undefined
  
  var kind: field
  
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
    * The field name, as specified in the protobuf source
    */
  val name: String
  
  /**
    * The field number, as specified in the protobuf source.
    */
  val number: Double
  
  /**
    * The `oneof` group this field belongs to, if any.
    */
  val oneof: js.UndefOr[DescOneof] = js.undefined
  
  /**
    * Whether this field was declared with `optional` in the protobuf source.
    */
  val optional: Boolean
  
  /**
    * Pack this repeated field?
    */
  val packed: Boolean
  
  /**
    * Is this field packed by default? Only valid for enum fields, and for
    * scalar fields except BYTES and STRING.
    * In proto3 syntax, fields are packed by default. In proto2 syntax, fields
    * are unpacked by default.
    */
  val packedByDefault: Boolean
  
  /**
    * The message this field is declared on.
    */
  val parent: DescMessage
  
  /**
    * The compiler-generated descriptor.
    */
  val proto: FieldDescriptorProto
  
  /**
    * Is the field repeated?
    */
  val repeated: `false`
  
  /**
    * Scalar type, if it is a scalar field.
    */
  val scalar: Unit
}
object DescFieldMapDescFieldComm {
  
  inline def apply(
    declarationString: () => String,
    deprecated: Boolean,
    `enum`: Unit,
    getComments: () => DescComments,
    mapKey: Exclude[ScalarType, FLOAT | DOUBLE | BYTES],
    mapValue: DescFieldMapValueEnum | DescFieldMapValueMessage | DescFieldMapValueScalar,
    message: Unit,
    name: String,
    number: Double,
    optional: Boolean,
    packed: Boolean,
    packedByDefault: Boolean,
    parent: DescMessage,
    proto: FieldDescriptorProto,
    scalar: Unit
  ): DescFieldMapDescFieldComm = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], fieldKind = "map", getComments = js.Any.fromFunction0(getComments), kind = "field", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = false, scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldMapDescFieldComm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldMapDescFieldComm] (val x: Self) extends AnyVal {
    
    inline def setDeclarationString(value: () => String): Self = StObject.set(x, "declarationString", js.Any.fromFunction0(value))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setEnum(value: Unit): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setFieldKind(value: map): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setKind(value: field): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMapKey(value: Exclude[ScalarType, FLOAT | DOUBLE | BYTES]): Self = StObject.set(x, "mapKey", value.asInstanceOf[js.Any])
    
    inline def setMapValue(value: DescFieldMapValueEnum | DescFieldMapValueMessage | DescFieldMapValueScalar): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Unit): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOneof(value: DescOneof): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
    
    inline def setOneofUndefined: Self = StObject.set(x, "oneof", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedByDefault(value: Boolean): Self = StObject.set(x, "packedByDefault", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DescMessage): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setProto(value: FieldDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setRepeated(value: `false`): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    
    inline def setScalar(value: Unit): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
  }
}
