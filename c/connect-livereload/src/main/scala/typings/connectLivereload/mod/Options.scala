package typings.connectLivereload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var disableCompression: js.UndefOr[Boolean] = js.undefined
  var excludeList: js.UndefOr[js.Array[FileMatcher]] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var html: js.UndefOr[js.Function1[/* val */ String, Boolean]] = js.undefined
  var ignore: js.UndefOr[js.Array[FileMatcher]] = js.undefined
  var include: js.UndefOr[js.Array[FileMatcher]] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  var src: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disableCompression: js.UndefOr[Boolean] = js.undefined,
    excludeList: js.Array[FileMatcher] = null,
    hostname: String = null,
    html: /* val */ String => Boolean = null,
    ignore: js.Array[FileMatcher] = null,
    include: js.Array[FileMatcher] = null,
    port: js.UndefOr[Double] = js.undefined,
    rules: js.Array[Rule] = null,
    src: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCompression)) __obj.updateDynamic("disableCompression")(disableCompression.get.asInstanceOf[js.Any])
    if (excludeList != null) __obj.updateDynamic("excludeList")(excludeList.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(js.Any.fromFunction1(html))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

