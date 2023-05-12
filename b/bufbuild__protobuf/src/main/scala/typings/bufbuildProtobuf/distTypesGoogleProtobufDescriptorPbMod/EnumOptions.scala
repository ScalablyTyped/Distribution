package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageEnumOptions
import typings.bufbuildProtobuf.anon.PlainMessageEnumOptionsAllowAlias
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumOptions")
@js.native
open class EnumOptions () extends Message[EnumOptions] {
  def this(data: PartialMessageEnumOptions) = this()
  
  /**
    * Set this option to true to allow mapping different tag names to the same
    * value.
    *
    * @generated from field: optional bool allow_alias = 2;
    */
  var allowAlias: js.UndefOr[Boolean] = js.native
  
  /**
    * Is this enum deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for the enum, or it will be completely ignored; in the very least, this
    * is a formalization for deprecating enums.
    *
    * @generated from field: optional bool deprecated = 3 [default = false];
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the legacy handling of JSON field name conflicts.  This lowercases
    * and strips underscored from the fields before comparison in proto3 only.
    * The new behavior takes `json_name` into account and applies to proto2 as
    * well.
    * TODO(b/261750190) Remove this legacy behavior once downstream teams have
    * had time to migrate.
    *
    * @generated from field: optional bool deprecated_legacy_json_field_conflicts = 6 [deprecated = true];
    * @deprecated
    */
  var deprecatedLegacyJsonFieldConflicts: js.UndefOr[Boolean] = js.native
  
  /**
    * The parser stores options it doesn't recognize here. See above.
    *
    * @generated from field: repeated google.protobuf.UninterpretedOption uninterpreted_option = 999;
    */
  var uninterpretedOption: js.Array[UninterpretedOption] = js.native
}
/* static members */
object EnumOptions {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageEnumOptionsAllowAlias): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: EnumOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumOptionsAllowAlias): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumOptionsAllowAlias, b: PlainMessageEnumOptionsAllowAlias): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageEnumOptionsAllowAlias, b: EnumOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: EnumOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: EnumOptions, b: PlainMessageEnumOptionsAllowAlias): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: EnumOptions, b: EnumOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumOptions.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): EnumOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnumOptions]
  
  inline def fromJson(jsonValue: JsonValue): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): EnumOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnumOptions]
  
  inline def fromJsonString(jsonString: String): EnumOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[EnumOptions]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): EnumOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EnumOptions]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumOptions.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "EnumOptions.typeName")
  @js.native
  val typeName: /* "google.protobuf.EnumOptions" */ String = js.native
}
