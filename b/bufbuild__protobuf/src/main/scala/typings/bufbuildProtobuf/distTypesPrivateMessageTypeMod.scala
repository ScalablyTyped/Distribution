package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.LocalName
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesPrivateFieldListMod.FieldListSource
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPrivateMessageTypeMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/private/message-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeMessageType[T /* <: Message[T] */](runtime: ProtoRuntime, typeName: String, fields: FieldListSource): MessageType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMessageType")(runtime.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[MessageType[T]]
  inline def makeMessageType[T /* <: Message[T] */](runtime: ProtoRuntime, typeName: String, fields: FieldListSource, opt: LocalName): MessageType[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeMessageType")(runtime.asInstanceOf[js.Any], typeName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[MessageType[T]]
}
