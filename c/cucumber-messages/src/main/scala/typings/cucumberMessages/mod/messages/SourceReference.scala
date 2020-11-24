package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ISourceReference
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Points to a [Source](#io.cucumber.messages.Source) identified by `uri` and a
  * [Location](#io.cucumber.messages.Location) within that file.
  */
@JSImport("cucumber-messages", "messages.SourceReference")
@js.native
/**
  * Constructs a new SourceReference.
  * @param [properties] Properties to set
  */
class SourceReference ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference {
  def this(properties: ISourceReference) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.SourceReference")
@js.native
object SourceReference extends js.Object {
  
  /**
    * Creates a new SourceReference instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourceReference instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  def create(properties: ISourceReference): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  
  /**
    * Decodes a SourceReference message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourceReference
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  
  /**
    * Decodes a SourceReference message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourceReference
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  
  /**
    * Encodes the specified SourceReference message. Does not implicitly {@link io.cucumber.messages.SourceReference.verify|verify} messages.
    * @param message SourceReference message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISourceReference): Writer = js.native
  def encode(message: ISourceReference, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourceReference message, length delimited. Does not implicitly {@link io.cucumber.messages.SourceReference.verify|verify} messages.
    * @param message SourceReference message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISourceReference): Writer = js.native
  def encodeDelimited(message: ISourceReference, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourceReference message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceReference
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference = js.native
  
  /**
    * Creates a plain object from a SourceReference message. Also converts values to other types if specified.
    * @param message SourceReference
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.SourceReference,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourceReference message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
