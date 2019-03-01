package typings
package backboneDotPaginatorLib.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableState extends js.Object {
  var currentPage: js.UndefOr[scala.Double] = js.undefined
  var firstPage: js.UndefOr[scala.Double] = js.undefined
  var lastPage: js.UndefOr[scala.Double] = js.undefined
  var order: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var sortKey: js.UndefOr[java.lang.String] = js.undefined
  var totalPages: js.UndefOr[scala.Double] = js.undefined
  var totalRecords: js.UndefOr[scala.Double] = js.undefined
}

object PageableState {
  @scala.inline
  def apply(
    currentPage: scala.Int | scala.Double = null,
    firstPage: scala.Int | scala.Double = null,
    lastPage: scala.Int | scala.Double = null,
    order: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    sortKey: java.lang.String = null,
    totalPages: scala.Int | scala.Double = null,
    totalRecords: scala.Int | scala.Double = null
  ): PageableState = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage.asInstanceOf[js.Any])
    if (lastPage != null) __obj.updateDynamic("lastPage")(lastPage.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (sortKey != null) __obj.updateDynamic("sortKey")(sortKey)
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageableState]
  }
}

