package typings.checksum.checksumMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("checksum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Generates a checksum for the given value
    * @param value	Any value
    * @param options	Allows to set the algorithm
    * @returns	Checksum
    */
  def apply(value: js.Any): String = js.native
  def apply(value: js.Any, options: ChecksumOptions): String = js.native
  /**
    * Generate the checksum for a file on disk
    * @param filename	The file name
    * @param callback	Callback which is called with the result or an error
    */
  def file(filename: String, callback: js.Function2[/* error */ Error, /* hash */ String, Unit]): Unit = js.native
  /**
    * Generate the checksum for a file on disk
    * @param filename	The file name
    * @param options	Options object to indicate hash algo
    * @param callback	Callback which is called with the result or an error
    */
  def file(
    filename: String,
    options: ChecksumOptions,
    callback: js.Function2[/* error */ Error, /* hash */ String, Unit]
  ): Unit = js.native
}

