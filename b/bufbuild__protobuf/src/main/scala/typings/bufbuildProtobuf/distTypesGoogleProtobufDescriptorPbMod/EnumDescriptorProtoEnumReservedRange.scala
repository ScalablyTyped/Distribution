package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageEnumDescripConstructor
import typings.bufbuildProtobuf.anon.PlainMessageEnumDescriptoEnd
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumDescriptorProto_EnumReservedRange")
@js.native
open class EnumDescriptorProtoEnumReservedRange () extends Message[EnumDescriptorProtoEnumReservedRange] {
  def this(data: PartialMessageEnumDescripConstructor) = this()
  
  /**
    * Inclusive.
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
object EnumDescriptorProtoEnumReservedRange {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumDescriptorProto_EnumReservedRange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageEnumDescriptoEnd): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: EnumDescriptorProtoEnumReservedRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumDescriptoEnd): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumDescriptoEnd, b: PlainMessageEnumDescriptoEnd): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumDescriptoEnd, b: EnumDescriptorProtoEnumReservedRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: EnumDescriptorProtoEnumReservedRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: EnumDescriptorProtoEnumReservedRange, b: PlainMessageEnumDescriptoEnd): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: EnumDescriptorProtoEnumReservedRange, b: EnumDescriptorProtoEnumReservedRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumDescriptorProto_EnumReservedRange.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): EnumDescriptorProtoEnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProtoEnumReservedRange]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): EnumDescriptorProtoEnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnumDescriptorProtoEnumReservedRange]
  
  inline def fromJson(jsonValue: JsonValue): EnumDescriptorProtoEnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProtoEnumReservedRange]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): EnumDescriptorProtoEnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnumDescriptorProtoEnumReservedRange]
  
  inline def fromJsonString(jsonString: String): EnumDescriptorProtoEnumReservedRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[EnumDescriptorProtoEnumReservedRange]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): EnumDescriptorProtoEnumReservedRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnumDescriptorProtoEnumReservedRange]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumDescriptorProto_EnumReservedRange.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumDescriptorProto_EnumReservedRange.typeName")
  @js.native
  val typeName: /* "google.protobuf.EnumDescriptorProto.EnumReservedRange" */ String = js.native
}
