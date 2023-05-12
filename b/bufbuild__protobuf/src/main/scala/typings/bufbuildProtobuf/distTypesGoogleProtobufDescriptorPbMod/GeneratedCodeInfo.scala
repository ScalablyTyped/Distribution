package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageGeneratedCo
import typings.bufbuildProtobuf.anon.PlainMessageGeneratedCodeAnnotation
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
@js.native
open class GeneratedCodeInfo () extends Message[GeneratedCodeInfo] {
  def this(data: PartialMessageGeneratedCo) = this()
  
  /**
    * An Annotation connects some span of text in generated code to an element
    * of its generating .proto file.
    *
    * @generated from field: repeated google.protobuf.GeneratedCodeInfo.Annotation annotation = 1;
    */
  var annotation: js.Array[GeneratedCodeInfoAnnotation] = js.native
}
/* static members */
object GeneratedCodeInfo {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageGeneratedCodeAnnotation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: GeneratedCodeInfo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageGeneratedCodeAnnotation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageGeneratedCodeAnnotation, b: PlainMessageGeneratedCodeAnnotation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageGeneratedCodeAnnotation, b: GeneratedCodeInfo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: GeneratedCodeInfo): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: GeneratedCodeInfo, b: PlainMessageGeneratedCodeAnnotation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: GeneratedCodeInfo, b: GeneratedCodeInfo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): GeneratedCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeneratedCodeInfo]
  
  inline def fromJson(jsonValue: JsonValue): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): GeneratedCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeneratedCodeInfo]
  
  inline def fromJsonString(jsonString: String): GeneratedCodeInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfo]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): GeneratedCodeInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeneratedCodeInfo]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo.typeName")
  @js.native
  val typeName: /* "google.protobuf.GeneratedCodeInfo" */ String = js.native
}
