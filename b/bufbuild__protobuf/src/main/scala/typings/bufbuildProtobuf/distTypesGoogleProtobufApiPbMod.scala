package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageApi
import typings.bufbuildProtobuf.anon.PartialMessageMethod
import typings.bufbuildProtobuf.anon.PartialMessageMixin
import typings.bufbuildProtobuf.anon.PlainMessageApiClone
import typings.bufbuildProtobuf.anon.PlainMessageMethodClone
import typings.bufbuildProtobuf.anon.PlainMessageMixinClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext
import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Option
import typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Syntax
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleProtobufApiPbMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Api")
  @js.native
  open class Api () extends Message[Api] {
    def this(data: PartialMessageApi) = this()
    
    /**
      * The methods of this interface, in unspecified order.
      *
      * @generated from field: repeated google.protobuf.Method methods = 2;
      */
    var methods: js.Array[Method] = js.native
    
    /**
      * Included interfaces. See [Mixin][].
      *
      * @generated from field: repeated google.protobuf.Mixin mixins = 6;
      */
    var mixins: js.Array[Mixin] = js.native
    
    /**
      * The fully qualified name of this interface, including package name
      * followed by the interface's simple name.
      *
      * @generated from field: string name = 1;
      */
    var name: String = js.native
    
    /**
      * Any metadata attached to the interface.
      *
      * @generated from field: repeated google.protobuf.Option options = 3;
      */
    var options: js.Array[Option] = js.native
    
    /**
      * Source context for the protocol buffer service represented by this
      * message.
      *
      * @generated from field: google.protobuf.SourceContext source_context = 5;
      */
    var sourceContext: js.UndefOr[SourceContext] = js.native
    
    /**
      * The source syntax of the service.
      *
      * @generated from field: google.protobuf.Syntax syntax = 7;
      */
    var syntax: Syntax = js.native
    
    /**
      * A version string for this interface. If specified, must have the form
      * `major-version.minor-version`, as in `1.10`. If the minor version is
      * omitted, it defaults to zero. If the entire version field is empty, the
      * major version is derived from the package name, as outlined below. If the
      * field is not empty, the version in the package name will be verified to be
      * consistent with what is provided here.
      *
      * The versioning schema uses [semantic
      * versioning](http://semver.org) where the major version number
      * indicates a breaking change and the minor version an additive,
      * non-breaking change. Both version numbers are signals to users
      * what to expect from different versions, and should be carefully
      * chosen based on the product plan.
      *
      * The major version is also reflected in the package name of the
      * interface, which must end in `v<major-version>`, as in
      * `google.feature.v1`. For major versions 0 and 1, the suffix can
      * be omitted. Zero major versions must only be used for
      * experimental, non-GA interfaces.
      *
      *
      * @generated from field: string version = 4;
      */
    var version: String = js.native
  }
  /* static members */
  object Api {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Api")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageApiClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Api): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageApiClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageApiClone, b: PlainMessageApiClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageApiClone, b: Api): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Api): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Api, b: PlainMessageApiClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Api, b: Api): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Api.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Api]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Api]
    
    inline def fromJson(jsonValue: JsonValue): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Api]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Api]
    
    inline def fromJsonString(jsonString: String): Api = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Api]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Api = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Api]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Api.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Api.typeName")
    @js.native
    val typeName: /* "google.protobuf.Api" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Method")
  @js.native
  open class Method () extends Message[Method] {
    def this(data: PartialMessageMethod) = this()
    
    /**
      * The simple name of this method.
      *
      * @generated from field: string name = 1;
      */
    var name: String = js.native
    
    /**
      * Any metadata attached to the method.
      *
      * @generated from field: repeated google.protobuf.Option options = 6;
      */
    var options: js.Array[Option] = js.native
    
    /**
      * If true, the request is streamed.
      *
      * @generated from field: bool request_streaming = 3;
      */
    var requestStreaming: Boolean = js.native
    
    /**
      * A URL of the input message type.
      *
      * @generated from field: string request_type_url = 2;
      */
    var requestTypeUrl: String = js.native
    
    /**
      * If true, the response is streamed.
      *
      * @generated from field: bool response_streaming = 5;
      */
    var responseStreaming: Boolean = js.native
    
    /**
      * The URL of the output message type.
      *
      * @generated from field: string response_type_url = 4;
      */
    var responseTypeUrl: String = js.native
    
    /**
      * The source syntax of this method.
      *
      * @generated from field: google.protobuf.Syntax syntax = 7;
      */
    var syntax: Syntax = js.native
  }
  /* static members */
  object Method {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Method")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageMethodClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Method): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageMethodClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageMethodClone, b: PlainMessageMethodClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageMethodClone, b: Method): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Method): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Method, b: PlainMessageMethodClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Method, b: Method): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Method.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Method = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Method]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Method = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Method]
    
    inline def fromJson(jsonValue: JsonValue): Method = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Method]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Method = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Method]
    
    inline def fromJsonString(jsonString: String): Method = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Method]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Method = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Method]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Method.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Method.typeName")
    @js.native
    val typeName: /* "google.protobuf.Method" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Mixin")
  @js.native
  open class Mixin () extends Message[Mixin] {
    def this(data: PartialMessageMixin) = this()
    
    /**
      * The fully qualified name of the interface which is included.
      *
      * @generated from field: string name = 1;
      */
    var name: String = js.native
    
    /**
      * If non-empty specifies a path under which inherited HTTP paths
      * are rooted.
      *
      * @generated from field: string root = 2;
      */
    var root: String = js.native
  }
  /* static members */
  object Mixin {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Mixin")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageMixinClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Mixin): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageMixinClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageMixinClone, b: PlainMessageMixinClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageMixinClone, b: Mixin): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Mixin): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Mixin, b: PlainMessageMixinClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Mixin, b: Mixin): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Mixin.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Mixin = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Mixin]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Mixin = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mixin]
    
    inline def fromJson(jsonValue: JsonValue): Mixin = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Mixin]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Mixin = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mixin]
    
    inline def fromJsonString(jsonString: String): Mixin = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Mixin]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Mixin = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mixin]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Mixin.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/api_pb", "Mixin.typeName")
    @js.native
    val typeName: /* "google.protobuf.Mixin" */ String = js.native
  }
}
