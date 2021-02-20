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

/** Represents a TestCasePreparedStep. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep")
@js.native
/**
  * Constructs a new TestCasePreparedStep.
  * @param [properties] Properties to set
  */
class TestCasePreparedStep () extends ITestCasePreparedStep {
  def this(properties: ITestCasePreparedStep) = this()
  
  /**
    * Converts this TestCasePreparedStep to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TestCasePreparedStep {
  
  /**
    * Creates a new TestCasePreparedStep instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCasePreparedStep instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.create")
  @js.native
  def create(): TestCasePreparedStep = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.create")
  @js.native
  def create(properties: ITestCasePreparedStep): TestCasePreparedStep = js.native
  
  /**
    * Decodes a TestCasePreparedStep message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCasePreparedStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.decode")
  @js.native
  def decode(reader: Reader): TestCasePreparedStep = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.decode")
  @js.native
  def decode(reader: Reader, length: Double): TestCasePreparedStep = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.decode")
  @js.native
  def decode(reader: Uint8Array): TestCasePreparedStep = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TestCasePreparedStep = js.native
  
  /**
    * Decodes a TestCasePreparedStep message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCasePreparedStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TestCasePreparedStep = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TestCasePreparedStep = js.native
  
  /**
    * Encodes the specified TestCasePreparedStep message. Does not implicitly {@link io.cucumber.messages.TestCasePreparedStep.verify|verify} messages.
    * @param message TestCasePreparedStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.encode")
  @js.native
  def encode(message: ITestCasePreparedStep): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.encode")
  @js.native
  def encode(message: ITestCasePreparedStep, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCasePreparedStep message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCasePreparedStep.verify|verify} messages.
    * @param message TestCasePreparedStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCasePreparedStep): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCasePreparedStep, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCasePreparedStep message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCasePreparedStep
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TestCasePreparedStep = js.native
  
  /**
    * Creates a plain object from a TestCasePreparedStep message. Also converts values to other types if specified.
    * @param message TestCasePreparedStep
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.toObject")
  @js.native
  def toObject(message: TestCasePreparedStep): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.toObject")
  @js.native
  def toObject(message: TestCasePreparedStep, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCasePreparedStep message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCasePreparedStep.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
