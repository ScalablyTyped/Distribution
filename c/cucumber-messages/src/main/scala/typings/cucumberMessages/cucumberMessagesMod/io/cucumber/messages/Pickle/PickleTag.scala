package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A tag */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag")
@js.native
/**
  * Constructs a new PickleTag.
  * @param [properties] Properties to set
  */
class PickleTag () extends IPickleTag {
  def this(properties: IPickleTag) = this()
  
  /** PickleTag astNodeId. */
  @JSName("astNodeId")
  var astNodeId_PickleTag: String = js.native
  
  /** PickleTag name. */
  @JSName("name")
  var name_PickleTag: String = js.native
  
  /**
    * Converts this PickleTag to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleTag")
@js.native
object PickleTag extends js.Object {
  
  /**
    * Creates a new PickleTag instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleTag instance
    */
  def create(): PickleTag = js.native
  def create(properties: IPickleTag): PickleTag = js.native
  
  /**
    * Decodes a PickleTag message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleTag
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PickleTag = js.native
  def decode(reader: Reader, length: Double): PickleTag = js.native
  def decode(reader: Uint8Array): PickleTag = js.native
  def decode(reader: Uint8Array, length: Double): PickleTag = js.native
  
  /**
    * Decodes a PickleTag message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleTag
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PickleTag = js.native
  def decodeDelimited(reader: Uint8Array): PickleTag = js.native
  
  /**
    * Encodes the specified PickleTag message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
    * @param message PickleTag message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPickleTag): Writer = js.native
  def encode(message: IPickleTag, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleTag message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
    * @param message PickleTag message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPickleTag): Writer = js.native
  def encodeDelimited(message: IPickleTag, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleTag message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleTag
    */
  def fromObject(`object`: StringDictionary[js.Any]): PickleTag = js.native
  
  /**
    * Creates a plain object from a PickleTag message. Also converts values to other types if specified.
    * @param message PickleTag
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PickleTag): StringDictionary[js.Any] = js.native
  def toObject(message: PickleTag, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleTag message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
