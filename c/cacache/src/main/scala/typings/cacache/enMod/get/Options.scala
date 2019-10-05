package typings.cacache.enMod.get

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var integrity: js.UndefOr[String] = js.undefined
  var memoize: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(integrity: String = null, memoize: js.UndefOr[Boolean] = js.undefined, size: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (!js.isUndefined(memoize)) __obj.updateDynamic("memoize")(memoize)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

