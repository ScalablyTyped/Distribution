package typings.browserslistDashUseragent.browserslistDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserslistUseragentOptions extends js.Object {
  var allowHigherVersions: js.UndefOr[Boolean] = js.undefined
  var browsers: js.UndefOr[js.Array[String]] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var ignoreMinor: js.UndefOr[Boolean] = js.undefined
  var ignorePath: js.UndefOr[Boolean] = js.undefined
}

object BrowserslistUseragentOptions {
  @scala.inline
  def apply(
    allowHigherVersions: js.UndefOr[Boolean] = js.undefined,
    browsers: js.Array[String] = null,
    env: String = null,
    ignoreMinor: js.UndefOr[Boolean] = js.undefined,
    ignorePath: js.UndefOr[Boolean] = js.undefined
  ): BrowserslistUseragentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHigherVersions)) __obj.updateDynamic("allowHigherVersions")(allowHigherVersions.asInstanceOf[js.Any])
    if (browsers != null) __obj.updateDynamic("browsers")(browsers.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreMinor)) __obj.updateDynamic("ignoreMinor")(ignoreMinor.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePath)) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserslistUseragentOptions]
  }
}

