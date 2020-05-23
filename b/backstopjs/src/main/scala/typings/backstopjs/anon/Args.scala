package typings.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Args extends js.Object {
  var args: js.Array[String]
  var chromeFlags: js.UndefOr[js.Array[String]] = js.undefined
  var chromePath: js.UndefOr[String] = js.undefined
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined
  var waitTimeout: js.UndefOr[Double] = js.undefined
}

object Args {
  @scala.inline
  def apply(
    args: js.Array[String],
    chromeFlags: js.Array[String] = null,
    chromePath: String = null,
    ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined,
    waitTimeout: js.UndefOr[Double] = js.undefined
  ): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    if (chromeFlags != null) __obj.updateDynamic("chromeFlags")(chromeFlags.asInstanceOf[js.Any])
    if (chromePath != null) __obj.updateDynamic("chromePath")(chromePath.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitTimeout)) __obj.updateDynamic("waitTimeout")(waitTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
}

