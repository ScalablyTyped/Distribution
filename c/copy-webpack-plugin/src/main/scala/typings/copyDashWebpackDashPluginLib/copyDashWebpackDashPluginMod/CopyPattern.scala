package typings
package copyDashWebpackDashPluginLib.copyDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyPattern extends js.Object {
  /** Enable transform caching. You can use `{ cache: { key: 'my-cache-key' } }` to invalidate the cache. (default: `false`) */
  var cache: js.UndefOr[scala.Boolean | copyDashWebpackDashPluginLib.Anon_Key] = js.undefined
  /** A path that determines how to interpret the `from` path. (default: `compiler.options.context`) */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Removes all directory references and only copies file names.
  	 *
  	 * If files have the same name, the result is non-deterministic. (default: `false`)
  	 */
  var flatten: js.UndefOr[scala.Boolean] = js.undefined
  /** Overwrites files already in `compilation.assets` (usually added by other plugins; default: `false`) */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /** File source path or glob */
  var from: java.lang.String | MiniMatchGlob
  /** See the `node-glob` options in addition to the ones below. (default: `{ cwd: context }`) */
  var fromArgs: js.UndefOr[MiniMatchOptions] = js.undefined
  /** Additional globs to ignore for this pattern. (default: `[]`) */
  var ignore: js.UndefOr[js.Array[java.lang.String | MiniMatchGlob]] = js.undefined
  /**
  	 * Path or webpack file-loader patterns. defaults:
  	 * output root if `from` is file or dir.
  	 * resolved glob path if `from` is glob.
  	 */
  var to: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * How to interpret `to`. defaults:
  	 * 'file' if to has extension or from is file.
  	 * 'dir' if from is directory, to has no extension or ends in '/'.
  	 * 'template' if to contains a template pattern.
  	 */
  var toType: js.UndefOr[
    copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.file | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.dir | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.template
  ] = js.undefined
  /** Function that modifies file contents before writing to webpack. (default: `(content, path) => content`) */
  var transform: js.UndefOr[
    js.Function2[/* content */ java.lang.String, /* path */ java.lang.String, java.lang.String]
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
    fromArgs: MiniMatchOptions = null,
    ignore: js.Array[java.lang.String | MiniMatchGlob] = null,
    to: java.lang.String = null,
    toType: copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.file | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.dir | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.template = null,
    transform: js.Function2[/* content */ java.lang.String, /* path */ java.lang.String, java.lang.String] = null
  ): CopyPattern = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (fromArgs != null) __obj.updateDynamic("fromArgs")(fromArgs)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (to != null) __obj.updateDynamic("to")(to)
    if (toType != null) __obj.updateDynamic("toType")(toType.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[CopyPattern]
  }
}

