package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCasePrepared. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePrepared")
@js.native
/**
  * Constructs a new TestCasePrepared.
  * @param [properties] Properties to set
  */
class TestCasePrepared () extends ITestCasePrepared {
  def this(properties: ITestCasePrepared) = this()
  
  /** TestCasePrepared pickleId. */
  @JSName("pickleId")
  var pickleId_TestCasePrepared: String = js.native
  
  /** TestCasePrepared steps. */
  @JSName("steps")
  var steps_TestCasePrepared: js.Array[ITestCasePreparedStep] = js.native
  
  /**
    * Converts this TestCasePrepared to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePrepared")
@js.native
object TestCasePrepared extends js.Object {
  
  /**
    * Creates a new TestCasePrepared instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCasePrepared instance
    */
  def create(): TestCasePrepared = js.native
  def create(properties: ITestCasePrepared): TestCasePrepared = js.native
  
  /**
    * Decodes a TestCasePrepared message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCasePrepared
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TestCasePrepared = js.native
  def decode(reader: Reader, length: Double): TestCasePrepared = js.native
  def decode(reader: Uint8Array): TestCasePrepared = js.native
  def decode(reader: Uint8Array, length: Double): TestCasePrepared = js.native
  
  /**
    * Decodes a TestCasePrepared message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCasePrepared
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TestCasePrepared = js.native
  def decodeDelimited(reader: Uint8Array): TestCasePrepared = js.native
  
  /**
    * Encodes the specified TestCasePrepared message. Does not implicitly {@link io.cucumber.messages.TestCasePrepared.verify|verify} messages.
    * @param message TestCasePrepared message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestCasePrepared): Writer = js.native
  def encode(message: ITestCasePrepared, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCasePrepared message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCasePrepared.verify|verify} messages.
    * @param message TestCasePrepared message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestCasePrepared): Writer = js.native
  def encodeDelimited(message: ITestCasePrepared, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCasePrepared message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCasePrepared
    */
  def fromObject(`object`: StringDictionary[js.Any]): TestCasePrepared = js.native
  
  /**
    * Creates a plain object from a TestCasePrepared message. Also converts values to other types if specified.
    * @param message TestCasePrepared
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TestCasePrepared): StringDictionary[js.Any] = js.native
  def toObject(message: TestCasePrepared, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCasePrepared message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
