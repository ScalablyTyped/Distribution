package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IPickleStepArgument
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.IPickleDocString
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.IPickleTable
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.IPickleTableRow
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.IPickleTableCell
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A wrapper for either a doc string or a table. */
@JSImport("cucumber-messages", "messages.PickleStepArgument")
@js.native
/**
  * Constructs a new PickleStepArgument.
  * @param [properties] Properties to set
  */
class PickleStepArgument ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument {
  def this(properties: IPickleStepArgument) = this()
}
object PickleStepArgument {
  
  @JSImport("cucumber-messages", "messages.PickleStepArgument")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a PickleDocString. */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString")
  @js.native
  /**
    * Constructs a new PickleDocString.
    * @param [properties] Properties to set
    */
  class PickleDocString ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString {
    def this(properties: IPickleDocString) = this()
  }
  object PickleDocString {
    
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PickleDocString instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleDocString instance
      */
    /* static member */
    inline def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString]
    inline def create(properties: IPickleDocString): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString]
    
    /**
      * Decodes a PickleDocString message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleDocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString]
    inline def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString]
    inline def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString]
    inline def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString]
    
    /**
      * Decodes a PickleDocString message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleDocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString]
    inline def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString]
    
    /**
      * Encodes the specified PickleDocString message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleDocString.verify|verify} messages.
      * @param message PickleDocString message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IPickleDocString): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IPickleDocString, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified PickleDocString message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleDocString.verify|verify} messages.
      * @param message PickleDocString message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IPickleDocString): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IPickleDocString, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a PickleDocString message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleDocString
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString]
    
    /**
      * Creates a plain object from a PickleDocString message. Also converts values to other types if specified.
      * @param message PickleDocString
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString
    ): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a PickleDocString message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a PickleTable. */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable")
  @js.native
  /**
    * Constructs a new PickleTable.
    * @param [properties] Properties to set
    */
  class PickleTable ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable {
    def this(properties: IPickleTable) = this()
  }
  object PickleTable {
    
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a PickleTableRow. */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow")
    @js.native
    /**
      * Constructs a new PickleTableRow.
      * @param [properties] Properties to set
      */
    class PickleTableRow ()
      extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow {
      def this(properties: IPickleTableRow) = this()
    }
    object PickleTableRow {
      
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a PickleTableCell. */
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell")
      @js.native
      /**
        * Constructs a new PickleTableCell.
        * @param [properties] Properties to set
        */
      class PickleTableCell ()
        extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell {
        def this(properties: IPickleTableCell) = this()
      }
      object PickleTableCell {
        
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new PickleTableCell instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PickleTableCell instance
          */
        /* static member */
        inline def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell]
        inline def create(properties: IPickleTableCell): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell]
        
        /**
          * Decodes a PickleTableCell message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PickleTableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell]
        inline def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell]
        inline def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell]
        inline def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell]
        
        /**
          * Decodes a PickleTableCell message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PickleTableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell]
        inline def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell]
        
        /**
          * Encodes the specified PickleTableCell message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify|verify} messages.
          * @param message PickleTableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encode(message: IPickleTableCell): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encode(message: IPickleTableCell, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Encodes the specified PickleTableCell message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify|verify} messages.
          * @param message PickleTableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        inline def encodeDelimited(message: IPickleTableCell): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
        inline def encodeDelimited(message: IPickleTableCell, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
        
        /**
          * Creates a PickleTableCell message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PickleTableCell
          */
        /* static member */
        inline def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell]
        
        /**
          * Creates a plain object from a PickleTableCell message. Also converts values to other types if specified.
          * @param message PickleTableCell
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell
        ): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        inline def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell,
          options: IConversionOptions
        ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
        /**
          * Verifies a PickleTableCell message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      }
      
      /**
        * Creates a new PickleTableRow instance using the specified properties.
        * @param [properties] Properties to set
        * @returns PickleTableRow instance
        */
      /* static member */
      inline def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow]
      inline def create(properties: IPickleTableRow): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow]
      
      /**
        * Decodes a PickleTableRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns PickleTableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow]
      inline def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow]
      inline def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow]
      inline def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow]
      
      /**
        * Decodes a PickleTableRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns PickleTableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow]
      inline def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow]
      
      /**
        * Encodes the specified PickleTableRow message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.verify|verify} messages.
        * @param message PickleTableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encode(message: IPickleTableRow): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encode(message: IPickleTableRow, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Encodes the specified PickleTableRow message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.verify|verify} messages.
        * @param message PickleTableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      inline def encodeDelimited(message: IPickleTableRow): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
      inline def encodeDelimited(message: IPickleTableRow, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
      
      /**
        * Creates a PickleTableRow message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns PickleTableRow
        */
      /* static member */
      inline def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow]
      
      /**
        * Creates a plain object from a PickleTableRow message. Also converts values to other types if specified.
        * @param message PickleTableRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow
      ): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow,
        options: IConversionOptions
      ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a PickleTableRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    }
    
    /**
      * Creates a new PickleTable instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleTable instance
      */
    /* static member */
    inline def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable]
    inline def create(properties: IPickleTable): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable]
    
    /**
      * Decodes a PickleTable message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable]
    inline def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable]
    inline def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable]
    inline def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable]
    
    /**
      * Decodes a PickleTable message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable]
    inline def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable]
    
    /**
      * Encodes the specified PickleTable message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.verify|verify} messages.
      * @param message PickleTable message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encode(message: IPickleTable): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encode(message: IPickleTable, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Encodes the specified PickleTable message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.verify|verify} messages.
      * @param message PickleTable message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    inline def encodeDelimited(message: IPickleTable): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
    inline def encodeDelimited(message: IPickleTable, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
    
    /**
      * Creates a PickleTable message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleTable
      */
    /* static member */
    inline def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable]
    
    /**
      * Creates a plain object from a PickleTable message. Also converts values to other types if specified.
      * @param message PickleTable
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable
    ): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable,
      options: IConversionOptions
    ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a PickleTable message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /**
    * Creates a new PickleStepArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleStepArgument instance
    */
  /* static member */
  inline def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument]
  inline def create(properties: IPickleStepArgument): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument]
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument]
  inline def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument]
  inline def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument]
  inline def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument]
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument]
  inline def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument]
  
  /**
    * Encodes the specified PickleStepArgument message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.verify|verify} messages.
    * @param message PickleStepArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IPickleStepArgument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPickleStepArgument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PickleStepArgument message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.verify|verify} messages.
    * @param message PickleStepArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IPickleStepArgument): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPickleStepArgument, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PickleStepArgument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleStepArgument
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument]
  
  /**
    * Creates a plain object from a PickleStepArgument message. Also converts values to other types if specified.
    * @param message PickleStepArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument,
    options: IConversionOptions
  ): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PickleStepArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
