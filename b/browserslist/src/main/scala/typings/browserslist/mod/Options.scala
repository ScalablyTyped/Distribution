package typings.browserslist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** path to config if you want to set it manually */
  var config: js.UndefOr[String] = js.undefined
  /** Disable security checks for extend query.  */
  var dangerousExtend: js.UndefOr[Boolean] = js.undefined
  /** what environment section use from config */
  var env: js.UndefOr[String] = js.undefined
  /** do not throw on direct query (like ie 12). */
  var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
  /** Use desktop browsers if Can I Use doesn’t have data about this mobile version */
  var mobileToDesktop: js.UndefOr[Boolean] = js.undefined
  /** file or a directory path to look for config file */
  var path: js.UndefOr[String] = js.undefined
  /** custom usage statistics data */
  var stats: js.UndefOr[Stats] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    config: String = null,
    dangerousExtend: js.UndefOr[Boolean] = js.undefined,
    env: String = null,
    ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined,
    mobileToDesktop: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    stats: Stats = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousExtend)) __obj.updateDynamic("dangerousExtend")(dangerousExtend.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnknownVersions)) __obj.updateDynamic("ignoreUnknownVersions")(ignoreUnknownVersions.asInstanceOf[js.Any])
    if (!js.isUndefined(mobileToDesktop)) __obj.updateDynamic("mobileToDesktop")(mobileToDesktop.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

