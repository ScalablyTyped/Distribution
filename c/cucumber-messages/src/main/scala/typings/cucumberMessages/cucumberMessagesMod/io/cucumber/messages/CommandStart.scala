package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandStart. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandStart")
@js.native
/**
  * Constructs a new CommandStart.
  * @param [properties] Properties to set
  */
class CommandStart () extends ICommandStart {
  def this(properties: ICommandStart) = this()
  
  /** CommandStart baseDirectory. */
  @JSName("baseDirectory")
  var baseDirectory_CommandStart: String = js.native
  
  /**
    * Converts this CommandStart to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandStart")
@js.native
object CommandStart extends js.Object {
  
  /**
    * Creates a new CommandStart instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandStart instance
    */
  def create(): CommandStart = js.native
  def create(properties: ICommandStart): CommandStart = js.native
  
  /**
    * Decodes a CommandStart message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandStart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CommandStart = js.native
  def decode(reader: Reader, length: Double): CommandStart = js.native
  def decode(reader: Uint8Array): CommandStart = js.native
  def decode(reader: Uint8Array, length: Double): CommandStart = js.native
  
  /**
    * Decodes a CommandStart message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandStart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CommandStart = js.native
  def decodeDelimited(reader: Uint8Array): CommandStart = js.native
  
  /**
    * Encodes the specified CommandStart message. Does not implicitly {@link io.cucumber.messages.CommandStart.verify|verify} messages.
    * @param message CommandStart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICommandStart): Writer = js.native
  def encode(message: ICommandStart, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandStart message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandStart.verify|verify} messages.
    * @param message CommandStart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICommandStart): Writer = js.native
  def encodeDelimited(message: ICommandStart, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandStart message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandStart
    */
  def fromObject(`object`: StringDictionary[js.Any]): CommandStart = js.native
  
  /**
    * Creates a plain object from a CommandStart message. Also converts values to other types if specified.
    * @param message CommandStart
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CommandStart): StringDictionary[js.Any] = js.native
  def toObject(message: CommandStart, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandStart message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
