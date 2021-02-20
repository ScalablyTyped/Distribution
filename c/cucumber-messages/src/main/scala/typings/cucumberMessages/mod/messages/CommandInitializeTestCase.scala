package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandInitializeTestCase
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandInitializeTestCase. */
@JSImport("cucumber-messages", "messages.CommandInitializeTestCase")
@js.native
/**
  * Constructs a new CommandInitializeTestCase.
  * @param [properties] Properties to set
  */
class CommandInitializeTestCase ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase {
  def this(properties: ICommandInitializeTestCase) = this()
}
object CommandInitializeTestCase {
  
  /**
    * Creates a new CommandInitializeTestCase instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandInitializeTestCase instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase = js.native
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.create")
  @js.native
  def create(properties: ICommandInitializeTestCase): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase = js.native
  
  /**
    * Decodes a CommandInitializeTestCase message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandInitializeTestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase = js.native
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase = js.native
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase = js.native
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase = js.native
  
  /**
    * Decodes a CommandInitializeTestCase message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandInitializeTestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase = js.native
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase = js.native
  
  /**
    * Encodes the specified CommandInitializeTestCase message. Does not implicitly {@link io.cucumber.messages.CommandInitializeTestCase.verify|verify} messages.
    * @param message CommandInitializeTestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.encode")
  @js.native
  def encode(message: ICommandInitializeTestCase): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.encode")
  @js.native
  def encode(message: ICommandInitializeTestCase, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandInitializeTestCase message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandInitializeTestCase.verify|verify} messages.
    * @param message CommandInitializeTestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandInitializeTestCase): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandInitializeTestCase, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandInitializeTestCase message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandInitializeTestCase
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase = js.native
  
  /**
    * Creates a plain object from a CommandInitializeTestCase message. Also converts values to other types if specified.
    * @param message CommandInitializeTestCase
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase
  ): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandInitializeTestCase,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandInitializeTestCase message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandInitializeTestCase.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
