package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An executable step */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep")
@js.native
/**
  * Constructs a new PickleStep.
  * @param [properties] Properties to set
  */
class PickleStep () extends IPickleStep {
  def this(properties: IPickleStep) = this()
  
  /** PickleStep astNodeIds. */
  @JSName("astNodeIds")
  var astNodeIds_PickleStep: js.Array[String] = js.native
  
  /** PickleStep id. */
  @JSName("id")
  var id_PickleStep: String = js.native
  
  /** PickleStep text. */
  @JSName("text")
  var text_PickleStep: String = js.native
  
  /**
    * Converts this PickleStep to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Pickle.PickleStep")
@js.native
object PickleStep extends js.Object {
  
  /**
    * Creates a new PickleStep instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleStep instance
    */
  def create(): PickleStep = js.native
  def create(properties: IPickleStep): PickleStep = js.native
  
  /**
    * Decodes a PickleStep message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PickleStep = js.native
  def decode(reader: Reader, length: Double): PickleStep = js.native
  def decode(reader: Uint8Array): PickleStep = js.native
  def decode(reader: Uint8Array, length: Double): PickleStep = js.native
  
  /**
    * Decodes a PickleStep message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleStep
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PickleStep = js.native
  def decodeDelimited(reader: Uint8Array): PickleStep = js.native
  
  /**
    * Encodes the specified PickleStep message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
    * @param message PickleStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPickleStep): Writer = js.native
  def encode(message: IPickleStep, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleStep message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
    * @param message PickleStep message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPickleStep): Writer = js.native
  def encodeDelimited(message: IPickleStep, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleStep message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleStep
    */
  def fromObject(`object`: StringDictionary[js.Any]): PickleStep = js.native
  
  /**
    * Creates a plain object from a PickleStep message. Also converts values to other types if specified.
    * @param message PickleStep
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PickleStep): StringDictionary[js.Any] = js.native
  def toObject(message: PickleStep, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleStep message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
