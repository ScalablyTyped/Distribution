package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.Step

import org.scalablytyped.runtime.StringDictionary
import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.GherkinDocument.Feature.ITableRow
import typings.protobufjs.mod.IConversionOptions
import typings.protobufjs.mod.Reader
import typings.protobufjs.mod.Writer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DataTable. */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable")
@js.native
/**
  * Constructs a new DataTable.
  * @param [properties] Properties to set
  */
class DataTable () extends IDataTable {
  def this(properties: IDataTable) = this()
  
  /** DataTable rows. */
  @JSName("rows")
  var rows_DataTable: js.Array[ITableRow] = js.native
  
  /**
    * Converts this DataTable to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
/* static members */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.GherkinDocument.Feature.Step.DataTable")
@js.native
object DataTable extends js.Object {
  
  /**
    * Creates a new DataTable instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DataTable instance
    */
  def create(): DataTable = js.native
  def create(properties: IDataTable): DataTable = js.native
  
  /**
    * Decodes a DataTable message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DataTable
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DataTable = js.native
  def decode(reader: Reader, length: Double): DataTable = js.native
  def decode(reader: Uint8Array): DataTable = js.native
  def decode(reader: Uint8Array, length: Double): DataTable = js.native
  
  /**
    * Decodes a DataTable message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DataTable
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DataTable = js.native
  def decodeDelimited(reader: Uint8Array): DataTable = js.native
  
  /**
    * Encodes the specified DataTable message. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
    * @param message DataTable message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDataTable): Writer = js.native
  def encode(message: IDataTable, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DataTable message, length delimited. Does not implicitly {@link io.cucumber.messages.GherkinDocument.Feature.Step.DataTable.verify|verify} messages.
    * @param message DataTable message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDataTable): Writer = js.native
  def encodeDelimited(message: IDataTable, writer: Writer): Writer = js.native
  
  /**
    * Creates a DataTable message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DataTable
    */
  def fromObject(`object`: StringDictionary[js.Any]): DataTable = js.native
  
  /**
    * Creates a plain object from a DataTable message. Also converts values to other types if specified.
    * @param message DataTable
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DataTable): StringDictionary[js.Any] = js.native
  def toObject(message: DataTable, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DataTable message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
