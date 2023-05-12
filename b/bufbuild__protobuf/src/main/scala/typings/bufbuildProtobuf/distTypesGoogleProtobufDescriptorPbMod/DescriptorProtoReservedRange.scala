package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageDescriptorPEquals
import typings.bufbuildProtobuf.anon.PlainMessageDescriptorProFields
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ReservedRange")
@js.native
open class DescriptorProtoReservedRange () extends Message[DescriptorProtoReservedRange] {
  def this(data: PartialMessageDescriptorPEquals) = this()
  
  /**
    * Exclusive.
    *
    * @generated from field: optional int32 end = 2;
    */
  var end: js.UndefOr[Double] = js.native
  
  /**
    * Inclusive.
    *
    * @generated from field: optional int32 start = 1;
    */
  var start: js.UndefOr[Double] = js.native
}
/* static members */
object DescriptorProtoReservedRange {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ReservedRange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageDescriptorProFields): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: DescriptorProtoReservedRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageDescriptorProFields): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageDescriptorProFields, b: PlainMessageDescriptorProFields): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageDescriptorProFields, b: DescriptorProtoReservedRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: DescriptorProtoReservedRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: DescriptorProtoReservedRange, b: PlainMessageDescriptorProFields): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: DescriptorProtoReservedRange, b: DescriptorProtoReservedRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ReservedRange.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): DescriptorProtoReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[DescriptorProtoReservedRange]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): DescriptorProtoReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DescriptorProtoReservedRange]
  
  inline def fromJson(jsonValue: JsonValue): DescriptorProtoReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[DescriptorProtoReservedRange]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): DescriptorProtoReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DescriptorProtoReservedRange]
  
  inline def fromJsonString(jsonString: String): DescriptorProtoReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[DescriptorProtoReservedRange]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): DescriptorProtoReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DescriptorProtoReservedRange]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ReservedRange.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ReservedRange.typeName")
  @js.native
  val typeName: /* "google.protobuf.DescriptorProto.ReservedRange" */ String = js.native
}
