package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.FeatureChild

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A `Rule` node */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule")
@js.native
/**
  * Constructs a new Rule.
  * @param [properties] Properties to set
  */
class Rule () extends IRule {
  def this(properties: IRule) = this()
  
  /** Rule children. */
  @JSName("children")
  var children_Rule: js.Array[IRuleChild] = js.native
  
  /** Rule description. */
  @JSName("description")
  var description_Rule: String = js.native
  
  /** Rule keyword. */
  @JSName("keyword")
  var keyword_Rule: String = js.native
  
  /** Rule name. */
  @JSName("name")
  var name_Rule: String = js.native
  
  /**
    * Converts this Rule to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule")
@js.native
object Rule extends js.Object {
  
  /**
    * Creates a new Rule instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Rule instance
    */
  def create(): Rule = js.native
  def create(properties: IRule): Rule = js.native
  
  /**
    * Decodes a Rule message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Rule
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Rule = js.native
  def decode(reader: Reader, length: Double): Rule = js.native
  def decode(reader: Uint8Array): Rule = js.native
  def decode(reader: Uint8Array, length: Double): Rule = js.native
  
  /**
    * Decodes a Rule message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Rule
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Rule = js.native
  def decodeDelimited(reader: Uint8Array): Rule = js.native
  
  /**
    * Encodes the specified Rule message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.verify|verify} messages.
    * @param message Rule message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRule): Writer = js.native
  def encode(message: IRule, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Rule message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.FeatureChild.Rule.verify|verify} messages.
    * @param message Rule message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRule): Writer = js.native
  def encodeDelimited(message: IRule, writer: Writer): Writer = js.native
  
  /**
    * Creates a Rule message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Rule
    */
  def fromObject(`object`: StringDictionary[js.Any]): Rule = js.native
  
  /**
    * Creates a plain object from a Rule message. Also converts values to other types if specified.
    * @param message Rule
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Rule): StringDictionary[js.Any] = js.native
  def toObject(message: Rule, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Rule message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
