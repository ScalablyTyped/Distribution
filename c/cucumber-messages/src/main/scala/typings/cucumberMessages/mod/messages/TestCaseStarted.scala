package typings.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ITestCaseStarted
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.IPlatform
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCaseStarted. */
@JSImport("cucumber-messages", "messages.TestCaseStarted")
@js.native
/**
  * Constructs a new TestCaseStarted.
  * @param [properties] Properties to set
  */
class TestCaseStarted ()
  extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted {
  def this(properties: ITestCaseStarted) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.TestCaseStarted")
@js.native
object TestCaseStarted extends js.Object {
  
  /**
    * Creates a new TestCaseStarted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCaseStarted instance
    */
  def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted = js.native
  def create(properties: ITestCaseStarted): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted = js.native
  
  /**
    * Decodes a TestCaseStarted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCaseStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted = js.native
  def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted = js.native
  def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted = js.native
  def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted = js.native
  
  /**
    * Decodes a TestCaseStarted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCaseStarted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted = js.native
  def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted = js.native
  
  /**
    * Encodes the specified TestCaseStarted message. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.verify|verify} messages.
    * @param message TestCaseStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITestCaseStarted): Writer = js.native
  def encode(message: ITestCaseStarted, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TestCaseStarted message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.verify|verify} messages.
    * @param message TestCaseStarted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITestCaseStarted): Writer = js.native
  def encodeDelimited(message: ITestCaseStarted, writer: Writer): Writer = js.native
  
  /**
    * Creates a TestCaseStarted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCaseStarted
    */
  def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted = js.native
  
  /**
    * Creates a plain object from a TestCaseStarted message. Also converts values to other types if specified.
    * @param message TestCaseStarted
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted): StringDictionary[js.Any] = js.native
  def toObject(
    message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TestCaseStarted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Represents a Platform. */
  @js.native
  /**
    * Constructs a new Platform.
    * @param [properties] Properties to set
    */
  class Platform ()
    extends typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform {
    def this(properties: IPlatform) = this()
  }
  /* static members */
  @js.native
  object Platform extends js.Object {
    
    /**
      * Creates a new Platform instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Platform instance
      */
    def create(): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform = js.native
    def create(properties: IPlatform): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform = js.native
    
    /**
      * Decodes a Platform message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Platform
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform = js.native
    def decode(reader: Reader, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform = js.native
    def decode(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform = js.native
    def decode(reader: Uint8Array, length: Double): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform = js.native
    
    /**
      * Decodes a Platform message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Platform
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform = js.native
    def decodeDelimited(reader: Uint8Array): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform = js.native
    
    /**
      * Encodes the specified Platform message. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.Platform.verify|verify} messages.
      * @param message Platform message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IPlatform): Writer = js.native
    def encode(message: IPlatform, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Platform message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseStarted.Platform.verify|verify} messages.
      * @param message Platform message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IPlatform): Writer = js.native
    def encodeDelimited(message: IPlatform, writer: Writer): Writer = js.native
    
    /**
      * Creates a Platform message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Platform
      */
    def fromObject(`object`: StringDictionary[js.Any]): typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform = js.native
    
    /**
      * Creates a plain object from a Platform message. Also converts values to other types if specified.
      * @param message Platform
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform
    ): StringDictionary[js.Any] = js.native
    def toObject(
      message: typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.TestCaseStarted.Platform,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Platform message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
