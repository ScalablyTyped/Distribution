package typings.backbonePaginator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageableInitialOptions extends js.Object {
  
  var comparator: js.UndefOr[js.Function1[/* repeated */ js.Any, Double]] = js.native
  
  var full: js.UndefOr[Boolean] = js.native
  
  var queryParam: js.UndefOr[PageableQueryParams] = js.native
  
  var state: js.UndefOr[PageableState] = js.native
}
object PageableInitialOptions {
  
  @scala.inline
  def apply(): PageableInitialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageableInitialOptions]
  }
  
  @scala.inline
  implicit class PageableInitialOptionsOps[Self <: PageableInitialOptions] (val x: Self) extends AnyVal {
    
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
    def setComparator(value: /* repeated */ js.Any => Double): Self = this.set("comparator", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
    
    @scala.inline
    def setFull(value: Boolean): Self = this.set("full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    
    @scala.inline
    def setQueryParam(value: PageableQueryParams): Self = this.set("queryParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParam: Self = this.set("queryParam", js.undefined)
    
    @scala.inline
    def setState(value: PageableState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
