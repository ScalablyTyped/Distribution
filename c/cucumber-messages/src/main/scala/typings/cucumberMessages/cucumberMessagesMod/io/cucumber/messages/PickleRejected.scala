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

/** Represents a PickleRejected. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected")
@js.native
/**
  * Constructs a new PickleRejected.
  * @param [properties] Properties to set
  */
class PickleRejected () extends IPickleRejected {
  def this(properties: IPickleRejected) = this()
  
  /** PickleRejected pickleId. */
  @JSName("pickleId")
  var pickleId_PickleRejected: String = js.native
  
  /**
    * Converts this PickleRejected to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object PickleRejected {
  
  /**
    * Creates a new PickleRejected instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleRejected instance
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.create")
  @js.native
  def create(): PickleRejected = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.create")
  @js.native
  def create(properties: IPickleRejected): PickleRejected = js.native
  
  /**
    * Decodes a PickleRejected message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleRejected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.decode")
  @js.native
  def decode(reader: Reader): PickleRejected = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.decode")
  @js.native
  def decode(reader: Reader, length: Double): PickleRejected = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.decode")
  @js.native
  def decode(reader: Uint8Array): PickleRejected = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.decode")
  @js.native
  def decode(reader: Uint8Array, length: Double): PickleRejected = js.native
  
  /**
    * Decodes a PickleRejected message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleRejected
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): PickleRejected = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Uint8Array): PickleRejected = js.native
  
  /**
    * Encodes the specified PickleRejected message. Does not implicitly {@link io.cucumber.messages.PickleRejected.verify|verify} messages.
    * @param message PickleRejected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.encode")
  @js.native
  def encode(message: IPickleRejected): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.encode")
  @js.native
  def encode(message: IPickleRejected, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleRejected message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleRejected.verify|verify} messages.
    * @param message PickleRejected message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickleRejected): Writer = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.encodeDelimited")
  @js.native
  def encodeDelimited(message: IPickleRejected, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleRejected message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleRejected
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): PickleRejected = js.native
  
  /**
    * Creates a plain object from a PickleRejected message. Also converts values to other types if specified.
    * @param message PickleRejected
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.toObject")
  @js.native
  def toObject(message: PickleRejected): StringDictionary[js.Any] = js.native
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.toObject")
  @js.native
  def toObject(message: PickleRejected, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleRejected message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleRejected.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
