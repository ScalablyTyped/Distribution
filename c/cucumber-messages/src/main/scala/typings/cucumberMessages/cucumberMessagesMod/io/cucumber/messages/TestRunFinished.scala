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

/** Represents a TestRunFinished. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished")
@js.native
/**
  * Constructs a new TestRunFinished.
  * @param [properties] Properties to set
  */
class TestRunFinished () extends ITestRunFinished {
  def this(properties: ITestRunFinished) = this()
  
  /** TestRunFinished success. */
  @JSName("success")
  var success_TestRunFinished: Boolean = js.native
  
  /**
    * Converts this TestRunFinished to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TestRunFinished {
  
  /**
    * Creates a new TestRunFinished instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestRunFinished instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.create")
  @js.native
  def create(): TestRunFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.create")
  @js.native
  def create(properties: ITestRunFinished): TestRunFinished = js.native
  
  /**
    * Decodes a TestRunFinished message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestRunFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.decode")
  @js.native
  def decode(reader: Reader): TestRunFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.decode")
  @js.native
  def decode(reader: Reader, length: Double): TestRunFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.decode")
  @js.native
  def decode(reader: Uint8Array): TestRunFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TestRunFinished = js.native
  
  /**
    * Decodes a TestRunFinished message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestRunFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TestRunFinished = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TestRunFinished = js.native
  
  /**
    * Encodes the specified TestRunFinished message. Does not implicitly {@link io.cucumber.messages.TestRunFinished.verify|verify} messages.
    * @param message TestRunFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.encode")
  @js.native
  def encode(message: ITestRunFinished): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.encode")
  @js.native
  def encode(message: ITestRunFinished, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestRunFinished message, length delimited. Does not implicitly {@link io.cucumber.messages.TestRunFinished.verify|verify} messages.
    * @param message TestRunFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestRunFinished): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestRunFinished, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestRunFinished message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestRunFinished
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TestRunFinished = js.native
  
  /**
    * Creates a plain object from a TestRunFinished message. Also converts values to other types if specified.
    * @param message TestRunFinished
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.toObject")
  @js.native
  def toObject(message: TestRunFinished): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.toObject")
  @js.native
  def toObject(message: TestRunFinished, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestRunFinished message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunFinished.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
