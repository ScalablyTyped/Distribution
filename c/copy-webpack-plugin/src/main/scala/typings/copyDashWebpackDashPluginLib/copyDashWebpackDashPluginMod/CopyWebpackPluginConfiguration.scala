package typings
package copyDashWebpackDashPluginLib.copyDashWebpackDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CopyWebpackPluginConfiguration extends js.Object {
  /** Copies files, regardless of modification when using `watch` or `webpack-dev-server`. All files are copied on first build, regardless of this option. (default: `false`) */
  var copyUnmodified: js.UndefOr[scala.Boolean] = js.undefined
  /** Debug level. warning: only warnings, info/true: file location and read info, debug: very detailed debugging info. (default: `'warning'`) */
  var debug: js.UndefOr[
    copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.warning | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.info | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibNumbers.`true` | copyDashWebpackDashPluginLib.copyDashWebpackDashPluginLibStrings.debug
  ] = js.undefined
  /** Array of globs to ignore. (applied to from; default: `[]`) */
  var ignore: js.UndefOr[js.Array[java.lang.String | MiniMatchGlob]] = js.undefined
}

