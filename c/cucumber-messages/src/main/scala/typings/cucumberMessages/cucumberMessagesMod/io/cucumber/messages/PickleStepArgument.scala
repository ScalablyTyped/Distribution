package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.IPickleTableRow
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.IPickleTableCell
import typings.cucumberMessages.cucumberMessagesStrings.dataTable
import typings.cucumberMessages.cucumberMessagesStrings.docString
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A wrapper for either a doc string or a table. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument")
@js.native
/**
  * Constructs a new PickleStepArgument.
  * @param [properties] Properties to set
  */
class PickleStepArgument () extends IPickleStepArgument {
  def this(properties: IPickleStepArgument) = this()
  
  /** PickleStepArgument message. */
  var message: js.UndefOr[docString | dataTable] = js.native
  
  /**
    * Converts this PickleStepArgument to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object PickleStepArgument {
  
  /** Represents a PickleDocString. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString")
  @js.native
  /**
    * Constructs a new PickleDocString.
    * @param [properties] Properties to set
    */
  class PickleDocString () extends IPickleDocString {
    def this(properties: IPickleDocString) = this()
    
    /** PickleDocString contentType. */
    @JSName("contentType")
    var contentType_PickleDocString: String = js.native
    
    /** PickleDocString content. */
    @JSName("content")
    var content_PickleDocString: String = js.native
    
    /**
      * Converts this PickleDocString to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object PickleDocString {
    
    /**
      * Creates a new PickleDocString instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleDocString instance
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.create")
    @js.native
    def create(): PickleDocString = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.create")
    @js.native
    def create(properties: IPickleDocString): PickleDocString = js.native
    
    /**
      * Decodes a PickleDocString message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleDocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.decode")
    @js.native
    def decode(reader: Reader): PickleDocString = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.decode")
    @js.native
    def decode(reader: Reader, length: Double): PickleDocString = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.decode")
    @js.native
    def decode(reader: Uint8Array): PickleDocString = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): PickleDocString = js.native
    
    /**
      * Decodes a PickleDocString message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleDocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): PickleDocString = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): PickleDocString = js.native
    
    /**
      * Encodes the specified PickleDocString message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleDocString.verify|verify} messages.
      * @param message PickleDocString message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.encode")
    @js.native
    def encode(message: IPickleDocString): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.encode")
    @js.native
    def encode(message: IPickleDocString, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleDocString message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleDocString.verify|verify} messages.
      * @param message PickleDocString message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleDocString): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleDocString, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleDocString message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleDocString
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): PickleDocString = js.native
    
    /**
      * Creates a plain object from a PickleDocString message. Also converts values to other types if specified.
      * @param message PickleDocString
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.toObject")
    @js.native
    def toObject(message: PickleDocString): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.toObject")
    @js.native
    def toObject(message: PickleDocString, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleDocString message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a PickleTable. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable")
  @js.native
  /**
    * Constructs a new PickleTable.
    * @param [properties] Properties to set
    */
  class PickleTable () extends IPickleTable {
    def this(properties: IPickleTable) = this()
    
    /** PickleTable rows. */
    @JSName("rows")
    var rows_PickleTable: js.Array[IPickleTableRow] = js.native
    
    /**
      * Converts this PickleTable to JSON.
      * @returns JSON object
      */
    def toJSON(): StringDictionary[js.Any] = js.native
  }
  object PickleTable {
    
    /** Represents a PickleTableRow. */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow")
    @js.native
    /**
      * Constructs a new PickleTableRow.
      * @param [properties] Properties to set
      */
    class PickleTableRow () extends IPickleTableRow {
      def this(properties: IPickleTableRow) = this()
      
      /** PickleTableRow cells. */
      @JSName("cells")
      var cells_PickleTableRow: js.Array[IPickleTableCell] = js.native
      
      /**
        * Converts this PickleTableRow to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object PickleTableRow {
      
      /** Represents a PickleTableCell. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell")
      @js.native
      /**
        * Constructs a new PickleTableCell.
        * @param [properties] Properties to set
        */
      class PickleTableCell () extends IPickleTableCell {
        def this(properties: IPickleTableCell) = this()
        
        /**
          * Converts this PickleTableCell to JSON.
          * @returns JSON object
          */
        def toJSON(): StringDictionary[js.Any] = js.native
        
        /** PickleTableCell value. */
        @JSName("value")
        var value_PickleTableCell: String = js.native
      }
      object PickleTableCell {
        
