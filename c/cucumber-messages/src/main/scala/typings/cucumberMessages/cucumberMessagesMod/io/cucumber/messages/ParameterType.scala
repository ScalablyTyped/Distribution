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

/** Represents a ParameterType. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType")
@js.native
/**
  * Constructs a new ParameterType.
  * @param [properties] Properties to set
  */
class ParameterType () extends IParameterType {
  def this(properties: IParameterType) = this()
  
  /** ParameterType name. */
  @JSName("name")
  var name_ParameterType: String = js.native
  
  /** ParameterType preferForRegularExpressionMatch. */
  @JSName("preferForRegularExpressionMatch")
  var preferForRegularExpressionMatch_ParameterType: Boolean = js.native
  
  /** ParameterType regularExpressions. */
  @JSName("regularExpressions")
  var regularExpressions_ParameterType: js.Array[String] = js.native
  
  /**
    * Converts this ParameterType to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** ParameterType useForSnippets. */
  @JSName("useForSnippets")
  var useForSnippets_ParameterType: Boolean = js.native
}
object ParameterType {
  
  /**
    * Creates a new ParameterType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ParameterType instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.create")
  @js.native
  def create(): ParameterType = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.create")
  @js.native
  def create(properties: IParameterType): ParameterType = js.native
  
  /**
    * Decodes a ParameterType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ParameterType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.decode")
  @js.native
  def decode(reader: Reader): ParameterType = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.decode")
  @js.native
  def decode(reader: Reader, length: Double): ParameterType = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.decode")
  @js.native
  def decode(reader: Uint8Array): ParameterType = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): ParameterType = js.native
  
  /**
    * Decodes a ParameterType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ParameterType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): ParameterType = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): ParameterType = js.native
  
  /**
    * Encodes the specified ParameterType message. Does not implicitly {@link io.cucumber.messages.ParameterType.verify|verify} messages.
    * @param message ParameterType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.encode")
  @js.native
  def encode(message: IParameterType): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.encode")
  @js.native
  def encode(message: IParameterType, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ParameterType message, length delimited. Does not implicitly {@link io.cucumber.messages.ParameterType.verify|verify} messages.
    * @param message ParameterType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.encodeDelimited")
  @js.native
  def encodeDelimited(message: IParameterType): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.encodeDelimited")
  @js.native
  def encodeDelimited(message: IParameterType, writer: Writer): Writer = js.native
  
  /**
    * Creates a ParameterType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ParameterType
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): ParameterType = js.native
  
  /**
    * Creates a plain object from a ParameterType message. Also converts values to other types if specified.
    * @param message ParameterType
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.toObject")
  @js.native
  def toObject(message: ParameterType): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.toObject")
  @js.native
  def toObject(message: ParameterType, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ParameterType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.ParameterType.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
