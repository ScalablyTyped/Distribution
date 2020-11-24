package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Scenario

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITableRow
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITag
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an Examples. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples")
@js.native
/**
  * Constructs a new Examples.
  * @param [properties] Properties to set
  */
class Examples () extends IExamples {
  def this(properties: IExamples) = this()
  
  /** Examples description. */
  @JSName("description")
  var description_Examples: String = js.native
  
  /** Examples keyword. */
  @JSName("keyword")
  var keyword_Examples: String = js.native
  
  /** Examples name. */
  @JSName("name")
  var name_Examples: String = js.native
  
  /** Examples tableBody. */
  @JSName("tableBody")
  var tableBody_Examples: js.Array[ITableRow] = js.native
  
  /** Examples tags. */
  @JSName("tags")
  var tags_Examples: js.Array[ITag] = js.native
  
  /**
    * Converts this Examples to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples")
@js.native
object Examples extends js.Object {
  
  /**
    * Creates a new Examples instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Examples instance
    */
  def create(): Examples = js.native
  def create(properties: IExamples): Examples = js.native
  
  /**
    * Decodes an Examples message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Examples
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Examples = js.native
  def decode(reader: Reader, length: Double): Examples = js.native
  def decode(reader: Uint8Array): Examples = js.native
  def decode(reader: Uint8Array, length: Double): Examples = js.native
  
  /**
    * Decodes an Examples message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Examples
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Examples = js.native
  def decodeDelimited(reader: Uint8Array): Examples = js.native
  
  /**
    * Encodes the specified Examples message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
    * @param message Examples message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IExamples): Writer = js.native
  def encode(message: IExamples, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Examples message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Scenario.Examples.verify|verify} messages.
    * @param message Examples message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IExamples): Writer = js.native
  def encodeDelimited(message: IExamples, writer: Writer): Writer = js.native
  
  /**
    * Creates an Examples message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Examples
    */
  def fromObject(`object`: StringDictionary[js.Any]): Examples = js.native
  
  /**
    * Creates a plain object from an Examples message. Also converts values to other types if specified.
    * @param message Examples
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Examples): StringDictionary[js.Any] = js.native
  def toObject(message: Examples, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Examples message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