        /**
          * Creates a new PickleTableCell instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PickleTableCell instance
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.create")
        @js.native
        def create(): PickleTableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.create")
        @js.native
        def create(properties: IPickleTableCell): PickleTableCell = js.native
        
        /**
          * Decodes a PickleTableCell message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PickleTableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decode")
        @js.native
        def decode(reader: Reader): PickleTableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decode")
        @js.native
        def decode(reader: Reader, length: Double): PickleTableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decode")
        @js.native
        def decode(reader: Uint8Array): PickleTableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decode")
        @js.native
        def decode(reader: Uint8Array, length: Double): PickleTableCell = js.native
        
        /**
          * Decodes a PickleTableCell message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PickleTableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Reader): PickleTableCell = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.decodeDelimited")
        @js.native
        def decodeDelimited(reader: Uint8Array): PickleTableCell = js.native
        
        /**
          * Encodes the specified PickleTableCell message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify|verify} messages.
          * @param message PickleTableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.encode")
        @js.native
        def encode(message: IPickleTableCell): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.encode")
        @js.native
        def encode(message: IPickleTableCell, writer: Writer): Writer = js.native
        
        /**
          * Encodes the specified PickleTableCell message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify|verify} messages.
          * @param message PickleTableCell message or plain object to encode
          * @param [writer] Writer to encode to
          * @returns Writer
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.encodeDelimited")
        @js.native
        def encodeDelimited(message: IPickleTableCell): Writer = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.encodeDelimited")
        @js.native
        def encodeDelimited(message: IPickleTableCell, writer: Writer): Writer = js.native
        
        /**
          * Creates a PickleTableCell message from a plain object. Also converts values to their respective internal types.
          * @param object Plain object
          * @returns PickleTableCell
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.fromObject")
        @js.native
        def fromObject(`object`: StringDictionary[js.Any]): PickleTableCell = js.native
        
        /**
          * Creates a plain object from a PickleTableCell message. Also converts values to other types if specified.
          * @param message PickleTableCell
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.toObject")
        @js.native
        def toObject(message: PickleTableCell): StringDictionary[js.Any] = js.native
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.toObject")
        @js.native
        def toObject(message: PickleTableCell, options: IConversionOptions): StringDictionary[js.Any] = js.native
        
        /**
          * Verifies a PickleTableCell message.
          * @param message Plain object to verify
          * @returns `null` if valid, otherwise the reason why it is not
          */
        /* static member */
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify")
        @js.native
        def verify(message: StringDictionary[js.Any]): String | Null = js.native
      }
      
      /**
        * Creates a new PickleTableRow instance using the specified properties.
        * @param [properties] Properties to set
        * @returns PickleTableRow instance
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.create")
      @js.native
      def create(): PickleTableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.create")
      @js.native
      def create(properties: IPickleTableRow): PickleTableRow = js.native
      
      /**
        * Decodes a PickleTableRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns PickleTableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.decode")
      @js.native
      def decode(reader: Reader): PickleTableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.decode")
      @js.native
      def decode(reader: Reader, length: Double): PickleTableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.decode")
      @js.native
      def decode(reader: Uint8Array): PickleTableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.decode")
      @js.native
      def decode(reader: Uint8Array, length: Double): PickleTableRow = js.native
      
      /**
        * Decodes a PickleTableRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns PickleTableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): PickleTableRow = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Uint8Array): PickleTableRow = js.native
      
      /**
        * Encodes the specified PickleTableRow message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.verify|verify} messages.
        * @param message PickleTableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.encode")
      @js.native
      def encode(message: IPickleTableRow): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.encode")
      @js.native
      def encode(message: IPickleTableRow, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified PickleTableRow message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.verify|verify} messages.
        * @param message PickleTableRow message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPickleTableRow): Writer = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.encodeDelimited")
      @js.native
      def encodeDelimited(message: IPickleTableRow, writer: Writer): Writer = js.native
      
      /**
        * Creates a PickleTableRow message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns PickleTableRow
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): PickleTableRow = js.native
      
      /**
        * Creates a plain object from a PickleTableRow message. Also converts values to other types if specified.
        * @param message PickleTableRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.toObject")
      @js.native
      def toObject(message: PickleTableRow): StringDictionary[js.Any] = js.native
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.toObject")
      @js.native
      def toObject(message: PickleTableRow, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a PickleTableRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
      
      /** Properties of a PickleTableCell. */
      @js.native
      trait IPickleTableCell extends StObject {
        
        /** PickleTableCell value */
        var value: js.UndefOr[String | Null] = js.native
      }
      object IPickleTableCell {
        
        @scala.inline
        def apply(): IPickleTableCell = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IPickleTableCell]
        }
        
        @scala.inline
        implicit class IPickleTableCellMutableBuilder[Self <: IPickleTableCell] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setValueNull: Self = StObject.set(x, "value", null)
          
