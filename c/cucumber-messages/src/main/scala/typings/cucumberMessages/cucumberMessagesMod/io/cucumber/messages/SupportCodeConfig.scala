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

/** Represents a SupportCodeConfig. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig")
@js.native
/**
  * Constructs a new SupportCodeConfig.
  * @param [properties] Properties to set
  */
class SupportCodeConfig () extends ISupportCodeConfig {
  def this(properties: ISupportCodeConfig) = this()
  
  /** SupportCodeConfig afterTestCaseHooks. */
  @JSName("afterTestCaseHooks")
  var afterTestCaseHooks_SupportCodeConfig: js.Array[IHook] = js.native
  
  /** SupportCodeConfig beforeTestCaseHooks. */
  @JSName("beforeTestCaseHooks")
  var beforeTestCaseHooks_SupportCodeConfig: js.Array[IHook] = js.native
  
  /** SupportCodeConfig parameterTypes. */
  @JSName("parameterTypes")
  var parameterTypes_SupportCodeConfig: js.Array[IParameterType] = js.native
  
  /** SupportCodeConfig stepDefinitions. */
  @JSName("stepDefinitions")
  var stepDefinitions_SupportCodeConfig: js.Array[IStepDefinition] = js.native
  
  /**
    * Converts this SupportCodeConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object SupportCodeConfig {
  
  /**
    * Creates a new SupportCodeConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SupportCodeConfig instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.create")
  @js.native
  def create(): SupportCodeConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.create")
  @js.native
  def create(properties: ISupportCodeConfig): SupportCodeConfig = js.native
  
  /**
    * Decodes a SupportCodeConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SupportCodeConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.decode")
  @js.native
  def decode(reader: Reader): SupportCodeConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): SupportCodeConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.decode")
  @js.native
  def decode(reader: Uint8Array): SupportCodeConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SupportCodeConfig = js.native
  
  /**
    * Decodes a SupportCodeConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SupportCodeConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SupportCodeConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SupportCodeConfig = js.native
  
  /**
    * Encodes the specified SupportCodeConfig message. Does not implicitly {@link io.cucumber.messages.SupportCodeConfig.verify|verify} messages.
    * @param message SupportCodeConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.encode")
  @js.native
  def encode(message: ISupportCodeConfig): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.encode")
  @js.native
  def encode(message: ISupportCodeConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SupportCodeConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.SupportCodeConfig.verify|verify} messages.
    * @param message SupportCodeConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISupportCodeConfig): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISupportCodeConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a SupportCodeConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SupportCodeConfig
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SupportCodeConfig = js.native
  
  /**
    * Creates a plain object from a SupportCodeConfig message. Also converts values to other types if specified.
    * @param message SupportCodeConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.toObject")
  @js.native
  def toObject(message: SupportCodeConfig): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.toObject")
  @js.native
  def toObject(message: SupportCodeConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SupportCodeConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SupportCodeConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
