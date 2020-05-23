package typings.checksum.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("checksum", "file")
@js.native
object file extends js.Object {
  /**
    * Generate the checksum for a file on disk
    * @param filename    The file name
    * @param callback    Callback which is called with the result or an error
    */
  def apply(filename: String, callback: js.Function2[/* error */ Error, /* hash */ String, Unit]): Unit = js.native
  /**
    * Generate the checksum for a file on disk
    * @param filename    The file name
    * @param options    Options object to indicate hash algo
    * @param callback    Callback which is called with the result or an error
    */
  def apply(
    filename: String,
    options: ChecksumOptions,
    callback: js.Function2[/* error */ Error, /* hash */ String, Unit]
  ): Unit = js.native
}

