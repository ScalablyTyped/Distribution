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
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage)
    if (directions != null) __obj.updateDynamic("directions")(directions)
    if (order != null) __obj.updateDynamic("order")(order)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize)
    if (sortKey != null) __obj.updateDynamic("sortKey")(sortKey)
    if (totalPages != null) __obj.updateDynamic("totalPages")(totalPages)
    if (totalRecords != null) __obj.updateDynamic("totalRecords")(totalRecords)
    __obj.asInstanceOf[PageableQueryParams]
  }
}

