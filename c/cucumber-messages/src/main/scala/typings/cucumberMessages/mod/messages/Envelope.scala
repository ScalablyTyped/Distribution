package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IEnvelope
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All the messages that are passed between different components/processes are Envelope
  * messages.
  */
@JSImport("cucumber-messages", "messages.Envelope")
@js.native
/**
  * Constructs a new Envelope.
  * @param [properties] Properties to set
  */
class Envelope ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope {
  def this(properties: IEnvelope) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.Envelope")
@js.native
object Envelope extends js.Object {
  
  /**
    * Creates a new Envelope instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Envelope instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  def create(properties: IEnvelope): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  
  /**
    * Decodes an Envelope message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  
  /**
    * Decodes an Envelope message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  
  /**
    * Encodes the specified Envelope message. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEnvelope): Writer = js.native
  def encode(message: IEnvelope, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Envelope message, length delimited. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEnvelope): Writer = js.native
  def encodeDelimited(message: IEnvelope, writer: Writer): Writer = js.native
  
  /**
    * Creates an Envelope message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Envelope
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope = js.native
  
  /**
    * Creates a plain object from an Envelope message. Also converts values to other types if specified.
    * @param message Envelope
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Envelope,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Envelope message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
