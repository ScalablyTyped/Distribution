package typings.chance.anon

import typings.chance.chanceStrings.lower
import typings.chance.chanceStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<chance.Chance.StringOptions> */
trait PartialStringOptions extends js.Object {
  var alpha: js.UndefOr[Boolean] = js.undefined
  var casing: js.UndefOr[upper | lower] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var numeric: js.UndefOr[Boolean] = js.undefined
  var pool: js.UndefOr[String] = js.undefined
  var symbols: js.UndefOr[Boolean] = js.undefined
}

object PartialStringOptions {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Boolean] = js.undefined,
    casing: upper | lower = null,
    length: js.UndefOr[Double] = js.undefined,
    numeric: js.UndefOr[Boolean] = js.undefined,
    pool: String = null,
    symbols: js.UndefOr[Boolean] = js.undefined
  ): PartialStringOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (casing != null) __obj.updateDynamic("casing")(casing.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.get.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (!js.isUndefined(symbols)) __obj.updateDynamic("symbols")(symbols.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStringOptions]
  }
}

