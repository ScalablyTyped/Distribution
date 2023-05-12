package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageBoolValue
import typings.bufbuildProtobuf.anon.PartialMessageBytesValue
import typings.bufbuildProtobuf.anon.PartialMessageDoubleValue
import typings.bufbuildProtobuf.anon.PartialMessageFloatValue
import typings.bufbuildProtobuf.anon.PartialMessageInt32Value
import typings.bufbuildProtobuf.anon.PartialMessageInt64Value
import typings.bufbuildProtobuf.anon.PartialMessageStringValue
import typings.bufbuildProtobuf.anon.PartialMessageUInt32Value
import typings.bufbuildProtobuf.anon.PartialMessageUInt64Value
import typings.bufbuildProtobuf.anon.PlainMessageBoolValueClone
import typings.bufbuildProtobuf.anon.PlainMessageBytesValueClone
import typings.bufbuildProtobuf.anon.PlainMessageDoubleValueClone
import typings.bufbuildProtobuf.anon.PlainMessageFloatValueClone
import typings.bufbuildProtobuf.anon.PlainMessageInt32ValueClone
import typings.bufbuildProtobuf.anon.PlainMessageInt64ValueClone
import typings.bufbuildProtobuf.anon.PlainMessageStringValueClone
import typings.bufbuildProtobuf.anon.PlainMessageUInt32ValueClone
import typings.bufbuildProtobuf.anon.PlainMessageUInt64ValueClone
import typings.bufbuildProtobuf.anon.UnwrapField
import typings.bufbuildProtobuf.anon.UnwrapFieldWrapField
import typings.bufbuildProtobuf.anon.WrapField
import typings.bufbuildProtobuf.anon.`0`
import typings.bufbuildProtobuf.anon.`1`
import typings.bufbuildProtobuf.anon.`2`
import typings.bufbuildProtobuf.anon.`3`
import typings.bufbuildProtobuf.anon.`4`
import typings.bufbuildProtobuf.anon.`5`
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleProtobufWrappersPbMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BoolValue")
  @js.native
  open class BoolValue () extends Message[BoolValue] {
    def this(data: PartialMessageBoolValue) = this()
    
    /**
      * The bool value.
      *
      * @generated from field: bool value = 1;
      */
    var value: Boolean = js.native
  }
  /* static members */
  object BoolValue {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BoolValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageBoolValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: BoolValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageBoolValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageBoolValueClone, b: PlainMessageBoolValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageBoolValueClone, b: BoolValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: BoolValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: BoolValue, b: PlainMessageBoolValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: BoolValue, b: BoolValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BoolValue.fieldWrapper")
    @js.native
    val fieldWrapper: `3` = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BoolValue.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): BoolValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[BoolValue]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): BoolValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BoolValue]
    
    inline def fromJson(jsonValue: JsonValue): BoolValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[BoolValue]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): BoolValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BoolValue]
    
    inline def fromJsonString(jsonString: String): BoolValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[BoolValue]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): BoolValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BoolValue]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BoolValue.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BoolValue.typeName")
    @js.native
    val typeName: /* "google.protobuf.BoolValue" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BytesValue")
  @js.native
  open class BytesValue () extends Message[BytesValue] {
    def this(data: PartialMessageBytesValue) = this()
    
    /**
      * The bytes value.
      *
      * @generated from field: bytes value = 1;
      */
    var value: js.typedarray.Uint8Array = js.native
  }
  /* static members */
  object BytesValue {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BytesValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageBytesValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: BytesValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageBytesValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageBytesValueClone, b: PlainMessageBytesValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageBytesValueClone, b: BytesValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: BytesValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: BytesValue, b: PlainMessageBytesValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: BytesValue, b: BytesValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BytesValue.fieldWrapper")
    @js.native
    val fieldWrapper: `5` = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BytesValue.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): BytesValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[BytesValue]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): BytesValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BytesValue]
    
    inline def fromJson(jsonValue: JsonValue): BytesValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[BytesValue]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): BytesValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BytesValue]
    
    inline def fromJsonString(jsonString: String): BytesValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[BytesValue]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): BytesValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[BytesValue]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BytesValue.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "BytesValue.typeName")
    @js.native
    val typeName: /* "google.protobuf.BytesValue" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "DoubleValue")
  @js.native
  open class DoubleValue () extends Message[DoubleValue] {
    def this(data: PartialMessageDoubleValue) = this()
    
    /**
      * The double value.
      *
      * @generated from field: double value = 1;
      */
    var value: Double = js.native
  }
  /* static members */
  object DoubleValue {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "DoubleValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageDoubleValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: DoubleValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageDoubleValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageDoubleValueClone, b: PlainMessageDoubleValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageDoubleValueClone, b: DoubleValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: DoubleValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: DoubleValue, b: PlainMessageDoubleValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: DoubleValue, b: DoubleValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "DoubleValue.fieldWrapper")
    @js.native
    val fieldWrapper: UnwrapField = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "DoubleValue.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): DoubleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[DoubleValue]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): DoubleValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DoubleValue]
    
    inline def fromJson(jsonValue: JsonValue): DoubleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[DoubleValue]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): DoubleValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DoubleValue]
    
    inline def fromJsonString(jsonString: String): DoubleValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[DoubleValue]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): DoubleValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DoubleValue]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "DoubleValue.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "DoubleValue.typeName")
    @js.native
    val typeName: /* "google.protobuf.DoubleValue" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "FloatValue")
  @js.native
  open class FloatValue () extends Message[FloatValue] {
    def this(data: PartialMessageFloatValue) = this()
    
    /**
      * The float value.
      *
      * @generated from field: float value = 1;
      */
    var value: Double = js.native
  }
  /* static members */
  object FloatValue {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "FloatValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageFloatValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: FloatValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageFloatValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageFloatValueClone, b: PlainMessageFloatValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageFloatValueClone, b: FloatValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: FloatValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: FloatValue, b: PlainMessageFloatValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: FloatValue, b: FloatValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "FloatValue.fieldWrapper")
    @js.native
    val fieldWrapper: WrapField = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "FloatValue.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): FloatValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[FloatValue]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): FloatValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FloatValue]
    
    inline def fromJson(jsonValue: JsonValue): FloatValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[FloatValue]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): FloatValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FloatValue]
    
    inline def fromJsonString(jsonString: String): FloatValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[FloatValue]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): FloatValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FloatValue]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "FloatValue.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "FloatValue.typeName")
    @js.native
    val typeName: /* "google.protobuf.FloatValue" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int32Value")
  @js.native
  open class Int32Value () extends Message[Int32Value] {
    def this(data: PartialMessageInt32Value) = this()
    
    /**
      * The int32 value.
      *
      * @generated from field: int32 value = 1;
      */
    var value: Double = js.native
  }
  /* static members */
  object Int32Value {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int32Value")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageInt32ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Int32Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageInt32ValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageInt32ValueClone, b: PlainMessageInt32ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageInt32ValueClone, b: Int32Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Int32Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Int32Value, b: PlainMessageInt32ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Int32Value, b: Int32Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int32Value.fieldWrapper")
    @js.native
    val fieldWrapper: `1` = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int32Value.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Int32Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Int32Value]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Int32Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Int32Value]
    
    inline def fromJson(jsonValue: JsonValue): Int32Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Int32Value]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Int32Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Int32Value]
    
    inline def fromJsonString(jsonString: String): Int32Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Int32Value]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Int32Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Int32Value]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int32Value.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int32Value.typeName")
    @js.native
    val typeName: /* "google.protobuf.Int32Value" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int64Value")
  @js.native
  open class Int64Value () extends Message[Int64Value] {
    def this(data: PartialMessageInt64Value) = this()
    
    /**
      * The int64 value.
      *
      * @generated from field: int64 value = 1;
      */
    var value: js.BigInt = js.native
  }
  /* static members */
  object Int64Value {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int64Value")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageInt64ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Int64Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageInt64ValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageInt64ValueClone, b: PlainMessageInt64ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageInt64ValueClone, b: Int64Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Int64Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Int64Value, b: PlainMessageInt64ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Int64Value, b: Int64Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int64Value.fieldWrapper")
    @js.native
    val fieldWrapper: UnwrapFieldWrapField = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int64Value.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Int64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Int64Value]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Int64Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Int64Value]
    
    inline def fromJson(jsonValue: JsonValue): Int64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Int64Value]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Int64Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Int64Value]
    
    inline def fromJsonString(jsonString: String): Int64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Int64Value]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Int64Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Int64Value]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int64Value.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "Int64Value.typeName")
    @js.native
    val typeName: /* "google.protobuf.Int64Value" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "StringValue")
  @js.native
  open class StringValue () extends Message[StringValue] {
    def this(data: PartialMessageStringValue) = this()
    
    /**
      * The string value.
      *
      * @generated from field: string value = 1;
      */
    var value: String = js.native
  }
  /* static members */
  object StringValue {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "StringValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageStringValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: StringValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageStringValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageStringValueClone, b: PlainMessageStringValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageStringValueClone, b: StringValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: StringValue): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: StringValue, b: PlainMessageStringValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: StringValue, b: StringValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "StringValue.fieldWrapper")
    @js.native
    val fieldWrapper: `4` = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "StringValue.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): StringValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[StringValue]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): StringValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringValue]
    
    inline def fromJson(jsonValue: JsonValue): StringValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[StringValue]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): StringValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringValue]
    
    inline def fromJsonString(jsonString: String): StringValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[StringValue]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): StringValue = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringValue]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "StringValue.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "StringValue.typeName")
    @js.native
    val typeName: /* "google.protobuf.StringValue" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt32Value")
  @js.native
  open class UInt32Value () extends Message[UInt32Value] {
    def this(data: PartialMessageUInt32Value) = this()
    
    /**
      * The uint32 value.
      *
      * @generated from field: uint32 value = 1;
      */
    var value: Double = js.native
  }
  /* static members */
  object UInt32Value {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt32Value")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageUInt32ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: UInt32Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageUInt32ValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageUInt32ValueClone, b: PlainMessageUInt32ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageUInt32ValueClone, b: UInt32Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: UInt32Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: UInt32Value, b: PlainMessageUInt32ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: UInt32Value, b: UInt32Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt32Value.fieldWrapper")
    @js.native
    val fieldWrapper: `2` = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt32Value.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): UInt32Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[UInt32Value]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): UInt32Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UInt32Value]
    
    inline def fromJson(jsonValue: JsonValue): UInt32Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[UInt32Value]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): UInt32Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UInt32Value]
    
    inline def fromJsonString(jsonString: String): UInt32Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[UInt32Value]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): UInt32Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UInt32Value]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt32Value.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt32Value.typeName")
    @js.native
    val typeName: /* "google.protobuf.UInt32Value" */ String = js.native
  }
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt64Value")
  @js.native
  open class UInt64Value () extends Message[UInt64Value] {
    def this(data: PartialMessageUInt64Value) = this()
    
    /**
      * The uint64 value.
      *
      * @generated from field: uint64 value = 1;
      */
    var value: js.BigInt = js.native
  }
  /* static members */
  object UInt64Value {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt64Value")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageUInt64ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: UInt64Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageUInt64ValueClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageUInt64ValueClone, b: PlainMessageUInt64ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageUInt64ValueClone, b: UInt64Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: UInt64Value): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: UInt64Value, b: PlainMessageUInt64ValueClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: UInt64Value, b: UInt64Value): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt64Value.fieldWrapper")
    @js.native
    val fieldWrapper: `0` = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt64Value.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): UInt64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[UInt64Value]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): UInt64Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UInt64Value]
    
    inline def fromJson(jsonValue: JsonValue): UInt64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[UInt64Value]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): UInt64Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UInt64Value]
    
    inline def fromJsonString(jsonString: String): UInt64Value = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[UInt64Value]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): UInt64Value = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UInt64Value]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt64Value.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/wrappers_pb", "UInt64Value.typeName")
    @js.native
    val typeName: /* "google.protobuf.UInt64Value" */ String = js.native
  }
}
