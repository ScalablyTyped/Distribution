package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a PickleTableCell. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell")
@js.native
/**
  * Constructs a new PickleTableCell.
  * @param [properties] Properties to set
  */
class PickleTableCell () extends IPickleTableCell {
  def this(properties: IPickleTableCell) = this()
  
  /**
    * Converts this PickleTableCell to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** PickleTableCell value. */
  @JSName("value")
  var value_PickleTableCell: String = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell")
@js.native
object PickleTableCell extends js.Object {
  
  /**
    * Creates a new PickleTableCell instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PickleTableCell instance
    */
  def create(): PickleTableCell = js.native
  def create(properties: IPickleTableCell): PickleTableCell = js.native
  
  /**
    * Decodes a PickleTableCell message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PickleTableCell
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): PickleTableCell = js.native
  def decode(reader: Reader, length: Double): PickleTableCell = js.native
  def decode(reader: Uint8Array): PickleTableCell = js.native
  def decode(reader: Uint8Array, length: Double): PickleTableCell = js.native
  
  /**
    * Decodes a PickleTableCell message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PickleTableCell
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): PickleTableCell = js.native
  def decodeDelimited(reader: Uint8Array): PickleTableCell = js.native
  
  /**
    * Encodes the specified PickleTableCell message. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify|verify} messages.
    * @param message PickleTableCell message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPickleTableCell): Writer = js.native
  def encode(message: IPickleTableCell, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified PickleTableCell message, length delimited. Does not implicitly {@link io.cucumber.messages.PickleStepArgument.PickleTable.PickleTableRow.PickleTableCell.verify|verify} messages.
    * @param message PickleTableCell message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPickleTableCell): Writer = js.native
  def encodeDelimited(message: IPickleTableCell, writer: Writer): Writer = js.native
  
  /**
    * Creates a PickleTableCell message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PickleTableCell
    */
  def fromObject(`object`: StringDictionary[js.Any]): PickleTableCell = js.native
  
  /**
    * Creates a plain object from a PickleTableCell message. Also converts values to other types if specified.
    * @param message PickleTableCell
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: PickleTableCell): StringDictionary[js.Any] = js.native
  def toObject(message: PickleTableCell, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a PickleTableCell message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
