package typings.bufbuildProtobuf

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.distTypesFieldListMod.FieldList
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageMod.PartialMessage
import typings.bufbuildProtobuf.distTypesMessageMod.PlainMessage
import typings.bufbuildProtobuf.distTypesPrivateFieldWrapperMod.FieldWrapper
import typings.bufbuildProtobuf.distTypesPrivateProtoRuntimeMod.ProtoRuntime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageTypeMod {
  
  @js.native
  trait MessageType[T /* <: Message[T] */]
    extends StObject
       with /**
    * Create a new instance of this type.
    */
  Instantiable0[T]
       with Instantiable1[/* data */ PartialMessage[T], T] {
    
    /**
      * Returns true if the given arguments have equal field values, recursively.
      * Will also return true if both messages are `undefined` or `null`.
      */
    def equals(): Boolean = js.native
    def equals(a: T, b: T): Boolean = js.native
    def equals(a: T, b: PlainMessage[T]): Boolean = js.native
    def equals(a: Null, b: T): Boolean = js.native
    def equals(a: Null, b: PlainMessage[T]): Boolean = js.native
    def equals(a: Unit, b: T): Boolean = js.native
    def equals(a: Unit, b: PlainMessage[T]): Boolean = js.native
    def equals(a: PlainMessage[T]): Boolean = js.native
    def equals(a: PlainMessage[T], b: T): Boolean = js.native
    def equals(a: PlainMessage[T], b: PlainMessage[T]): Boolean = js.native
    
    /**
      * When used as a field, unwrap this message to a simple value.
      */
    val fieldWrapper: js.UndefOr[FieldWrapper[T, Any]] = js.native
    
    /**
      * Field metadata.
      */
    val fields: FieldList = js.native
    
    /**
      * Parse serialized binary data.
      */
    def fromBinary(data: js.typedarray.Uint8Array): T = js.native
    def fromBinary(data: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): T = js.native
    
    /**
      * Parse a JSON object.
      */
    def fromJson(jsonValue: JsonValue): T = js.native
    def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): T = js.native
    
    /**
      * Parse a JSON string.
      */
    def fromJsonString(jsonString: String): T = js.native
    def fromJsonString(jsonString: String, options: PartialJsonReadOptions): T = js.native
    
    /**
      * Provides serialization and other functionality.
      */
    val runtime: ProtoRuntime = js.native
    
    /**
      * The fully qualified name of the message.
      */
    val typeName: String = js.native
  }
}
