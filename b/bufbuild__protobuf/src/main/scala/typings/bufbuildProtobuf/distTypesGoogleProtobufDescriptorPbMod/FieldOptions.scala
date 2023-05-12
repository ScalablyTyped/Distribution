package typings.bufbuildProtobuf.distTypesGoogleProtobufDescriptorPbMod

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageFieldOption
import typings.bufbuildProtobuf.anon.PlainMessageFieldOptionsClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldOptions")
@js.native
open class FieldOptions () extends Message[FieldOptions] {
  def this(data: PartialMessageFieldOption) = this()
  
  /**
    * The ctype option instructs the C++ code generator to use a different
    * representation of the field than it normally would.  See the specific
    * options below.  This option is not yet implemented in the open source
    * release -- sorry, we'll try to include it in a future version!
    *
    * @generated from field: optional google.protobuf.FieldOptions.CType ctype = 1 [default = STRING];
    */
  var ctype: js.UndefOr[FieldOptionsCType] = js.native
  
  /**
    * Indicate that the field value should not be printed out when using debug
    * formats, e.g. when the field contains sensitive credentials.
    *
    * @generated from field: optional bool debug_redact = 16 [default = false];
    */
  var debugRedact: js.UndefOr[Boolean] = js.native
  
  /**
    * Is this field deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for accessors, or it will be completely ignored; in the very least, this
    * is a formalization for deprecating fields.
    *
    * @generated from field: optional bool deprecated = 3 [default = false];
    */
  var deprecated: js.UndefOr[Boolean] = js.native
  
  /**
    * The jstype option determines the JavaScript type used for values of the
    * field.  The option is permitted only for 64 bit integral and fixed types
    * (int64, uint64, sint64, fixed64, sfixed64).  A field with jstype JS_STRING
    * is represented as JavaScript string, which avoids loss of precision that
    * can happen when a large value is converted to a floating point JavaScript.
    * Specifying JS_NUMBER for the jstype causes the generated JavaScript code to
    * use the JavaScript "number" type.  The behavior of the default option
    * JS_NORMAL is implementation dependent.
    *
    * This option is an enum to permit additional types to be added, e.g.
    * goog.math.Integer.
    *
    * @generated from field: optional google.protobuf.FieldOptions.JSType jstype = 6 [default = JS_NORMAL];
    */
  var jstype: js.UndefOr[FieldOptionsJSType] = js.native
  
  /**
    * Should this field be parsed lazily?  Lazy applies only to message-type
    * fields.  It means that when the outer message is initially parsed, the
    * inner message's contents will not be parsed but instead stored in encoded
    * form.  The inner message will actually be parsed when it is first accessed.
    *
    * This is only a hint.  Implementations are free to choose whether to use
    * eager or lazy parsing regardless of the value of this option.  However,
    * setting this option true suggests that the protocol author believes that
    * using lazy parsing on this field is worth the additional bookkeeping
    * overhead typically needed to implement it.
    *
    * This option does not affect the public interface of any generated code;
    * all method signatures remain the same.  Furthermore, thread-safety of the
    * interface is not affected by this option; const methods remain safe to
    * call from multiple threads concurrently, while non-const methods continue
    * to require exclusive access.
    *
    * Note that implementations may choose not to check required fields within
    * a lazy sub-message.  That is, calling IsInitialized() on the outer message
    * may return true even if the inner message has missing required fields.
    * This is necessary because otherwise the inner message would have to be
    * parsed in order to perform the check, defeating the purpose of lazy
    * parsing.  An implementation which chooses not to check required fields
    * must be consistent about it.  That is, for any particular sub-message, the
    * implementation must either *always* check its required fields, or *never*
    * check its required fields, regardless of whether or not the message has
    * been parsed.
    *
    * As of May 2022, lazy verifies the contents of the byte stream during
    * parsing.  An invalid byte stream will cause the overall parsing to fail.
    *
    * @generated from field: optional bool lazy = 5 [default = false];
    */
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  /**
    * The packed option can be enabled for repeated primitive fields to enable
    * a more efficient representation on the wire. Rather than repeatedly
    * writing the tag and type for each element, the entire array is encoded as
    * a single length-delimited blob. In proto3, only explicit setting it to
    * false will avoid using packed encoding.
    *
    * @generated from field: optional bool packed = 2;
    */
  var packed: js.UndefOr[Boolean] = js.native
  
  /**
    * @generated from field: optional google.protobuf.FieldOptions.OptionRetention retention = 17;
    */
  var retention: js.UndefOr[FieldOptionsOptionRetention] = js.native
  
  /**
    * @generated from field: optional google.protobuf.FieldOptions.OptionTargetType target = 18;
    */
  var target: js.UndefOr[FieldOptionsOptionTargetType] = js.native
  
  /**
    * The parser stores options it doesn't recognize here. See above.
    *
    * @generated from field: repeated google.protobuf.UninterpretedOption uninterpreted_option = 999;
    */
  var uninterpretedOption: js.Array[UninterpretedOption] = js.native
  
  /**
    * unverified_lazy does no correctness checks on the byte stream. This should
    * only be used where lazy with verification is prohibitive for performance
    * reasons.
    *
    * @generated from field: optional bool unverified_lazy = 15 [default = false];
    */
  var unverifiedLazy: js.UndefOr[Boolean] = js.native
  
  /**
    * For Google-internal migration only. Do not use.
    *
    * @generated from field: optional bool weak = 10 [default = false];
    */
  var weak: js.UndefOr[Boolean] = js.native
}
/* static members */
object FieldOptions {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals(a: Unit, b: PlainMessageFieldOptionsClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: Unit, b: FieldOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFieldOptionsClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFieldOptionsClone, b: PlainMessageFieldOptionsClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: PlainMessageFieldOptionsClone, b: FieldOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: FieldOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals(a: FieldOptions, b: PlainMessageFieldOptionsClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals(a: FieldOptions, b: FieldOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldOptions.fields")
  @js.native
  val fields: FieldList = js.native
  
  inline def fromBinary(bytes: js.typedarray.Uint8Array): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FieldOptions]
  
  inline def fromJson(jsonValue: JsonValue): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FieldOptions]
  
  inline def fromJsonString(jsonString: String): FieldOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[FieldOptions]
  inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): FieldOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FieldOptions]
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldOptions.runtime")
  @js.native
  val runtime: ProtoRuntime = js.native
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/descriptor_pb", "FieldOptions.typeName")
  @js.native
  val typeName: /* "google.protobuf.FieldOptions" */ String = js.native
}
