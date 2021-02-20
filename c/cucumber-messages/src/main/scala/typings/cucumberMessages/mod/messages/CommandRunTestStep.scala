package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandRunTestStep
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandRunTestStep. */
@JSImport("cucumber-messages", "messages.CommandRunTestStep")
@js.native
/**
  * Constructs a new CommandRunTestStep.
  * @param [properties] Properties to set
  */
class CommandRunTestStep ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep {
  def this(properties: ICommandRunTestStep) = this()
}
object CommandRunTestStep {
  
  /**
    * Creates a new CommandRunTestStep instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandRunTestStep instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep = js.native
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.create")
  @js.native
  def create(properties: ICommandRunTestStep): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep = js.native
  
  /**
    * Decodes a CommandRunTestStep message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandRunTestStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep = js.native
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep = js.native
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep = js.native
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep = js.native
  
  /**
    * Decodes a CommandRunTestStep message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandRunTestStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep = js.native
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep = js.native
  
  /**
    * Encodes the specified CommandRunTestStep message. Does not implicitly {@link io.cucumber.messages.CommandRunTestStep.verify|verify} messages.
    * @param message CommandRunTestStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.encode")
  @js.native
  def encode(message: ICommandRunTestStep): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.encode")
  @js.native
  def encode(message: ICommandRunTestStep, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandRunTestStep message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandRunTestStep.verify|verify} messages.
    * @param message CommandRunTestStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunTestStep): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandRunTestStep, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandRunTestStep message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandRunTestStep
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep = js.native
  
  /**
    * Creates a plain object from a CommandRunTestStep message. Also converts values to other types if specified.
    * @param message CommandRunTestStep
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandRunTestStep,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandRunTestStep message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandRunTestStep.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
