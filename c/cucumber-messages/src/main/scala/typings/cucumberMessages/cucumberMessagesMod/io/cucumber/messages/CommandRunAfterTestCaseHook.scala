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

/** Represents a CommandRunAfterTestCaseHook. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook")
@js.native
/**
  * Constructs a new CommandRunAfterTestCaseHook.
  * @param [properties] Properties to set
  */
class CommandRunAfterTestCaseHook () extends ICommandRunAfterTestCaseHook {
  def this(properties: ICommandRunAfterTestCaseHook) = this()
  
  /** CommandRunAfterTestCaseHook actionId. */
  @JSName("actionId")
  var actionId_CommandRunAfterTestCaseHook: String = js.native
  
  /** CommandRunAfterTestCaseHook hookId. */
  @JSName("hookId")
  var hookId_CommandRunAfterTestCaseHook: String = js.native
  
  /** CommandRunAfterTestCaseHook testCaseId. */
  @JSName("testCaseId")
  var testCaseId_CommandRunAfterTestCaseHook: String = js.native
  
  /**
    * Converts this CommandRunAfterTestCaseHook to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object CommandRunAfterTestCaseHook {
  
  /**
    * Creates a new CommandRunAfterTestCaseHook instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunAfterTestCaseHook instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.create")
  @js.native
  def create(): CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.create")
  @js.native
  def create(properties: ICommandRunAfterTestCaseHook): CommandRunAfterTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunAfterTestCaseHook message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunAfterTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.decode")
  @js.native
  def decode(reader: Reader): CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.decode")
  @js.native
  def decode(reader: Reader, length: Double): CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.decode")
  @js.native
  def decode(reader: Uint8Array): CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): CommandRunAfterTestCaseHook = js.native
  
  /**
    * Decodes a CommandRunAfterTestCaseHook message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunAfterTestCaseHook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): CommandRunAfterTestCaseHook = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): CommandRunAfterTestCaseHook = js.native
  
  /**
    * Encodes the specified CommandRunAfterTestCaseHook message. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestCaseHook.verify|verify} messages.
    * @param message CommandRunAfterTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.encode")
  @js.native
  def encode(message: ICommandRunAfterTestCaseHook): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.encode")
  @js.native
  def encode(message: ICommandRunAfterTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunAfterTestCaseHook message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunAfterTestCaseHook.verify|verify} messages.
    * @param message CommandRunAfterTestCaseHook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunAfterTestCaseHook): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunAfterTestCaseHook, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunAfterTestCaseHook message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunAfterTestCaseHook
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): CommandRunAfterTestCaseHook = js.native
  
  /**
    * Creates a plain object from a CommandRunAfterTestCaseHook message. Also converts values to other types if specified.
    * @param message CommandRunAfterTestCaseHook
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.toObject")
  @js.native
  def toObject(message: CommandRunAfterTestCaseHook): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.toObject")
  @js.native
  def toObject(message: CommandRunAfterTestCaseHook, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunAfterTestCaseHook message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.CommandRunAfterTestCaseHook.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
