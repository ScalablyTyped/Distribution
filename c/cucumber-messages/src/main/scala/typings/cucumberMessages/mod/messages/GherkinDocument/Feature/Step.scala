package typings.cucumberMessages.mod.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.IStep
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDataTable
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.IDocString
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Step. */
@JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step")
@js.native
/**
  * Constructs a new Step.
  * @param [properties] Properties to set
  */
class Step ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step {
  def this(properties: IStep) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.GherkinDocument.Feature.Step")
@js.native
object Step extends js.Object {
  
  /**
    * Creates a new Step instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Step instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
  def create(properties: IStep): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
  
  /**
    * Decodes a Step message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Step
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
  
  /**
    * Decodes a Step message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Step
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
  
  /**
    * Encodes the specified Step message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.verify|verify} messages.
    * @param message Step message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStep): Writer = js.native
  def encode(message: IStep, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Step message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.verify|verify} messages.
    * @param message Step message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStep): Writer = js.native
  def encodeDelimited(message: IStep, writer: Writer): Writer = js.native
  
  /**
    * Creates a Step message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Step
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step = js.native
  
  /**
    * Creates a plain object from a Step message. Also converts values to other types if specified.
    * @param message Step
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Step message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Represents a DataTable. */
  @js.native
  /**
    * Constructs a new DataTable.
    * @param [properties] Properties to set
    */
  class DataTable ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable {
    def this(properties: IDataTable) = this()
  }
  /* static members */
  @js.native
  object DataTable extends js.Object {
    
    /**
      * Creates a new DataTable instance using the specified properties.
      * @param [properties] Properties to set
      * @returns DataTable instance
      */
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
    def create(properties: IDataTable): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
    
    /**
      * Decodes a DataTable message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns DataTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
    
    /**
      * Decodes a DataTable message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns DataTable
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
    
    /**
      * Encodes the specified DataTable message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
      * @param message DataTable message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IDataTable): Writer = js.native
    def encode(message: IDataTable, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified DataTable message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
      * @param message DataTable message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IDataTable): Writer = js.native
    def encodeDelimited(message: IDataTable, writer: Writer): Writer = js.native
    
    /**
      * Creates a DataTable message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns DataTable
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable = js.native
    
    /**
      * Creates a plain object from a DataTable message. Also converts values to other types if specified.
      * @param message DataTable
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable
    ): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DataTable,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a DataTable message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a DocString. */
  @js.native
  /**
    * Constructs a new DocString.
    * @param [properties] Properties to set
    */
  class DocString ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString {
    def this(properties: IDocString) = this()
  }
  /* static members */
  @js.native
  object DocString extends js.Object {
    
    /**
      * Creates a new DocString instance using the specified properties.
      * @param [properties] Properties to set
      * @returns DocString instance
      */
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
    def create(properties: IDocString): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
    
    /**
      * Decodes a DocString message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns DocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
    
    /**
      * Decodes a DocString message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns DocString
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
    
    /**
      * Encodes the specified DocString message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DocString.verify|verify} messages.
      * @param message DocString message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IDocString): Writer = js.native
    def encode(message: IDocString, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified DocString message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DocString.verify|verify} messages.
      * @param message DocString message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IDocString): Writer = js.native
    def encodeDelimited(message: IDocString, writer: Writer): Writer = js.native
    
    /**
      * Creates a DocString message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns DocString
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString = js.native
    
    /**
      * Creates a plain object from a DocString message. Also converts values to other types if specified.
      * @param message DocString
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString
    ): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step.DocString,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a DocString message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