          @scala.inline
          def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
    }
    
    /**
      * Creates a new PickleTable instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleTable instance
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.create")
    @js.native
    def create(): PickleTable = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.create")
    @js.native
    def create(properties: IPickleTable): PickleTable = js.native
    
    /**
      * Decodes a PickleTable message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.decode")
    @js.native
    def decode(reader: Reader): PickleTable = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.decode")
    @js.native
    def decode(reader: Reader, length: Double): PickleTable = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.decode")
    @js.native
    def decode(reader: Uint8Array): PickleTable = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): PickleTable = js.native
    
    /**
      * Decodes a PickleTable message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): PickleTable = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): PickleTable = js.native
    
    /**
      * Encodes the specified PickleTable message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.verify|verify} messages.
      * @param message PickleTable message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.encode")
    @js.native
    def encode(message: IPickleTable): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.encode")
    @js.native
    def encode(message: IPickleTable, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleTable message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.verify|verify} messages.
      * @param message PickleTable message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleTable): Writer = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.encodeDelimited")
    @js.native
    def encodeDelimited(message: IPickleTable, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleTable message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleTable
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): PickleTable = js.native
    
    /**
      * Creates a plain object from a PickleTable message. Also converts values to other types if specified.
      * @param message PickleTable
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.toObject")
    @js.native
    def toObject(message: PickleTable): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.toObject")
    @js.native
    def toObject(message: PickleTable, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleTable message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
    
    /** Properties of a PickleTableRow. */
    @js.native
    trait IPickleTableRow extends StObject {
      
      /** PickleTableRow cells */
      var cells: js.UndefOr[js.Array[IPickleTableCell] | Null] = js.native
    }
    object IPickleTableRow {
      
      @scala.inline
      def apply(): IPickleTableRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IPickleTableRow]
      }
      
      @scala.inline
      implicit class IPickleTableRowMutableBuilder[Self <: IPickleTableRow] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCells(value: js.Array[IPickleTableCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCellsNull: Self = StObject.set(x, "cells", null)
        
        @scala.inline
        def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
        
        @scala.inline
        def setCellsVarargs(value: IPickleTableCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
      }
    }
  }
  
  /**
    * Creates a new PickleStepArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleStepArgument instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.create")
  @js.native
  def create(): PickleStepArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.create")
  @js.native
  def create(properties: IPickleStepArgument): PickleStepArgument = js.native
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.decode")
  @js.native
  def decode(reader: Reader): PickleStepArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.decode")
  @js.native
  def decode(reader: Reader, length: Double): PickleStepArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.decode")
  @js.native
  def decode(reader: Uint8Array): PickleStepArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): PickleStepArgument = js.native
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): PickleStepArgument = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): PickleStepArgument = js.native
  
  /**
    * Encodes the specified PickleStepArgument message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.verify|verify} messages.
    * @param message PickleStepArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.encode")
  @js.native
  def encode(message: IPickleStepArgument): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.encode")
  @js.native
  def encode(message: IPickleStepArgument, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleStepArgument message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.verify|verify} messages.
    * @param message PickleStepArgument message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickleStepArgument): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickleStepArgument, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleStepArgument message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleStepArgument
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): PickleStepArgument = js.native
  
  /**
    * Creates a plain object from a PickleStepArgument message. Also converts values to other types if specified.
    * @param message PickleStepArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.toObject")
  @js.native
  def toObject(message: PickleStepArgument): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.toObject")
  @js.native
  def toObject(message: PickleStepArgument, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleStepArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Properties of a PickleDocString. */
  @js.native
  trait IPickleDocString extends StObject {
    
    /** PickleDocString content */
    var content: js.UndefOr[String | Null] = js.native
    
    /** PickleDocString contentType */
    var contentType: js.UndefOr[String | Null] = js.native
  }
  object IPickleDocString {
    
    @scala.inline
    def apply(): IPickleDocString = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickleDocString]
    }
    
    @scala.inline
    implicit class IPickleDocStringMutableBuilder[Self <: IPickleDocString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeNull: Self = StObject.set(x, "contentType", null)
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  /** Properties of a PickleTable. */
  @js.native
  trait IPickleTable extends StObject {
    
    /** PickleTable rows */
    var rows: js.UndefOr[js.Array[IPickleTableRow] | Null] = js.native
  }
  object IPickleTable {
    
    @scala.inline
    def apply(): IPickleTable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickleTable]
    }
    
    @scala.inline
    implicit class IPickleTableMutableBuilder[Self <: IPickleTable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRows(value: js.Array[IPickleTableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsNull: Self = StObject.set(x, "rows", null)
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowsVarargs(value: IPickleTableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
}
