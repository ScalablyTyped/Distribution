package typings.copy

import typings.std.Error
import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("copy", JSImport.Namespace)
  @js.native
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
  @JSImport("copy", JSImport.Namespace)
  @js.native
  def apply(patterns: String, dir: String, options: Options, callback: Callback): Unit = js.native
  @JSImport("copy", JSImport.Namespace)
  @js.native
  def apply(patterns: js.Array[File | String], dir: String, callback: Callback): Unit = js.native
  @JSImport("copy", JSImport.Namespace)
  @js.native
  def apply(patterns: js.Array[File | String], dir: String, options: Options, callback: Callback): Unit = js.native
  @JSImport("copy", JSImport.Namespace)
  @js.native
  def apply(patterns: File, dir: String, callback: Callback): Unit = js.native
  @JSImport("copy", JSImport.Namespace)
  @js.native
  def apply(patterns: File, dir: String, options: Options, callback: Callback): Unit = js.native
  
  @JSImport("copy", "each")
  @js.native
  def each(files: js.Array[File | String], dir: String, cb: Callback): Unit = js.native
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
  @JSImport("copy", "each")
  @js.native
  def each(files: js.Array[File | String], dir: String, options: Options, cb: Callback): Unit = js.native
  
  @JSImport("copy", "one")
  @js.native
  def one(pattern: String, dir: String, cb: Callback): Unit = js.native
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
  @JSImport("copy", "one")
  @js.native
  def one(pattern: String, dir: String, options: Options, cb: Callback): Unit = js.native
  @JSImport("copy", "one")
  @js.native
  def one(pattern: File, dir: String, cb: Callback): Unit = js.native
  @JSImport("copy", "one")
  @js.native
  def one(pattern: File, dir: String, options: Options, cb: Callback): Unit = js.native
  
  type Callback = js.Function2[/* error */ Error | Null, /* files */ js.UndefOr[js.Array[File]], Unit]
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var srcBase: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setSrcBase(value: String): Self = StObject.set(x, "srcBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcBaseUndefined: Self = StObject.set(x, "srcBase", js.undefined)
    }
  }
}
