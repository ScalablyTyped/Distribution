package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageFileDescripConstructor
import typings.bufbuildProtobuf.anon.PlainMessageFileDescriptoDependency
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FileDescriptorProto")
@js.native
open class FileDescriptorProto () extends Message[FileDescriptorProto] {
  def this(data: PartialMessageFileDescripConstructor) = this()
  
  /**
    * e.g. "foo", "foo.bar", etc.
    *
    * @generated from field: optional string package = 2;
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  
  /**
    * Names of files imported by this file.
    *
    * @generated from field: repeated string dependency = 3;
    */
  var dependency: js.Array[String] = js.native
  
  /**
    * The edition of the proto file, which is an opaque string.
    *
    * @generated from field: optional string edition = 13;
    */
  var edition: js.UndefOr[String] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.EnumDescriptorProto enum_type = 5;
    */
  var enumType: js.Array[EnumDescriptorProto] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.FieldDescriptorProto extension = 7;
    */
  var `extension`: js.Array[FieldDescriptorProto] = js.native
  
  /**
    * All top-level definitions in this file.
    *
    * @generated from field: repeated google.protobuf.DescriptorProto message_type = 4;
    */
  var messageType: js.Array[DescriptorProto] = js.native
  
  /**
    * file name, relative to root of source tree
    *
    * @generated from field: optional string name = 1;
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * @generated from field: optional google.protobuf.FileOptions options = 8;
    */
  var options: js.UndefOr[FileOptions] = js.native
  
  /**
    * Indexes of the public imported files in the dependency list above.
    *
    * @generated from field: repeated int32 public_dependency = 10;
    */
  var publicDependency: js.Array[Double] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.ServiceDescriptorProto service = 6;
    */
  var service: js.Array[ServiceDescriptorProto] = js.native
  
  /**
    * This field contains optional information about the original source code.
    * You may safely remove this entire field without harming runtime
    * functionality of the descriptors -- the information is needed only by
    * development tools.
    *
    * @generated from field: optional google.protobuf.SourceCodeInfo source_code_info = 9;
    */
  var sourceCodeInfo: js.UndefOr[SourceCodeInfo] = js.native
  
  /**
    * The syntax of the proto file.
    * The supported values are "proto2", "proto3", and "editions".
    *
    * If `edition` is present, this value must be "editions".
    *
    * @generated from field: optional string syntax = 12;
    */
  var syntax: js.UndefOr[String] = js.native
  
  /**
    * Indexes of the weak imported files in the dependency list.
    * For Google-internal migration only. Do not use.
    *
    * @generated from field: repeated int32 weak_dependency = 11;
    */
  var weakDependency: js.Array[Double] = js.native
}
/* static members */
object FileDescriptorProto {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FileDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageFileDescriptoDependency): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: FileDescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFileDescriptoDependency): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFileDescriptoDependency, b: PlainMessageFileDescriptoDependency): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFileDescriptoDependency, b: FileDescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: FileDescriptorProto): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: FileDescriptorProto, b: PlainMessageFileDescriptoDependency): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: FileDescriptorProto, b: FileDescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FileDescriptorProto.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): FileDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileDescriptorProto]
  
  inline def fromJson(jsonValue: JsonValue): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): FileDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileDescriptorProto]
  
  inline def fromJsonString(jsonString: String): FileDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[FileDescriptorProto]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): FileDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FileDescriptorProto]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FileDescriptorProto.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FileDescriptorProto.typeName")
  @js.native
  val typeName: /* "google.protobuf.FileDescriptorProto" */ String = js.native
}
