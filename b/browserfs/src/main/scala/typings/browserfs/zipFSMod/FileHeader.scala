package typings.browserfs.zipFSMod

import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/ZipFS", "FileHeader")
@js.native
class FileHeader protected () extends js.Object {
  def this(data: Buffer) = this()
  var data: js.Any = js.native
  def compressionMethod(): CompressionMethod = js.native
  def crc32(): Double = js.native
  def extraField(): Buffer = js.native
  def extraFieldLength(): Double = js.native
  def fileName(): String = js.native
  /**
    * These two values are COMPLETELY USELESS.
    *
    * Section 4.4.9:
    *   If bit 3 of the general purpose bit flag is set,
    *   these fields are set to zero in the local header and the
    *   correct values are put in the data descriptor and
    *   in the central directory.
    *
    * So we'll just use the central directory's values.
    */
  def fileNameLength(): Double = js.native
  def flags(): Double = js.native
  def lastModFileTime(): Date = js.native
  def rawLastModFileTime(): Double = js.native
  def totalSize(): Double = js.native
  def useUTF8(): Boolean = js.native
  def versionNeeded(): Double = js.native
}

