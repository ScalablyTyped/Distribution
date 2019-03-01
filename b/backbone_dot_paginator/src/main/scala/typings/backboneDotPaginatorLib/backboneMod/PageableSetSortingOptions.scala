package typings
package backboneDotPaginatorLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableSetSortingOptions[TModel /* <: backboneLib.backboneMod.Model */] extends js.Object {
  var full: js.UndefOr[scala.Boolean] = js.undefined
  var side: js.UndefOr[java.lang.String] = js.undefined
  var sortValue: js.UndefOr[
    js.Function2[/* model */ TModel, /* sortKey */ java.lang.String, _ | java.lang.String]
  ] = js.undefined
}

object PageableSetSortingOptions {
  @scala.inline
  def apply[TModel /* <: backboneLib.backboneMod.Model */](
    full: js.UndefOr[scala.Boolean] = js.undefined,
    side: java.lang.String = null,
    sortValue: js.Function2[/* model */ TModel, /* sortKey */ java.lang.String, _ | java.lang.String] = null
  ): PageableSetSortingOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (side != null) __obj.updateDynamic("side")(side)
    if (sortValue != null) __obj.updateDynamic("sortValue")(sortValue)
    __obj.asInstanceOf[PageableSetSortingOptions[TModel]]
  }
}

