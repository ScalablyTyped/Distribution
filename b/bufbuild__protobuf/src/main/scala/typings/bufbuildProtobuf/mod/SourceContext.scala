package typings.bufbuildProtobuf.mod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageSourceConteConstructor
import typings.bufbuildProtobuf.anon.PlainMessageSourceContextClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf", "SourceContext")
@js.native
open class SourceContext ()
  extends typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext {
  def this(data: PartialMessageSourceConteConstructor) = this()
}
/* static members */
object SourceContext {
  
  @JSImport("@bufbuild/protobuf", "SourceContext")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageSourceContextClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageSourceContextClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageSourceContextClone, b: PlainMessageSourceContextClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: PlainMessageSourceContextClone,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext,
    b: PlainMessageSourceContextClone
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf", "SourceContext.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext]
  
  inline def fromJson(jsonValue: JsonValue): typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext]
  
  inline def fromJsonString(jsonString: String): typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext]
  
  @JSImport("@bufbuild/protobuf", "SourceContext.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf", "SourceContext.typeName")
  @js.native
  val typeName: /* "google.protobuf.SourceContext" */ String = js.native
}
