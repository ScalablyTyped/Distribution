package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IGeneratedExpression
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a GeneratedExpression. */
@JSImport("cucumber-messages", "messages.GeneratedExpression")
@js.native
/**
  * Constructs a new GeneratedExpression.
  * @param [properties] Properties to set
  */
class GeneratedExpression ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression {
  def this(properties: IGeneratedExpression) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.GeneratedExpression")
@js.native
object GeneratedExpression extends js.Object {
  
  /**
    * Creates a new GeneratedExpression instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GeneratedExpression instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  def create(properties: IGeneratedExpression): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  
  /**
    * Decodes a GeneratedExpression message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GeneratedExpression
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  
  /**
    * Decodes a GeneratedExpression message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GeneratedExpression
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  
  /**
    * Encodes the specified GeneratedExpression message. Does not implicitly {@link io.cucumber.messages.GeneratedExpression.verify|verify} messages.
    * @param message GeneratedExpression message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGeneratedExpression): Writer = js.native
  def encode(message: IGeneratedExpression, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified GeneratedExpression message, length delimited. Does not implicitly {@link io.cucumber.messages.GeneratedExpression.verify|verify} messages.
    * @param message GeneratedExpression message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGeneratedExpression): Writer = js.native
  def encodeDelimited(message: IGeneratedExpression, writer: Writer): Writer = js.native
  
  /**
    * Creates a GeneratedExpression message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GeneratedExpression
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression = js.native
  
  /**
    * Creates a plain object from a GeneratedExpression message. Also converts values to other types if specified.
    * @param message GeneratedExpression
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GeneratedExpression,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a GeneratedExpression message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
