package typings
package connectDashLivereloadLib.connectDashLivereloadMod.livereloadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var disableCompression: js.UndefOr[scala.Boolean] = js.undefined
  var excludeList: js.UndefOr[js.Array[FileMatcher]] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[js.Function1[/* val */ java.lang.String, scala.Boolean]] = js.undefined
  var ignore: js.UndefOr[js.Array[FileMatcher]] = js.undefined
  var include: js.UndefOr[js.Array[FileMatcher]] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var rules: js.UndefOr[js.Array[Rule]] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    disableCompression: js.UndefOr[scala.Boolean] = js.undefined,
    excludeList: js.Array[FileMatcher] = null,
    hostname: java.lang.String = null,
    html: /* val */ java.lang.String => scala.Boolean = null,
    ignore: js.Array[FileMatcher] = null,
    include: js.Array[FileMatcher] = null,
    port: scala.Int | scala.Double = null,
    rules: js.Array[Rule] = null,
    src: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableCompression)) __obj.updateDynamic("disableCompression")(disableCompression)
    if (excludeList != null) __obj.updateDynamic("excludeList")(excludeList)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (html != null) __obj.updateDynamic("html")(js.Any.fromFunction1(html))
    if (ignore != null) __obj.updateDynamic("ignore")(ignore)
    if (include != null) __obj.updateDynamic("include")(include)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules)
    if (src != null) __obj.updateDynamic("src")(src)
    __obj.asInstanceOf[Options]
  }
}

