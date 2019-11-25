package typings.backstopjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  var args: js.Array[String]
  var chromeFlags: js.UndefOr[js.Array[String]] = js.undefined
  var chromePath: js.UndefOr[String] = js.undefined
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
  var waitTimeout: js.UndefOr[Double] = js.undefined
}

object Anon_Args {
  @scala.inline
  def apply(
    args: js.Array[String],
    chromeFlags: js.Array[String] = null,
    chromePath: String = null,
    ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined,
    waitTimeout: Int | Double = null
  ): Anon_Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    if (chromeFlags != null) __obj.updateDynamic("chromeFlags")(chromeFlags.asInstanceOf[js.Any])
    if (chromePath != null) __obj.updateDynamic("chromePath")(chromePath.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors.asInstanceOf[js.Any])
    if (waitTimeout != null) __obj.updateDynamic("waitTimeout")(waitTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Args]
  }
}

