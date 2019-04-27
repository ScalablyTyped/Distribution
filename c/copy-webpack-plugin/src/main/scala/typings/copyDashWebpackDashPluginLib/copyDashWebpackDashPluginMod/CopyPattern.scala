package typings
package copyDashWebpackDashPluginLib.copyDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyPattern extends js.Object {
  /** 
  	 * Enable transform caching.  (default: `false`)
  	 * 
  	 * You can use `{ key: 'my-cache-key' }` to invalidate the cache.  
  	 * */
  var cache: js.UndefOr[scala.Boolean | copyDashWebpackDashPluginLib.Anon_Key] = js.undefined
  /** A path that determines how to interpret the `from` path. 
  	 * 
  	 * (default: `options.context | compiler.options.context`) 
  	 * */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Removes all directory references and only copies file names. (default: `false`)
  	 *
  	 * If files have the same name, the result is non-deterministic. 
  	 */
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
  /** Overwrites files already in `compilation.assets` (usually added by other plugins; default: `false`) */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /** File source path or glob */
  var from: java.lang.String | MiniMatchGlob
  /** Additional globs to ignore for this pattern. (default: `[]`) */
  var ignore: js.UndefOr[js.Array[java.lang.String | MiniMatchGlob]] = js.undefined
  /** 
  	 * Pattern for extracting elements to be used in `to` templates. 
  	 * 
  	 * Defines a `RegExp` to match some parts of the file path. These capture groups can be reused in the name property using [N] 
  	 * placeholder. Note that [0] will be replaced by the entire path of the file, whereas [1] will contain the first capturing 
  	 * parenthesis of your RegExp and so on...
  	 * 
  	 * */
  var test: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
  	 * Path or webpack file-loader patterns. defaults:
  	 * output root if `from` is file or dir.
  	 * resolved glob path if `from` is glob.
  	 */
  var to: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * How to interpret `to`. default: undefined
  	 * 
  	 * `file` - if 'to' has extension or 'from' is file.
  	 * `dir` - if 'from' is directory, 'to' has no extension or ends in '/'.
  	 * `template` - if 'to' contains a template pattern.
  	 */
  var toType: js.UndefOr[
    copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.file | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.dir | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.template
  ] = js.undefined
  /** Function that modifies file contents before writing to webpack. (default: `(content, path) => content`) */
  var transform: js.UndefOr[
    js.Function2[
      /* content */ nodeLib.Buffer, 
      /* path */ java.lang.String, 
      java.lang.String | nodeLib.Buffer | (js.Promise[java.lang.String | nodeLib.Buffer])
    ]
  ] = js.undefined
  /** 
  	 * Allows to modify the writing path.
  	 * 
  	 *  Returns the new path or a promise that resolves into the new path
  	 */
  var transformPath: js.UndefOr[
    js.Function2[
      /* targetPath */ java.lang.String, 
      /* absolutePath */ java.lang.String, 
      java.lang.String | js.Promise[java.lang.String]
    ]
  ] = js.undefined
}

object CopyPattern {
  @scala.inline
  def apply(
    from: java.lang.String | MiniMatchGlob,
    cache: scala.Boolean | copyDashWebpackDashPluginLib.Anon_Key = null,
    context: java.lang.String = null,
    flatten: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: js.Array[java.lang.String | MiniMatchGlob] = null,
    test: stdLib.RegExp = null,
    to: java.lang.String = null,
    toType: copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.file | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.dir | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.template = null,
    transform: (/* content */ nodeLib.Buffer, /* path */ java.lang.String) => java.lang.String | nodeLib.Buffer | (js.Promise[java.lang.String | nodeLib.Buffer]) = null,
    transformPath: (/* targetPath */ java.lang.String, /* absolutePath */ java.lang.String) => java.lang.String | js.Promise[java.lang.String] = null
  ): CopyPattern = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (test != null) __obj.updateDynamic("test")(test)
    if (to != null) __obj.updateDynamic("to")(to)
    if (toType != null) __obj.updateDynamic("toType")(toType.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    if (transformPath != null) __obj.updateDynamic("transformPath")(js.Any.fromFunction2(transformPath))
    __obj.asInstanceOf[CopyPattern]
  }
}

