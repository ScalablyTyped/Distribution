package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageSourceCodeIConstructor
import typings.bufbuildProtobuf.anon.PlainMessageSourceCodeInfEquals
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo_Location")
@js.native
open class SourceCodeInfoLocation () extends Message[SourceCodeInfoLocation] {
  def this(data: PartialMessageSourceCodeIConstructor) = this()
  
  /**
    * If this SourceCodeInfo represents a complete declaration, these are any
    * comments appearing before and after the declaration which appear to be
    * attached to the declaration.
    *
    * A series of line comments appearing on consecutive lines, with no other
    * tokens appearing on those lines, will be treated as a single comment.
    *
    * leading_detached_comments will keep paragraphs of comments that appear
    * before (but not connected to) the current element. Each paragraph,
    * separated by empty lines, will be one comment element in the repeated
    * field.
    *
    * Only the comment content is provided; comment markers (e.g. //) are
    * stripped out.  For block comments, leading whitespace and an asterisk
    * will be stripped from the beginning of each line other than the first.
    * Newlines are included in the output.
    *
    * Examples:
    *
    *   optional int32 foo = 1;  // Comment attached to foo.
    *   // Comment attached to bar.
    *   optional int32 bar = 2;
    *
    *   optional string baz = 3;
    *   // Comment attached to baz.
    *   // Another line attached to baz.
    *
    *   // Comment attached to moo.
    *   //
    *   // Another line attached to moo.
    *   optional double moo = 4;
    *
    *   // Detached comment for corge. This is not leading or trailing comments
    *   // to moo or corge because there are blank lines separating it from
    *   // both.
    *
    *   // Detached comment for corge paragraph 2.
    *
    *   optional string corge = 5;
    *   / * Block comment attached
    *    * to corge.  Leading asterisks
    *    * will be removed. *\/
    *   / * Block comment attached to
    *    * grault. *\/
    *   optional int32 grault = 6;
    *
    *   // ignored detached comments.
    *
    * @generated from field: optional string leading_comments = 3;
    */
  var leadingComments: js.UndefOr[String] = js.native
  
  /**
    * @generated from field: repeated string leading_detached_comments = 6;
    */
  var leadingDetachedComments: js.Array[String] = js.native
  
  /**
    * Identifies which part of the FileDescriptorProto was defined at this
    * location.
    *
    * Each element is a field number or an index.  They form a path from
    * the root FileDescriptorProto to the place where the definition occurs.
    * For example, this path:
    *   [ 4, 3, 2, 7, 1 ]
    * refers to:
    *   file.message_type(3)  // 4, 3
    *       .field(7)         // 2, 7
    *       .name()           // 1
    * This is because FileDescriptorProto.message_type has field number 4:
    *   repeated DescriptorProto message_type = 4;
    * and DescriptorProto.field has field number 2:
    *   repeated FieldDescriptorProto field = 2;
    * and FieldDescriptorProto.name has field number 1:
    *   optional string name = 1;
    *
    * Thus, the above path gives the location of a field name.  If we removed
    * the last element:
    *   [ 4, 3, 2, 7 ]
    * this path refers to the whole field declaration (from the beginning
    * of the label to the terminating semicolon).
    *
    * @generated from field: repeated int32 path = 1 [packed = true];
    */
  var path: js.Array[Double] = js.native
  
  /**
    * Always has exactly three or four elements: start line, start column,
    * end line (optional, otherwise assumed same as start line), end column.
    * These are packed into a single field for efficiency.  Note that line
    * and column numbers are zero-based -- typically you will want to add
    * 1 to each before displaying to a user.
    *
    * @generated from field: repeated int32 span = 2 [packed = true];
    */
  var span: js.Array[Double] = js.native
  
  /**
    * @generated from field: optional string trailing_comments = 4;
    */
  var trailingComments: js.UndefOr[String] = js.native
}
/* static members */
object SourceCodeInfoLocation {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo_Location")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageSourceCodeInfEquals): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: SourceCodeInfoLocation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageSourceCodeInfEquals): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageSourceCodeInfEquals, b: PlainMessageSourceCodeInfEquals): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageSourceCodeInfEquals, b: SourceCodeInfoLocation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: SourceCodeInfoLocation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: SourceCodeInfoLocation, b: PlainMessageSourceCodeInfEquals): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: SourceCodeInfoLocation, b: SourceCodeInfoLocation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo_Location.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): SourceCodeInfoLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfoLocation]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): SourceCodeInfoLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceCodeInfoLocation]
  
  inline def fromJson(jsonValue: JsonValue): SourceCodeInfoLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfoLocation]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): SourceCodeInfoLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceCodeInfoLocation]
  
  inline def fromJsonString(jsonString: String): SourceCodeInfoLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfoLocation]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): SourceCodeInfoLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceCodeInfoLocation]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo_Location.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo_Location.typeName")
  @js.native
  val typeName: /* "google.protobuf.SourceCodeInfo.Location" */ String = js.native
}
