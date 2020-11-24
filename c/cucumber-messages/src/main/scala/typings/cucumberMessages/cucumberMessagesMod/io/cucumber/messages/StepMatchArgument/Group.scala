package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Group. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group")
@js.native
/**
  * Constructs a new Group.
  * @param [properties] Properties to set
  */
class Group () extends IGroup {
  def this(properties: IGroup) = this()
  
  /** Group children. */
  @JSName("children")
  var children_Group: js.Array[IGroup] = js.native
  
  /** Group start. */
  @JSName("start")
  var start_Group: Double = js.native
  
  /**
    * Converts this Group to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** Group value. */
  @JSName("value")
  var value_Group: String = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.StepMatchArgument.Group")
@js.native
object Group extends js.Object {
  
  /**
    * Creates a new Group instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Group instance
    */
  def create(): Group = js.native
  def create(properties: IGroup): Group = js.native
  
  /**
    * Decodes a Group message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Group
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Group = js.native
  def decode(reader: Reader, length: Double): Group = js.native
  def decode(reader: Uint8Array): Group = js.native
  def decode(reader: Uint8Array, length: Double): Group = js.native
  
  /**
    * Decodes a Group message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Group
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Group = js.native
  def decodeDelimited(reader: Uint8Array): Group = js.native
  
  /**
    * Encodes the specified Group message. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
    * @param message Group message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGroup): Writer = js.native
  def encode(message: IGroup, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Group message, length delimited. Does not implicitly {@link io.cucumber.messages.StepMatchArgument.Group.verify|verify} messages.
    * @param message Group message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGroup): Writer = js.native
  def encodeDelimited(message: IGroup, writer: Writer): Writer = js.native
  
  /**
    * Creates a Group message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Group
    */
  def fromObject(`object`: StringDictionary[js.Any]): Group = js.native
  
  /**
    * Creates a plain object from a Group message. Also converts values to other types if specified.
    * @param message Group
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Group): StringDictionary[js.Any] = js.native
  def toObject(message: Group, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Group message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
