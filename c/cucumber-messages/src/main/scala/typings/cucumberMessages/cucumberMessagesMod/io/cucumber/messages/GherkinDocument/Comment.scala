package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A comment in a Gherkin document */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment")
@js.native
/**
  * Constructs a new Comment.
  * @param [properties] Properties to set
  */
class Comment () extends IComment {
  def this(properties: IComment) = this()
  
  /** Comment text. */
  @JSName("text")
  var text_Comment: String = js.native
  
  /**
    * Converts this Comment to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Comment")
@js.native
object Comment extends js.Object {
  
  /**
    * Creates a new Comment instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Comment instance
    */
  def create(): Comment = js.native
  def create(properties: IComment): Comment = js.native
  
  /**
    * Decodes a Comment message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Comment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Comment = js.native
  def decode(reader: Reader, length: Double): Comment = js.native
  def decode(reader: Uint8Array): Comment = js.native
  def decode(reader: Uint8Array, length: Double): Comment = js.native
  
  /**
    * Decodes a Comment message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Comment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Comment = js.native
  def decodeDelimited(reader: Uint8Array): Comment = js.native
  
  /**
    * Encodes the specified Comment message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Comment.verify|verify} messages.
    * @param message Comment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IComment): Writer = js.native
  def encode(message: IComment, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Comment message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Comment.verify|verify} messages.
    * @param message Comment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IComment): Writer = js.native
  def encodeDelimited(message: IComment, writer: Writer): Writer = js.native
  
  /**
    * Creates a Comment message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Comment
    */
  def fromObject(`object`: StringDictionary[js.Any]): Comment = js.native
  
  /**
    * Creates a plain object from a Comment message. Also converts values to other types if specified.
    * @param message Comment
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Comment): StringDictionary[js.Any] = js.native
  def toObject(message: Comment, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Comment message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
