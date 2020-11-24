package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A tag */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag")
@js.native
/**
  * Constructs a new Tag.
  * @param [properties] Properties to set
  */
class Tag () extends ITag {
  def this(properties: ITag) = this()
  
  /** Tag id. */
  @JSName("id")
  var id_Tag: String = js.native
  
  /** Tag name. */
  @JSName("name")
  var name_Tag: String = js.native
  
  /**
    * Converts this Tag to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Tag")
@js.native
object Tag extends js.Object {
  
  /**
    * Creates a new Tag instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Tag instance
    */
  def create(): Tag = js.native
  def create(properties: ITag): Tag = js.native
  
  /**
    * Decodes a Tag message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Tag
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Tag = js.native
  def decode(reader: Reader, length: Double): Tag = js.native
  def decode(reader: Uint8Array): Tag = js.native
  def decode(reader: Uint8Array, length: Double): Tag = js.native
  
  /**
    * Decodes a Tag message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Tag
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Tag = js.native
  def decodeDelimited(reader: Uint8Array): Tag = js.native
  
  /**
    * Encodes the specified Tag message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
    * @param message Tag message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITag): Writer = js.native
  def encode(message: ITag, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Tag message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Tag.verify|verify} messages.
    * @param message Tag message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITag): Writer = js.native
  def encodeDelimited(message: ITag, writer: Writer): Writer = js.native
  
  /**
    * Creates a Tag message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Tag
    */
  def fromObject(`object`: StringDictionary[js.Any]): Tag = js.native
  
  /**
    * Creates a plain object from a Tag message. Also converts values to other types if specified.
    * @param message Tag
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Tag): StringDictionary[js.Any] = js.native
  def toObject(message: Tag, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Tag message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
