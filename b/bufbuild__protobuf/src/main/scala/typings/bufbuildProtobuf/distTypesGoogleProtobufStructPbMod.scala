package typings.bufbuildProtobuf

import org.scalablytyped.runtime.StringDictionary
import typings.bufbuildProtobuf.anon.Case
import typings.bufbuildProtobuf.anon.CaseUndefined
import typings.bufbuildProtobuf.anon.CaseValue
import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageListValue
import typings.bufbuildProtobuf.anon.PartialMessageStruct
import typings.bufbuildProtobuf.anon.PartialMessageValue
import typings.bufbuildProtobuf.anon.PlainMessageListValueClone
import typings.bufbuildProtobuf.anon.PlainMessageStructClone
import typings.bufbuildProtobuf.anon.PlainMessageValueClone
import typings.bufbuildProtobuf.anon.ValueBoolean
import typings.bufbuildProtobuf.anon.ValueListValue
import typings.bufbuildProtobuf.anon.ValueStruct
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleProtobufStructPbMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "ListValue")
  @js.native
  open class ListValue () extends Message[ListValue] {
    def this(data: PartialMessageListValue) = this()
    
    /**
      * Repeated field of dynamically typed values.
      *
      * @generated from field: repeated google.protobuf.Value values = 1;
      */
    var values: js.Array[Value] = js.native
  }
  /* static members */
  object ListValue {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "ListValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageListValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: ListValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageListValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageListValueClone, b: PlainMessageListValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageListValueClone, b: ListValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: ListValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: ListValue, b: PlainMessageListValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: ListValue, b: ListValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "ListValue.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): ListValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[ListValue]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): ListValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ListValue]
    
    inline def fromJson(jsonValue: JsonValue): ListValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[ListValue]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): ListValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ListValue]
    
    inline def fromJsonString(jsonString: String): ListValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[ListValue]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): ListValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ListValue]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "ListValue.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "ListValue.typeName")
    @js.native
    val typeName: /* "google.protobuf.ListValue" */ String = js.native
  }
  
  @js.native
  sealed trait NullValue extends StObject
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "NullValue")
  @js.native
  object NullValue extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[NullValue & Double] = js.native
    
    /**
      * Null value.
      *
      * @generated from enum value: NULL_VALUE = 0;
      */
    @js.native
    sealed trait NULL_VALUE
      extends StObject
         with NullValue
    /* 0 */ val NULL_VALUE: typings.bufbuildProtobuf.distTypesGoogleProtobufStructPbMod.NullValue.NULL_VALUE & Double = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Struct")
  @js.native
  open class Struct () extends Message[Struct] {
    def this(data: PartialMessageStruct) = this()
    
    /**
      * Unordered map of dynamically typed values.
      *
      * @generated from field: map<string, google.protobuf.Value> fields = 1;
      */
    var fields: StringDictionary[Value] = js.native
  }
  /* static members */
  object Struct {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Struct")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageStructClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Struct): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageStructClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageStructClone, b: PlainMessageStructClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageStructClone, b: Struct): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Struct): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Struct, b: PlainMessageStructClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Struct, b: Struct): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Struct.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Struct]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Struct = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct]
    
    inline def fromJson(jsonValue: JsonValue): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Struct]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Struct = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct]
    
    inline def fromJsonString(jsonString: String): Struct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Struct]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Struct = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Struct]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Struct.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Struct.typeName")
    @js.native
    val typeName: /* "google.protobuf.Struct" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Value")
  @js.native
  open class Value () extends Message[Value] {
    def this(data: PartialMessageValue) = this()
    
    /**
      * The kind of value.
      *
      * @generated from oneof google.protobuf.Value.kind
      */
    var kind: Case | typings.bufbuildProtobuf.anon.Value | CaseValue | ValueBoolean | ValueStruct | ValueListValue | CaseUndefined = js.native
  }
  /* static members */
  object Value {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Value")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageValueClone, b: PlainMessageValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageValueClone, b: Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Value, b: PlainMessageValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Value, b: Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Value.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Value]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Value]
    
    inline def fromJson(jsonValue: JsonValue): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Value]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Value]
    
    inline def fromJsonString(jsonString: String): Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Value]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Value]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Value.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/struct_pb", "Value.typeName")
    @js.native
    val typeName: /* "google.protobuf.Value" */ String = js.native
  }
}
