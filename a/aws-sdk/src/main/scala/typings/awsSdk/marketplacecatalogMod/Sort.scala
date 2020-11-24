package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sort extends js.Object {
  
  /**
    * For ListEntities, supported attributes include LastModifiedDate (default), Visibility, EntityId, and Name. For ListChangeSets, supported attributes include StartTime and EndTime.
    */
  var SortBy: js.UndefOr[typings.awsSdk.marketplacecatalogMod.SortBy] = js.native
  
  /**
    * The sorting order. Can be ASCENDING or DESCENDING. The default value is DESCENDING.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.marketplacecatalogMod.SortOrder] = js.native
}
object Sort {
  
  @scala.inline
  def apply(): Sort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sort]
  }
  
  @scala.inline
  implicit class SortOps[Self <: Sort] (val x: Self) extends AnyVal {
    
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
    def setSortBy(value: SortBy): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = this.set("SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("SortOrder", js.undefined)
  }
}
