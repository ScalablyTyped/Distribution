package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestCaseFinished
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCaseFinished. */
@JSImport("cucumber-messages", "messages.TestCaseFinished")
@js.native
/**
  * Constructs a new TestCaseFinished.
  * @param [properties] Properties to set
  */
class TestCaseFinished ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished {
  def this(properties: ITestCaseFinished) = this()
}
object TestCaseFinished {
  
  /**
    * Creates a new TestCaseFinished instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCaseFinished instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCaseFinished.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished = js.native
  @JSImport("cucumber-messages", "messages.TestCaseFinished.create")
  @js.native
  def create(properties: ITestCaseFinished): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished = js.native
  
  /**
    * Decodes a TestCaseFinished message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCaseFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCaseFinished.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished = js.native
  @JSImport("cucumber-messages", "messages.TestCaseFinished.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished = js.native
  @JSImport("cucumber-messages", "messages.TestCaseFinished.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished = js.native
  @JSImport("cucumber-messages", "messages.TestCaseFinished.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished = js.native
  
  /**
    * Decodes a TestCaseFinished message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCaseFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCaseFinished.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished = js.native
  @JSImport("cucumber-messages", "messages.TestCaseFinished.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished = js.native
  
  /**
    * Encodes the specified TestCaseFinished message. Does not implicitly {@link io.cucumber.messages.TestCaseFinished.verify|verify} messages.
    * @param message TestCaseFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCaseFinished.encode")
  @js.native
  def encode(message: ITestCaseFinished): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestCaseFinished.encode")
  @js.native
  def encode(message: ITestCaseFinished, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCaseFinished message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseFinished.verify|verify} messages.
    * @param message TestCaseFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCaseFinished.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCaseFinished): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestCaseFinished.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCaseFinished, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCaseFinished message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCaseFinished
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCaseFinished.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished = js.native
  
  /**
    * Creates a plain object from a TestCaseFinished message. Also converts values to other types if specified.
    * @param message TestCaseFinished
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCaseFinished.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.TestCaseFinished.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseFinished,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCaseFinished message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCaseFinished.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
