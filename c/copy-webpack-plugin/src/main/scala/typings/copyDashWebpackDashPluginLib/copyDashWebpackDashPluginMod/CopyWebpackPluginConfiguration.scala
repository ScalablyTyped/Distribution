package typings
package copyDashWebpackDashPluginLib.copyDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyWebpackPluginConfiguration extends js.Object {
  /** A path that determines how to interpret the from path, shared for all patterns. default: `'compiler.options.context'` */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /** Copies files, regardless of modification when using `watch` or `webpack-dev-server`. All files are copied on first build, regardless of this option. (default: `false`) */
  var copyUnmodified: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of globs to ignore. (applied to `from`; default: `[]`) */
  var ignore: js.UndefOr[js.Array[java.lang.String | MiniMatchGlob]] = js.undefined
  /** Level of messages that the module will log. (default: `'warn'`) */
  var logLevel: js.UndefOr[
    copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.trace | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.debug | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.info | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.warn | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.error | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.silent
  ] = js.undefined
}

object CopyWebpackPluginConfiguration {
  @scala.inline
  def apply(
    context: java.lang.String = null,
    copyUnmodified: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: js.Array[java.lang.String | MiniMatchGlob] = null,
    logLevel: copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.trace | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.debug | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.info | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.warn | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.error | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.silent = null
  ): CopyWebpackPluginConfiguration = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(copyUnmodified)) __obj.updateDynamic("copyUnmodified")(copyUnmodified)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWebpackPluginConfiguration]
  }
}

