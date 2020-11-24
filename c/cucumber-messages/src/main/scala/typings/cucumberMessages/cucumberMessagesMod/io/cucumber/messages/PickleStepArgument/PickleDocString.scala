package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PickleDocString. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString")
@js.native
/**
  * Constructs a new PickleDocString.
  * @param [properties] Properties to set
  */
class PickleDocString () extends IPickleDocString {
  def this(properties: IPickleDocString) = this()
  
  /** PickleDocString contentType. */
  @JSName("contentType")
  var contentType_PickleDocString: String = js.native
  
  /** PickleDocString content. */
  @JSName("content")
  var content_PickleDocString: String = js.native
  
  /**
    * Converts this PickleDocString to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleDocString")
@js.native
object PickleDocString extends js.Object {
  
  /**
    * Creates a new PickleDocString instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleDocString instance
    */
  def create(): PickleDocString = js.native
  def create(properties: IPickleDocString): PickleDocString = js.native
  
  /**
    * Decodes a PickleDocString message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleDocString
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PickleDocString = js.native
  def decode(reader: Reader, length: Double): PickleDocString = js.native
  def decode(reader: Uint8Array): PickleDocString = js.native
  def decode(reader: Uint8Array, length: Double): PickleDocString = js.native
  
  /**
    * Decodes a PickleDocString message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleDocString
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PickleDocString = js.native
  def decodeDelimited(reader: Uint8Array): PickleDocString = js.native
  
  /**
    * Encodes the specified PickleDocString message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleDocString.verify|verify} messages.
    * @param message PickleDocString message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPickleDocString): Writer = js.native
  def encode(message: IPickleDocString, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleDocString message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleDocString.verify|verify} messages.
    * @param message PickleDocString message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPickleDocString): Writer = js.native
  def encodeDelimited(message: IPickleDocString, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleDocString message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleDocString
    */
  def fromObject(`object`: StringDictionary[js.Any]): PickleDocString = js.native
  
  /**
    * Creates a plain object from a PickleDocString message. Also converts values to other types if specified.
    * @param message PickleDocString
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PickleDocString): StringDictionary[js.Any] = js.native
  def toObject(message: PickleDocString, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleDocString message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
