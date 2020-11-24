package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestRunStarted
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestRunStarted. */
@JSImport("cucumber-messages", "messages.TestRunStarted")
@js.native
/**
  * Constructs a new TestRunStarted.
  * @param [properties] Properties to set
  */
class TestRunStarted ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted {
  def this(properties: ITestRunStarted) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.TestRunStarted")
@js.native
object TestRunStarted extends js.Object {
  
  /**
    * Creates a new TestRunStarted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestRunStarted instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted = js.native
  def create(properties: ITestRunStarted): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted = js.native
  
  /**
    * Decodes a TestRunStarted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestRunStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted = js.native
  
  /**
    * Decodes a TestRunStarted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestRunStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted = js.native
  
  /**
    * Encodes the specified TestRunStarted message. Does not implicitly {@link io.cucumber.messages.TestRunStarted.verify|verify} messages.
    * @param message TestRunStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestRunStarted): Writer = js.native
  def encode(message: ITestRunStarted, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestRunStarted message, length delimited. Does not implicitly {@link io.cucumber.messages.TestRunStarted.verify|verify} messages.
    * @param message TestRunStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestRunStarted): Writer = js.native
  def encodeDelimited(message: ITestRunStarted, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestRunStarted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestRunStarted
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted = js.native
  
  /**
    * Creates a plain object from a TestRunStarted message. Also converts values to other types if specified.
    * @param message TestRunStarted
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestRunStarted,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestRunStarted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
