package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestCase
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.ITestStep
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCase. */
@JSImport("cucumber-messages", "messages.TestCase")
@js.native
/**
  * Constructs a new TestCase.
  * @param [properties] Properties to set
  */
class TestCase ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase {
  def this(properties: ITestCase) = this()
}
object TestCase {
  
  /** Represents a TestStep. */
  @JSImport("cucumber-messages", "messages.TestCase.TestStep")
  @js.native
  /**
    * Constructs a new TestStep.
    * @param [properties] Properties to set
    */
  class TestStep ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep {
    def this(properties: ITestStep) = this()
  }
  object TestStep {
    
    /**
      * Creates a new TestStep instance using the specified properties.
      * @param [properties] Properties to set
      * @returns TestStep instance
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.create")
    @js.native
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = js.native
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.create")
    @js.native
    def create(properties: ITestStep): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = js.native
    
    /**
      * Decodes a TestStep message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns TestStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.decode")
    @js.native
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = js.native
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.decode")
    @js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = js.native
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.decode")
    @js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = js.native
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.decode")
    @js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = js.native
    
    /**
      * Decodes a TestStep message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns TestStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = js.native
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = js.native
    
    /**
      * Encodes the specified TestStep message. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
      * @param message TestStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.encode")
    @js.native
    def encode(message: ITestStep): Writer = js.native
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.encode")
    @js.native
    def encode(message: ITestStep, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified TestStep message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCase.TestStep.verify|verify} messages.
      * @param message TestStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.encodeDelimited")
    @js.native
    def encodeDelimited(message: ITestStep): Writer = js.native
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.encodeDelimited")
    @js.native
    def encodeDelimited(message: ITestStep, writer: Writer): Writer = js.native
    
    /**
      * Creates a TestStep message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns TestStep
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep = js.native
    
    /**
      * Creates a plain object from a TestStep message. Also converts values to other types if specified.
      * @param message TestStep
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.toObject")
    @js.native
    def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep): StringDictionary[js.Any] = js.native
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.toObject")
    @js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase.TestStep,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a TestStep message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("cucumber-messages", "messages.TestCase.TestStep.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /**
    * Creates a new TestCase instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCase instance
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCase.create")
  @js.native
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase = js.native
  @JSImport("cucumber-messages", "messages.TestCase.create")
  @js.native
  def create(properties: ITestCase): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase = js.native
  
  /**
    * Decodes a TestCase message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCase.decode")
  @js.native
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase = js.native
  @JSImport("cucumber-messages", "messages.TestCase.decode")
  @js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase = js.native
  @JSImport("cucumber-messages", "messages.TestCase.decode")
  @js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase = js.native
  @JSImport("cucumber-messages", "messages.TestCase.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase = js.native
  
  /**
    * Decodes a TestCase message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCase
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCase.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase = js.native
  @JSImport("cucumber-messages", "messages.TestCase.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase = js.native
  
  /**
    * Encodes the specified TestCase message. Does not implicitly {@link io.cucumber.messages.TestCase.verify|verify} messages.
    * @param message TestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCase.encode")
  @js.native
  def encode(message: ITestCase): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestCase.encode")
  @js.native
  def encode(message: ITestCase, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCase message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCase.verify|verify} messages.
    * @param message TestCase message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCase.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCase): Writer = js.native
  @JSImport("cucumber-messages", "messages.TestCase.encodeDelimited")
  @js.native
  def encodeDelimited(message: ITestCase, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCase message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCase
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCase.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase = js.native
  
  /**
    * Creates a plain object from a TestCase message. Also converts values to other types if specified.
    * @param message TestCase
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCase.toObject")
  @js.native
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages", "messages.TestCase.toObject")
  @js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCase,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCase message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages", "messages.TestCase.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
