package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageEnumValueOp
import typings.bufbuildProtobuf.anon.PlainMessageEnumValueOptiClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumValueOptions")
@js.native
open class EnumValueOptions () extends Message[EnumValueOptions] {
  def this(data: PartialMessageEnumValueOp) = this()
  
  /**
    * Is this enum value deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for the enum value, or it will be completely ignored; in the very least,
    * this is a formalization for deprecating enum values.
    *
    * @generated from field: optional bool deprecated = 1 [default = false];
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * The parser stores options it doesn't recognize here. See above.
    *
    * @generated from field: repeated google.protobuf.UninterpretedOption uninterpreted_option = 999;
    */
  var uninterpretedOption: js.Array[UninterpretedOption] = js.native
}
/* static members */
object EnumValueOptions {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumValueOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageEnumValueOptiClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: EnumValueOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumValueOptiClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumValueOptiClone, b: PlainMessageEnumValueOptiClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumValueOptiClone, b: EnumValueOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: EnumValueOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: EnumValueOptions, b: PlainMessageEnumValueOptiClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: EnumValueOptions, b: EnumValueOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumValueOptions.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): EnumValueOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnumValueOptions]
  
  inline def fromJson(jsonValue: JsonValue): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): EnumValueOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnumValueOptions]
  
  inline def fromJsonString(jsonString: String): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): EnumValueOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnumValueOptions]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumValueOptions.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumValueOptions.typeName")
  @js.native
  val typeName: /* "google.protobuf.EnumValueOptions" */ String = js.native
}
