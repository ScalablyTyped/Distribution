package typings.bufbuildProtobuf.mod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageCodeGeneratFromBinary
import typings.bufbuildProtobuf.anon.PlainMessageCodeGeneratorFields
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf", "CodeGeneratorResponse_File")
@js.native
open class CodeGeneratorResponseFile ()
  extends typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile {
  def this(data: PartialMessageCodeGeneratFromBinary) = this()
}
/* static members */
object CodeGeneratorResponseFile {
  
  @JSImport("@bufbuild/protobuf", "CodeGeneratorResponse_File")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageCodeGeneratorFields): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: Unit,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageCodeGeneratorFields): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageCodeGeneratorFields, b: PlainMessageCodeGeneratorFields): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: PlainMessageCodeGeneratorFields,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile,
    b: PlainMessageCodeGeneratorFields
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf", "CodeGeneratorResponse_File.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile]
  
  inline def fromJson(jsonValue: JsonValue): typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile]
  
  inline def fromJsonString(jsonString: String): typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufCompilerPluginPbMod.CodeGeneratorResponseFile]
  
  @JSImport("@bufbuild/protobuf", "CodeGeneratorResponse_File.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf", "CodeGeneratorResponse_File.typeName")
  @js.native
  val typeName: /* "google.protobuf.compiler.CodeGeneratorResponse.File" */ String = js.native
}
