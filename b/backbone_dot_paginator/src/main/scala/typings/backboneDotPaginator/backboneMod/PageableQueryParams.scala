package typings.backboneDotPaginator.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageableQueryParams extends js.Object {
  var currentPage: js.UndefOr[String] = js.undefined
  var directions: js.UndefOr[js.Any] = js.undefined
  var order: js.UndefOr[String] = js.undefined
  var pageSize: js.UndefOr[String] = js.undefined
  var sortKey: js.UndefOr[String] = js.undefined
  var totalPages: js.UndefOr[String] = js.undefined
  var totalRecords: js.UndefOr[String] = js.undefined
}

object PageableQueryParams {
  @scala.inline
  def apply(
    currentPage: String = null,
    directions: js.Any = null,
    order: String = null,
    pageSize: String = null,
    sortKey: String = null,
    totalPages: String = null,
    totalRecords: String = null
  ): PageableQueryParams = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (directions != null) __obj.updateDynamic("directions")(directions.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (sortKey != null) __obj.updateDynamic("sortKey")(sortKey.asInstanceOf[js.Any])
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages.asInstanceOf[js.Any])
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageableQueryParams]
  }
}

