package typings.copy.mod

import typings.vinyl.mod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("copy", "one")
@js.native
object one extends js.Object {
  
  def apply(pattern: String, dir: String, cb: Callback): Unit = js.native
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
  def apply(pattern: String, dir: String, options: Options, cb: Callback): Unit = js.native
  def apply(pattern: File, dir: String, cb: Callback): Unit = js.native
  def apply(pattern: File, dir: String, options: Options, cb: Callback): Unit = js.native
}
