package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.distTypesEnumMod.EnumType
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesServiceTypeMod.ServiceType
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IEnumTypeRegistry
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IServiceTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCreateRegistryMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/create-registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRegistry(types: (MessageType[AnyMessage] | EnumType | ServiceType)*): IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry = ^.asInstanceOf[js.Dynamic].applyDynamic("createRegistry")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IMessageTypeRegistry & IEnumTypeRegistry & IServiceTypeRegistry]
}
