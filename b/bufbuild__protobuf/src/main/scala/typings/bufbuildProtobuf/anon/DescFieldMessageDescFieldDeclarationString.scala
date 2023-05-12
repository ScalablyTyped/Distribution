package typings.bufbuildProtobuf.anon

import typings.bufbuildProtobuf.bufbuildProtobufStrings.`extension`
import typings.bufbuildProtobuf.bufbuildProtobufStrings.message_
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescComments
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescExtension
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescFile
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescFieldMessage & @bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescFieldCommon & {  kind :'extension',  readonly typeName :string,  readonly file :@bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescFile,  readonly parent :@bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescMessage | undefined,  readonly extendee :@bufbuild/protobuf.@bufbuild/protobuf/dist/types/descriptor-set.DescMessage} */
trait DescFieldMessageDescFieldDeclarationString
  extends StObject
     with DescExtension {
  
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
  
  /**
    * The message that this extension extends.
    */
  val extendee: DescMessage
  
  val fieldKind: message_
  
  /**
    * The file this extension was declared in.
    */
  val file: DescFile
  
  /**
    * Get comments on the element in the protobuf source.
    */
  def getComments(): DescComments
  
  /**
    * A user-defined name for the JSON format, set with the field option
    * [json_name="foo"].
    */
  val jsonName: js.UndefOr[String] = js.undefined
  
  var kind: `extension`
  
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
    * The parent message, if this extension was declared inside a message declaration.
    */
  val parent: js.UndefOr[DescMessage] = js.undefined
  
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
  
  /**
    * The fully qualified name of the extension.
    */
  val typeName: String
}
object DescFieldMessageDescFieldDeclarationString {
  
  inline def apply(
    declarationString: () => String,
    deprecated: Boolean,
    `enum`: Unit,
    extendee: DescMessage,
    file: DescFile,
    getComments: () => DescComments,
    mapKey: Unit,
    mapValue: Unit,
    message: DescMessage,
    name: String,
    number: Double,
    optional: Boolean,
    packed: Boolean,
    packedByDefault: Boolean,
    proto: FieldDescriptorProto,
    repeated: Boolean,
    scalar: Unit,
    typeName: String
  ): DescFieldMessageDescFieldDeclarationString = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], extendee = extendee.asInstanceOf[js.Any], fieldKind = "message", file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "extension", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescFieldMessageDescFieldDeclarationString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescFieldMessageDescFieldDeclarationString] (val x: Self) extends AnyVal {
    
    inline def setDeclarationString(value: () => String): Self = StObject.set(x, "declarationString", js.Any.fromFunction0(value))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setEnum(value: Unit): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setExtendee(value: DescMessage): Self = StObject.set(x, "extendee", value.asInstanceOf[js.Any])
    
    inline def setFieldKind(value: message_): Self = StObject.set(x, "fieldKind", value.asInstanceOf[js.Any])
    
    inline def setFile(value: DescFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setGetComments(value: () => DescComments): Self = StObject.set(x, "getComments", js.Any.fromFunction0(value))
    
    inline def setJsonName(value: String): Self = StObject.set(x, "jsonName", value.asInstanceOf[js.Any])
    
    inline def setJsonNameUndefined: Self = StObject.set(x, "jsonName", js.undefined)
    
    inline def setKind(value: `extension`): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
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
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProto(value: FieldDescriptorProto): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    
    inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    
    inline def setScalar(value: Unit): Self = StObject.set(x, "scalar", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
