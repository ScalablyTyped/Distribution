package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.distTypesDescriptorSetMod.DescriptorSet
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorSet
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IEnumTypeRegistry
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IServiceTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCreateRegistryFromDescMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/create-registry-from-desc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRegistryFromDescriptors(input: js.typedarray.Uint8Array): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any]).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
  inline def createRegistryFromDescriptors(input: js.typedarray.Uint8Array, replaceWkt: Boolean): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any], replaceWkt.asInstanceOf[js.Any])).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
  inline def createRegistryFromDescriptors(input: DescriptorSet): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any]).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
  inline def createRegistryFromDescriptors(input: DescriptorSet, replaceWkt: Boolean): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any], replaceWkt.asInstanceOf[js.Any])).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
  inline def createRegistryFromDescriptors(input: FileDescriptorSet): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any]).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
  inline def createRegistryFromDescriptors(input: FileDescriptorSet, replaceWkt: Boolean): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = (^.asInstanceOf[js.Dynamic].applyDynamic("createRegistryFromDescriptors")(input.asInstanceOf[js.Any], replaceWkt.asInstanceOf[js.Any])).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
}
