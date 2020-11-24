package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IAttachment
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An attachment represents any kind of data associated with a line in a
  * [Source](#io.cucumber.messages.Source) file. It can be used for:
  *
  * * Syntax errors during parse time
  * * Screenshots captured and attached during execution
  * * Logs captured and attached during execution
  *
  * It is not to be used for runtime errors raised/thrown during execution. This
  * is captured in `TestResult`.
  */
@JSImport("cucumber-messages", "messages.Attachment")
@js.native
/**
  * Constructs a new Attachment.
  * @param [properties] Properties to set
  */
class Attachment ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment {
  def this(properties: IAttachment) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.Attachment")
@js.native
object Attachment extends js.Object {
  
  /**
    * Creates a new Attachment instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Attachment instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment = js.native
  def create(properties: IAttachment): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment = js.native
  
  /**
    * Decodes an Attachment message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Attachment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment = js.native
  
  /**
    * Decodes an Attachment message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Attachment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment = js.native
  
  /**
    * Encodes the specified Attachment message. Does not implicitly {@link io.cucumber.messages.Attachment.verify|verify} messages.
    * @param message Attachment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IAttachment): Writer = js.native
  def encode(message: IAttachment, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Attachment message, length delimited. Does not implicitly {@link io.cucumber.messages.Attachment.verify|verify} messages.
    * @param message Attachment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IAttachment): Writer = js.native
  def encodeDelimited(message: IAttachment, writer: Writer): Writer = js.native
  
  /**
    * Creates an Attachment message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Attachment
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment = js.native
  
  /**
    * Creates a plain object from an Attachment message. Also converts values to other types if specified.
    * @param message Attachment
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Attachment,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Attachment message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
