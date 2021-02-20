package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesStrings.attachment
import typings.cucumberMessages.cucumberMessagesStrings.commandActionComplete
import typings.cucumberMessages.cucumberMessagesStrings.commandError
import typings.cucumberMessages.cucumberMessagesStrings.commandGenerateSnippet
import typings.cucumberMessages.cucumberMessagesStrings.commandInitializeTestCase
import typings.cucumberMessages.cucumberMessagesStrings.commandRunAfterTestCaseHook
import typings.cucumberMessages.cucumberMessagesStrings.commandRunAfterTestRunHooks
import typings.cucumberMessages.cucumberMessagesStrings.commandRunBeforeTestCaseHook
import typings.cucumberMessages.cucumberMessagesStrings.commandRunBeforeTestRunHooks
import typings.cucumberMessages.cucumberMessagesStrings.commandRunTestStep
import typings.cucumberMessages.cucumberMessagesStrings.commandStart
import typings.cucumberMessages.cucumberMessagesStrings.gherkinDocument
import typings.cucumberMessages.cucumberMessagesStrings.hook
import typings.cucumberMessages.cucumberMessagesStrings.pickle
import typings.cucumberMessages.cucumberMessagesStrings.pickleAccepted
import typings.cucumberMessages.cucumberMessagesStrings.pickleRejected
import typings.cucumberMessages.cucumberMessagesStrings.source
import typings.cucumberMessages.cucumberMessagesStrings.stepDefinition
import typings.cucumberMessages.cucumberMessagesStrings.testCase
import typings.cucumberMessages.cucumberMessagesStrings.testCaseFinished
import typings.cucumberMessages.cucumberMessagesStrings.testCasePrepared
import typings.cucumberMessages.cucumberMessagesStrings.testCaseStarted
import typings.cucumberMessages.cucumberMessagesStrings.testRunFinished
import typings.cucumberMessages.cucumberMessagesStrings.testRunStarted
import typings.cucumberMessages.cucumberMessagesStrings.testStepFinished
import typings.cucumberMessages.cucumberMessagesStrings.testStepStarted
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All the messages that are passed between different components/processes are Envelope
  * messages.
  */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope")
@js.native
/**
  * Constructs a new Envelope.
  * @param [properties] Properties to set
  */
class Envelope () extends IEnvelope {
  def this(properties: IEnvelope) = this()
  
  /** Envelope commandError. */
  @JSName("commandError")
  var commandError_Envelope: String = js.native
  
  /** Envelope message. */
  var message: js.UndefOr[
    source | gherkinDocument | pickle | attachment | testCaseStarted | testStepStarted | testStepFinished | testCaseFinished | pickleAccepted | pickleRejected | testCasePrepared | testRunStarted | testRunFinished | commandStart | commandActionComplete | commandRunBeforeTestRunHooks | commandInitializeTestCase | commandRunBeforeTestCaseHook | commandRunTestStep | commandRunAfterTestCaseHook | commandRunAfterTestRunHooks | commandGenerateSnippet | commandError | testCase | stepDefinition | hook
  ] = js.native
  
  /**
    * Converts this Envelope to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object Envelope {
  
  /**
    * Creates a new Envelope instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Envelope instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.create")
  @js.native
  def create(): Envelope = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.create")
  @js.native
  def create(properties: IEnvelope): Envelope = js.native
  
  /**
    * Decodes an Envelope message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.decode")
  @js.native
  def decode(reader: Reader): Envelope = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.decode")
  @js.native
  def decode(reader: Reader, length: Double): Envelope = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.decode")
  @js.native
  def decode(reader: Uint8Array): Envelope = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): Envelope = js.native
  
  /**
    * Decodes an Envelope message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): Envelope = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): Envelope = js.native
  
  /**
    * Encodes the specified Envelope message. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.encode")
  @js.native
  def encode(message: IEnvelope): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.encode")
  @js.native
  def encode(message: IEnvelope, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Envelope message, length delimited. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnvelope): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.encodeDelimited")
  @js.native
  def encodeDelimited(message: IEnvelope, writer: Writer): Writer = js.native
  
  /**
    * Creates an Envelope message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Envelope
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): Envelope = js.native
  
  /**
    * Creates a plain object from an Envelope message. Also converts values to other types if specified.
    * @param message Envelope
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.toObject")
  @js.native
  def toObject(message: Envelope): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.toObject")
  @js.native
  def toObject(message: Envelope, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies an Envelope message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
