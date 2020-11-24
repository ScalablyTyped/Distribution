package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesStrings.background
import typings.cucumberMessages.cucumberMessagesStrings.scenario
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a RuleChild. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild")
@js.native
/**
  * Constructs a new RuleChild.
  * @param [properties] Properties to set
  */
class RuleChild () extends IRuleChild {
  def this(properties: IRuleChild) = this()
  
  /**
    * Converts this RuleChild to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** RuleChild value. */
  var value: js.UndefOr[background | scenario] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild")
@js.native
object RuleChild extends js.Object {
  
  /**
    * Creates a new RuleChild instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RuleChild instance
    */
  def create(): RuleChild = js.native
  def create(properties: IRuleChild): RuleChild = js.native
  
  /**
    * Decodes a RuleChild message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RuleChild
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): RuleChild = js.native
  def decode(reader: Reader, length: Double): RuleChild = js.native
  def decode(reader: Uint8Array): RuleChild = js.native
  def decode(reader: Uint8Array, length: Double): RuleChild = js.native
  
  /**
    * Decodes a RuleChild message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RuleChild
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): RuleChild = js.native
  def decodeDelimited(reader: Uint8Array): RuleChild = js.native
  
  /**
    * Encodes the specified RuleChild message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify|verify} messages.
    * @param message RuleChild message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRuleChild): Writer = js.native
  def encode(message: IRuleChild, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified RuleChild message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.RuleChild.verify|verify} messages.
    * @param message RuleChild message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRuleChild): Writer = js.native
  def encodeDelimited(message: IRuleChild, writer: Writer): Writer = js.native
  
  /**
    * Creates a RuleChild message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RuleChild
    */
  def fromObject(`object`: StringDictionary[js.Any]): RuleChild = js.native
  
  /**
    * Creates a plain object from a RuleChild message. Also converts values to other types if specified.
    * @param message RuleChild
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: RuleChild): StringDictionary[js.Any] = js.native
  def toObject(message: RuleChild, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a RuleChild message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
