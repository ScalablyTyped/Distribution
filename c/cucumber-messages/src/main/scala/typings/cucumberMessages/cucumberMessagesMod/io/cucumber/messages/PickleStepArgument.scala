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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A wrapper for either a doc string or a table. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument")
@js.native
/**
  * Constructs a new PickleStepArgument.
  * @param [properties] Properties to set
  */
class PickleStepArgument ()
  extends StObject
     with IPickleStepArgument {
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
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument")
  @js.native
  val ^ : js.Any = js.native
  
  /** Represents a PickleDocString. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString")
  @js.native
  /**
    * Constructs a new PickleDocString.
    * @param [properties] Properties to set
    */
  class PickleDocString ()
    extends StObject
       with IPickleDocString {
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
    
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new PickleDocString instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleDocString instance
      */
    /* static member */
    inline def create(): PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PickleDocString]
    inline def create(properties: IPickleDocString): PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PickleDocString]
    
    /**
      * Decodes a PickleDocString message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleDocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleDocString]
    inline def decode(reader: Reader, length: Double): PickleDocString = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleDocString]
    inline def decode(reader: Uint8Array): PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleDocString]
    inline def decode(reader: Uint8Array, length: Double): PickleDocString = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleDocString]
    
    /**
      * Decodes a PickleDocString message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleDocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleDocString]
    inline def decodeDelimited(reader: Uint8Array): PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleDocString]
    
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
    inline def fromObject(`object`: StringDictionary[js.Any]): PickleDocString = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PickleDocString]
    
    /**
      * Creates a plain object from a PickleDocString message. Also converts values to other types if specified.
      * @param message PickleDocString
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: PickleDocString): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(message: PickleDocString, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a PickleDocString message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  /** Represents a PickleTable. */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable")
  @js.native
  /**
    * Constructs a new PickleTable.
    * @param [properties] Properties to set
    */
  class PickleTable ()
    extends StObject
       with IPickleTable {
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
    
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable")
    @js.native
    val ^ : js.Any = js.native
    
    /** Represents a PickleTableRow. */
    @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow")
    @js.native
    /**
      * Constructs a new PickleTableRow.
      * @param [properties] Properties to set
      */
    class PickleTableRow ()
      extends StObject
         with IPickleTableRow {
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
      
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow")
      @js.native
      val ^ : js.Any = js.native
      
      /** Represents a PickleTableCell. */
      @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell")
      @js.native
      /**
        * Constructs a new PickleTableCell.
        * @param [properties] Properties to set
        */
      class PickleTableCell ()
        extends StObject
           with IPickleTableCell {
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
        
        @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Creates a new PickleTableCell instance using the specified properties.
          * @param [properties] Properties to set
          * @returns PickleTableCell instance
          */
        /* static member */
        inline def create(): PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PickleTableCell]
        inline def create(properties: IPickleTableCell): PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PickleTableCell]
        
        /**
          * Decodes a PickleTableCell message from the specified reader or buffer.
          * @param reader Reader or buffer to decode from
          * @param [length] Message length if known beforehand
          * @returns PickleTableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decode(reader: Reader): PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTableCell]
        inline def decode(reader: Reader, length: Double): PickleTableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleTableCell]
        inline def decode(reader: Uint8Array): PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTableCell]
        inline def decode(reader: Uint8Array, length: Double): PickleTableCell = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleTableCell]
        
        /**
          * Decodes a PickleTableCell message from the specified reader or buffer, length delimited.
          * @param reader Reader or buffer to decode from
          * @returns PickleTableCell
          * @throws {Error} If the payload is not a reader or valid buffer
          * @throws {$protobuf.util.ProtocolError} If required fields are missing
          */
        /* static member */
        inline def decodeDelimited(reader: Reader): PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTableCell]
        inline def decodeDelimited(reader: Uint8Array): PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTableCell]
        
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
        inline def fromObject(`object`: StringDictionary[js.Any]): PickleTableCell = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PickleTableCell]
        
        /**
          * Creates a plain object from a PickleTableCell message. Also converts values to other types if specified.
          * @param message PickleTableCell
          * @param [options] Conversion options
          * @returns Plain object
          */
        /* static member */
        inline def toObject(message: PickleTableCell): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
        inline def toObject(message: PickleTableCell, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
        
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
      inline def create(): PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PickleTableRow]
      inline def create(properties: IPickleTableRow): PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PickleTableRow]
      
      /**
        * Decodes a PickleTableRow message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns PickleTableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decode(reader: Reader): PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTableRow]
      inline def decode(reader: Reader, length: Double): PickleTableRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleTableRow]
      inline def decode(reader: Uint8Array): PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTableRow]
      inline def decode(reader: Uint8Array, length: Double): PickleTableRow = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleTableRow]
      
      /**
        * Decodes a PickleTableRow message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns PickleTableRow
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      inline def decodeDelimited(reader: Reader): PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTableRow]
      inline def decodeDelimited(reader: Uint8Array): PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTableRow]
      
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
      inline def fromObject(`object`: StringDictionary[js.Any]): PickleTableRow = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PickleTableRow]
      
      /**
        * Creates a plain object from a PickleTableRow message. Also converts values to other types if specified.
        * @param message PickleTableRow
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      inline def toObject(message: PickleTableRow): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
      inline def toObject(message: PickleTableRow, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
      
      /**
        * Verifies a PickleTableRow message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
      
      /** Properties of a PickleTableCell. */
      trait IPickleTableCell extends StObject {
        
        /** PickleTableCell value */
        var value: js.UndefOr[String | Null] = js.undefined
      }
      object IPickleTableCell {
        
        inline def apply(): IPickleTableCell = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IPickleTableCell]
        }
        
        extension [Self <: IPickleTableCell](x: Self) {
          
          inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
          
          inline def setValueNull: Self = StObject.set(x, "value", null)
          
          inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        }
      }
    }
    
    /**
      * Creates a new PickleTable instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleTable instance
      */
    /* static member */
    inline def create(): PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PickleTable]
    inline def create(properties: IPickleTable): PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PickleTable]
    
    /**
      * Decodes a PickleTable message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decode(reader: Reader): PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTable]
    inline def decode(reader: Reader, length: Double): PickleTable = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleTable]
    inline def decode(reader: Uint8Array): PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTable]
    inline def decode(reader: Uint8Array, length: Double): PickleTable = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleTable]
    
    /**
      * Decodes a PickleTable message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    inline def decodeDelimited(reader: Reader): PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTable]
    inline def decodeDelimited(reader: Uint8Array): PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleTable]
    
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
    inline def fromObject(`object`: StringDictionary[js.Any]): PickleTable = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PickleTable]
    
    /**
      * Creates a plain object from a PickleTable message. Also converts values to other types if specified.
      * @param message PickleTable
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    inline def toObject(message: PickleTable): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
    inline def toObject(message: PickleTable, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
    
    /**
      * Verifies a PickleTable message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    /** Properties of a PickleTableRow. */
    trait IPickleTableRow extends StObject {
      
      /** PickleTableRow cells */
      var cells: js.UndefOr[js.Array[IPickleTableCell] | Null] = js.undefined
    }
    object IPickleTableRow {
      
      inline def apply(): IPickleTableRow = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IPickleTableRow]
      }
      
      extension [Self <: IPickleTableRow](x: Self) {
        
        inline def setCells(value: js.Array[IPickleTableCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
        
        inline def setCellsNull: Self = StObject.set(x, "cells", null)
        
        inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
        
        inline def setCellsVarargs(value: IPickleTableCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
      }
    }
  }
  
  /**
    * Creates a new PickleStepArgument instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleStepArgument instance
    */
  /* static member */
  inline def create(): PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PickleStepArgument]
  inline def create(properties: IPickleStepArgument): PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PickleStepArgument]
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleStepArgument]
  inline def decode(reader: Reader, length: Double): PickleStepArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleStepArgument]
  inline def decode(reader: Uint8Array): PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleStepArgument]
  inline def decode(reader: Uint8Array, length: Double): PickleStepArgument = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PickleStepArgument]
  
  /**
    * Decodes a PickleStepArgument message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleStepArgument
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleStepArgument]
  inline def decodeDelimited(reader: Uint8Array): PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PickleStepArgument]
  
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
  inline def fromObject(`object`: StringDictionary[js.Any]): PickleStepArgument = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PickleStepArgument]
  
  /**
    * Creates a plain object from a PickleStepArgument message. Also converts values to other types if specified.
    * @param message PickleStepArgument
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: PickleStepArgument): StringDictionary[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.Any]]
  inline def toObject(message: PickleStepArgument, options: IConversionOptions): StringDictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Any]]
  
  /**
    * Verifies a PickleStepArgument message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[js.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  /** Properties of a PickleDocString. */
  trait IPickleDocString extends StObject {
    
    /** PickleDocString content */
    var content: js.UndefOr[String | Null] = js.undefined
    
    /** PickleDocString contentType */
    var contentType: js.UndefOr[String | Null] = js.undefined
  }
  object IPickleDocString {
    
    inline def apply(): IPickleDocString = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickleDocString]
    }
    
    extension [Self <: IPickleDocString](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  /** Properties of a PickleTable. */
  trait IPickleTable extends StObject {
    
    /** PickleTable rows */
    var rows: js.UndefOr[js.Array[IPickleTableRow] | Null] = js.undefined
  }
  object IPickleTable {
    
    inline def apply(): IPickleTable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPickleTable]
    }
    
    extension [Self <: IPickleTable](x: Self) {
      
      inline def setRows(value: js.Array[IPickleTableRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsNull: Self = StObject.set(x, "rows", null)
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: IPickleTableRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
}
