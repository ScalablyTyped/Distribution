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
  - typings.bufbuildProtobuf.anon.DescFieldScalarDescFieldC
  - typings.bufbuildProtobuf.anon.DescFieldMessageDescField
  - typings.bufbuildProtobuf.anon.DescFieldEnumDescFieldCom
  - typings.bufbuildProtobuf.anon.DescFieldMapDescFieldComm
*/
trait DescField
  extends StObject
     with AnyDesc
object DescField {
  
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
}
