package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunBeforeTestCaseHook. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook")
@js.native
/**
  * Constructs a new CommandRunBeforeTestCaseHook.
  * @param [properties] Properties to set
  */
class CommandRunBeforeTestCaseHook () extends ICommandRunBeforeTestCaseHook {
  def this(properties: ICommandRunBeforeTestCaseHook) = this()
  
  /** CommandRunBeforeTestCaseHook actionId. */
  @JSName("actionId")
  var actionId_CommandRunBeforeTestCaseHook: String = js.native
  
  /** CommandRunBeforeTestCaseHook hookId. */
  @JSName("hookId")
  var hookId_CommandRunBeforeTestCaseHook: String = js.native
  
  /** CommandRunBeforeTestCaseHook testCaseId. */
  @JSName("testCaseId")
  var testCaseId_CommandRunBeforeTestCaseHook: String = js.native
  
  /**
    * Converts this CommandRunBeforeTestCaseHook to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CommandRunBeforeTestCaseHook {
  
  /**
    * Creates a new CommandRunBeforeTestCaseHook instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunBeforeTestCaseHook instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.create")
  @js.native
  def create(): CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.create")
  @js.native
  def create(properties: ICommandRunBeforeTestCaseHook): CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunBeforeTestCaseHook message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunBeforeTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.decode")
  @js.native
  def decode(reader: Reader): CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.decode")
  @js.native
  def decode(reader: Reader, length: Double): CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.decode")
  @js.native
  def decode(reader: Uint8Array): CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunBeforeTestCaseHook message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunBeforeTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): CommandRunBeforeTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestCaseHook message. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestCaseHook.verify|verify} messages.
    * @param message CommandRunBeforeTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.encode")
  @js.native
  def encode(message: ICommandRunBeforeTestCaseHook): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.encode")
  @js.native
  def encode(message: ICommandRunBeforeTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunBeforeTestCaseHook message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunBeforeTestCaseHook.verify|verify} messages.
    * @param message CommandRunBeforeTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunBeforeTestCaseHook): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunBeforeTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunBeforeTestCaseHook message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunBeforeTestCaseHook
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): CommandRunBeforeTestCaseHook = js.native
  
  /**
    * Creates a plain object from a CommandRunBeforeTestCaseHook message. Also converts values to other types if specified.
    * @param message CommandRunBeforeTestCaseHook
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.toObject")
  @js.native
  def toObject(message: CommandRunBeforeTestCaseHook): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.toObject")
  @js.native
  def toObject(message: CommandRunBeforeTestCaseHook, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunBeforeTestCaseHook message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunBeforeTestCaseHook.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
