package typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageType
import typings.bufbuildProtobuf.anon.PlainMessageTypeClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Type")
@js.native
open class Type () extends Message[Type] {
  def this(data: PartialMessageType) = this()
  
  /**
    * The list of fields.
    *
    * @generated from field: repeated google.protobuf.Field fields = 2;
    */
  var fields: js.Array[Field] = js.native
  
  /**
    * The fully qualified message name.
    *
    * @generated from field: string name = 1;
    */
  var name: String = js.native
  
  /**
    * The list of types appearing in `oneof` definitions in this type.
    *
    * @generated from field: repeated string oneofs = 3;
    */
  var oneofs: js.Array[String] = js.native
  
  /**
    * The protocol buffer options.
    *
    * @generated from field: repeated google.protobuf.Option options = 4;
    */
  var options: js.Array[Option] = js.native
  
  /**
    * The source context.
    *
    * @generated from field: google.protobuf.SourceContext source_context = 5;
    */
  var sourceContext: js.UndefOr[SourceContext] = js.native
  
  /**
    * The source syntax.
    *
    * @generated from field: google.protobuf.Syntax syntax = 6;
    */
  var syntax: Syntax = js.native
}
/* static members */
object Type {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Type")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageTypeClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageTypeClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageTypeClone, b: PlainMessageTypeClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageTypeClone, b: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: Type, b: PlainMessageTypeClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Type, b: Type): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Type.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def fromJson(jsonValue: JsonValue): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  inline def fromJsonString(jsonString: String): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Type]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Type]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Type.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Type.typeName")
  @js.native
  val typeName: /* "google.protobuf.Type" */ String = js.native
}
