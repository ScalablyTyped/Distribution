package typings.bufbuildProtobuf.distTypesDescriptorSetMod

import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.BYTES
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.DOUBLE
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType.FLOAT
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FieldDescriptorProto
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.bufbuildProtobuf.anon.DescFieldScalarDescFieldCDeclarationString
  - typings.bufbuildProtobuf.anon.DescFieldMessageDescFieldDeclarationString
  - typings.bufbuildProtobuf.anon.DescFieldEnumDescFieldComDeclarationString
  - typings.bufbuildProtobuf.anon.DescFieldMapDescFieldCommDeclarationString
*/
trait DescExtension
  extends StObject
     with AnyDesc
object DescExtension {
  
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
}
