package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageMethodOptio
import typings.bufbuildProtobuf.anon.PlainMessageMethodOptionsClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MethodOptions")
@js.native
open class MethodOptions () extends Message[MethodOptions] {
  def this(data: PartialMessageMethodOptio) = this()
  
  /**
    * Is this method deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for the method, or it will be completely ignored; in the very least,
    * this is a formalization for deprecating methods.
    *
    * @generated from field: optional bool deprecated = 33 [default = false];
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * @generated from field: optional google.protobuf.MethodOptions.IdempotencyLevel idempotency_level = 34 [default = IDEMPOTENCY_UNKNOWN];
    */
  var idempotencyLevel: js.UndefOr[MethodOptionsIdempotencyLevel] = js.native
  
  /**
    * The parser stores options it doesn't recognize here. See above.
    *
    * @generated from field: repeated google.protobuf.UninterpretedOption uninterpreted_option = 999;
    */
  var uninterpretedOption: js.Array[UninterpretedOption] = js.native
}
/* static members */
object MethodOptions {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MethodOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageMethodOptionsClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: MethodOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageMethodOptionsClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageMethodOptionsClone, b: PlainMessageMethodOptionsClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageMethodOptionsClone, b: MethodOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: MethodOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: MethodOptions, b: PlainMessageMethodOptionsClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: MethodOptions, b: MethodOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MethodOptions.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): MethodOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MethodOptions]
  
  inline def fromJson(jsonValue: JsonValue): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): MethodOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MethodOptions]
  
  inline def fromJsonString(jsonString: String): MethodOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[MethodOptions]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): MethodOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MethodOptions]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MethodOptions.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MethodOptions.typeName")
  @js.native
  val typeName: /* "google.protobuf.MethodOptions" */ String = js.native
}
