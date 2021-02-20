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

/** Represents a PickleAccepted. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted")
@js.native
/**
  * Constructs a new PickleAccepted.
  * @param [properties] Properties to set
  */
class PickleAccepted () extends IPickleAccepted {
  def this(properties: IPickleAccepted) = this()
  
  /** PickleAccepted pickleId. */
  @JSName("pickleId")
  var pickleId_PickleAccepted: String = js.native
  
  /**
    * Converts this PickleAccepted to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object PickleAccepted {
  
  /**
    * Creates a new PickleAccepted instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleAccepted instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.create")
  @js.native
  def create(): PickleAccepted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.create")
  @js.native
  def create(properties: IPickleAccepted): PickleAccepted = js.native
  
  /**
    * Decodes a PickleAccepted message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleAccepted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.decode")
  @js.native
  def decode(reader: Reader): PickleAccepted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.decode")
  @js.native
  def decode(reader: Reader, length: Double): PickleAccepted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.decode")
  @js.native
  def decode(reader: Uint8Array): PickleAccepted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): PickleAccepted = js.native
  
  /**
    * Decodes a PickleAccepted message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleAccepted
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): PickleAccepted = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): PickleAccepted = js.native
  
  /**
    * Encodes the specified PickleAccepted message. Does not implicitly {@link io.cucumber.messages.PickleAccepted.verify|verify} messages.
    * @param message PickleAccepted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.encode")
  @js.native
  def encode(message: IPickleAccepted): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.encode")
  @js.native
  def encode(message: IPickleAccepted, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleAccepted message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleAccepted.verify|verify} messages.
    * @param message PickleAccepted message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickleAccepted): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickleAccepted, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleAccepted message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleAccepted
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): PickleAccepted = js.native
  
  /**
    * Creates a plain object from a PickleAccepted message. Also converts values to other types if specified.
    * @param message PickleAccepted
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.toObject")
  @js.native
  def toObject(message: PickleAccepted): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.toObject")
  @js.native
  def toObject(message: PickleAccepted, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleAccepted message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleAccepted.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
