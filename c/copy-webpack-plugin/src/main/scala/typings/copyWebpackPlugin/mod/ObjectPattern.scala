package typings.copyWebpackPlugin.mod

import typings.copyWebpackPlugin.copyWebpackPluginStrings.dir
import typings.copyWebpackPlugin.copyWebpackPluginStrings.file
import typings.copyWebpackPlugin.copyWebpackPluginStrings.template
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPattern extends js.Object {
  /**
    * Enable/disable and configure caching. Default path to cache directory: node_modules/.cache/copy-webpack-plugin.
    * @default false
    */
  var cacheTransform: js.UndefOr[Boolean | String | js.Object] = js.undefined
  /**
    * A path that determines how to interpret the `from` path.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#context}
    * @default options.context | compiler.options.context
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * Removes all directory references and only copies file names. (default: `false`)
    * If files have the same name, the result is non-deterministic.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#flatten}
    * @default false
    */
  var flatten: js.UndefOr[Boolean] = js.undefined
  /**
    * Overwrites files already in `compilation.assets` (usually added by other plugins.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#force}
    * @default false
    */
  var force: js.UndefOr[Boolean] = js.undefined
  /**
    * File source path or glob
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#from}
    * @default undefined
    */
  var from: String
  /**
    * Allows to configure the glob pattern matching library used by the plugin.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#globoptions}
    */
  var globOptions: js.UndefOr[js.Object] = js.undefined
  /**
    * Doesn't generate an error on missing file(s);
    * @default false
    */
  var noErrorOnMissing: js.UndefOr[Boolean] = js.undefined
  /**
    * Path or webpack file-loader patterns. defaults:
    * output root if `from` is file or dir.
    * resolved glob path if `from` is glob.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#to}
    * @default compiler.options.output
    */
  var to: js.UndefOr[String] = js.undefined
  /**
    * How to interpret `to`. default: undefined
    * `file` - if 'to' has extension or 'from' is file.
    * `dir` - if 'from' is directory, 'to' has no extension or ends in '/'.
    * `template` - if 'to' contains a template pattern.
    * @default undefined
    */
  var toType: js.UndefOr[file | dir | template] = js.undefined
  /**
    * Function that modifies file contents before writing to webpack. (default: `(content, path) => content`)
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#transform}
    * @default undefined
    */
  var transform: js.UndefOr[
    js.Function2[
      /* content */ Buffer, 
      /* absoluteFrom */ String, 
      String | Buffer | (js.Promise[String | Buffer])
    ]
  ] = js.undefined
  /**
    * Allows to modify the writing path.
    * Returns the new path or a promise that resolves into the new path
    * @default undefined
    */
  var transformPath: js.UndefOr[
    js.Function2[/* targetPath */ String, /* absolutePath */ String, String | js.Promise[String]]
  ] = js.undefined
}

object ObjectPattern {
  @scala.inline
  def apply(
    from: String,
    cacheTransform: Boolean | String | js.Object = null,
    context: String = null,
    flatten: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    globOptions: js.Object = null,
    noErrorOnMissing: js.UndefOr[Boolean] = js.undefined,
    to: String = null,
    toType: file | dir | template = null,
    transform: (/* content */ Buffer, /* absoluteFrom */ String) => String | Buffer | (js.Promise[String | Buffer]) = null,
    transformPath: (/* targetPath */ String, /* absolutePath */ String) => String | js.Promise[String] = null
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (cacheTransform != null) __obj.updateDynamic("cacheTransform")(cacheTransform.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(flatten)) __obj.updateDynamic("flatten")(flatten.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (globOptions != null) __obj.updateDynamic("globOptions")(globOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(noErrorOnMissing)) __obj.updateDynamic("noErrorOnMissing")(noErrorOnMissing.get.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (toType != null) __obj.updateDynamic("toType")(toType.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    if (transformPath != null) __obj.updateDynamic("transformPath")(js.Any.fromFunction2(transformPath))
    __obj.asInstanceOf[ObjectPattern]
  }
}

