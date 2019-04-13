package typings
package copyLib.copyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("copy", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    patterns: java.lang.String | vinylLib.vinylMod.File | js.Array[java.lang.String] | js.Array[vinylLib.vinylMod.File],
    dir: java.lang.String,
    callback: Callback
  ): scala.Unit = js.native
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
  def apply(
    patterns: java.lang.String | vinylLib.vinylMod.File | js.Array[java.lang.String] | js.Array[vinylLib.vinylMod.File],
    dir: java.lang.String,
    options: Options,
    callback: Callback
  ): scala.Unit = js.native
  def each(files: js.Array[vinylLib.vinylMod.File | java.lang.String], dir: java.lang.String, cb: Callback): scala.Unit = js.native
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
  def each(
    files: js.Array[vinylLib.vinylMod.File | java.lang.String],
    dir: java.lang.String,
    options: Options,
    cb: Callback
  ): scala.Unit = js.native
  def one(pattern: java.lang.String, dir: java.lang.String, cb: Callback): scala.Unit = js.native
  /**
    * Copy a single `file` to the given `dest` directory, using
    * the specified options and callback function.
    *
    * ```js
    * copy.one('foo.txt', 'dist', function(err, file) {
    *   if (err) throw err;
    *   // exposes the vinyl `file` that is created when the file is copied
    * });
    * ```
    * @param `file` Filepath or vinyl file
    * @param `dir` Destination directory
    * @param `options` or callback function
    * @param `cb` Callback function if no options are specified
    */
  def one(pattern: java.lang.String, dir: java.lang.String, options: Options, cb: Callback): scala.Unit = js.native
  def one(pattern: vinylLib.vinylMod.File, dir: java.lang.String, cb: Callback): scala.Unit = js.native
  def one(pattern: vinylLib.vinylMod.File, dir: java.lang.String, options: Options, cb: Callback): scala.Unit = js.native
}

