package typings.deglob.deglobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var configKey: js.UndefOr[String] = js.undefined
  var cwd: js.UndefOr[String] = js.undefined
  var gitIgnoreFile: js.UndefOr[String] = js.undefined
  var ignore: js.UndefOr[js.Array[String]] = js.undefined
  var useGitIgnore: js.UndefOr[Boolean] = js.undefined
  var usePackageJson: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    configKey: String = null,
    cwd: String = null,
    gitIgnoreFile: String = null,
    ignore: js.Array[String] = null,
    useGitIgnore: js.UndefOr[Boolean] = js.undefined,
    usePackageJson: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (configKey != null) __obj.updateDynamic("configKey")(configKey.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (gitIgnoreFile != null) __obj.updateDynamic("gitIgnoreFile")(gitIgnoreFile.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(useGitIgnore)) __obj.updateDynamic("useGitIgnore")(useGitIgnore.asInstanceOf[js.Any])
    if (!js.isUndefined(usePackageJson)) __obj.updateDynamic("usePackageJson")(usePackageJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

