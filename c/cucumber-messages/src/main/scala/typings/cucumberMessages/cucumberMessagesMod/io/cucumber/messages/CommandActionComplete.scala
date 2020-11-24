package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesStrings.snippet
import typings.cucumberMessages.cucumberMessagesStrings.testResult
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandActionComplete. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandActionComplete")
@js.native
/**
  * Constructs a new CommandActionComplete.
  * @param [properties] Properties to set
  */
class CommandActionComplete () extends ICommandActionComplete {
  def this(properties: ICommandActionComplete) = this()
  
  /** CommandActionComplete completedId. */
  @JSName("completedId")
  var completedId_CommandActionComplete: String = js.native
  
  /** CommandActionComplete result. */
  var result: js.UndefOr[testResult | snippet] = js.native
  
  /** CommandActionComplete snippet. */
  @JSName("snippet")
  var snippet_CommandActionComplete: String = js.native
  
  /**
    * Converts this CommandActionComplete to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandActionComplete")
@js.native
object CommandActionComplete extends js.Object {
  
  /**
    * Creates a new CommandActionComplete instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandActionComplete instance
    */
  def create(): CommandActionComplete = js.native
  def create(properties: ICommandActionComplete): CommandActionComplete = js.native
  
  /**
    * Decodes a CommandActionComplete message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandActionComplete
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CommandActionComplete = js.native
  def decode(reader: Reader, length: Double): CommandActionComplete = js.native
  def decode(reader: Uint8Array): CommandActionComplete = js.native
  def decode(reader: Uint8Array, length: Double): CommandActionComplete = js.native
  
  /**
    * Decodes a CommandActionComplete message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandActionComplete
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CommandActionComplete = js.native
  def decodeDelimited(reader: Uint8Array): CommandActionComplete = js.native
  
  /**
    * Encodes the specified CommandActionComplete message. Does not implicitly {@link io.cucumber.messages.CommandActionComplete.verify|verify} messages.
    * @param message CommandActionComplete message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICommandActionComplete): Writer = js.native
  def encode(message: ICommandActionComplete, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandActionComplete message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandActionComplete.verify|verify} messages.
    * @param message CommandActionComplete message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICommandActionComplete): Writer = js.native
  def encodeDelimited(message: ICommandActionComplete, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandActionComplete message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandActionComplete
    */
  def fromObject(`object`: StringDictionary[js.Any]): CommandActionComplete = js.native
  
  /**
    * Creates a plain object from a CommandActionComplete message. Also converts values to other types if specified.
    * @param message CommandActionComplete
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CommandActionComplete): StringDictionary[js.Any] = js.native
  def toObject(message: CommandActionComplete, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandActionComplete message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
