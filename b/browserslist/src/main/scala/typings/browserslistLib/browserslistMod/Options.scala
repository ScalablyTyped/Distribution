package typings
package browserslistLib.browserslistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var config: js.UndefOr[java.lang.String] = js.undefined
  var dangerousExtend: js.UndefOr[scala.Boolean] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
  var ignoreUnknownVersions: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var stats: js.UndefOr[Stats] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    config: java.lang.String = null,
    dangerousExtend: js.UndefOr[scala.Boolean] = js.undefined,
    env: java.lang.String = null,
    ignoreUnknownVersions: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    stats: Stats = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(dangerousExtend)) __obj.updateDynamic("dangerousExtend")(dangerousExtend)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(ignoreUnknownVersions)) __obj.updateDynamic("ignoreUnknownVersions")(ignoreUnknownVersions)
    if (path != null) __obj.updateDynamic("path")(path)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[Options]
  }
}

