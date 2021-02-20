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

/** Represents a TestStepFinished. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished")
@js.native
/**
  * Constructs a new TestStepFinished.
  * @param [properties] Properties to set
  */
class TestStepFinished () extends ITestStepFinished {
  def this(properties: ITestStepFinished) = this()
  
  /** TestStepFinished testCaseStartedId. */
  @JSName("testCaseStartedId")
  var testCaseStartedId_TestStepFinished: String = js.native
  
  /** TestStepFinished testStepId. */
  @JSName("testStepId")
  var testStepId_TestStepFinished: String = js.native
  
  /**
    * Converts this TestStepFinished to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TestStepFinished {
  
  /**
    * Creates a new TestStepFinished instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestStepFinished instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.create")
  @js.native
  def create(): TestStepFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.create")
  @js.native
  def create(properties: ITestStepFinished): TestStepFinished = js.native
  
  /**
    * Decodes a TestStepFinished message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestStepFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.decode")
  @js.native
  def decode(reader: Reader): TestStepFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.decode")
  @js.native
  def decode(reader: Reader, length: Double): TestStepFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.decode")
  @js.native
  def decode(reader: Uint8Array): TestStepFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TestStepFinished = js.native
  
  /**
    * Decodes a TestStepFinished message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestStepFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TestStepFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TestStepFinished = js.native
  
  /**
    * Encodes the specified TestStepFinished message. Does not implicitly {@link io.cucumber.messages.TestStepFinished.verify|verify} messages.
    * @param message TestStepFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.encode")
  @js.native
  def encode(message: ITestStepFinished): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.encode")
  @js.native
  def encode(message: ITestStepFinished, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestStepFinished message, length delimited. Does not implicitly {@link io.cucumber.messages.TestStepFinished.verify|verify} messages.
    * @param message TestStepFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestStepFinished): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestStepFinished, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestStepFinished message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestStepFinished
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TestStepFinished = js.native
  
  /**
    * Creates a plain object from a TestStepFinished message. Also converts values to other types if specified.
    * @param message TestStepFinished
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.toObject")
  @js.native
  def toObject(message: TestStepFinished): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.toObject")
  @js.native
  def toObject(message: TestStepFinished, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestStepFinished message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestStepFinished.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
