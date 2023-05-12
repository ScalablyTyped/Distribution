package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.field
import typings.bufbuildProtobuf.bufbuildProtobufStrings.message_
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescComments
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescFieldMessage & @bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescFieldCommon & {  kind :'field',  readonly parent :@bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescMessage} */
trait DescFieldMessageDescField
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
  
  val fieldKind: message_
  
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
  val repeated: Boolean
  
  /**
    * Scalar type, if it is a scalar field.
    */
  val scalar: Unit
}
object DescFieldMessageDescField {
  
  inline def apply(
    declarationString: () => String,
    deprecated: Boolean,
    `enum`: Unit,
    getComments: () => DescComments,
    mapKey: Unit,
    mapValue: Unit,
    message: DescMessage,
    name: String,
    number: Double,
    optional: Boolean,
    packed: Boolean,
    packedByDefault: Boolean,
    parent: DescMessage,
    proto: FieldDescriptorProto,
    repeated: Boolean,
    scalar: Unit
  ): DescFieldMessageDescField = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], fieldKind = "message", getComments = js.Any.fromFunction0(getComments), kind = "field", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldMessageDescField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldMessageDescField] (val x: Self) extends AnyVal {
    
    inline def setDeclarationString(value: () => String): Self = StObject.set(x, "declarationString", js.Any.fromFunction0(value))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setEnum(value: Unit): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setFieldKind(value: message_): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setKind(value: field): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMapKey(value: Unit): Self = StObject.set(x, "mapKey", value.asInstanceOf[js.Any])
    
    inline def setMapValue(value: Unit): Self = StObject.set(x, "mapValue", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: DescMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setOneof(value: DescOneof): Self = StObject.set(x, "oneof", value.asInstanceOf[js.Any])
    
    inline def setOneofUndefined: Self = StObject.set(x, "oneof", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setPacked(value: Boolean): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
    
    inline def setPackedByDefault(value: Boolean): Self = StObject.set(x, "packedByDefault", value.asInstanceOf[js.Any])
    
    inline def setParent(value: DescMessage): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setProto(value: FieldDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    
    inline def setScalar(value: Unit): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
  }
}
