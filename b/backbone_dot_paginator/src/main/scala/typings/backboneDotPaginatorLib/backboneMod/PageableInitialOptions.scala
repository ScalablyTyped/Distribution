package typings
package backboneDotPaginatorLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableInitialOptions extends js.Object {
  var comparator: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Double]] = js.undefined
  var full: js.UndefOr[scala.Boolean] = js.undefined
  var queryParam: js.UndefOr[PageableQueryParams] = js.undefined
  var state: js.UndefOr[PageableState] = js.undefined
}

object PageableInitialOptions {
  @scala.inline
  def apply(
    comparator: /* repeated */ js.Any => scala.Double = null,
    full: js.UndefOr[scala.Boolean] = js.undefined,
    queryParam: PageableQueryParams = null,
    state: PageableState = null
  ): PageableInitialOptions = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction1(comparator))
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (queryParam != null) __obj.updateDynamic("queryParam")(queryParam)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PageableInitialOptions]
  }
}

