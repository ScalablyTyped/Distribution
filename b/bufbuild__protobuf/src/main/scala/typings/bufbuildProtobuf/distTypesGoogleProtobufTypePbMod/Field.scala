package typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageField
import typings.bufbuildProtobuf.anon.PlainMessageFieldCardinality
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Field")
@js.native
open class Field () extends Message[Field] {
  def this(data: PartialMessageField) = this()
  
  /**
    * The field cardinality.
    *
    * @generated from field: google.protobuf.Field.Cardinality cardinality = 2;
    */
  var cardinality: FieldCardinality = js.native
  
  /**
    * The string value of the default value of this field. Proto2 syntax only.
    *
    * @generated from field: string default_value = 11;
    */
  var defaultValue: String = js.native
  
  /**
    * The field JSON name.
    *
    * @generated from field: string json_name = 10;
    */
  var jsonName: String = js.native
  
  /**
    * The field type.
    *
    * @generated from field: google.protobuf.Field.Kind kind = 1;
    */
  var kind: FieldKind = js.native
  
  /**
    * The field name.
    *
    * @generated from field: string name = 4;
    */
  var name: String = js.native
  
  /**
    * The field number.
    *
    * @generated from field: int32 number = 3;
    */
  var number: Double = js.native
  
  /**
    * The index of the field type in `Type.oneofs`, for message or enumeration
    * types. The first type has index 1; zero means the type is not in the list.
    *
    * @generated from field: int32 oneof_index = 7;
    */
  var oneofIndex: Double = js.native
  
  /**
    * The protocol buffer options.
    *
    * @generated from field: repeated google.protobuf.Option options = 9;
    */
  var options: js.Array[Option] = js.native
  
  /**
    * Whether to use alternative packed wire representation.
    *
    * @generated from field: bool packed = 8;
    */
  var packed: Boolean = js.native
  
  /**
    * The field type URL, without the scheme, for message or enumeration
    * types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
    *
    * @generated from field: string type_url = 6;
    */
  var typeUrl: String = js.native
}
/* static members */
object Field {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Field")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageFieldCardinality): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: Field): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFieldCardinality): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFieldCardinality, b: PlainMessageFieldCardinality): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFieldCardinality, b: Field): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Field): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: Field, b: PlainMessageFieldCardinality): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Field, b: Field): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Field.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Field]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Field = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Field]
  
  inline def fromJson(jsonValue: JsonValue): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Field]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Field = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Field]
  
  inline def fromJsonString(jsonString: String): Field = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Field]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Field = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Field]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Field.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Field.typeName")
  @js.native
  val typeName: /* "google.protobuf.Field" */ String = js.native
}
