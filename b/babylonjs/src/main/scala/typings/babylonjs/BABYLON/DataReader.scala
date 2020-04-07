package typings.babylonjs.BABYLON

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.DataReader")
@js.native
class DataReader protected () extends js.Object {
  /**
    * Constructor
    * @param buffer The buffer to read
    */
  def this(buffer: IDataBuffer) = this()
  var _dataByteOffset: js.Any = js.native
  var _dataView: js.Any = js.native
  /**
    * The data buffer associated with this data reader.
    */
  val buffer: IDataBuffer = js.native
  /**
    * The current byte offset from the beginning of the data buffer.
    */
  var byteOffset: Double = js.native
  /**
    * Loads the given byte length.
    * @param byteLength The byte length to load
    * @returns A promise that resolves when the load is complete
    */
  def loadAsync(byteLength: Double): js.Promise[Unit] = js.native
  /**
    * Read a string from the currently loaded data range.
    * @param byteLength The byte length to read
    * @returns The string read
    */
  def readString(byteLength: Double): String = js.native
  /**
    * Read a unsigned 32-bit integer from the currently loaded data range.
    * @returns The 32-bit integer read
    */
  def readUint32(): Double = js.native
  /**
    * Read a byte array from the currently loaded data range.
    * @param byteLength The byte length to read
    * @returns The byte array read
    */
  def readUint8Array(byteLength: Double): Uint8Array = js.native
  /**
    * Skips the given byte length the currently loaded data range.
    * @param byteLength The byte length to skip
    */
  def skipBytes(byteLength: Double): Unit = js.native
}

