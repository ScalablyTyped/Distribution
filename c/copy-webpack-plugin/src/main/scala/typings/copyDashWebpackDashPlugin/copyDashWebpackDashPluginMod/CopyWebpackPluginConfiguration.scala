package typings.copyDashWebpackDashPlugin.copyDashWebpackDashPluginMod

import typings.copyDashWebpackDashPlugin.copyDashWebpackDashPluginStrings.debug
import typings.copyDashWebpackDashPlugin.copyDashWebpackDashPluginStrings.error
import typings.copyDashWebpackDashPlugin.copyDashWebpackDashPluginStrings.info
import typings.copyDashWebpackDashPlugin.copyDashWebpackDashPluginStrings.silent
import typings.copyDashWebpackDashPlugin.copyDashWebpackDashPluginStrings.trace
import typings.copyDashWebpackDashPlugin.copyDashWebpackDashPluginStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyWebpackPluginConfiguration extends js.Object {
  /** A path that determines how to interpret the from path, shared for all patterns. default: `'compiler.options.context'` */
  var context: js.UndefOr[String] = js.undefined
  /** Copies files, regardless of modification when using `watch` or `webpack-dev-server`. All files are copied on first build, regardless of this option. (default: `false`) */
  var copyUnmodified: js.UndefOr[Boolean] = js.undefined
  /** Array of globs to ignore. (applied to `from`; default: `[]`) */
  var ignore: js.UndefOr[js.Array[String | MiniMatchGlob]] = js.undefined
  /** Level of messages that the module will log. (default: `'warn'`) */
  var logLevel: js.UndefOr[trace | debug | info | warn | error | silent] = js.undefined
}

object CopyWebpackPluginConfiguration {
  @scala.inline
  def apply(
    context: String = null,
    copyUnmodified: js.UndefOr[Boolean] = js.undefined,
    ignore: js.Array[String | MiniMatchGlob] = null,
    logLevel: trace | debug | info | warn | error | silent = null
  ): CopyWebpackPluginConfiguration = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(copyUnmodified)) __obj.updateDynamic("copyUnmodified")(copyUnmodified.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWebpackPluginConfiguration]
  }
}

