package typings.browserslist.browserslistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var config: js.UndefOr[String] = js.undefined
  var dangerousExtend: js.UndefOr[Boolean] = js.undefined
  var env: js.UndefOr[String] = js.undefined
  var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var stats: js.UndefOr[Stats] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    config: String = null,
    dangerousExtend: js.UndefOr[Boolean] = js.undefined,
    env: String = null,
    ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    stats: Stats = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousExtend)) __obj.updateDynamic("dangerousExtend")(dangerousExtend.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknownVersions)) __obj.updateDynamic("ignoreUnknownVersions")(ignoreUnknownVersions.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

