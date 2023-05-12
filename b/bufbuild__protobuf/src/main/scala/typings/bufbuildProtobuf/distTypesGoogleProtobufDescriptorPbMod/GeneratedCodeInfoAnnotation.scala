package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageGeneratedCoBegin
import typings.bufbuildProtobuf.anon.PlainMessageGeneratedCodeClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo_Annotation")
@js.native
open class GeneratedCodeInfoAnnotation () extends Message[GeneratedCodeInfoAnnotation] {
  def this(data: PartialMessageGeneratedCoBegin) = this()
  
  /**
    * Identifies the starting offset in bytes in the generated code
    * that relates to the identified object.
    *
    * @generated from field: optional int32 begin = 3;
    */
  var begin: js.UndefOr[Double] = js.native
  
  /**
    * Identifies the ending offset in bytes in the generated code that
    * relates to the identified object. The end offset should be one past
    * the last relevant byte (so the length of the text = end - begin).
    *
    * @generated from field: optional int32 end = 4;
    */
  var end: js.UndefOr[Double] = js.native
  
  /**
    * Identifies the element in the original source .proto file. This field
    * is formatted the same as SourceCodeInfo.Location.path.
    *
    * @generated from field: repeated int32 path = 1 [packed = true];
    */
  var path: js.Array[Double] = js.native
  
  /**
    * @generated from field: optional google.protobuf.GeneratedCodeInfo.Annotation.Semantic semantic = 5;
    */
  var semantic: js.UndefOr[GeneratedCodeInfoAnnotationSemantic] = js.native
  
  /**
    * Identifies the filesystem path to the original source .proto.
    *
    * @generated from field: optional string source_file = 2;
    */
  var sourceFile: js.UndefOr[String] = js.native
}
/* static members */
object GeneratedCodeInfoAnnotation {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo_Annotation")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageGeneratedCodeClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: GeneratedCodeInfoAnnotation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageGeneratedCodeClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageGeneratedCodeClone, b: PlainMessageGeneratedCodeClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageGeneratedCodeClone, b: GeneratedCodeInfoAnnotation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: GeneratedCodeInfoAnnotation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: GeneratedCodeInfoAnnotation, b: PlainMessageGeneratedCodeClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: GeneratedCodeInfoAnnotation, b: GeneratedCodeInfoAnnotation): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo_Annotation.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): GeneratedCodeInfoAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfoAnnotation]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): GeneratedCodeInfoAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeneratedCodeInfoAnnotation]
  
  inline def fromJson(jsonValue: JsonValue): GeneratedCodeInfoAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfoAnnotation]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): GeneratedCodeInfoAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeneratedCodeInfoAnnotation]
  
  inline def fromJsonString(jsonString: String): GeneratedCodeInfoAnnotation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[GeneratedCodeInfoAnnotation]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): GeneratedCodeInfoAnnotation = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeneratedCodeInfoAnnotation]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo_Annotation.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "GeneratedCodeInfo_Annotation.typeName")
  @js.native
  val typeName: /* "google.protobuf.GeneratedCodeInfo.Annotation" */ String = js.native
}
