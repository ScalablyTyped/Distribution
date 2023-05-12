package typings.bufbuildProtobuf.mod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageUInt64ValueConstructor
import typings.bufbuildProtobuf.anon.PlainMessageUInt64ValueClone
import typings.bufbuildProtobuf.anon.`0`
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf", "UInt64Value")
@js.native
open class UInt64Value ()
  extends typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value {
  def this(data: PartialMessageUInt64ValueConstructor) = this()
}
/* static members */
object UInt64Value {
  
  @JSImport("@bufbuild/protobuf", "UInt64Value")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageUInt64ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageUInt64ValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageUInt64ValueClone, b: PlainMessageUInt64ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: PlainMessageUInt64ValueClone,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value,
    b: PlainMessageUInt64ValueClone
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf", "UInt64Value.fieldWrapper")
  @js.native
  val fieldWrapper: `0` = js.native
  
  @JSImport("@bufbuild/protobuf", "UInt64Value.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value]
  
  inline def fromJson(jsonValue: JsonValue): typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value]
  
  inline def fromJsonString(jsonString: String): typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufWrappersPbMod.UInt64Value]
  
  @JSImport("@bufbuild/protobuf", "UInt64Value.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf", "UInt64Value.typeName")
  @js.native
  val typeName: /* "google.protobuf.UInt64Value" */ String = js.native
}
