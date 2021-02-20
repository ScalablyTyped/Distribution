package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandRunBeforeTestRunHooks
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunBeforeTestRunHooks. */
@JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks")
@js.native
/**
  * Constructs a new CommandRunBeforeTestRunHooks.
  * @param [properties] Properties to set
  */
class CommandRunBeforeTestRunHooks ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks {
  def this(properties: ICommandRunBeforeTestRunHooks) = this()
}
object CommandRunBeforeTestRunHooks {
  
  /**
    * Creates a new CommandRunBeforeTestRunHooks instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunBeforeTestRunHooks instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.create")
  @js.native
  def create(properties: ICommandRunBeforeTestRunHooks): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Decodes a CommandRunBeforeTestRunHooks message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunBeforeTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Decodes a CommandRunBeforeTestRunHooks message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunBeforeTestRunHooks
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestRunHooks message. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestRunHooks.verify|verify} messages.
    * @param message CommandRunBeforeTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.encode")
  @js.native
  def encode(message: ICommandRunBeforeTestRunHooks): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.encode")
  @js.native
  def encode(message: ICommandRunBeforeTestRunHooks, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestRunHooks message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestRunHooks.verify|verify} messages.
    * @param message CommandRunBeforeTestRunHooks message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunBeforeTestRunHooks): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunBeforeTestRunHooks, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunBeforeTestRunHooks message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunBeforeTestRunHooks
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks = js.native
  
  /**
    * Creates a plain object from a CommandRunBeforeTestRunHooks message. Also converts values to other types if specified.
    * @param message CommandRunBeforeTestRunHooks
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks
  ): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunBeforeTestRunHooks,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunBeforeTestRunHooks message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunBeforeTestRunHooks.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
