package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageDescriptorP
import typings.bufbuildProtobuf.anon.PlainMessageDescriptorProClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto")
@js.native
open class DescriptorProto () extends Message[DescriptorProto] {
  def this(data: PartialMessageDescriptorP) = this()
  
  /**
    * @generated from field: repeated google.protobuf.EnumDescriptorProto enum_type = 4;
    */
  var enumType: js.Array[EnumDescriptorProto] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.FieldDescriptorProto extension = 6;
    */
  var `extension`: js.Array[FieldDescriptorProto] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.DescriptorProto.ExtensionRange extension_range = 5;
    */
  var extensionRange: js.Array[DescriptorProtoExtensionRange] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.FieldDescriptorProto field = 2;
    */
  var field: js.Array[FieldDescriptorProto] = js.native
  
  /**
    * @generated from field: optional string name = 1;
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.DescriptorProto nested_type = 3;
    */
  var nestedType: js.Array[DescriptorProto] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.OneofDescriptorProto oneof_decl = 8;
    */
  var oneofDecl: js.Array[OneofDescriptorProto] = js.native
  
  /**
    * @generated from field: optional google.protobuf.MessageOptions options = 7;
    */
  var options: js.UndefOr[MessageOptions] = js.native
  
  /**
    * Reserved field names, which may not be used by fields in the same message.
    * A given name may only be reserved once.
    *
    * @generated from field: repeated string reserved_name = 10;
    */
  var reservedName: js.Array[String] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.DescriptorProto.ReservedRange reserved_range = 9;
    */
  var reservedRange: js.Array[DescriptorProtoReservedRange] = js.native
}
/* static members */
object DescriptorProto {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageDescriptorProClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: DescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageDescriptorProClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageDescriptorProClone, b: PlainMessageDescriptorProClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageDescriptorProClone, b: DescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: DescriptorProto): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: DescriptorProto, b: PlainMessageDescriptorProClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: DescriptorProto, b: DescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): DescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DescriptorProto]
  
  inline def fromJson(jsonValue: JsonValue): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): DescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DescriptorProto]
  
  inline def fromJsonString(jsonString: String): DescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[DescriptorProto]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): DescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DescriptorProto]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "DescriptorProto.typeName")
  @js.native
  val typeName: /* "google.protobuf.DescriptorProto" */ String = js.native
}
