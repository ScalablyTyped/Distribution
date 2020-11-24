package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DocString. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString")
@js.native
/**
  * Constructs a new DocString.
  * @param [properties] Properties to set
  */
class DocString () extends IDocString {
  def this(properties: IDocString) = this()
  
  /** DocString contentType. */
  @JSName("contentType")
  var contentType_DocString: String = js.native
  
  /** DocString content. */
  @JSName("content")
  var content_DocString: String = js.native
  
  /** DocString delimiter. */
  @JSName("delimiter")
  var delimiter_DocString: String = js.native
  
  /**
    * Converts this DocString to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DocString")
@js.native
object DocString extends js.Object {
  
  /**
    * Creates a new DocString instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DocString instance
    */
  def create(): DocString = js.native
  def create(properties: IDocString): DocString = js.native
  
  /**
    * Decodes a DocString message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DocString
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DocString = js.native
  def decode(reader: Reader, length: Double): DocString = js.native
  def decode(reader: Uint8Array): DocString = js.native
  def decode(reader: Uint8Array, length: Double): DocString = js.native
  
  /**
    * Decodes a DocString message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DocString
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DocString = js.native
  def decodeDelimited(reader: Uint8Array): DocString = js.native
  
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
  def fromObject(`object`: StringDictionary[js.Any]): DocString = js.native
  
  /**
    * Creates a plain object from a DocString message. Also converts values to other types if specified.
    * @param message DocString
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DocString): StringDictionary[js.Any] = js.native
  def toObject(message: DocString, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DocString message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
