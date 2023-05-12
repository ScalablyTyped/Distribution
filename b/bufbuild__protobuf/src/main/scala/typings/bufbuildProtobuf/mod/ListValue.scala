package typings.bufbuildProtobuf.mod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageListValueConstructor
import typings.bufbuildProtobuf.anon.PlainMessageListValueClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf", "ListValue")
@js.native
open class ListValue ()
  extends typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue {
  def this(data: PartialMessageListValueConstructor) = this()
}
/* static members */
object ListValue {
  
  @JSImport("@bufbuild/protobuf", "ListValue")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageListValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageListValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageListValueClone, b: PlainMessageListValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: PlainMessageListValueClone,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue,
    b: PlainMessageListValueClone
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf", "ListValue.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue]
  
  inline def fromJson(jsonValue: JsonValue): typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue]
  
  inline def fromJsonString(jsonString: String): typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.ListValue]
  
  @JSImport("@bufbuild/protobuf", "ListValue.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf", "ListValue.typeName")
  @js.native
  val typeName: /* "google.protobuf.ListValue" */ String = js.native
}
