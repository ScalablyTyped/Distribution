package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageUninterpretClone
import typings.bufbuildProtobuf.anon.PlainMessageUninterpretedConstructor
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption_NamePart")
@js.native
open class UninterpretedOptionNamePart () extends Message[UninterpretedOptionNamePart] {
  def this(data: PartialMessageUninterpretClone) = this()
  
  /**
    * @generated from field: required bool is_extension = 2;
    */
  var isExtension: js.UndefOr[Boolean] = js.native
  
  /**
    * @generated from field: required string name_part = 1;
    */
  var namePart: js.UndefOr[String] = js.native
}
/* static members */
object UninterpretedOptionNamePart {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption_NamePart")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageUninterpretedConstructor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: UninterpretedOptionNamePart): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageUninterpretedConstructor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageUninterpretedConstructor, b: PlainMessageUninterpretedConstructor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageUninterpretedConstructor, b: UninterpretedOptionNamePart): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: UninterpretedOptionNamePart): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: UninterpretedOptionNamePart, b: PlainMessageUninterpretedConstructor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: UninterpretedOptionNamePart, b: UninterpretedOptionNamePart): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption_NamePart.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): UninterpretedOptionNamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOptionNamePart]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): UninterpretedOptionNamePart = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UninterpretedOptionNamePart]
  
  inline def fromJson(jsonValue: JsonValue): UninterpretedOptionNamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOptionNamePart]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): UninterpretedOptionNamePart = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UninterpretedOptionNamePart]
  
  inline def fromJsonString(jsonString: String): UninterpretedOptionNamePart = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOptionNamePart]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): UninterpretedOptionNamePart = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UninterpretedOptionNamePart]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption_NamePart.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption_NamePart.typeName")
  @js.native
  val typeName: /* "google.protobuf.UninterpretedOption.NamePart" */ String = js.native
}
