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
import scala.scalajs.js.`|`
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
    
    /**
      * Creates a new PickleDocString instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleDocString instance
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.create")
    @js.native
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.create")
    @js.native
    def create(properties: IPickleDocString): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = js.native
    
    /**
      * Decodes a PickleDocString message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleDocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.decode")
    @js.native
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.decode")
    @js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = js.native
    
    /**
      * Decodes a PickleDocString message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleDocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = js.native
    
    /**
      * Encodes the specified PickleDocString message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleDocString.verify|verify} messages.
      * @param message PickleDocString message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.encode")
    @js.native
    def encode(message: IPickleDocString): Writer = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.encode")
    @js.native
    def encode(message: IPickleDocString, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleDocString message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleDocString.verify|verify} messages.
      * @param message PickleDocString message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleDocString): Writer = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleDocString, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleDocString message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleDocString
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString = js.native
    
    /**
      * Creates a plain object from a PickleDocString message. Also converts values to other types if specified.
      * @param message PickleDocString
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.toObject")
    @js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString
    ): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.toObject")
    @js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleDocString,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleDocString message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleDocString.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
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
        
        /**
          * Creates a new PickleTableCell instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PickleTableCell instance
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.create")
        @js.native
        def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = js.native
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.create")
        @js.native
        def create(properties: IPickleTableCell): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = js.native
        
        /**
          * Decodes a PickleTableCell message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PickleTableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decode")
        @js.native
        def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = js.native
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decode")
        @js.native
        def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = js.native
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decode")
        @js.native
        def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = js.native
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = js.native
        
        /**
          * Decodes a PickleTableCell message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PickleTableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = js.native
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = js.native
        
        /**
          * Encodes the specified PickleTableCell message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify|verify} messages.
          * @param message PickleTableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.encode")
        @js.native
        def encode(message: IPickleTableCell): Writer = js.native
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.encode")
        @js.native
        def encode(message: IPickleTableCell, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified PickleTableCell message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify|verify} messages.
          * @param message PickleTableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.encodeDelimited")
        @js.native
        def encodeDelimited(message: IPickleTableCell): Writer = js.native
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.encodeDelimited")
        @js.native
        def encodeDelimited(message: IPickleTableCell, writer: Writer): Writer = js.native
        
        /**
          * Creates a PickleTableCell message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PickleTableCell
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell = js.native
        
        /**
          * Creates a plain object from a PickleTableCell message. Also converts values to other types if specified.
          * @param message PickleTableCell
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell
        ): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.toObject")
        @js.native
        def toObject(
          message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell,
          options: IConversionOptions
        ): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a PickleTableCell message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new PickleTableRow instance using the specified properties.
        * @param [properties] Properties to set
        * @returns PickleTableRow instance
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.create")
      @js.native
      def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.create")
      @js.native
      def create(properties: IPickleTableRow): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
      
      /**
        * Decodes a PickleTableRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns PickleTableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.decode")
      @js.native
      def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.decode")
      @js.native
      def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.decode")
      @js.native
      def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
      
      /**
        * Decodes a PickleTableRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns PickleTableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
      
      /**
        * Encodes the specified PickleTableRow message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.verify|verify} messages.
        * @param message PickleTableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.encode")
      @js.native
      def encode(message: IPickleTableRow): Writer = js.native
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.encode")
      @js.native
      def encode(message: IPickleTableRow, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified PickleTableRow message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.verify|verify} messages.
        * @param message PickleTableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPickleTableRow): Writer = js.native
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPickleTableRow, writer: Writer): Writer = js.native
      
      /**
        * Creates a PickleTableRow message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns PickleTableRow
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow = js.native
      
      /**
        * Creates a plain object from a PickleTableRow message. Also converts values to other types if specified.
        * @param message PickleTableRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow
      ): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.toObject")
      @js.native
      def toObject(
        message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a PickleTableRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.PickleTableRow.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /**
      * Creates a new PickleTable instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleTable instance
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.create")
    @js.native
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.create")
    @js.native
    def create(properties: IPickleTable): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = js.native
    
    /**
      * Decodes a PickleTable message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.decode")
    @js.native
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.decode")
    @js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = js.native
    
    /**
      * Decodes a PickleTable message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = js.native
    
    /**
      * Encodes the specified PickleTable message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.verify|verify} messages.
      * @param message PickleTable message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.encode")
    @js.native
    def encode(message: IPickleTable): Writer = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.encode")
    @js.native
    def encode(message: IPickleTable, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleTable message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.verify|verify} messages.
      * @param message PickleTable message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleTable): Writer = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleTable, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleTable message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleTable
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable = js.native
    
    /**
      * Creates a plain object from a PickleTable message. Also converts values to other types if specified.
      * @param message PickleTable
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.toObject")
    @js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable
    ): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.toObject")
    @js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleTable message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.PickleStepArgument.PickleTable.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new PickleStepArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleStepArgument instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  @JSImport("cucumber-messages", "messages.PickleStepArgument.create")
  @js.native
  def create(properties: IPickleStepArgument): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  @JSImport("cucumber-messages", "messages.PickleStepArgument.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  @JSImport("cucumber-messages", "messages.PickleStepArgument.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  @JSImport("cucumber-messages", "messages.PickleStepArgument.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  @JSImport("cucumber-messages", "messages.PickleStepArgument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  
  /**
    * Encodes the specified PickleStepArgument message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.verify|verify} messages.
    * @param message PickleStepArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.encode")
  @js.native
  def encode(message: IPickleStepArgument): Writer = js.native
  @JSImport("cucumber-messages", "messages.PickleStepArgument.encode")
  @js.native
  def encode(message: IPickleStepArgument, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleStepArgument message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.verify|verify} messages.
    * @param message PickleStepArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickleStepArgument): Writer = js.native
  @JSImport("cucumber-messages", "messages.PickleStepArgument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickleStepArgument, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleStepArgument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleStepArgument
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument = js.native
  
  /**
    * Creates a plain object from a PickleStepArgument message. Also converts values to other types if specified.
    * @param message PickleStepArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.PickleStepArgument.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleStepArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.PickleStepArgument.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
