package typings.backboneDotPaginator.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableInitialOptions extends js.Object {
  var comparator: js.UndefOr[js.Function1[/* repeated */ js.Any, Double]] = js.undefined
  var full: js.UndefOr[Boolean] = js.undefined
  var queryParam: js.UndefOr[PageableQueryParams] = js.undefined
  var state: js.UndefOr[PageableState] = js.undefined
}

object PageableInitialOptions {
  @scala.inline
  def apply(
    comparator: /* repeated */ js.Any => Double = null,
    full: js.UndefOr[Boolean] = js.undefined,
    queryParam: PageableQueryParams = null,
    state: PageableState = null
  ): PageableInitialOptions = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction1(comparator))
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (queryParam != null) __obj.updateDynamic("queryParam")(queryParam.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageableInitialOptions]
  }
}

