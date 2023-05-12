package typings.bufbuildProtobuf.mod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageGeneratedCoEnd
import typings.bufbuildProtobuf.anon.PlainMessageGeneratedCodeClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf", "GeneratedCodeInfo_Annotation")
@js.native
open class GeneratedCodeInfoAnnotation ()
  extends typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation {
  def this(data: PartialMessageGeneratedCoEnd) = this()
}
/* static members */
object GeneratedCodeInfoAnnotation {
  
  @JSImport("@bufbuild/protobuf", "GeneratedCodeInfo_Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageGeneratedCodeClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: Unit,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageGeneratedCodeClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageGeneratedCodeClone, b: PlainMessageGeneratedCodeClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: PlainMessageGeneratedCodeClone,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation,
    b: PlainMessageGeneratedCodeClone
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(
    a: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation,
    b: typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf", "GeneratedCodeInfo_Annotation.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation]
  
  inline def fromJson(jsonValue: JsonValue): typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation]
  
  inline def fromJsonString(jsonString: String): typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod.GeneratedCodeInfoAnnotation]
  
  @JSImport("@bufbuild/protobuf", "GeneratedCodeInfo_Annotation.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf", "GeneratedCodeInfo_Annotation.typeName")
  @js.native
  val typeName: /* "google.protobuf.GeneratedCodeInfo.Annotation" */ String = js.native
}
