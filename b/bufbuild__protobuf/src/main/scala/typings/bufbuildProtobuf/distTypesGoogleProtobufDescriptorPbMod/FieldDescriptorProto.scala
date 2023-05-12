package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageFieldDescri
import typings.bufbuildProtobuf.anon.PlainMessageFieldDescriptClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldDescriptorProto")
@js.native
open class FieldDescriptorProto () extends Message[FieldDescriptorProto] {
  def this(data: PartialMessageFieldDescri) = this()
  
  /**
    * For numeric types, contains the original text representation of the value.
    * For booleans, "true" or "false".
    * For strings, contains the default text contents (not escaped in any way).
    * For bytes, contains the C escaped value.  All bytes >= 128 are escaped.
    *
    * @generated from field: optional string default_value = 7;
    */
  var defaultValue: js.UndefOr[String] = js.native
  
  /**
    * For extensions, this is the name of the type being extended.  It is
    * resolved in the same manner as type_name.
    *
    * @generated from field: optional string extendee = 2;
    */
  var extendee: js.UndefOr[String] = js.native
  
  /**
    * JSON name of this field. The value is set by protocol compiler. If the
    * user has set a "json_name" option on this field, that option's value
    * will be used. Otherwise, it's deduced from the field's name by converting
    * it to camelCase.
    *
    * @generated from field: optional string json_name = 10;
    */
  var jsonName: js.UndefOr[String] = js.native
  
  /**
    * @generated from field: optional google.protobuf.FieldDescriptorProto.Label label = 4;
    */
  var label: js.UndefOr[FieldDescriptorProtoLabel] = js.native
  
  /**
    * @generated from field: optional string name = 1;
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * @generated from field: optional int32 number = 3;
    */
  var number: js.UndefOr[Double] = js.native
  
  /**
    * If set, gives the index of a oneof in the containing type's oneof_decl
    * list.  This field is a member of that oneof.
    *
    * @generated from field: optional int32 oneof_index = 9;
    */
  var oneofIndex: js.UndefOr[Double] = js.native
  
  /**
    * @generated from field: optional google.protobuf.FieldOptions options = 8;
    */
  var options: js.UndefOr[FieldOptions] = js.native
  
  /**
    * If true, this is a proto3 "optional". When a proto3 field is optional, it
    * tracks presence regardless of field type.
    *
    * When proto3_optional is true, this field must be belong to a oneof to
    * signal to old proto3 clients that presence is tracked for this field. This
    * oneof is known as a "synthetic" oneof, and this field must be its sole
    * member (each proto3 optional field gets its own synthetic oneof). Synthetic
    * oneofs exist in the descriptor only, and do not generate any API. Synthetic
    * oneofs must be ordered after all "real" oneofs.
    *
    * For message fields, proto3_optional doesn't create any semantic change,
    * since non-repeated message fields always track presence. However it still
    * indicates the semantic detail of whether the user wrote "optional" or not.
    * This can be useful for round-tripping the .proto file. For consistency we
    * give message fields a synthetic oneof also, even though it is not required
    * to track presence. This is especially important because the parser can't
    * tell if a field is a message or an enum, so it must always create a
    * synthetic oneof.
    *
    * Proto2 optional fields do not set this flag, because they already indicate
    * optional with `LABEL_OPTIONAL`.
    *
    * @generated from field: optional bool proto3_optional = 17;
    */
  var proto3Optional: js.UndefOr[Boolean] = js.native
  
  /**
    * If type_name is set, this need not be set.  If both this and type_name
    * are set, this must be one of TYPE_ENUM, TYPE_MESSAGE or TYPE_GROUP.
    *
    * @generated from field: optional google.protobuf.FieldDescriptorProto.Type type = 5;
    */
  var `type`: js.UndefOr[FieldDescriptorProtoType] = js.native
  
  /**
    * For message and enum types, this is the name of the type.  If the name
    * starts with a '.', it is fully-qualified.  Otherwise, C++-like scoping
    * rules are used to find the type (i.e. first the nested types within this
    * message are searched, then within the parent, on up to the root
    * namespace).
    *
    * @generated from field: optional string type_name = 6;
    */
  var typeName: js.UndefOr[String] = js.native
}
/* static members */
object FieldDescriptorProto {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldDescriptorProto")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageFieldDescriptClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: FieldDescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFieldDescriptClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFieldDescriptClone, b: PlainMessageFieldDescriptClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFieldDescriptClone, b: FieldDescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: FieldDescriptorProto): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: FieldDescriptorProto, b: PlainMessageFieldDescriptClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: FieldDescriptorProto, b: FieldDescriptorProto): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldDescriptorProto.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): FieldDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FieldDescriptorProto]
  
  inline def fromJson(jsonValue: JsonValue): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): FieldDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FieldDescriptorProto]
  
  inline def fromJsonString(jsonString: String): FieldDescriptorProto = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[FieldDescriptorProto]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): FieldDescriptorProto = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FieldDescriptorProto]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldDescriptorProto.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldDescriptorProto.typeName")
  @js.native
  val typeName: /* "google.protobuf.FieldDescriptorProto" */ String = js.native
}
