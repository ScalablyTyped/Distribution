package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IStepMatchArgument
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestStep. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep")
@js.native
/**
  * Constructs a new TestStep.
  * @param [properties] Properties to set
  */
class TestStep () extends ITestStep {
  def this(properties: ITestStep) = this()
  
  /** TestStep hookId. */
  @JSName("hookId")
  var hookId_TestStep: String = js.native
  
  /** TestStep id. */
  @JSName("id")
  var id_TestStep: String = js.native
  
  /** TestStep pickleStepId. */
  @JSName("pickleStepId")
  var pickleStepId_TestStep: String = js.native
  
  /** TestStep stepDefinitionIds. */
  @JSName("stepDefinitionIds")
  var stepDefinitionIds_TestStep: js.Array[String] = js.native
  
  /** TestStep stepMatchArguments. */
  @JSName("stepMatchArguments")
  var stepMatchArguments_TestStep: js.Array[IStepMatchArgument] = js.native
  
  /**
    * Converts this TestStep to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestCase.TestStep")
@js.native
object TestStep extends js.Object {
  
  /**
    * Creates a new TestStep instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestStep instance
    */
  def create(): TestStep = js.native
  def create(properties: ITestStep): TestStep = js.native
  
  /**
    * Decodes a TestStep message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TestStep = js.native
  def decode(reader: Reader, length: Double): TestStep = js.native
  def decode(reader: Uint8Array): TestStep = js.native
  def decode(reader: Uint8Array, length: Double): TestStep = js.native
  
  /**
    * Decodes a TestStep message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TestStep = js.native
  def decodeDelimited(reader: Uint8Array): TestStep = js.native
  
  /**
    * Encodes the specified TestStep message. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
    * @param message TestStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestStep): Writer = js.native
  def encode(message: ITestStep, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestStep message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
    * @param message TestStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestStep): Writer = js.native
  def encodeDelimited(message: ITestStep, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestStep message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestStep
    */
  def fromObject(`object`: StringDictionary[js.Any]): TestStep = js.native
  
  /**
    * Creates a plain object from a TestStep message. Also converts values to other types if specified.
    * @param message TestStep
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TestStep): StringDictionary[js.Any] = js.native
  def toObject(message: TestStep, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestStep message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
