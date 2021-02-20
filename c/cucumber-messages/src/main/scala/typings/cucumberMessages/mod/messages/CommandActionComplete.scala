package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandActionComplete
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandActionComplete. */
@JSImport("cucumber-messages", "messages.CommandActionComplete")
@js.native
/**
  * Constructs a new CommandActionComplete.
  * @param [properties] Properties to set
  */
class CommandActionComplete ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete {
  def this(properties: ICommandActionComplete) = this()
}
object CommandActionComplete {
  
  /**
    * Creates a new CommandActionComplete instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandActionComplete instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandActionComplete.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete = js.native
  @JSImport("cucumber-messages", "messages.CommandActionComplete.create")
  @js.native
  def create(properties: ICommandActionComplete): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete = js.native
  
  /**
    * Decodes a CommandActionComplete message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandActionComplete
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandActionComplete.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete = js.native
  @JSImport("cucumber-messages", "messages.CommandActionComplete.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete = js.native
  @JSImport("cucumber-messages", "messages.CommandActionComplete.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete = js.native
  @JSImport("cucumber-messages", "messages.CommandActionComplete.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete = js.native
  
  /**
    * Decodes a CommandActionComplete message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandActionComplete
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandActionComplete.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete = js.native
  @JSImport("cucumber-messages", "messages.CommandActionComplete.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete = js.native
  
  /**
    * Encodes the specified CommandActionComplete message. Does not implicitly {@link io.cucumber.messages.CommandActionComplete.verify|verify} messages.
    * @param message CommandActionComplete message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandActionComplete.encode")
  @js.native
  def encode(message: ICommandActionComplete): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandActionComplete.encode")
  @js.native
  def encode(message: ICommandActionComplete, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandActionComplete message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandActionComplete.verify|verify} messages.
    * @param message CommandActionComplete message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandActionComplete.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandActionComplete): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandActionComplete.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandActionComplete, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandActionComplete message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandActionComplete
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandActionComplete.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete = js.native
  
  /**
    * Creates a plain object from a CommandActionComplete message. Also converts values to other types if specified.
    * @param message CommandActionComplete
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandActionComplete.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.CommandActionComplete.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandActionComplete,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandActionComplete message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandActionComplete.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
