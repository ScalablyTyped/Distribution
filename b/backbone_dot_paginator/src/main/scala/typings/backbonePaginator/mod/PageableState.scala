package typings.backbonePaginator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageableState extends js.Object {
  var currentPage: js.UndefOr[Double] = js.native
  var firstPage: js.UndefOr[Double] = js.native
  var lastPage: js.UndefOr[Double] = js.native
  var order: js.UndefOr[Double] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var sortKey: js.UndefOr[String] = js.native
  var totalPages: js.UndefOr[Double] = js.native
  var totalRecords: js.UndefOr[Double] = js.native
}

object PageableState {
  @scala.inline
  def apply(): PageableState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableState]
  }
  @scala.inline
  implicit class PageableStateOps[Self <: PageableState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrentPage(value: Double): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    @scala.inline
    def setFirstPage(value: Double): Self = this.set("firstPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstPage: Self = this.set("firstPage", js.undefined)
    @scala.inline
    def setLastPage(value: Double): Self = this.set("lastPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPage: Self = this.set("lastPage", js.undefined)
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setSortKey(value: String): Self = this.set("sortKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortKey: Self = this.set("sortKey", js.undefined)
    @scala.inline
    def setTotalPages(value: Double): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalPages: Self = this.set("totalPages", js.undefined)
    @scala.inline
    def setTotalRecords(value: Double): Self = this.set("totalRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRecords: Self = this.set("totalRecords", js.undefined)
  }
  
}

