package typings.backbonePaginator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableState extends js.Object {
  var currentPage: js.UndefOr[Double] = js.undefined
  var firstPage: js.UndefOr[Double] = js.undefined
  var lastPage: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var sortKey: js.UndefOr[String] = js.undefined
  var totalPages: js.UndefOr[Double] = js.undefined
  var totalRecords: js.UndefOr[Double] = js.undefined
}

object PageableState {
  @scala.inline
  def apply(
    currentPage: js.UndefOr[Double] = js.undefined,
    firstPage: js.UndefOr[Double] = js.undefined,
    lastPage: js.UndefOr[Double] = js.undefined,
    order: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    sortKey: String = null,
    totalPages: js.UndefOr[Double] = js.undefined,
    totalRecords: js.UndefOr[Double] = js.undefined
  ): PageableState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentPage)) __obj.updateDynamic("currentPage")(currentPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(firstPage)) __obj.updateDynamic("firstPage")(firstPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastPage)) __obj.updateDynamic("lastPage")(lastPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (sortKey != null) __obj.updateDynamic("sortKey")(sortKey.asInstanceOf[js.Any])
    if (!js.isUndefined(totalPages)) __obj.updateDynamic("totalPages")(totalPages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRecords)) __obj.updateDynamic("totalRecords")(totalRecords.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageableState]
  }
}

