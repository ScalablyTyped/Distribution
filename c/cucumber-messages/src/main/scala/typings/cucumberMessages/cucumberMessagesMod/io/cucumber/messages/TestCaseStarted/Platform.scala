package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Platform. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform")
@js.native
/**
  * Constructs a new Platform.
  * @param [properties] Properties to set
  */
class Platform () extends IPlatform {
  def this(properties: IPlatform) = this()
  
  /** Platform cpu. */
  @JSName("cpu")
  var cpu_Platform: String = js.native
  
  /** Platform implementation. */
  @JSName("implementation")
  var implementation_Platform: String = js.native
  
  /** Platform os. */
  @JSName("os")
  var os_Platform: String = js.native
  
  /**
    * Converts this Platform to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Platform version. */
  @JSName("version")
  var version_Platform: String = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCaseStarted.Platform")
@js.native
object Platform extends js.Object {
  
  /**
    * Creates a new Platform instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Platform instance
    */
  def create(): Platform = js.native
  def create(properties: IPlatform): Platform = js.native
  
  /**
    * Decodes a Platform message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Platform
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Platform = js.native
  def decode(reader: Reader, length: Double): Platform = js.native
  def decode(reader: Uint8Array): Platform = js.native
  def decode(reader: Uint8Array, length: Double): Platform = js.native
  
  /**
    * Decodes a Platform message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Platform
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Platform = js.native
  def decodeDelimited(reader: Uint8Array): Platform = js.native
  
  /**
    * Encodes the specified Platform message. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.Platform.verify|verify} messages.
    * @param message Platform message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPlatform): Writer = js.native
  def encode(message: IPlatform, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Platform message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.Platform.verify|verify} messages.
    * @param message Platform message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPlatform): Writer = js.native
  def encodeDelimited(message: IPlatform, writer: Writer): Writer = js.native
  
  /**
    * Creates a Platform message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Platform
    */
  def fromObject(`object`: StringDictionary[js.Any]): Platform = js.native
  
  /**
    * Creates a plain object from a Platform message. Also converts values to other types if specified.
    * @param message Platform
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Platform): StringDictionary[js.Any] = js.native
  def toObject(message: Platform, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Platform message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
