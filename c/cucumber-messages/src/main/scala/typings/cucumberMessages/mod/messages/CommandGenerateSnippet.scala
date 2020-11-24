package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandGenerateSnippet
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandGenerateSnippet. */
@JSImport("cucumber-messages", "messages.CommandGenerateSnippet")
@js.native
/**
  * Constructs a new CommandGenerateSnippet.
  * @param [properties] Properties to set
  */
class CommandGenerateSnippet ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet {
  def this(properties: ICommandGenerateSnippet) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.CommandGenerateSnippet")
@js.native
object CommandGenerateSnippet extends js.Object {
  
  /**
    * Creates a new CommandGenerateSnippet instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandGenerateSnippet instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = js.native
  def create(properties: ICommandGenerateSnippet): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = js.native
  
  /**
    * Decodes a CommandGenerateSnippet message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandGenerateSnippet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = js.native
  
  /**
    * Decodes a CommandGenerateSnippet message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandGenerateSnippet
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = js.native
  
  /**
    * Encodes the specified CommandGenerateSnippet message. Does not implicitly {@link io.cucumber.messages.CommandGenerateSnippet.verify|verify} messages.
    * @param message CommandGenerateSnippet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICommandGenerateSnippet): Writer = js.native
  def encode(message: ICommandGenerateSnippet, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandGenerateSnippet message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandGenerateSnippet.verify|verify} messages.
    * @param message CommandGenerateSnippet message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICommandGenerateSnippet): Writer = js.native
  def encodeDelimited(message: ICommandGenerateSnippet, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandGenerateSnippet message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandGenerateSnippet
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet = js.native
  
  /**
    * Creates a plain object from a CommandGenerateSnippet message. Also converts values to other types if specified.
    * @param message CommandGenerateSnippet
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandGenerateSnippet,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandGenerateSnippet message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
