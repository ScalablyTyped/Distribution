package typings.cordovaPluginFile

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface expands on the FileSaver interface to allow for multiple write
  * actions, rather than just saving a single Blob.
  */
@js.native
trait FileWriter extends FileSaver {
  /**
    * The length of the file. If the user does not have read access to the file,
    * this will be the highest byte offset at which the user has written.
    */
  var length: Double = js.native
  /**
    * The byte offset at which the next write to the file will occur. This always less or equal than length.
    * A newly-created FileWriter will have position set to 0.
    */
  var position: Double = js.native
  /**
    * The file position at which the next write will occur.
    * @param offset If nonnegative, an absolute byte offset into the file.
    *               If negative, an offset back from the end of the file.
    */
  def seek(offset: Double): Unit = js.native
  /**
    * Changes the length of the file to that specified. If shortening the file, data beyond the new length
    * will be discarded. If extending the file, the existing data will be zero-padded up to the new length.
    * @param size The size to which the length of the file is to be adjusted, measured in bytes.
    */
  def truncate(size: Double): Unit = js.native
  def write(data: String): Unit = js.native
  /**
    * Write the supplied data to the file at position.
    * @param {Blob|string} data The blob to write.
    */
  def write(data: Blob): Unit = js.native
}

