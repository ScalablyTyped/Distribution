package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageDescriptorPConstructor
import typings.bufbuildProtobuf.anon.PlainMessageDescriptorProEnd
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ExtensionRange")
@js.native
open class DescriptorProtoExtensionRange () extends Message[DescriptorProtoExtensionRange] {
  def this(data: PartialMessageDescriptorPConstructor) = this()
  
  /**
    * Exclusive.
    *
    * @generated from field: optional int32 end = 2;
    */
  var end: js.UndefOr[Double] = js.native
  
  /**
    * @generated from field: optional google.protobuf.ExtensionRangeOptions options = 3;
    */
  var options: js.UndefOr[ExtensionRangeOptions] = js.native
  
  /**
    * Inclusive.
    *
    * @generated from field: optional int32 start = 1;
    */
  var start: js.UndefOr[Double] = js.native
}
/* static members */
object DescriptorProtoExtensionRange {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ExtensionRange")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageDescriptorProEnd): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: DescriptorProtoExtensionRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageDescriptorProEnd): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageDescriptorProEnd, b: PlainMessageDescriptorProEnd): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageDescriptorProEnd, b: DescriptorProtoExtensionRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: DescriptorProtoExtensionRange): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: DescriptorProtoExtensionRange, b: PlainMessageDescriptorProEnd): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: DescriptorProtoExtensionRange, b: DescriptorProtoExtensionRange): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ExtensionRange.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): DescriptorProtoExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[DescriptorProtoExtensionRange]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): DescriptorProtoExtensionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DescriptorProtoExtensionRange]
  
  inline def fromJson(jsonValue: JsonValue): DescriptorProtoExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[DescriptorProtoExtensionRange]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): DescriptorProtoExtensionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DescriptorProtoExtensionRange]
  
  inline def fromJsonString(jsonString: String): DescriptorProtoExtensionRange = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[DescriptorProtoExtensionRange]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): DescriptorProtoExtensionRange = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DescriptorProtoExtensionRange]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ExtensionRange.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto_ExtensionRange.typeName")
  @js.native
  val typeName: /* "google.protobuf.DescriptorProto.ExtensionRange" */ String = js.native
}
