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

/** Represents a StepDefinition. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition")
@js.native
/**
  * Constructs a new StepDefinition.
  * @param [properties] Properties to set
  */
class StepDefinition () extends IStepDefinition {
  def this(properties: IStepDefinition) = this()
  
  /** StepDefinition id. */
  @JSName("id")
  var id_StepDefinition: String = js.native
  
  /**
    * Converts this StepDefinition to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object StepDefinition {
  
  /**
    * Creates a new StepDefinition instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StepDefinition instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.create")
  @js.native
  def create(): StepDefinition = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.create")
  @js.native
  def create(properties: IStepDefinition): StepDefinition = js.native
  
  /**
    * Decodes a StepDefinition message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StepDefinition
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.decode")
  @js.native
  def decode(reader: Reader): StepDefinition = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.decode")
  @js.native
  def decode(reader: Reader, length: Double): StepDefinition = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.decode")
  @js.native
  def decode(reader: Uint8Array): StepDefinition = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): StepDefinition = js.native
  
  /**
    * Decodes a StepDefinition message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StepDefinition
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): StepDefinition = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): StepDefinition = js.native
  
  /**
    * Encodes the specified StepDefinition message. Does not implicitly {@link io.cucumber.messages.StepDefinition.verify|verify} messages.
    * @param message StepDefinition message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.encode")
  @js.native
  def encode(message: IStepDefinition): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.encode")
  @js.native
  def encode(message: IStepDefinition, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StepDefinition message, length delimited. Does not implicitly {@link io.cucumber.messages.StepDefinition.verify|verify} messages.
    * @param message StepDefinition message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepDefinition): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStepDefinition, writer: Writer): Writer = js.native
  
  /**
    * Creates a StepDefinition message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StepDefinition
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): StepDefinition = js.native
  
  /**
    * Creates a plain object from a StepDefinition message. Also converts values to other types if specified.
    * @param message StepDefinition
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.toObject")
  @js.native
  def toObject(message: StepDefinition): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.toObject")
  @js.native
  def toObject(message: StepDefinition, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StepDefinition message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepDefinition.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
