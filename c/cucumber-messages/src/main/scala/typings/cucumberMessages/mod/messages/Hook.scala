package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IHook
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Hook. */
@JSImport("cucumber-messages", "messages.Hook")
@js.native
/**
  * Constructs a new Hook.
  * @param [properties] Properties to set
  */
class Hook ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook {
  def this(properties: IHook) = this()
}
object Hook {
  
  /**
    * Creates a new Hook instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Hook instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Hook.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook = js.native
  @JSImport("cucumber-messages", "messages.Hook.create")
  @js.native
  def create(properties: IHook): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook = js.native
  
  /**
    * Decodes a Hook message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Hook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Hook.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook = js.native
  @JSImport("cucumber-messages", "messages.Hook.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook = js.native
  @JSImport("cucumber-messages", "messages.Hook.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook = js.native
  @JSImport("cucumber-messages", "messages.Hook.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook = js.native
  
  /**
    * Decodes a Hook message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Hook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Hook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook = js.native
  @JSImport("cucumber-messages", "messages.Hook.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook = js.native
  
  /**
    * Encodes the specified Hook message. Does not implicitly {@link io.cucumber.messages.Hook.verify|verify} messages.
    * @param message Hook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Hook.encode")
  @js.native
  def encode(message: IHook): Writer = js.native
  @JSImport("cucumber-messages", "messages.Hook.encode")
  @js.native
  def encode(message: IHook, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Hook message, length delimited. Does not implicitly {@link io.cucumber.messages.Hook.verify|verify} messages.
    * @param message Hook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Hook.encodeDelimited")
  @js.native
  def encodeDelimited(message: IHook): Writer = js.native
  @JSImport("cucumber-messages", "messages.Hook.encodeDelimited")
  @js.native
  def encodeDelimited(message: IHook, writer: Writer): Writer = js.native
  
  /**
    * Creates a Hook message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Hook
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Hook.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook = js.native
  
  /**
    * Creates a plain object from a Hook message. Also converts values to other types if specified.
    * @param message Hook
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Hook.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.Hook.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Hook,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Hook message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.Hook.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
