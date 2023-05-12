package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageSourceCodeI
import typings.bufbuildProtobuf.anon.PlainMessageSourceCodeInfClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo")
@js.native
open class SourceCodeInfo () extends Message[SourceCodeInfo] {
  def this(data: PartialMessageSourceCodeI) = this()
  
  /**
    * A Location identifies a piece of source code in a .proto file which
    * corresponds to a particular definition.  This information is intended
    * to be useful to IDEs, code indexers, documentation generators, and similar
    * tools.
    *
    * For example, say we have a file like:
    *   message Foo {
    *     optional string foo = 1;
    *   }
    * Let's look at just the field definition:
    *   optional string foo = 1;
    *   ^       ^^     ^^  ^  ^^^
    *   a       bc     de  f  ghi
    * We have the following locations:
    *   span   path               represents
    *   [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
    *   [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
    *   [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
    *   [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
    *   [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
    *
    * Notes:
    * - A location may refer to a repeated field itself (i.e. not to any
    *   particular index within it).  This is used whenever a set of elements are
    *   logically enclosed in a single code segment.  For example, an entire
    *   extend block (possibly containing multiple extension definitions) will
    *   have an outer location whose path refers to the "extensions" repeated
    *   field without an index.
    * - Multiple locations may have the same path.  This happens when a single
    *   logical declaration is spread out across multiple places.  The most
    *   obvious example is the "extend" block again -- there may be multiple
    *   extend blocks in the same scope, each of which will have the same path.
    * - A location's span is not always a subset of its parent's span.  For
    *   example, the "extendee" of an extension declaration appears at the
    *   beginning of the "extend" block and is shared by all extensions within
    *   the block.
    * - Just because a location's span is a subset of some other location's span
    *   does not mean that it is a descendant.  For example, a "group" defines
    *   both a type and a field in a single declaration.  Thus, the locations
    *   corresponding to the type and field and their components will overlap.
    * - Code which tries to interpret locations should probably be designed to
    *   ignore those that it doesn't understand, as more types of locations could
    *   be recorded in the future.
    *
    * @generated from field: repeated google.protobuf.SourceCodeInfo.Location location = 1;
    */
  var location: js.Array[SourceCodeInfoLocation] = js.native
}
/* static members */
object SourceCodeInfo {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageSourceCodeInfClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: SourceCodeInfo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageSourceCodeInfClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageSourceCodeInfClone, b: PlainMessageSourceCodeInfClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageSourceCodeInfClone, b: SourceCodeInfo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: SourceCodeInfo): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: SourceCodeInfo, b: PlainMessageSourceCodeInfClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: SourceCodeInfo, b: SourceCodeInfo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfo]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): SourceCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceCodeInfo]
  
  inline def fromJson(jsonValue: JsonValue): SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfo]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): SourceCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceCodeInfo]
  
  inline def fromJsonString(jsonString: String): SourceCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[SourceCodeInfo]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): SourceCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SourceCodeInfo]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "SourceCodeInfo.typeName")
  @js.native
  val typeName: /* "google.protobuf.SourceCodeInfo" */ String = js.native
}
