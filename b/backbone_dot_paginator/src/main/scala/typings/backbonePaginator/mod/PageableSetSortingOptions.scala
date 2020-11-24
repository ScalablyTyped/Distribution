package typings.backbonePaginator.mod

import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageableSetSortingOptions[TModel /* <: Model[_, ModelSetOptions, js.Object] */] extends js.Object {
  
  var full: js.UndefOr[Boolean] = js.native
  
  var side: js.UndefOr[String] = js.native
  
  var sortValue: js.UndefOr[js.Function2[/* model */ TModel, /* sortKey */ String, _ | String]] = js.native
}
object PageableSetSortingOptions {
  
  @scala.inline
  def apply[TModel /* <: Model[_, ModelSetOptions, js.Object] */](): PageableSetSortingOptions[TModel] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableSetSortingOptions[TModel]]
  }
  
  @scala.inline
  implicit class PageableSetSortingOptionsOps[Self <: PageableSetSortingOptions[_], TModel /* <: Model[_, ModelSetOptions, js.Object] */] (val x: Self with PageableSetSortingOptions[TModel]) extends AnyVal {
    
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
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setSide(value: String): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setSortValue(value: (/* model */ TModel, /* sortKey */ String) => _ | String): Self = this.set("sortValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSortValue: Self = this.set("sortValue", js.undefined)
  }
}
