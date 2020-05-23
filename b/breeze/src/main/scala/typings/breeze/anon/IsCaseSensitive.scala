package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsCaseSensitive extends js.Object {
  var isCaseSensitive: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var usesSql92CompliantStringComparison: js.UndefOr[Boolean] = js.undefined
}

object IsCaseSensitive {
  @scala.inline
  def apply(
    isCaseSensitive: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    usesSql92CompliantStringComparison: js.UndefOr[Boolean] = js.undefined
  ): IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(usesSql92CompliantStringComparison)) __obj.updateDynamic("usesSql92CompliantStringComparison")(usesSql92CompliantStringComparison.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsCaseSensitive]
  }
}

