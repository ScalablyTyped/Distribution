package typings.bufbuildProtobuf.mod

import typings.bufbuildProtobuf.distTypesCodegenInfoMod.CodegenInfo_
import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescriptorSet
import typings.bufbuildProtobuf.distTypesEnumMod.EnumType
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import typings.bufbuildProtobuf.distTypesProtoInt64Mod.Int64Support
import typings.bufbuildProtobuf.distTypesServiceTypeMod.ServiceType
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IEnumTypeRegistry
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IServiceTypeRegistry
import typings.bufbuildProtobuf.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def codegenInfo: CodegenInfo_ = ^.asInstanceOf[js.Dynamic].selectDynamic("codegenInfo").asInstanceOf[CodegenInfo_]

inline def createDescriptorSet(
  input: js.Array[
  typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorProto
]
): DescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDescriptorSet")(input.asInstanceOf[js.Any]).asInstanceOf[DescriptorSet]
inline def createDescriptorSet(input: js.typedarray.Uint8Array): DescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDescriptorSet")(input.asInstanceOf[js.Any]).asInstanceOf[DescriptorSet]
inline def createDescriptorSet(input: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorSet): DescriptorSet = ^.asInstanceOf[js.Dynamic].applyDynamic("createDescriptorSet")(input.asInstanceOf[js.Any]).asInstanceOf[DescriptorSet]

inline def createRegistry(types: (MessageType[AnyMessage] | EnumType | ServiceType)*): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]

inline def createRegistryFromDescriptors(input: js.typedarray.Uint8Array): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any]).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
inline def createRegistryFromDescriptors(input: js.typedarray.Uint8Array, replaceWkt: Boolean): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any], replaceWkt.asInstanceOf[js.Any])).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
inline def createRegistryFromDescriptors(input: DescriptorSet): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any]).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
inline def createRegistryFromDescriptors(input: DescriptorSet, replaceWkt: Boolean): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any], replaceWkt.asInstanceOf[js.Any])).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
inline def createRegistryFromDescriptors(input: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorSet): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any]).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
inline def createRegistryFromDescriptors(
  input: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorSet,
  replaceWkt: Boolean
): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any], replaceWkt.asInstanceOf[js.Any])).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]

inline def proto2: ProtoRuntime = ^.asInstanceOf[js.Dynamic].selectDynamic("proto2").asInstanceOf[ProtoRuntime]

inline def proto3: ProtoRuntime = ^.asInstanceOf[js.Dynamic].selectDynamic("proto3").asInstanceOf[ProtoRuntime]

inline def protoInt64: Int64Support = ^.asInstanceOf[js.Dynamic].selectDynamic("protoInt64").asInstanceOf[Int64Support]
