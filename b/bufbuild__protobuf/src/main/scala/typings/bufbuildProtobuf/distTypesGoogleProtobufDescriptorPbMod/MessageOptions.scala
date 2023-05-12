package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageMessageOpti
import typings.bufbuildProtobuf.anon.PlainMessageMessageOptionClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MessageOptions")
@js.native
open class MessageOptions () extends Message[MessageOptions] {
  def this(data: PartialMessageMessageOpti) = this()
  
  /**
    * Is this message deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for the message, or it will be completely ignored; in the very least,
    * this is a formalization for deprecating messages.
    *
    * @generated from field: optional bool deprecated = 3 [default = false];
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * Enable the legacy handling of JSON field name conflicts.  This lowercases
    * and strips underscored from the fields before comparison in proto3 only.
    * The new behavior takes `json_name` into account and applies to proto2 as
    * well.
    *
    * This should only be used as a temporary measure against broken builds due
    * to the change in behavior for JSON field name conflicts.
    *
    * TODO(b/261750190) This is legacy behavior we plan to remove once downstream
    * teams have had time to migrate.
    *
    * @generated from field: optional bool deprecated_legacy_json_field_conflicts = 11 [deprecated = true];
    * @deprecated
    */
  var deprecatedLegacyJsonFieldConflicts: js.UndefOr[Boolean] = js.native
  
  /**
    * NOTE: Do not set the option in .proto files. Always use the maps syntax
    * instead. The option should only be implicitly set by the proto compiler
    * parser.
    *
    * Whether the message is an automatically generated map entry type for the
    * maps field.
    *
    * For maps fields:
    *     map<KeyType, ValueType> map_field = 1;
    * The parsed descriptor looks like:
    *     message MapFieldEntry {
    *         option map_entry = true;
    *         optional KeyType key = 1;
    *         optional ValueType value = 2;
    *     }
    *     repeated MapFieldEntry map_field = 1;
    *
    * Implementations may choose not to generate the map_entry=true message, but
    * use a native map in the target language to hold the keys and values.
    * The reflection APIs in such implementations still need to work as
    * if the field is a repeated message field.
    *
    * @generated from field: optional bool map_entry = 7;
    */
  var mapEntry: js.UndefOr[Boolean] = js.native
  
  /**
    * Set true to use the old proto1 MessageSet wire format for extensions.
    * This is provided for backwards-compatibility with the MessageSet wire
    * format.  You should not use this for any other reason:  It's less
    * efficient, has fewer features, and is more complicated.
    *
    * The message must be defined exactly as follows:
    *   message Foo {
    *     option message_set_wire_format = true;
    *     extensions 4 to max;
    *   }
    * Note that the message cannot have any defined fields; MessageSets only
    * have extensions.
    *
    * All extensions of your type must be singular messages; e.g. they cannot
    * be int32s, enums, or repeated messages.
    *
    * Because this is an option, the above two restrictions are not enforced by
    * the protocol compiler.
    *
    * @generated from field: optional bool message_set_wire_format = 1 [default = false];
    */
  var messageSetWireFormat: js.UndefOr[Boolean] = js.native
  
  /**
    * Disables the generation of the standard "descriptor()" accessor, which can
    * conflict with a field of the same name.  This is meant to make migration
    * from proto1 easier; new code should avoid fields named "descriptor".
    *
    * @generated from field: optional bool no_standard_descriptor_accessor = 2 [default = false];
    */
  var noStandardDescriptorAccessor: js.UndefOr[Boolean] = js.native
  
  /**
    * The parser stores options it doesn't recognize here. See above.
    *
    * @generated from field: repeated google.protobuf.UninterpretedOption uninterpreted_option = 999;
    */
  var uninterpretedOption: js.Array[UninterpretedOption] = js.native
}
/* static members */
object MessageOptions {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MessageOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageMessageOptionClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: MessageOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageMessageOptionClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageMessageOptionClone, b: PlainMessageMessageOptionClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageMessageOptionClone, b: MessageOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: MessageOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: MessageOptions, b: PlainMessageMessageOptionClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: MessageOptions, b: MessageOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MessageOptions.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): MessageOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageOptions]
  
  inline def fromJson(jsonValue: JsonValue): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): MessageOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageOptions]
  
  inline def fromJsonString(jsonString: String): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): MessageOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MessageOptions]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MessageOptions.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "MessageOptions.typeName")
  @js.native
  val typeName: /* "google.protobuf.MessageOptions" */ String = js.native
}
