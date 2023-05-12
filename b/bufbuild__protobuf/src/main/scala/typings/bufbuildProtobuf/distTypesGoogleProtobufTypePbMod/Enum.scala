package typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageEnum
import typings.bufbuildProtobuf.anon.PlainMessageEnumClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesGoogleProtobufSourceContextPbMod.SourceContext
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Enum")
@js.native
open class Enum () extends Message[Enum] {
  def this(data: PartialMessageEnum) = this()
  
  /**
    * Enum value definitions.
    *
    * @generated from field: repeated google.protobuf.EnumValue enumvalue = 2;
    */
  var enumvalue: js.Array[EnumValue] = js.native
  
  /**
    * Enum type name.
    *
    * @generated from field: string name = 1;
    */
  var name: String = js.native
  
  /**
    * Protocol buffer options.
    *
    * @generated from field: repeated google.protobuf.Option options = 3;
    */
  var options: js.Array[Option] = js.native
  
  /**
    * The source context.
    *
    * @generated from field: google.protobuf.SourceContext source_context = 4;
    */
  var sourceContext: js.UndefOr[SourceContext] = js.native
  
  /**
    * The source syntax.
    *
    * @generated from field: google.protobuf.Syntax syntax = 5;
    */
  var syntax: Syntax = js.native
}
/* static members */
object Enum {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Enum")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageEnumClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: Enum): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumClone, b: PlainMessageEnumClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumClone, b: Enum): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Enum): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: Enum, b: PlainMessageEnumClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Enum, b: Enum): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Enum.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Enum]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Enum]
  
  inline def fromJson(jsonValue: JsonValue): Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Enum]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Enum]
  
  inline def fromJsonString(jsonString: String): Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Enum]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Enum]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Enum.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/type_pb", "Enum.typeName")
  @js.native
  val typeName: /* "google.protobuf.Enum" */ String = js.native
}
