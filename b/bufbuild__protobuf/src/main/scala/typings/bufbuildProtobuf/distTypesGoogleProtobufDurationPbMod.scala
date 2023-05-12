package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialMessageDuration
import typings.bufbuildProtobuf.anon.PlainMessageDurationClone
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGoogleProtobufDurationPbMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/duration_pb", "Duration")
  @js.native
  open class Duration () extends Message[Duration] {
    def this(data: PartialMessageDuration) = this()
    
    /**
      * Signed fractions of a second at nanosecond resolution of the span
      * of time. Durations less than one second are represented with a 0
      * `seconds` field and a positive or negative `nanos` field. For durations
      * of one second or more, a non-zero value for the `nanos` field must be
      * of the same sign as the `seconds` field. Must be from -999,999,999
      * to +999,999,999 inclusive.
      *
      * @generated from field: int32 nanos = 2;
      */
    var nanos: Double = js.native
    
    /**
      * Signed seconds of the span of time. Must be from -315,576,000,000
      * to +315,576,000,000 inclusive. Note: these bounds are computed from:
      * 60 sec/min * 60 min/hr * 24 hr/day * 365.25 days/year * 10000 years
      *
      * @generated from field: int64 seconds = 1;
      */
    var seconds: js.BigInt = js.native
  }
  /* static members */
  object Duration {
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/duration_pb", "Duration")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Unit, b: PlainMessageDurationClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Unit, b: Duration): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageDurationClone): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageDurationClone, b: PlainMessageDurationClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: PlainMessageDurationClone, b: Duration): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Duration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: Duration, b: PlainMessageDurationClone): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: Duration, b: Duration): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/duration_pb", "Duration.fields")
    @js.native
    val fields: FieldList = js.native
    
    inline def fromBinary(bytes: js.typedarray.Uint8Array): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[Duration]
    inline def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBinary")(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duration]
    
    inline def fromJson(jsonValue: JsonValue): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Duration]
    inline def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJson")(jsonValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duration]
    
    inline def fromJsonString(jsonString: String): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any]).asInstanceOf[Duration]
    inline def fromJsonString(jsonString: String, options: PartialJsonReadOptions): Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJsonString")(jsonString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duration]
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/duration_pb", "Duration.runtime")
    @js.native
    val runtime: ProtoRuntime = js.native
    
    @JSImport("@bufbuild/protobuf/dist/types/google/protobuf/duration_pb", "Duration.typeName")
    @js.native
    val typeName: /* "google.protobuf.Duration" */ String = js.native
  }
}
