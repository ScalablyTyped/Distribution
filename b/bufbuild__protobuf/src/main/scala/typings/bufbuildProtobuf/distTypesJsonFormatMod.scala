package typings.bufbuildProtobuf

import org.scalablytyped.runtime.StringDictionary
import typings.bufbuildProtobuf.anon.PartialJsonReadOptions
import typings.bufbuildProtobuf.anon.PartialJsonWriteStringOpt
import typings.bufbuildProtobuf.anon.ReadonlyJsonReadOptions
import typings.bufbuildProtobuf.anon.ReadonlyJsonWriteStringOp
import typings.bufbuildProtobuf.distTypesFieldMod.ScalarType
import typings.bufbuildProtobuf.distTypesMessageMod.AnyMessage
import typings.bufbuildProtobuf.distTypesMessageMod.Message
import typings.bufbuildProtobuf.distTypesMessageTypeMod.MessageType
import typings.bufbuildProtobuf.distTypesTypeRegistryMod.IMessageTypeRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesJsonFormatMod {
  
  @js.native
  trait JsonFormat extends StObject {
    
    /**
      * Returns a short string representation of a JSON value, suitable for error messages.
      */
    def debug(json: JsonValue): String = js.native
    
    /**
      * Provide options for parsing JSON data.
      */
    def makeReadOptions(): ReadonlyJsonReadOptions = js.native
    def makeReadOptions(options: PartialJsonReadOptions): ReadonlyJsonReadOptions = js.native
    
    /**
      * Provide options for serializing to JSON.
      */
    def makeWriteOptions(): ReadonlyJsonWriteStringOp = js.native
    def makeWriteOptions(options: PartialJsonWriteStringOpt): ReadonlyJsonWriteStringOp = js.native
    
    /**
      * Parse a message from JSON.
      */
    def readMessage[T /* <: Message[T] */](`type`: MessageType[T], jsonValue: JsonValue, options: JsonReadOptions): T = js.native
    def readMessage[T /* <: Message[T] */](`type`: MessageType[T], jsonValue: JsonValue, options: JsonReadOptions, message: T): T = js.native
    
    /**
      * Parse a single scalar value from JSON.
      * This method may throw an error, but it may have a blank error message.
      * Callers are expected to provide context.
      */
    def readScalar(`type`: ScalarType, json: JsonValue): Any = js.native
    
    /**
      * Serialize a message to JSON.
      */
    def writeMessage(message: Message[AnyMessage], options: JsonWriteOptions): JsonValue = js.native
    
    /**
      * Serialize a single scalar value to JSON.
      */
    def writeScalar(`type`: ScalarType, value: Any, emitDefaultValues: Boolean): js.UndefOr[JsonValue] = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonObject = {[k: string] : @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonValue}
  }}}
  to avoid circular code involving: 
  - @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonObject
  - @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonValue
  */
  trait JsonObject
    extends StObject
       with /* k */ StringDictionary[JsonValue]
  object JsonObject {
    
    inline def apply(): JsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonObject]
    }
  }
  
  trait JsonReadOptions extends StObject {
    
    /**
      * Ignore unknown fields: Proto3 JSON parser should reject unknown fields
      * by default. This option ignores unknown fields in parsing, as well as
      * unrecognized enum string representations.
      */
    var ignoreUnknownFields: Boolean
    
    /**
      * This option is required to read `google.protobuf.Any`
      * from JSON format.
      */
    var typeRegistry: js.UndefOr[IMessageTypeRegistry] = js.undefined
  }
  object JsonReadOptions {
    
    inline def apply(ignoreUnknownFields: Boolean): JsonReadOptions = {
      val __obj = js.Dynamic.literal(ignoreUnknownFields = ignoreUnknownFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonReadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonReadOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnoreUnknownFields(value: Boolean): Self = StObject.set(x, "ignoreUnknownFields", value.asInstanceOf[js.Any])
      
      inline def setTypeRegistry(value: IMessageTypeRegistry): Self = StObject.set(x, "typeRegistry", value.asInstanceOf[js.Any])
      
      inline def setTypeRegistryUndefined: Self = StObject.set(x, "typeRegistry", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonValue = number | string | boolean | null | @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonObject | std.Array<@bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonValue>
  }}}
  to avoid circular code involving: 
  - @bufbuild/protobuf.@bufbuild/protobuf/dist/types/json-format.JsonValue
  */
  type JsonValue = Double | String | Boolean | Null | JsonObject | js.Array[Any]
  
  trait JsonWriteOptions extends StObject {
    
    /**
      * Emit fields with default values: Fields with default values are omitted
      * by default in proto3 JSON output. This option overrides this behavior
      * and outputs fields with their default values.
      */
    var emitDefaultValues: Boolean
    
    /**
      * Emit enum values as integers instead of strings: The name of an enum
      * value is used by default in JSON output. An option may be provided to
      * use the numeric value of the enum value instead.
      */
    var enumAsInteger: Boolean
    
    /**
      * This option is required to write `google.protobuf.Any`
      * to JSON format.
      */
    var typeRegistry: js.UndefOr[IMessageTypeRegistry] = js.undefined
    
    /**
      * Use proto field name instead of lowerCamelCase name: By default proto3
      * JSON printer should convert the field name to lowerCamelCase and use
      * that as the JSON name. An implementation may provide an option to use
      * proto field name as the JSON name instead. Proto3 JSON parsers are
      * required to accept both the converted lowerCamelCase name and the proto
      * field name.
      */
    var useProtoFieldName: Boolean
  }
  object JsonWriteOptions {
    
    inline def apply(emitDefaultValues: Boolean, enumAsInteger: Boolean, useProtoFieldName: Boolean): JsonWriteOptions = {
      val __obj = js.Dynamic.literal(emitDefaultValues = emitDefaultValues.asInstanceOf[js.Any], enumAsInteger = enumAsInteger.asInstanceOf[js.Any], useProtoFieldName = useProtoFieldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonWriteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonWriteOptions] (val x: Self) extends AnyVal {
      
      inline def setEmitDefaultValues(value: Boolean): Self = StObject.set(x, "emitDefaultValues", value.asInstanceOf[js.Any])
      
      inline def setEnumAsInteger(value: Boolean): Self = StObject.set(x, "enumAsInteger", value.asInstanceOf[js.Any])
      
      inline def setTypeRegistry(value: IMessageTypeRegistry): Self = StObject.set(x, "typeRegistry", value.asInstanceOf[js.Any])
      
      inline def setTypeRegistryUndefined: Self = StObject.set(x, "typeRegistry", js.undefined)
      
      inline def setUseProtoFieldName(value: Boolean): Self = StObject.set(x, "useProtoFieldName", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonWriteStringOptions
    extends StObject
       with JsonWriteOptions {
    
    var prettySpaces: Double
  }
  object JsonWriteStringOptions {
    
    inline def apply(
      emitDefaultValues: Boolean,
      enumAsInteger: Boolean,
      prettySpaces: Double,
      useProtoFieldName: Boolean
    ): JsonWriteStringOptions = {
      val __obj = js.Dynamic.literal(emitDefaultValues = emitDefaultValues.asInstanceOf[js.Any], enumAsInteger = enumAsInteger.asInstanceOf[js.Any], prettySpaces = prettySpaces.asInstanceOf[js.Any], useProtoFieldName = useProtoFieldName.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonWriteStringOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonWriteStringOptions] (val x: Self) extends AnyVal {
      
      inline def setPrettySpaces(value: Double): Self = StObject.set(x, "prettySpaces", value.asInstanceOf[js.Any])
    }
  }
}
