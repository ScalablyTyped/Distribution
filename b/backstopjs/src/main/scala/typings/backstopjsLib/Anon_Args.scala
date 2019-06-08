package typings
package backstopjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.Array[java.lang.String]
  var chromeFlags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var chromePath: js.UndefOr[java.lang.String] = js.undefined
  var ignoreHTTPSErrors: js.UndefOr[scala.Boolean] = js.undefined
  var waitTimeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    args: js.Array[java.lang.String],
    chromeFlags: js.Array[java.lang.String] = null,
    chromePath: java.lang.String = null,
    ignoreHTTPSErrors: js.UndefOr[scala.Boolean] = js.undefined,
    waitTimeout: scala.Int | scala.Double = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args)
    if (chromeFlags != null) __obj.updateDynamic("chromeFlags")(chromeFlags)
    if (chromePath != null) __obj.updateDynamic("chromePath")(chromePath)
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors)
    if (waitTimeout != null) __obj.updateDynamic("waitTimeout")(waitTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

