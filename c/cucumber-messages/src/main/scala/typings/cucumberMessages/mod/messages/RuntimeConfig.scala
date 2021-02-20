package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IRuntimeConfig
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RuntimeConfig. */
@JSImport("cucumber-messages", "messages.RuntimeConfig")
@js.native
/**
  * Constructs a new RuntimeConfig.
  * @param [properties] Properties to set
  */
class RuntimeConfig ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig {
  def this(properties: IRuntimeConfig) = this()
}
object RuntimeConfig {
  
  /**
    * Creates a new RuntimeConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RuntimeConfig instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.RuntimeConfig.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig = js.native
  @JSImport("cucumber-messages", "messages.RuntimeConfig.create")
  @js.native
  def create(properties: IRuntimeConfig): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig = js.native
  
  /**
    * Decodes a RuntimeConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RuntimeConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.RuntimeConfig.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig = js.native
  @JSImport("cucumber-messages", "messages.RuntimeConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig = js.native
  @JSImport("cucumber-messages", "messages.RuntimeConfig.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig = js.native
  @JSImport("cucumber-messages", "messages.RuntimeConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig = js.native
  
  /**
    * Decodes a RuntimeConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RuntimeConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.RuntimeConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig = js.native
  @JSImport("cucumber-messages", "messages.RuntimeConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig = js.native
  
  /**
    * Encodes the specified RuntimeConfig message. Does not implicitly {@link io.cucumber.messages.RuntimeConfig.verify|verify} messages.
    * @param message RuntimeConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.RuntimeConfig.encode")
  @js.native
  def encode(message: IRuntimeConfig): Writer = js.native
  @JSImport("cucumber-messages", "messages.RuntimeConfig.encode")
  @js.native
  def encode(message: IRuntimeConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified RuntimeConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.RuntimeConfig.verify|verify} messages.
    * @param message RuntimeConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.RuntimeConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRuntimeConfig): Writer = js.native
  @JSImport("cucumber-messages", "messages.RuntimeConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: IRuntimeConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a RuntimeConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RuntimeConfig
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.RuntimeConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig = js.native
  
  /**
    * Creates a plain object from a RuntimeConfig message. Also converts values to other types if specified.
    * @param message RuntimeConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.RuntimeConfig.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.RuntimeConfig.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.RuntimeConfig,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a RuntimeConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.RuntimeConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
