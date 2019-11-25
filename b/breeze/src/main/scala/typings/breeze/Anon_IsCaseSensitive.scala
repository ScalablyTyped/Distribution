package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsCaseSensitive extends js.Object {
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var usesSql92CompliantStringComparison: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsCaseSensitive {
  @scala.inline
  def apply(
    isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    usesSql92CompliantStringComparison: js.UndefOr[Boolean] = js.undefined
  ): Anon_IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(usesSql92CompliantStringComparison)) __obj.updateDynamic("usesSql92CompliantStringComparison")(usesSql92CompliantStringComparison.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsCaseSensitive]
  }
}

