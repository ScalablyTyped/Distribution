package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageCodeGenerat
import typings.bufbuildProtobuf.anon.PartialMessageCodeGeneratConstructor
import typings.bufbuildProtobuf.anon.PartialMessageCodeGeneratContent
import typings.bufbuildProtobuf.anon.PartialMessageVersion
import typings.bufbuildProtobuf.anon.PlainMessageCodeGeneratorClone
import typings.bufbuildProtobuf.anon.PlainMessageCodeGeneratorEquals
import typings.bufbuildProtobuf.anon.PlainMessageCodeGeneratorFields
import typings.bufbuildProtobuf.anon.PlainMessageVersionClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.FileDescriptorProto
import typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfo
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleProtobufCompilerPluginPbMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
  @js.native
  open class CodeGeneratorRequest () extends Message[CodeGeneratorRequest] {
    def this(data: PartialMessageCodeGenerat) = this()
    
    /**
      * The version number of protocol compiler.
      *
      * @generated from field: optional google.protobuf.compiler.Version compiler_version = 3;
      */
    var compilerVersion: js.UndefOr[Version] = js.native
    
    /**
      * The .proto files that were explicitly listed on the command-line.  The
      * code generator should generate code only for these files.  Each file's
      * descriptor will be included in proto_file, below.
      *
      * @generated from field: repeated string file_to_generate = 1;
      */
    var fileToGenerate: js.Array[String] = js.native
    
    /**
      * The generator parameter passed on the command-line.
      *
      * @generated from field: optional string parameter = 2;
      */
    var parameter: js.UndefOr[String] = js.native
    
    /**
      * FileDescriptorProtos for all files in files_to_generate and everything
      * they import.  The files will appear in topological order, so each file
      * appears before any file that imports it.
      *
      * protoc guarantees that all proto_files will be written after
      * the fields above, even though this is not technically guaranteed by the
      * protobuf wire format.  This theoretically could allow a plugin to stream
      * in the FileDescriptorProtos and handle them one by one rather than read
      * the entire set into memory at once.  However, as of this writing, this
      * is not similarly optimized on protoc's end -- it will store all fields in
      * memory at once before sending them to the plugin.
      *
      * Type names of fields and extensions in the FileDescriptorProto are always
      * fully qualified.
      *
      * @generated from field: repeated google.protobuf.FileDescriptorProto proto_file = 15;
      */
    var protoFile: js.Array[FileDescriptorProto] = js.native
  }
  /* static members */
  object CodeGeneratorRequest {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageCodeGeneratorClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: CodeGeneratorRequest): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageCodeGeneratorClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageCodeGeneratorClone, b: PlainMessageCodeGeneratorClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageCodeGeneratorClone, b: CodeGeneratorRequest): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: CodeGeneratorRequest): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: CodeGeneratorRequest, b: PlainMessageCodeGeneratorClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: CodeGeneratorRequest, b: CodeGeneratorRequest): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): CodeGeneratorRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorRequest]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): CodeGeneratorRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorRequest]
    
    inline def fromJson(jsonValue: JsonValue): CodeGeneratorRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorRequest]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): CodeGeneratorRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorRequest]
    
    inline def fromJsonString(jsonString: String): CodeGeneratorRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorRequest]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): CodeGeneratorRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorRequest]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorRequest.typeName")
    @js.native
    val typeName: /* "google.protobuf.compiler.CodeGeneratorRequest" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
  @js.native
  open class CodeGeneratorResponse () extends Message[CodeGeneratorResponse] {
    def this(data: PartialMessageCodeGeneratConstructor) = this()
    
    /**
      * Error message.  If non-empty, code generation failed.  The plugin process
      * should exit with status code zero even if it reports an error in this way.
      *
      * This should be used to indicate errors in .proto files which prevent the
      * code generator from generating correct code.  Errors which indicate a
      * problem in protoc itself -- such as the input CodeGeneratorRequest being
      * unparseable -- should be reported by writing a message to stderr and
      * exiting with a non-zero status code.
      *
      * @generated from field: optional string error = 1;
      */
    var error: js.UndefOr[String] = js.native
    
    /**
      * @generated from field: repeated google.protobuf.compiler.CodeGeneratorResponse.File file = 15;
      */
    var file: js.Array[CodeGeneratorResponseFile] = js.native
    
    /**
      * A bitmask of supported features that the code generator supports.
      * This is a bitwise "or" of values from the Feature enum.
      *
      * @generated from field: optional uint64 supported_features = 2;
      */
    var supportedFeatures: js.UndefOr[js.BigInt] = js.native
  }
  /* static members */
  object CodeGeneratorResponse {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageCodeGeneratorEquals): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: CodeGeneratorResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageCodeGeneratorEquals): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageCodeGeneratorEquals, b: PlainMessageCodeGeneratorEquals): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageCodeGeneratorEquals, b: CodeGeneratorResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: CodeGeneratorResponse): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: CodeGeneratorResponse, b: PlainMessageCodeGeneratorEquals): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: CodeGeneratorResponse, b: CodeGeneratorResponse): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): CodeGeneratorResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorResponse]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): CodeGeneratorResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorResponse]
    
    inline def fromJson(jsonValue: JsonValue): CodeGeneratorResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorResponse]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): CodeGeneratorResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorResponse]
    
    inline def fromJsonString(jsonString: String): CodeGeneratorResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorResponse]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): CodeGeneratorResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorResponse]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.typeName")
    @js.native
    val typeName: /* "google.protobuf.compiler.CodeGeneratorResponse" */ String = js.native
  }
  
  @js.native
  sealed trait CodeGeneratorResponseFeature extends StObject
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse_Feature")
  @js.native
  object CodeGeneratorResponseFeature extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CodeGeneratorResponseFeature & Double] = js.native
    
    /**
      * @generated from enum value: FEATURE_NONE = 0;
      */
    @js.native
    sealed trait NONE
      extends StObject
         with CodeGeneratorResponseFeature
    /* 0 */ val NONE: typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFeature.NONE & Double = js.native
    
    /**
      * @generated from enum value: FEATURE_PROTO3_OPTIONAL = 1;
      */
    @js.native
    sealed trait PROTO3_OPTIONAL
      extends StObject
         with CodeGeneratorResponseFeature
    /* 1 */ val PROTO3_OPTIONAL: typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFeature.PROTO3_OPTIONAL & Double = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse_File")
  @js.native
  open class CodeGeneratorResponseFile () extends Message[CodeGeneratorResponseFile] {
    def this(data: PartialMessageCodeGeneratContent) = this()
    
    /**
      * The file contents.
      *
      * @generated from field: optional string content = 15;
      */
    var content: js.UndefOr[String] = js.native
    
    /**
      * Information describing the file content being inserted. If an insertion
      * point is used, this information will be appropriately offset and inserted
      * into the code generation metadata for the generated files.
      *
      * @generated from field: optional google.protobuf.GeneratedCodeInfo generated_code_info = 16;
      */
    var generatedCodeInfo: js.UndefOr[GeneratedCodeInfo] = js.native
    
    /**
      * If non-empty, indicates that the named file should already exist, and the
      * content here is to be inserted into that file at a defined insertion
      * point.  This feature allows a code generator to extend the output
      * produced by another code generator.  The original generator may provide
      * insertion points by placing special annotations in the file that look
      * like:
      *   @@protoc_insertion_point(NAME)
      * The annotation can have arbitrary text before and after it on the line,
      * which allows it to be placed in a comment.  NAME should be replaced with
      * an identifier naming the point -- this is what other generators will use
      * as the insertion_point.  Code inserted at this point will be placed
      * immediately above the line containing the insertion point (thus multiple
      * insertions to the same point will come out in the order they were added).
      * The double-@ is intended to make it unlikely that the generated code
      * could contain things that look like insertion points by accident.
      *
      * For example, the C++ code generator places the following line in the
      * .pb.h files that it generates:
      *   // @@protoc_insertion_point(namespace_scope)
      * This line appears within the scope of the file's package namespace, but
      * outside of any particular class.  Another plugin can then specify the
      * insertion_point "namespace_scope" to generate additional classes or
      * other declarations that should be placed in this scope.
      *
      * Note that if the line containing the insertion point begins with
      * whitespace, the same whitespace will be added to every line of the
      * inserted text.  This is useful for languages like Python, where
      * indentation matters.  In these languages, the insertion point comment
      * should be indented the same amount as any inserted code will need to be
      * in order to work correctly in that context.
      *
      * The code generator that generates the initial file and the one which
      * inserts into it must both run as part of a single invocation of protoc.
      * Code generators are executed in the order in which they appear on the
      * command line.
      *
      * If |insertion_point| is present, |name| must also be present.
      *
      * @generated from field: optional string insertion_point = 2;
      */
    var insertionPoint: js.UndefOr[String] = js.native
    
    /**
      * The file name, relative to the output directory.  The name must not
      * contain "." or ".." components and must be relative, not be absolute (so,
      * the file cannot lie outside the output directory).  "/" must be used as
      * the path separator, not "\".
      *
      * If the name is omitted, the content will be appended to the previous
      * file.  This allows the generator to break large files into small chunks,
      * and allows the generated text to be streamed back to protoc so that large
      * files need not reside completely in memory at one time.  Note that as of
      * this writing protoc does not optimize for this -- it will read the entire
      * CodeGeneratorResponse before writing files to disk.
      *
      * @generated from field: optional string name = 1;
      */
    var name: js.UndefOr[String] = js.native
  }
  /* static members */
  object CodeGeneratorResponseFile {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse_File")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageCodeGeneratorFields): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: CodeGeneratorResponseFile): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageCodeGeneratorFields): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageCodeGeneratorFields, b: PlainMessageCodeGeneratorFields): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageCodeGeneratorFields, b: CodeGeneratorResponseFile): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: CodeGeneratorResponseFile): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: CodeGeneratorResponseFile, b: PlainMessageCodeGeneratorFields): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: CodeGeneratorResponseFile, b: CodeGeneratorResponseFile): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse_File.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): CodeGeneratorResponseFile = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorResponseFile]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): CodeGeneratorResponseFile = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorResponseFile]
    
    inline def fromJson(jsonValue: JsonValue): CodeGeneratorResponseFile = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorResponseFile]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): CodeGeneratorResponseFile = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorResponseFile]
    
    inline def fromJsonString(jsonString: String): CodeGeneratorResponseFile = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[CodeGeneratorResponseFile]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): CodeGeneratorResponseFile = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodeGeneratorResponseFile]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse_File.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse_File.typeName")
    @js.native
    val typeName: /* "google.protobuf.compiler.CodeGeneratorResponse.File" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "Version")
  @js.native
  open class Version () extends Message[Version] {
    def this(data: PartialMessageVersion) = this()
    
    /**
      * @generated from field: optional int32 major = 1;
      */
    var major: js.UndefOr[Double] = js.native
    
    /**
      * @generated from field: optional int32 minor = 2;
      */
    var minor: js.UndefOr[Double] = js.native
    
    /**
      * @generated from field: optional int32 patch = 3;
      */
    var patch: js.UndefOr[Double] = js.native
    
    /**
      * A suffix for alpha, beta or rc release, e.g., "alpha-1", "rc2". It should
      * be empty for mainline stable releases.
      *
      * @generated from field: optional string suffix = 4;
      */
    var suffix: js.UndefOr[String] = js.native
  }
  /* static members */
  object Version {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "Version")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageVersionClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageVersionClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageVersionClone, b: PlainMessageVersionClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageVersionClone, b: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Version): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Version, b: PlainMessageVersionClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Version, b: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "Version.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Version = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Version]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Version = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Version]
    
    inline def fromJson(jsonValue: JsonValue): Version = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Version]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Version = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Version]
    
    inline def fromJsonString(jsonString: String): Version = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Version]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Version = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Version]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "Version.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/compiler/plugin_pb", "Version.typeName")
    @js.native
    val typeName: /* "google.protobuf.compiler.Version" */ String = js.native
  }
}
