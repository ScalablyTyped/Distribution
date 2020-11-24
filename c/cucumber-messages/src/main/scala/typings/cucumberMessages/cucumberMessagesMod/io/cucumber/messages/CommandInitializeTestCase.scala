package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandInitializeTestCase. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandInitializeTestCase")
@js.native
/**
  * Constructs a new CommandInitializeTestCase.
  * @param [properties] Properties to set
  */
class CommandInitializeTestCase () extends ICommandInitializeTestCase {
  def this(properties: ICommandInitializeTestCase) = this()
  
  /** CommandInitializeTestCase actionId. */
  @JSName("actionId")
  var actionId_CommandInitializeTestCase: String = js.native
  
  /**
    * Converts this CommandInitializeTestCase to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandInitializeTestCase")
@js.native
object CommandInitializeTestCase extends js.Object {
  
  /**
    * Creates a new CommandInitializeTestCase instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandInitializeTestCase instance
    */
  def create(): CommandInitializeTestCase = js.native
  def create(properties: ICommandInitializeTestCase): CommandInitializeTestCase = js.native
  
  /**
    * Decodes a CommandInitializeTestCase message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandInitializeTestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): CommandInitializeTestCase = js.native
  def decode(reader: Reader, length: Double): CommandInitializeTestCase = js.native
  def decode(reader: Uint8Array): CommandInitializeTestCase = js.native
  def decode(reader: Uint8Array, length: Double): CommandInitializeTestCase = js.native
  
  /**
    * Decodes a CommandInitializeTestCase message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandInitializeTestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): CommandInitializeTestCase = js.native
  def decodeDelimited(reader: Uint8Array): CommandInitializeTestCase = js.native
  
  /**
    * Encodes the specified CommandInitializeTestCase message. Does not implicitly {@link io.cucumber.messages.CommandInitializeTestCase.verify|verify} messages.
    * @param message CommandInitializeTestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICommandInitializeTestCase): Writer = js.native
  def encode(message: ICommandInitializeTestCase, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandInitializeTestCase message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandInitializeTestCase.verify|verify} messages.
    * @param message CommandInitializeTestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICommandInitializeTestCase): Writer = js.native
  def encodeDelimited(message: ICommandInitializeTestCase, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandInitializeTestCase message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandInitializeTestCase
    */
  def fromObject(`object`: StringDictionary[js.Any]): CommandInitializeTestCase = js.native
  
  /**
    * Creates a plain object from a CommandInitializeTestCase message. Also converts values to other types if specified.
    * @param message CommandInitializeTestCase
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: CommandInitializeTestCase): StringDictionary[js.Any] = js.native
  def toObject(message: CommandInitializeTestCase, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandInitializeTestCase message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
