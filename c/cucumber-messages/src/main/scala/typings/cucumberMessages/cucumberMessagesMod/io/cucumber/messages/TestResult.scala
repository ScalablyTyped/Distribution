package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestResult.Status
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestResult. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestResult")
@js.native
/**
  * Constructs a new TestResult.
  * @param [properties] Properties to set
  */
class TestResult () extends ITestResult {
  def this(properties: ITestResult) = this()
  
  /** TestResult message. */
  @JSName("message")
  var message_TestResult: String = js.native
  
  /** TestResult status. */
  @JSName("status")
  var status_TestResult: Status = js.native
  
  /**
    * Converts this TestResult to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** TestResult willBeRetried. */
  @JSName("willBeRetried")
  var willBeRetried_TestResult: Boolean = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.TestResult")
@js.native
object TestResult extends js.Object {
  
  /**
    * Creates a new TestResult instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestResult instance
    */
  def create(): TestResult = js.native
  def create(properties: ITestResult): TestResult = js.native
  
  /**
    * Decodes a TestResult message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TestResult = js.native
  def decode(reader: Reader, length: Double): TestResult = js.native
  def decode(reader: Uint8Array): TestResult = js.native
  def decode(reader: Uint8Array, length: Double): TestResult = js.native
  
  /**
    * Decodes a TestResult message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestResult
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TestResult = js.native
  def decodeDelimited(reader: Uint8Array): TestResult = js.native
  
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
  def fromObject(`object`: StringDictionary[js.Any]): TestResult = js.native
  
  /**
    * Creates a plain object from a TestResult message. Also converts values to other types if specified.
    * @param message TestResult
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TestResult): StringDictionary[js.Any] = js.native
  def toObject(message: TestResult, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestResult message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  @js.native
  sealed trait Status extends js.Object
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
    def apply(value: Double): js.UndefOr[Status with Double] = js.native
    
    @js.native
    sealed trait AMBIGUOUS extends Status
    /* 5 */ @js.native
    object AMBIGUOUS extends TopLevel[AMBIGUOUS with Double]
    
    @js.native
    sealed trait FAILED extends Status
    /* 6 */ @js.native
    object FAILED extends TopLevel[FAILED with Double]
    
    @js.native
    sealed trait PASSED extends Status
    /* 1 */ @js.native
    object PASSED extends TopLevel[PASSED with Double]
    
    @js.native
    sealed trait PENDING extends Status
    /* 3 */ @js.native
    object PENDING extends TopLevel[PENDING with Double]
    
    @js.native
    sealed trait SKIPPED extends Status
    /* 2 */ @js.native
    object SKIPPED extends TopLevel[SKIPPED with Double]
    
    @js.native
    sealed trait UNDEFINED extends Status
    /* 4 */ @js.native
    object UNDEFINED extends TopLevel[UNDEFINED with Double]
    
    @js.native
    sealed trait UNKNOWN extends Status
    /* 0 */ @js.native
    object UNKNOWN extends TopLevel[UNKNOWN with Double]
  }
}
