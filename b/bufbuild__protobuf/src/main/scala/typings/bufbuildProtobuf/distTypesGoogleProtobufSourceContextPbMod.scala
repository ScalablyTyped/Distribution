package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageSourceConte
import typings.bufbuildProtobuf.anon.PlainMessageSourceContextClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleProtobufSourceContextPbMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/source_context_pb", "SourceContext")
  @js.native
  open class SourceContext () extends Message[SourceContext] {
    def this(data: PartialMessageSourceConte) = this()
    
    /**
      * The path-qualified name of the .proto file that contained the associated
      * protobuf element.  For example: `"google/protobuf/source_context.proto"`.
      *
      * @generated from field: string file_name = 1;
      */
    var fileName: String = js.native
  }
  /* static members */
  object SourceContext {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/source_context_pb", "SourceContext")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageSourceContextClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: SourceContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageSourceContextClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageSourceContextClone, b: PlainMessageSourceContextClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageSourceContextClone, b: SourceContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: SourceContext): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: SourceContext, b: PlainMessageSourceContextClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: SourceContext, b: SourceContext): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/source_context_pb", "SourceContext.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): SourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SourceContext]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): SourceContext = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceContext]
    
    inline def fromJson(jsonValue: JsonValue): SourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[SourceContext]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): SourceContext = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceContext]
    
    inline def fromJsonString(jsonString: String): SourceContext = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[SourceContext]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): SourceContext = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceContext]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/source_context_pb", "SourceContext.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/source_context_pb", "SourceContext.typeName")
    @js.native
    val typeName: /* "google.protobuf.SourceContext" */ String = js.native
  }
}
