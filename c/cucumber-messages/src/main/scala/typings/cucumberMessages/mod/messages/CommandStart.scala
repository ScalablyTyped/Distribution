package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ICommandStart
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a CommandStart. */
@JSImport("cucumber-messages", "messages.CommandStart")
@js.native
/**
  * Constructs a new CommandStart.
  * @param [properties] Properties to set
  */
class CommandStart ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart {
  def this(properties: ICommandStart) = this()
}
object CommandStart {
  
  /**
    * Creates a new CommandStart instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CommandStart instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandStart.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  @JSImport("cucumber-messages", "messages.CommandStart.create")
  @js.native
  def create(properties: ICommandStart): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  
  /**
    * Decodes a CommandStart message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CommandStart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandStart.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  @JSImport("cucumber-messages", "messages.CommandStart.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  @JSImport("cucumber-messages", "messages.CommandStart.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  @JSImport("cucumber-messages", "messages.CommandStart.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  
  /**
    * Decodes a CommandStart message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CommandStart
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandStart.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  @JSImport("cucumber-messages", "messages.CommandStart.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  
  /**
    * Encodes the specified CommandStart message. Does not implicitly {@link io.cucumber.messages.CommandStart.verify|verify} messages.
    * @param message CommandStart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandStart.encode")
  @js.native
  def encode(message: ICommandStart): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandStart.encode")
  @js.native
  def encode(message: ICommandStart, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified CommandStart message, length delimited. Does not implicitly {@link io.cucumber.messages.CommandStart.verify|verify} messages.
    * @param message CommandStart message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandStart.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandStart): Writer = js.native
  @JSImport("cucumber-messages", "messages.CommandStart.encodeDelimited")
  @js.native
  def encodeDelimited(message: ICommandStart, writer: Writer): Writer = js.native
  
  /**
    * Creates a CommandStart message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CommandStart
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandStart.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart = js.native
  
  /**
    * Creates a plain object from a CommandStart message. Also converts values to other types if specified.
    * @param message CommandStart
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandStart.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.CommandStart.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.CommandStart,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a CommandStart message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.CommandStart.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
