package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageAny
import typings.bufbuildProtobuf.anon.PlainMessageAnyClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleProtobufAnyPbMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/any_pb", "Any")
  @js.native
  open class Any () extends Message[Any] {
    def this(data: PartialMessageAny) = this()
    
    def is(`type`: String): Boolean = js.native
    def is(`type`: MessageType[AnyMessage]): Boolean = js.native
    
    def packFrom(message: Message[AnyMessage]): Unit = js.native
    
    /* private */ var typeNameToUrl: scala.Any = js.native
    
    /**
      * A URL/resource name that uniquely identifies the type of the serialized
      * protocol buffer message. This string must contain at least
      * one "/" character. The last segment of the URL's path must represent
      * the fully qualified name of the type (as in
      * `path/google.protobuf.Duration`). The name should be in a canonical form
      * (e.g., leading "." is not accepted).
      *
      * In practice, teams usually precompile into the binary all types that they
      * expect it to use in the context of Any. However, for URLs which use the
      * scheme `http`, `https`, or no scheme, one can optionally set up a type
      * server that maps type URLs to message definitions as follows:
      *
      * * If no scheme is provided, `https` is assumed.
      * * An HTTP GET on the URL must yield a [google.protobuf.Type][]
      *   value in binary format, or produce an error.
      * * Applications are allowed to cache lookup results based on the
      *   URL, or have them precompiled into a binary to avoid any
      *   lookup. Therefore, binary compatibility needs to be preserved
      *   on changes to types. (Use versioned type names to manage
      *   breaking changes.)
      *
      * Note: this functionality is not currently available in the official
      * protobuf release, and it is not used for type URLs beginning with
      * type.googleapis.com.
      *
      * Schemes other than `http`, `https` (or the empty scheme) might be
      * used with implementation specific semantics.
      *
      *
      * @generated from field: string type_url = 1;
      */
    var typeUrl: String = js.native
    
    /* private */ var typeUrlToName: scala.Any = js.native
    
    def unpack(registry: IMessageTypeRegistry): js.UndefOr[Message[AnyMessage]] = js.native
    
    def unpackTo(target: Message[AnyMessage]): Boolean = js.native
    
    /**
      * Must be a valid serialized protocol buffer of the above specified type.
      *
      * @generated from field: bytes value = 2;
      */
    var value: js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object Any {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/any_pb", "Any")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageAnyClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageAnyClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageAnyClone, b: PlainMessageAnyClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageAnyClone, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Any, b: PlainMessageAnyClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/any_pb", "Any.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def fromJson(jsonValue: JsonValue): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def fromJsonString(jsonString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def pack(message: Message[AnyMessage]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/any_pb", "Any.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/any_pb", "Any.typeName")
    @js.native
    val typeName: /* "google.protobuf.Any" */ String = js.native
  }
}
