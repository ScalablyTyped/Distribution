package typings.backbonePaginator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageableQueryParams extends js.Object {
  
  var currentPage: js.UndefOr[String] = js.native
  
  var directions: js.UndefOr[js.Any] = js.native
  
  var order: js.UndefOr[String] = js.native
  
  var pageSize: js.UndefOr[String] = js.native
  
  var sortKey: js.UndefOr[String] = js.native
  
  var totalPages: js.UndefOr[String] = js.native
  
  var totalRecords: js.UndefOr[String] = js.native
}
object PageableQueryParams {
  
  @scala.inline
  def apply(): PageableQueryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableQueryParams]
  }
  
  @scala.inline
  implicit class PageableQueryParamsOps[Self <: PageableQueryParams] (val x: Self) extends AnyVal {
    
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
    def setCurrentPage(value: String): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    
    @scala.inline
    def setDirections(value: js.Any): Self = this.set("directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirections: Self = this.set("directions", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setPageSize(value: String): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setSortKey(value: String): Self = this.set("sortKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortKey: Self = this.set("sortKey", js.undefined)
    
    @scala.inline
    def setTotalPages(value: String): Self = this.set("totalPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalPages: Self = this.set("totalPages", js.undefined)
    
    @scala.inline
    def setTotalRecords(value: String): Self = this.set("totalRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalRecords: Self = this.set("totalRecords", js.undefined)
  }
}
