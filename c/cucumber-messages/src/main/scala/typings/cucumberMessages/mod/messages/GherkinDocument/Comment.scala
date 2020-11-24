package typings.cucumberMessages.mod.messages.GherkinDocument

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.IComment
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A comment in a Gherkin document */
@JSImport("cucumber-messages", "messages.GherkinDocument.Comment")
@js.native
/**
  * Constructs a new Comment.
  * @param [properties] Properties to set
  */
class Comment ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment {
  def this(properties: IComment) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.GherkinDocument.Comment")
@js.native
object Comment extends js.Object {
  
  /**
    * Creates a new Comment instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Comment instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment = js.native
  def create(properties: IComment): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment = js.native
  
  /**
    * Decodes a Comment message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Comment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment = js.native
  
  /**
    * Decodes a Comment message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Comment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment = js.native
  
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
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment = js.native
  
  /**
    * Creates a plain object from a Comment message. Also converts values to other types if specified.
    * @param message Comment
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Comment,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Comment message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
