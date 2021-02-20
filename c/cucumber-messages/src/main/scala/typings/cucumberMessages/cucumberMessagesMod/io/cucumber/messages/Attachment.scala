package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
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
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment")
@js.native
/**
  * Constructs a new Attachment.
  * @param [properties] Properties to set
  */
class Attachment () extends IAttachment {
  def this(properties: IAttachment) = this()
  
  /** Attachment data. */
  @JSName("data")
  var data_Attachment: String = js.native
  
  /** Attachment testCaseStartedId. */
  @JSName("testCaseStartedId")
  var testCaseStartedId_Attachment: String = js.native
  
  /** Attachment testStepId. */
  @JSName("testStepId")
  var testStepId_Attachment: String = js.native
  
  /**
    * Converts this Attachment to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Attachment {
  
  /**
    * Creates a new Attachment instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Attachment instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.create")
  @js.native
  def create(): Attachment = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.create")
  @js.native
  def create(properties: IAttachment): Attachment = js.native
  
  /**
    * Decodes an Attachment message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Attachment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.decode")
  @js.native
  def decode(reader: Reader): Attachment = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.decode")
  @js.native
  def decode(reader: Reader, length: Double): Attachment = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.decode")
  @js.native
  def decode(reader: Uint8Array): Attachment = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Attachment = js.native
  
  /**
    * Decodes an Attachment message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Attachment
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Attachment = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Attachment = js.native
  
  /**
    * Encodes the specified Attachment message. Does not implicitly {@link io.cucumber.messages.Attachment.verify|verify} messages.
    * @param message Attachment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.encode")
  @js.native
  def encode(message: IAttachment): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.encode")
  @js.native
  def encode(message: IAttachment, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Attachment message, length delimited. Does not implicitly {@link io.cucumber.messages.Attachment.verify|verify} messages.
    * @param message Attachment message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAttachment): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.encodeDelimited")
  @js.native
  def encodeDelimited(message: IAttachment, writer: Writer): Writer = js.native
  
  /**
    * Creates an Attachment message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Attachment
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Attachment = js.native
  
  /**
    * Creates a plain object from an Attachment message. Also converts values to other types if specified.
    * @param message Attachment
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.toObject")
  @js.native
  def toObject(message: Attachment): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.toObject")
  @js.native
  def toObject(message: Attachment, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Attachment message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Attachment.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
