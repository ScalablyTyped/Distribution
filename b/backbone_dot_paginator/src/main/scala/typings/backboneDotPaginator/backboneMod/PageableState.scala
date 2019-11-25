package typings.backboneDotPaginator.backboneMod

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
    currentPage: Int | Double = null,
    firstPage: Int | Double = null,
    lastPage: Int | Double = null,
    order: Int | Double = null,
    pageSize: Int | Double = null,
    sortKey: String = null,
    totalPages: Int | Double = null,
    totalRecords: Int | Double = null
  ): PageableState = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage.asInstanceOf[js.Any])
    if (lastPage != null) __obj.updateDynamic("lastPage")(lastPage.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (sortKey != null) __obj.updateDynamic("sortKey")(sortKey.asInstanceOf[js.Any])
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageableState]
  }
}

