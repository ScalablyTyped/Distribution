package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsCaseSensitive extends js.Object {
  var isCaseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var usesSql92CompliantStringComparison: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IsCaseSensitive {
  @scala.inline
  def apply(
    isCaseSensitive: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    usesSql92CompliantStringComparison: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IsCaseSensitive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCaseSensitive)) __obj.updateDynamic("isCaseSensitive")(isCaseSensitive)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(usesSql92CompliantStringComparison)) __obj.updateDynamic("usesSql92CompliantStringComparison")(usesSql92CompliantStringComparison)
    __obj.asInstanceOf[Anon_IsCaseSensitive]
  }
}

