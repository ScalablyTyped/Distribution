package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageUninterpret
import typings.bufbuildProtobuf.anon.PlainMessageUninterpretedAggregateValue
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption")
@js.native
open class UninterpretedOption () extends Message[UninterpretedOption] {
  def this(data: PartialMessageUninterpret) = this()
  
  /**
    * @generated from field: optional string aggregate_value = 8;
    */
  var aggregateValue: js.UndefOr[String] = js.native
  
  /**
    * @generated from field: optional double double_value = 6;
    */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /**
    * The value of the uninterpreted option, in whatever type the tokenizer
    * identified it as during parsing. Exactly one of these should be set.
    *
    * @generated from field: optional string identifier_value = 3;
    */
  var identifierValue: js.UndefOr[String] = js.native
  
  /**
    * @generated from field: repeated google.protobuf.UninterpretedOption.NamePart name = 2;
    */
  var name: js.Array[UninterpretedOptionNamePart] = js.native
  
  /**
    * @generated from field: optional int64 negative_int_value = 5;
    */
  var negativeIntValue: js.UndefOr[js.BigInt] = js.native
  
  /**
    * @generated from field: optional uint64 positive_int_value = 4;
    */
  var positiveIntValue: js.UndefOr[js.BigInt] = js.native
  
  /**
    * @generated from field: optional bytes string_value = 7;
    */
  var stringValue: js.UndefOr[js.typedarray.Uint8Array] = js.native
}
/* static members */
object UninterpretedOption {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageUninterpretedAggregateValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: UninterpretedOption): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageUninterpretedAggregateValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageUninterpretedAggregateValue, b: PlainMessageUninterpretedAggregateValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageUninterpretedAggregateValue, b: UninterpretedOption): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: UninterpretedOption): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: UninterpretedOption, b: PlainMessageUninterpretedAggregateValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: UninterpretedOption, b: UninterpretedOption): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): UninterpretedOption = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UninterpretedOption]
  
  inline def fromJson(jsonValue: JsonValue): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): UninterpretedOption = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UninterpretedOption]
  
  inline def fromJsonString(jsonString: String): UninterpretedOption = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[UninterpretedOption]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): UninterpretedOption = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UninterpretedOption]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "UninterpretedOption.typeName")
  @js.native
  val typeName: /* "google.protobuf.UninterpretedOption" */ String = js.native
}
