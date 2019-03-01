package typings
package browserslistDashUseragentLib.browserslistDashUseragentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserslistUseragentOptions extends js.Object {
  var allowHigherVersions: js.UndefOr[scala.Boolean] = js.undefined
  var browsers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
  var ignoreMinor: js.UndefOr[scala.Boolean] = js.undefined
  var ignorePath: js.UndefOr[scala.Boolean] = js.undefined
}

object BrowserslistUseragentOptions {
  @scala.inline
  def apply(
    allowHigherVersions: js.UndefOr[scala.Boolean] = js.undefined,
    browsers: js.Array[java.lang.String] = null,
    env: java.lang.String = null,
    ignoreMinor: js.UndefOr[scala.Boolean] = js.undefined,
    ignorePath: js.UndefOr[scala.Boolean] = js.undefined
  ): BrowserslistUseragentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHigherVersions)) __obj.updateDynamic("allowHigherVersions")(allowHigherVersions)
    if (browsers != null) __obj.updateDynamic("browsers")(browsers)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(ignoreMinor)) __obj.updateDynamic("ignoreMinor")(ignoreMinor)
    if (!js.isUndefined(ignorePath)) __obj.updateDynamic("ignorePath")(ignorePath)
    __obj.asInstanceOf[BrowserslistUseragentOptions]
  }
}

