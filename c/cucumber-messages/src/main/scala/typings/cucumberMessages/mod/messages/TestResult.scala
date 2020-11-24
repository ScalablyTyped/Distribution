package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestResult
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestResult. */
@JSImport("cucumber-messages", "messages.TestResult")
@js.native
/**
  * Constructs a new TestResult.
  * @param [properties] Properties to set
  */
class TestResult ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult {
  def this(properties: ITestResult) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.TestResult")
@js.native
object TestResult extends js.Object {
  
  /**
    * Creates a new TestResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestResult instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def create(properties: ITestResult): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  
  /**
    * Decodes a TestResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  
  /**
    * Decodes a TestResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  
  /**
    * Encodes the specified TestResult message. Does not implicitly {@link io.cucumber.messages.TestResult.verify|verify} messages.
    * @param message TestResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestResult): Writer = js.native
  def encode(message: ITestResult, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestResult message, length delimited. Does not implicitly {@link io.cucumber.messages.TestResult.verify|verify} messages.
    * @param message TestResult message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestResult): Writer = js.native
  def encodeDelimited(message: ITestResult, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestResult message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestResult
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult = js.native
  
  /**
    * Creates a plain object from a TestResult message. Also converts values to other types if specified.
    * @param message TestResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /**
    * Status of a step. Can also represent status of a Pickle (aggregated
    * from the status of its steps).
    *
    * The ordinal values of statuses are significant. The status of a Pickle
    * is determined by the union of statuses of its steps. The
    * status of the Pickle is the status with the highest ordinal
    * in the enum.
    *
    * For example, if a pickle has steps with statuses passed, undefined and skipped,
    * then the pickle's status is undefined.
    */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status with Double
      ] = js.native
    
    /* 5 */ val AMBIGUOUS: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.AMBIGUOUS with Double = js.native
    
    /* 6 */ val FAILED: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.FAILED with Double = js.native
    
    /* 1 */ val PASSED: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.PASSED with Double = js.native
    
    /* 3 */ val PENDING: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.PENDING with Double = js.native
    
    /* 2 */ val SKIPPED: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.SKIPPED with Double = js.native
    
    /* 4 */ val UNDEFINED: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.UNDEFINED with Double = js.native
    
    /* 0 */ val UNKNOWN: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status.UNKNOWN with Double = js.native
  }
}
