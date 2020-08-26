package typings.copyWebpackPlugin.mod

import typings.copyWebpackPlugin.copyWebpackPluginStrings.dir
import typings.copyWebpackPlugin.copyWebpackPluginStrings.file
import typings.copyWebpackPlugin.copyWebpackPluginStrings.template
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPattern extends js.Object {
  /**
    * Enable/disable and configure caching. Default path to cache directory: node_modules/.cache/copy-webpack-plugin.
    * @default false
    */
  var cacheTransform: js.UndefOr[Boolean | String | js.Object] = js.native
  /**
    * A path that determines how to interpret the `from` path.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#context}
    * @default options.context | compiler.options.context
    */
  var context: js.UndefOr[String] = js.native
  /**
    * Removes all directory references and only copies file names. (default: `false`)
    * If files have the same name, the result is non-deterministic.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#flatten}
    * @default false
    */
  var flatten: js.UndefOr[Boolean] = js.native
  /**
    * Overwrites files already in `compilation.assets` (usually added by other plugins.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#force}
    * @default false
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * File source path or glob
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#from}
    * @default undefined
    */
  var from: String = js.native
  /**
    * Allows to configure the glob pattern matching library used by the plugin.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#globoptions}
    */
  var globOptions: js.UndefOr[js.Object] = js.native
  /**
    * Doesn't generate an error on missing file(s);
    * @default false
    */
  var noErrorOnMissing: js.UndefOr[Boolean] = js.native
  /**
    * Path or webpack file-loader patterns. defaults:
    * output root if `from` is file or dir.
    * resolved glob path if `from` is glob.
    * {@link https://webpack.js.org/plugins/copy-webpack-plugin/#to}
    * @default compiler.options.output
    */
  var to: js.UndefOr[String] = js.native
  /**
    * How to interpret `to`. default: undefined
    * `file` - if 'to' has extension or 'from' is file.
    * `dir` - if 'from' is directory, 'to' has no extension or ends in '/'.
    * `template` - if 'to' contains a template pattern.
    * @default undefined
    */
  var toType: js.UndefOr[file | dir | template] = js.native
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
  ] = js.native
  /**
    * Allows to modify the writing path.
    * Returns the new path or a promise that resolves into the new path
    * @default undefined
    */
  var transformPath: js.UndefOr[
    js.Function2[/* targetPath */ String, /* absolutePath */ String, String | js.Promise[String]]
  ] = js.native
}

object ObjectPattern {
  @scala.inline
  def apply(from: String): ObjectPattern = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
  @scala.inline
  implicit class ObjectPatternOps[Self <: ObjectPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def setCacheTransform(value: Boolean | String | js.Object): Self = this.set("cacheTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheTransform: Self = this.set("cacheTransform", js.undefined)
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFlatten(value: Boolean): Self = this.set("flatten", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatten: Self = this.set("flatten", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setGlobOptions(value: js.Object): Self = this.set("globOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobOptions: Self = this.set("globOptions", js.undefined)
    @scala.inline
    def setNoErrorOnMissing(value: Boolean): Self = this.set("noErrorOnMissing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoErrorOnMissing: Self = this.set("noErrorOnMissing", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    @scala.inline
    def setToType(value: file | dir | template): Self = this.set("toType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToType: Self = this.set("toType", js.undefined)
    @scala.inline
    def setTransform(
      value: (/* content */ Buffer, /* absoluteFrom */ String) => String | Buffer | (js.Promise[String | Buffer])
    ): Self = this.set("transform", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTransformPath(value: (/* targetPath */ String, /* absolutePath */ String) => String | js.Promise[String]): Self = this.set("transformPath", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTransformPath: Self = this.set("transformPath", js.undefined)
  }
  
}

