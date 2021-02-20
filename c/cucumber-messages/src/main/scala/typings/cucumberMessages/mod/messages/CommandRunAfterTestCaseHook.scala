package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandRunAfterTestCaseHook
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunAfterTestCaseHook. */
@JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook")
@js.native
/**
  * Constructs a new CommandRunAfterTestCaseHook.
  * @param [properties] Properties to set
  */
class CommandRunAfterTestCaseHook ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook {
  def this(properties: ICommandRunAfterTestCaseHook) = this()
}
object CommandRunAfterTestCaseHook {
  
  /**
    * Creates a new CommandRunAfterTestCaseHook instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunAfterTestCaseHook instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.create")
  @js.native
  def create(properties: ICommandRunAfterTestCaseHook): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunAfterTestCaseHook message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunAfterTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunAfterTestCaseHook message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunAfterTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook = js.native
  
  /**
    * Encodes the specified CommandRunAfterTestCaseHook message. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestCaseHook.verify|verify} messages.
    * @param message CommandRunAfterTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.encode")
  @js.native
  def encode(message: ICommandRunAfterTestCaseHook): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.encode")
  @js.native
  def encode(message: ICommandRunAfterTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunAfterTestCaseHook message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestCaseHook.verify|verify} messages.
    * @param message CommandRunAfterTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunAfterTestCaseHook): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunAfterTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunAfterTestCaseHook message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunAfterTestCaseHook
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook = js.native
  
  /**
    * Creates a plain object from a CommandRunAfterTestCaseHook message. Also converts values to other types if specified.
    * @param message CommandRunAfterTestCaseHook
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook
  ): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunAfterTestCaseHook,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunAfterTestCaseHook message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunAfterTestCaseHook.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
