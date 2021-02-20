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

/** Represents a TestRunStarted. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted")
@js.native
/**
  * Constructs a new TestRunStarted.
  * @param [properties] Properties to set
  */
class TestRunStarted () extends ITestRunStarted {
  def this(properties: ITestRunStarted) = this()
  
  /**
    * Converts this TestRunStarted to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object TestRunStarted {
  
  /**
    * Creates a new TestRunStarted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestRunStarted instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.create")
  @js.native
  def create(): TestRunStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.create")
  @js.native
  def create(properties: ITestRunStarted): TestRunStarted = js.native
  
  /**
    * Decodes a TestRunStarted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestRunStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.decode")
  @js.native
  def decode(reader: Reader): TestRunStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.decode")
  @js.native
  def decode(reader: Reader, length: Double): TestRunStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.decode")
  @js.native
  def decode(reader: Uint8Array): TestRunStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): TestRunStarted = js.native
  
  /**
    * Decodes a TestRunStarted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestRunStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): TestRunStarted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): TestRunStarted = js.native
  
  /**
    * Encodes the specified TestRunStarted message. Does not implicitly {@link io.cucumber.messages.TestRunStarted.verify|verify} messages.
    * @param message TestRunStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.encode")
  @js.native
  def encode(message: ITestRunStarted): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.encode")
  @js.native
  def encode(message: ITestRunStarted, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestRunStarted message, length delimited. Does not implicitly {@link io.cucumber.messages.TestRunStarted.verify|verify} messages.
    * @param message TestRunStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestRunStarted): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestRunStarted, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestRunStarted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestRunStarted
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): TestRunStarted = js.native
  
  /**
    * Creates a plain object from a TestRunStarted message. Also converts values to other types if specified.
    * @param message TestRunStarted
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.toObject")
  @js.native
  def toObject(message: TestRunStarted): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.toObject")
  @js.native
  def toObject(message: TestRunStarted, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestRunStarted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestRunStarted.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
