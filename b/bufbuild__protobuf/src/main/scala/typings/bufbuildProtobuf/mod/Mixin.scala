package typings.bufbuildProtobuf.mod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageMixinConstructor
import typings.bufbuildProtobuf.anon.PlainMessageMixinClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf", "Mixin")
@js.native
open class Mixin ()
  extends typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin {
  def this(data: PartialMessageMixinConstructor) = this()
}
/* static members */
object Mixin {
  
  @JSImport("@bufbuild/protobuf", "Mixin")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageMixinClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageMixinClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageMixinClone, b: PlainMessageMixinClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageMixinClone, b: typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin, b: PlainMessageMixinClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf", "Mixin.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin]
  
  inline def fromJson(jsonValue: JsonValue): typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin]
  
  inline def fromJsonString(jsonString: String): typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufApiPbMod.Mixin]
  
  @JSImport("@bufbuild/protobuf", "Mixin.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf", "Mixin.typeName")
  @js.native
  val typeName: /* "google.protobuf.Mixin" */ String = js.native
}
