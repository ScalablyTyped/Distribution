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

/** Represents a SourcesFilterConfig. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig")
@js.native
/**
  * Constructs a new SourcesFilterConfig.
  * @param [properties] Properties to set
  */
class SourcesFilterConfig () extends ISourcesFilterConfig {
  def this(properties: ISourcesFilterConfig) = this()
  
  /** SourcesFilterConfig nameRegularExpressions. */
  @JSName("nameRegularExpressions")
  var nameRegularExpressions_SourcesFilterConfig: js.Array[String] = js.native
  
  /** SourcesFilterConfig tagExpression. */
  @JSName("tagExpression")
  var tagExpression_SourcesFilterConfig: String = js.native
  
  /**
    * Converts this SourcesFilterConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** SourcesFilterConfig uriToLinesMapping. */
  @JSName("uriToLinesMapping")
  var uriToLinesMapping_SourcesFilterConfig: js.Array[IUriToLinesMapping] = js.native
}
object SourcesFilterConfig {
  
  /**
    * Creates a new SourcesFilterConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourcesFilterConfig instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.create")
  @js.native
  def create(): SourcesFilterConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.create")
  @js.native
  def create(properties: ISourcesFilterConfig): SourcesFilterConfig = js.native
  
  /**
    * Decodes a SourcesFilterConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourcesFilterConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.decode")
  @js.native
  def decode(reader: Reader): SourcesFilterConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.decode")
  @js.native
  def decode(reader: Reader, length: Double): SourcesFilterConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.decode")
  @js.native
  def decode(reader: Uint8Array): SourcesFilterConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): SourcesFilterConfig = js.native
  
  /**
    * Decodes a SourcesFilterConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourcesFilterConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): SourcesFilterConfig = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): SourcesFilterConfig = js.native
  
  /**
    * Encodes the specified SourcesFilterConfig message. Does not implicitly {@link io.cucumber.messages.SourcesFilterConfig.verify|verify} messages.
    * @param message SourcesFilterConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.encode")
  @js.native
  def encode(message: ISourcesFilterConfig): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.encode")
  @js.native
  def encode(message: ISourcesFilterConfig, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified SourcesFilterConfig message, length delimited. Does not implicitly {@link io.cucumber.messages.SourcesFilterConfig.verify|verify} messages.
    * @param message SourcesFilterConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesFilterConfig): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.encodeDelimited")
  @js.native
  def encodeDelimited(message: ISourcesFilterConfig, writer: Writer): Writer = js.native
  
  /**
    * Creates a SourcesFilterConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourcesFilterConfig
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): SourcesFilterConfig = js.native
  
  /**
    * Creates a plain object from a SourcesFilterConfig message. Also converts values to other types if specified.
    * @param message SourcesFilterConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.toObject")
  @js.native
  def toObject(message: SourcesFilterConfig): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.toObject")
  @js.native
  def toObject(message: SourcesFilterConfig, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a SourcesFilterConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.SourcesFilterConfig.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
