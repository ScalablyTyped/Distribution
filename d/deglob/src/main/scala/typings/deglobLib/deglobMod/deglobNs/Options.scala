package typings
package deglobLib.deglobMod.deglobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var configKey: js.UndefOr[java.lang.String] = js.undefined
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var gitIgnoreFile: js.UndefOr[java.lang.String] = js.undefined
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var useGitIgnore: js.UndefOr[scala.Boolean] = js.undefined
  var usePackageJson: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    configKey: java.lang.String = null,
    cwd: java.lang.String = null,
    gitIgnoreFile: java.lang.String = null,
    ignore: js.Array[java.lang.String] = null,
    useGitIgnore: js.UndefOr[scala.Boolean] = js.undefined,
    usePackageJson: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (configKey != null) __obj.updateDynamic("configKey")(configKey)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (gitIgnoreFile != null) __obj.updateDynamic("gitIgnoreFile")(gitIgnoreFile)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (!js.isUndefined(useGitIgnore)) __obj.updateDynamic("useGitIgnore")(useGitIgnore)
    if (!js.isUndefined(usePackageJson)) __obj.updateDynamic("usePackageJson")(usePackageJson)
    __obj.asInstanceOf[Options]
  }
}

