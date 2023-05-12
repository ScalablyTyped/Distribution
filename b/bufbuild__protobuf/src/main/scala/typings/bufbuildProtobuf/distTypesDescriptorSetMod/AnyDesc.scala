package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.bufbuildProtobufStrings.proto2
import typings.bufbuildProtobuf.bufbuildProtobufStrings.proto3
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.BYTES
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.DOUBLE
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.FLOAT
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.DescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.EnumValueDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.MethodDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.OneofDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.ServiceDescriptorProto
import typings.bufbuildProtobuf.distTypesServiceTypeMod.MethodKind
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescFile
  - typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnum
  - typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnumValue
  - typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage
  - typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescField
  - typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescExtension
  - typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof
  - typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescService
  - typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMethod
*/
trait AnyDesc extends StObject
object AnyDesc {
  
  inline def DescEnum(
    deprecated: Boolean,
    file: DescFile,
    getComments: () => DescComments,
    name: String,
    proto: EnumDescriptorProto,
    typeName: String,
    values: js.Array[DescEnumValue]
  ): typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnum = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "enum", name = name.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnum]
  }
  
  inline def DescEnumValue(
    declarationString: () => String,
    deprecated: Boolean,
    getComments: () => DescComments,
    name: String,
    number: Double,
    parent: DescEnum,
    proto: EnumValueDescriptorProto
  ): typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnumValue = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "enum_value", name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescEnumValue]
  }
  
  inline def DescFieldEnumDescFieldCom(
    declarationString: () => String,
    deprecated: Boolean,
    `enum`: DescEnum,
    getComments: () => DescComments,
    getDefaultValue: () => js.UndefOr[Double | Boolean | String | js.BigInt | js.typedarray.Uint8Array],
    mapKey: Unit,
    mapValue: Unit,
    message: Unit,
    name: String,
    number: Double,
    optional: Boolean,
    packed: Boolean,
    packedByDefault: Boolean,
    parent: DescMessage,
    proto: FieldDescriptorProto,
    repeated: Boolean,
    scalar: Unit
  ): typings.bufbuildProtobuf.anon.DescFieldEnumDescFieldCom = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], fieldKind = "enum", getComments = js.Any.fromFunction0(getComments), getDefaultValue = js.Any.fromFunction0(getDefaultValue), kind = "field", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.anon.DescFieldEnumDescFieldCom]
  }
  
  inline def DescFieldEnumDescFieldComDeclarationString(
    declarationString: () => String,
    deprecated: Boolean,
    `enum`: DescEnum,
    extendee: DescMessage,
    file: DescFile,
    getComments: () => DescComments,
    getDefaultValue: () => js.UndefOr[Double | Boolean | String | js.BigInt | js.typedarray.Uint8Array],
    mapKey: Unit,
    mapValue: Unit,
    message: Unit,
    name: String,
    number: Double,
    optional: Boolean,
    packed: Boolean,
    packedByDefault: Boolean,
    proto: FieldDescriptorProto,
    repeated: Boolean,
    scalar: Unit,
    typeName: String
  ): typings.bufbuildProtobuf.anon.DescFieldEnumDescFieldComDeclarationString = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], extendee = extendee.asInstanceOf[js.Any], fieldKind = "enum", file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), getDefaultValue = js.Any.fromFunction0(getDefaultValue), kind = "extension", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.anon.DescFieldEnumDescFieldComDeclarationString]
  }
  
  inline def DescFieldMapDescFieldComm(
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
  ): typings.bufbuildProtobuf.anon.DescFieldMapDescFieldComm = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], fieldKind = "map", getComments = js.Any.fromFunction0(getComments), kind = "field", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = false, scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.anon.DescFieldMapDescFieldComm]
  }
  
  inline def DescFieldMapDescFieldCommDeclarationString(
    declarationString: () => String,
    deprecated: Boolean,
    `enum`: Unit,
    extendee: DescMessage,
    file: DescFile,
    getComments: () => DescComments,
    mapKey: Exclude[ScalarType, FLOAT | DOUBLE | BYTES],
    mapValue: DescFieldMapValueEnum | DescFieldMapValueMessage | DescFieldMapValueScalar,
    message: Unit,
    name: String,
    number: Double,
    optional: Boolean,
    packed: Boolean,
    packedByDefault: Boolean,
    proto: FieldDescriptorProto,
    scalar: Unit,
    typeName: String
  ): typings.bufbuildProtobuf.anon.DescFieldMapDescFieldCommDeclarationString = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], extendee = extendee.asInstanceOf[js.Any], fieldKind = "map", file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "extension", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = false, scalar = scalar.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.anon.DescFieldMapDescFieldCommDeclarationString]
  }
  
  inline def DescFieldMessageDescField(
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
  ): typings.bufbuildProtobuf.anon.DescFieldMessageDescField = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], fieldKind = "message", getComments = js.Any.fromFunction0(getComments), kind = "field", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.anon.DescFieldMessageDescField]
  }
  
  inline def DescFieldMessageDescFieldDeclarationString(
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
  ): typings.bufbuildProtobuf.anon.DescFieldMessageDescFieldDeclarationString = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], extendee = extendee.asInstanceOf[js.Any], fieldKind = "message", file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "extension", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.anon.DescFieldMessageDescFieldDeclarationString]
  }
  
  inline def DescFieldScalarDescFieldC(
    declarationString: () => String,
    deprecated: Boolean,
    `enum`: Unit,
    getComments: () => DescComments,
    getDefaultValue: () => js.UndefOr[Double | Boolean | String | js.BigInt | js.typedarray.Uint8Array],
    mapKey: Unit,
    mapValue: Unit,
    message: Unit,
    name: String,
    number: Double,
    optional: Boolean,
    packed: Boolean,
    packedByDefault: Boolean,
    parent: DescMessage,
    proto: FieldDescriptorProto,
    repeated: Boolean,
    scalar: ScalarType
  ): typings.bufbuildProtobuf.anon.DescFieldScalarDescFieldC = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], fieldKind = "scalar", getComments = js.Any.fromFunction0(getComments), getDefaultValue = js.Any.fromFunction0(getDefaultValue), kind = "field", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.anon.DescFieldScalarDescFieldC]
  }
  
  inline def DescFieldScalarDescFieldCDeclarationString(
    declarationString: () => String,
    deprecated: Boolean,
    `enum`: Unit,
    extendee: DescMessage,
    file: DescFile,
    getComments: () => DescComments,
    getDefaultValue: () => js.UndefOr[Double | Boolean | String | js.BigInt | js.typedarray.Uint8Array],
    mapKey: Unit,
    mapValue: Unit,
    message: Unit,
    name: String,
    number: Double,
    optional: Boolean,
    packed: Boolean,
    packedByDefault: Boolean,
    proto: FieldDescriptorProto,
    repeated: Boolean,
    scalar: ScalarType,
    typeName: String
  ): typings.bufbuildProtobuf.anon.DescFieldScalarDescFieldCDeclarationString = {
    val __obj = js.Dynamic.literal(declarationString = js.Any.fromFunction0(declarationString), deprecated = deprecated.asInstanceOf[js.Any], extendee = extendee.asInstanceOf[js.Any], fieldKind = "scalar", file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), getDefaultValue = js.Any.fromFunction0(getDefaultValue), kind = "extension", mapKey = mapKey.asInstanceOf[js.Any], mapValue = mapValue.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], packedByDefault = packedByDefault.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], scalar = scalar.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.anon.DescFieldScalarDescFieldCDeclarationString]
  }
  
  inline def DescFile(
    deprecated: Boolean,
    enums: js.Array[DescEnum],
    extensions: js.Array[DescExtension],
    getPackageComments: () => DescComments,
    getSyntaxComments: () => DescComments,
    messages: js.Array[DescMessage],
    name: String,
    proto: FileDescriptorProto,
    services: js.Array[DescService],
    syntax: proto3 | proto2
  ): typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescFile = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], enums = enums.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], getPackageComments = js.Any.fromFunction0(getPackageComments), getSyntaxComments = js.Any.fromFunction0(getSyntaxComments), kind = "file", messages = messages.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescFile]
  }
  
  inline def DescMessage(
    deprecated: Boolean,
    fields: js.Array[DescField],
    file: DescFile,
    getComments: () => DescComments,
    members: js.Array[DescField | DescOneof],
    name: String,
    nestedEnums: js.Array[DescEnum],
    nestedExtensions: js.Array[DescExtension],
    nestedMessages: js.Array[typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage],
    oneofs: js.Array[DescOneof],
    proto: DescriptorProto,
    typeName: String
  ): typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "message", members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nestedEnums = nestedEnums.asInstanceOf[js.Any], nestedExtensions = nestedExtensions.asInstanceOf[js.Any], nestedMessages = nestedMessages.asInstanceOf[js.Any], oneofs = oneofs.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMessage]
  }
  
  inline def DescMethod(
    deprecated: Boolean,
    getComments: () => DescComments,
    input: DescMessage,
    methodKind: MethodKind,
    name: String,
    output: DescMessage,
    parent: DescService,
    proto: MethodDescriptorProto
  ): typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMethod = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), input = input.asInstanceOf[js.Any], kind = "rpc", methodKind = methodKind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescMethod]
  }
  
  inline def DescOneof(
    deprecated: Boolean,
    fields: js.Array[DescField],
    getComments: () => DescComments,
    name: String,
    parent: DescMessage,
    proto: OneofDescriptorProto
  ): typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "oneof", name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescOneof]
  }
  
  inline def DescService(
    deprecated: Boolean,
    file: DescFile,
    getComments: () => DescComments,
    methods: js.Array[DescMethod],
    name: String,
    proto: ServiceDescriptorProto,
    typeName: String
  ): typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescService = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getComments = js.Any.fromFunction0(getComments), kind = "service", methods = methods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescService]
  }
}
