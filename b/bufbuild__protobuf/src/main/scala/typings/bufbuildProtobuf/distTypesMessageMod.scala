package typings.bufbuildProtobuf

import typings.bufbuildProtobuf.anon.PartialBinaryReadOptions
import typings.bufbuildProtobuf.anon.PartialBinaryWriteOptions
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonWriteOptions
import typings.bufbuildProtobuf.anon.PartialJsonWriteStringOpt
import typings.bufbuildProtobuf.distTypesJsonFormatMod.JsonValue
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageMod {
  
  @JSImport("@bufbuild/protobuf/dist/types/message", "Message")
  @js.native
  open class Message[T /* <: Message[T] */] () extends StObject {
    
    /**
      * Compare with a message of the same type.
      */
    def equals(): Boolean = js.native
    def equals(other: PlainMessage[T]): Boolean = js.native
    
    /**
      * Parse from binary data, merging fields.
      *
      * Repeated fields are appended. Map entries are added, overwriting
      * existing keys.
      *
      * If a message field is already present, it will be merged with the
      * new data.
      */
    def fromBinary(bytes: js.typedarray.Uint8Array): this.type = js.native
    def fromBinary(bytes: js.typedarray.Uint8Array, options: PartialBinaryReadOptions): this.type = js.native
    
    /**
      * Parse a message from a JSON value.
      */
    def fromJson(jsonValue: JsonValue): this.type = js.native
    def fromJson(jsonValue: JsonValue, options: PartialJsonReadOptions): this.type = js.native
    
    /**
      * Parse a message from a JSON string.
      */
    def fromJsonString(jsonString: String): this.type = js.native
    def fromJsonString(jsonString: String, options: PartialJsonReadOptions): this.type = js.native
    
    /**
      * Retrieve the MessageType of this message - a singleton that represents
      * the protobuf message declaration and provides metadata for reflection-
      * based operations.
      */
    def getType(): MessageType[T] = js.native
    
    /**
      * Serialize the message to binary data.
      */
    def toBinary(): js.typedarray.Uint8Array = js.native
    def toBinary(options: PartialBinaryWriteOptions): js.typedarray.Uint8Array = js.native
    
    /**
      * Override for serialization behavior. This will be invoked when calling
      * JSON.stringify on this message (i.e. JSON.stringify(msg)).
      *
      * Note that this will not serialize google.protobuf.Any with a packed
      * message because the protobuf JSON format specifies that it needs to be
      * unpacked, and this is only possible with a type registry to look up the
      * message type.  As a result, attempting to serialize a message with this
      * type will throw an Error.
      *
      * This method is protected because you should not need to invoke it
      * directly -- instead use JSON.stringify or toJsonString for
      * stringified JSON.  Alternatively, if actual JSON is desired, you should
      * use toJson.
      */
    /* protected */ def toJSON(): JsonValue = js.native
    
    /**
      * Serialize the message to a JSON value, a JavaScript value that can be
      * passed to JSON.stringify().
      */
    def toJson(): JsonValue = js.native
    def toJson(options: PartialJsonWriteOptions): JsonValue = js.native
    
    /**
      * Serialize the message to a JSON string.
      */
    def toJsonString(): String = js.native
    def toJsonString(options: PartialJsonWriteStringOpt): String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait AnyMessage extends Message[AnyMessage]
  
  trait OneofSelectedMessage[K /* <: String */, M /* <: Message[M] */] extends StObject {
    
    var `case`: K
    
    var value: M
  }
  object OneofSelectedMessage {
    
    inline def apply[K /* <: String */, M /* <: Message[M] */](`case`: K, value: M): OneofSelectedMessage[K, M] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("case")(`case`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OneofSelectedMessage[K, M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OneofSelectedMessage[?, ?], K /* <: String */, M /* <: Message[M] */] (val x: Self & (OneofSelectedMessage[K, M])) extends AnyVal {
      
      inline def setCase(value: K): Self = StObject.set(x, "case", value.asInstanceOf[js.Any])
      
      inline def setValue(value: M): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    F extends std.Date | std.Uint8Array | bigint | boolean | string | number ? F : F extends std.Array<infer U> ? std.Array<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialField<U>> : F extends std.ReadonlyArray<infer U> ? std.ReadonlyArray<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialField<U>> : F extends @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.Message<infer U> ? @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<U> : F extends @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.OneofSelectedMessage<infer C, infer V> ? {  case :C,   value :@bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<V>} : F extends {  case :string | undefined,   value :unknown | undefined} ? F : F extends {[key: string | number] : @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.Message<infer U>} ? {[key: string | number] : @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialMessage<U>} : F
    }}}
    */
  type PartialField[F] = F
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T as T[P] extends std.Function? never : P ]:? @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PartialField<T[P]>}
    }}}
    */
  @js.native
  trait PartialMessage[T /* <: Message[T] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    F extends std.Date | std.Uint8Array | bigint | boolean | string | number ? F : F extends std.Array<infer U> ? std.Array<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainField<U>> : F extends std.ReadonlyArray<infer U> ? std.ReadonlyArray<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainField<U>> : F extends @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.Message<infer U> ? @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainMessage<U> : F extends @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.OneofSelectedMessage<infer C, infer V> ? {  case :C,   value :@bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainField<V>} : F extends {  case :string | undefined,   value :unknown | undefined} ? F : F extends {[key: string | number] : @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.Message<infer U>} ? {[key: string | number] : @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainField<U>} : F
    }}}
    */
  type PlainField[F] = F
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T as T[P] extends std.Function? never : P ]: @bufbuild/protobuf.@bufbuild/protobuf/dist/types/message.PlainField<T[P]>}
    }}}
    */
  @js.native
  trait PlainMessage[T /* <: Message[T] */] extends StObject
}
