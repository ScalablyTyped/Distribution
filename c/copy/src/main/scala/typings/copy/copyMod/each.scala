package typings.copy.copyMod

import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("copy", "each")
@js.native
object each extends js.Object {
  def apply(files: js.Array[File | String], dir: String, cb: Callback): Unit = js.native
  /**
    * Copy an array of files to the given destination `directory`, with
    * `options` and callback function that exposes `err` and the array of
    * vinyl files that are created by the copy operation.
    *
    * ```js
    * copy.each(['foo.txt', 'bar.txt', 'baz.txt'], 'dist', function(err, files) {
    *   // exposes the vinyl `files` created when the files are copied
    * });
    * ```
    * @param `files` Filepaths or vinyl files.
    * @param `dir` Destination directory
    * @param `options` or callback function
    * @param `cb` Callback function if no options are specified
    */
  def apply(files: js.Array[File | String], dir: String, options: Options, cb: Callback): Unit = js.native
}

