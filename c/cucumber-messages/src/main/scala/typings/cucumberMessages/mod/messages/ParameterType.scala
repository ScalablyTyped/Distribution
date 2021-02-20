package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IParameterType
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ParameterType. */
@JSImport("cucumber-messages", "messages.ParameterType")
@js.native
/**
  * Constructs a new ParameterType.
  * @param [properties] Properties to set
  */
class ParameterType ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType {
  def this(properties: IParameterType) = this()
}
object ParameterType {
  
  /**
    * Creates a new ParameterType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ParameterType instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.ParameterType.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType = js.native
  @JSImport("cucumber-messages", "messages.ParameterType.create")
  @js.native
  def create(properties: IParameterType): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType = js.native
  
  /**
    * Decodes a ParameterType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ParameterType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.ParameterType.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType = js.native
  @JSImport("cucumber-messages", "messages.ParameterType.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType = js.native
  @JSImport("cucumber-messages", "messages.ParameterType.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType = js.native
  @JSImport("cucumber-messages", "messages.ParameterType.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType = js.native
  
  /**
    * Decodes a ParameterType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ParameterType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.ParameterType.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType = js.native
  @JSImport("cucumber-messages", "messages.ParameterType.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType = js.native
  
  /**
    * Encodes the specified ParameterType message. Does not implicitly {@link io.cucumber.messages.ParameterType.verify|verify} messages.
    * @param message ParameterType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.ParameterType.encode")
  @js.native
  def encode(message: IParameterType): Writer = js.native
  @JSImport("cucumber-messages", "messages.ParameterType.encode")
  @js.native
  def encode(message: IParameterType, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ParameterType message, length delimited. Does not implicitly {@link io.cucumber.messages.ParameterType.verify|verify} messages.
    * @param message ParameterType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.ParameterType.encodeDelimited")
  @js.native
  def encodeDelimited(message: IParameterType): Writer = js.native
  @JSImport("cucumber-messages", "messages.ParameterType.encodeDelimited")
  @js.native
  def encodeDelimited(message: IParameterType, writer: Writer): Writer = js.native
  
  /**
    * Creates a ParameterType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ParameterType
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.ParameterType.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType = js.native
  
  /**
    * Creates a plain object from a ParameterType message. Also converts values to other types if specified.
    * @param message ParameterType
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.ParameterType.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.ParameterType.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ParameterType,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ParameterType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.ParameterType.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
