package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestCasePreparedStep
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCasePreparedStep. */
@JSImport("cucumber-messages", "messages.TestCasePreparedStep")
@js.native
/**
  * Constructs a new TestCasePreparedStep.
  * @param [properties] Properties to set
  */
class TestCasePreparedStep ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep {
  def this(properties: ITestCasePreparedStep) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.TestCasePreparedStep")
@js.native
object TestCasePreparedStep extends js.Object {
  
  /**
    * Creates a new TestCasePreparedStep instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCasePreparedStep instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  def create(properties: ITestCasePreparedStep): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  
  /**
    * Decodes a TestCasePreparedStep message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCasePreparedStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  
  /**
    * Decodes a TestCasePreparedStep message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCasePreparedStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  
  /**
    * Encodes the specified TestCasePreparedStep message. Does not implicitly {@link io.cucumber.messages.TestCasePreparedStep.verify|verify} messages.
    * @param message TestCasePreparedStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestCasePreparedStep): Writer = js.native
  def encode(message: ITestCasePreparedStep, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCasePreparedStep message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCasePreparedStep.verify|verify} messages.
    * @param message TestCasePreparedStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestCasePreparedStep): Writer = js.native
  def encodeDelimited(message: ITestCasePreparedStep, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCasePreparedStep message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCasePreparedStep
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep = js.native
  
  /**
    * Creates a plain object from a TestCasePreparedStep message. Also converts values to other types if specified.
    * @param message TestCasePreparedStep
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCasePreparedStep,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCasePreparedStep message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
