package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.TableRow

import org.scalablytyped.runtime.StringDictionary
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TableCell. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell")
@js.native
/**
  * Constructs a new TableCell.
  * @param [properties] Properties to set
  */
class TableCell () extends ITableCell {
  def this(properties: ITableCell) = this()
  
  /**
    * Converts this TableCell to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
  
  /** TableCell value. */
  @JSName("value")
  var value_TableCell: String = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell")
@js.native
object TableCell extends js.Object {
  
  /**
    * Creates a new TableCell instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TableCell instance
    */
  def create(): TableCell = js.native
  def create(properties: ITableCell): TableCell = js.native
  
  /**
    * Decodes a TableCell message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TableCell
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): TableCell = js.native
  def decode(reader: Reader, length: Double): TableCell = js.native
  def decode(reader: Uint8Array): TableCell = js.native
  def decode(reader: Uint8Array, length: Double): TableCell = js.native
  
  /**
    * Decodes a TableCell message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TableCell
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): TableCell = js.native
  def decodeDelimited(reader: Uint8Array): TableCell = js.native
  
  /**
    * Encodes the specified TableCell message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
    * @param message TableCell message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITableCell): Writer = js.native
  def encode(message: ITableCell, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified TableCell message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.TableRow.TableCell.verify|verify} messages.
    * @param message TableCell message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITableCell): Writer = js.native
  def encodeDelimited(message: ITableCell, writer: Writer): Writer = js.native
  
  /**
    * Creates a TableCell message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TableCell
    */
  def fromObject(`object`: StringDictionary[js.Any]): TableCell = js.native
  
  /**
    * Creates a plain object from a TableCell message. Also converts values to other types if specified.
    * @param message TableCell
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: TableCell): StringDictionary[js.Any] = js.native
  def toObject(message: TableCell, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a TableCell message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
