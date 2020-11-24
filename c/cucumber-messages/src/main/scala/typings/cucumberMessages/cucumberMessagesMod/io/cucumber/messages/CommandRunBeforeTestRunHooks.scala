package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunBeforeTestRunHooks. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestRunHooks")
@js.native
/**
  * Constructs a new CommandRunBeforeTestRunHooks.
  * @param [properties] Properties to set
  */
class CommandRunBeforeTestRunHooks () extends ICommandRunBeforeTestRunHooks {
  def this(properties: ICommandRunBeforeTestRunHooks) = this()
  
  /** CommandRunBeforeTestRunHooks actionId. */
  @JSName("actionId")
  var actionId_CommandRunBeforeTestRunHooks: String = js.native
  
  /**
    * Converts this CommandRunBeforeTestRunHooks to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestRunHooks")
@js.native
object CommandRunBeforeTestRunHooks extends js.Object {
  
  /**
    * Creates a new CommandRunBeforeTestRunHooks instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunBeforeTestRunHooks instance
    */
  def create(): CommandRunBeforeTestRunHooks = js.native
  def create(properties: ICommandRunBeforeTestRunHooks): CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Decodes a CommandRunBeforeTestRunHooks message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunBeforeTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CommandRunBeforeTestRunHooks = js.native
  def decode(reader: Reader, length: Double): CommandRunBeforeTestRunHooks = js.native
  def decode(reader: Uint8Array): CommandRunBeforeTestRunHooks = js.native
  def decode(reader: Uint8Array, length: Double): CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Decodes a CommandRunBeforeTestRunHooks message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunBeforeTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CommandRunBeforeTestRunHooks = js.native
  def decodeDelimited(reader: Uint8Array): CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestRunHooks message. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestRunHooks.verify|verify} messages.
    * @param message CommandRunBeforeTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICommandRunBeforeTestRunHooks): Writer = js.native
  def encode(message: ICommandRunBeforeTestRunHooks, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestRunHooks message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestRunHooks.verify|verify} messages.
    * @param message CommandRunBeforeTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICommandRunBeforeTestRunHooks): Writer = js.native
  def encodeDelimited(message: ICommandRunBeforeTestRunHooks, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunBeforeTestRunHooks message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunBeforeTestRunHooks
    */
  def fromObject(`object`: StringDictionary[js.Any]): CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Creates a plain object from a CommandRunBeforeTestRunHooks message. Also converts values to other types if specified.
    * @param message CommandRunBeforeTestRunHooks
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CommandRunBeforeTestRunHooks): StringDictionary[js.Any] = js.native
  def toObject(message: CommandRunBeforeTestRunHooks, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunBeforeTestRunHooks message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
