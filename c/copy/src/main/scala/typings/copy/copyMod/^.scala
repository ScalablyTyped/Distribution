package typings.copy.copyMod

import typings.vinyl.vinylMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("copy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(patterns: String, dir: String, callback: Callback): Unit = js.native
  /**
    * Copy a filepath, vinyl file, array of files, or glob of files to the
    * given destination `directory`, with `options` and callback function that
    * exposes `err` and the array of vinyl files that are created by the copy
    * operation.
    *
    * ```js
    * copy('*.js', 'dist', function(err, file) {
    *   // exposes the vinyl `file` created when the file is copied
    * });
    * ```
    * @param `patterns` Filepath(s), vinyl file(s) or glob of files.
    * @param `dir` Destination directory
    * @param `options` or callback function
    * @param `cb` Callback function if no options are specified
    */
  def apply(patterns: String, dir: String, options: Options, callback: Callback): Unit = js.native
  def apply(patterns: js.Array[File | String], dir: String, callback: Callback): Unit = js.native
  def apply(patterns: js.Array[File | String], dir: String, options: Options, callback: Callback): Unit = js.native
  def apply(patterns: File, dir: String, callback: Callback): Unit = js.native
  def apply(patterns: File, dir: String, options: Options, callback: Callback): Unit = js.native
}

