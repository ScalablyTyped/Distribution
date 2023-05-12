package typings.bufbuildProtobuf.mod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageEnumConstructor
import typings.bufbuildProtobuf.anon.PlainMessageEnumClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf", "Enum")
@js.native
open class Enum ()
  extends typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum {
  def this(data: PartialMessageEnumConstructor) = this()
}
/* static members */
object Enum {
  
  @JSImport("@bufbuild/protobuf", "Enum")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageEnumClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumClone, b: PlainMessageEnumClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumClone, b: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum, b: PlainMessageEnumClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf", "Enum.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum]
  
  inline def fromJson(jsonValue: JsonValue): typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum]
  
  inline def fromJsonString(jsonString: String): typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufTypePbMod.Enum]
  
  @JSImport("@bufbuild/protobuf", "Enum.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf", "Enum.typeName")
  @js.native
  val typeName: /* "google.protobuf.Enum" */ String = js.native
}
