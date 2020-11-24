package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Hook. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Hook")
@js.native
/**
  * Constructs a new Hook.
  * @param [properties] Properties to set
  */
class Hook () extends IHook {
  def this(properties: IHook) = this()
  
  /** Hook id. */
  @JSName("id")
  var id_Hook: String = js.native
  
  /** Hook tagExpression. */
  @JSName("tagExpression")
  var tagExpression_Hook: String = js.native
  
  /**
    * Converts this Hook to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Hook")
@js.native
object Hook extends js.Object {
  
  /**
    * Creates a new Hook instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Hook instance
    */
  def create(): Hook = js.native
  def create(properties: IHook): Hook = js.native
  
  /**
    * Decodes a Hook message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Hook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Hook = js.native
  def decode(reader: Reader, length: Double): Hook = js.native
  def decode(reader: Uint8Array): Hook = js.native
  def decode(reader: Uint8Array, length: Double): Hook = js.native
  
  /**
    * Decodes a Hook message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Hook
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Hook = js.native
  def decodeDelimited(reader: Uint8Array): Hook = js.native
  
  /**
    * Encodes the specified Hook message. Does not implicitly {@link io.cucumber.messages.Hook.verify|verify} messages.
    * @param message Hook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IHook): Writer = js.native
  def encode(message: IHook, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Hook message, length delimited. Does not implicitly {@link io.cucumber.messages.Hook.verify|verify} messages.
    * @param message Hook message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IHook): Writer = js.native
  def encodeDelimited(message: IHook, writer: Writer): Writer = js.native
  
  /**
    * Creates a Hook message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Hook
    */
  def fromObject(`object`: StringDictionary[js.Any]): Hook = js.native
  
  /**
    * Creates a plain object from a Hook message. Also converts values to other types if specified.
    * @param message Hook
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Hook): StringDictionary[js.Any] = js.native
  def toObject(message: Hook, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Hook message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
