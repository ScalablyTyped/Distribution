package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PickleRejected. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected")
@js.native
/**
  * Constructs a new PickleRejected.
  * @param [properties] Properties to set
  */
class PickleRejected () extends IPickleRejected {
  def this(properties: IPickleRejected) = this()
  
  /** PickleRejected pickleId. */
  @JSName("pickleId")
  var pickleId_PickleRejected: String = js.native
  
  /**
    * Converts this PickleRejected to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected")
@js.native
object PickleRejected extends js.Object {
  
  /**
    * Creates a new PickleRejected instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleRejected instance
    */
  def create(): PickleRejected = js.native
  def create(properties: IPickleRejected): PickleRejected = js.native
  
  /**
    * Decodes a PickleRejected message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleRejected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PickleRejected = js.native
  def decode(reader: Reader, length: Double): PickleRejected = js.native
  def decode(reader: Uint8Array): PickleRejected = js.native
  def decode(reader: Uint8Array, length: Double): PickleRejected = js.native
  
  /**
    * Decodes a PickleRejected message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleRejected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PickleRejected = js.native
  def decodeDelimited(reader: Uint8Array): PickleRejected = js.native
  
  /**
    * Encodes the specified PickleRejected message. Does not implicitly {@link io.cucumber.messages.PickleRejected.verify|verify} messages.
    * @param message PickleRejected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPickleRejected): Writer = js.native
  def encode(message: IPickleRejected, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleRejected message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleRejected.verify|verify} messages.
    * @param message PickleRejected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPickleRejected): Writer = js.native
  def encodeDelimited(message: IPickleRejected, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleRejected message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleRejected
    */
  def fromObject(`object`: StringDictionary[js.Any]): PickleRejected = js.native
  
  /**
    * Creates a plain object from a PickleRejected message. Also converts values to other types if specified.
    * @param message PickleRejected
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PickleRejected): StringDictionary[js.Any] = js.native
  def toObject(message: PickleRejected, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleRejected message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
