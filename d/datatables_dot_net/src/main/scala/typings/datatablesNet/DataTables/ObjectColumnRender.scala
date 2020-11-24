package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectColumnRender extends js.Object {
  
  @JSName("_")
  var _underscore: js.UndefOr[String | Double | FunctionColumnRender] = js.native
  
  var display: js.UndefOr[String | Double | FunctionColumnRender] = js.native
  
  var filter: js.UndefOr[String | Double | FunctionColumnRender] = js.native
  
  var sort: js.UndefOr[String | Double | FunctionColumnRender] = js.native
  
  var `type`: js.UndefOr[String | Double | FunctionColumnRender] = js.native
}
object ObjectColumnRender {
  
  @scala.inline
  def apply(): ObjectColumnRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectColumnRender]
  }
  
  @scala.inline
  implicit class ObjectColumnRenderOps[Self <: ObjectColumnRender] (val x: Self) extends AnyVal {
    
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
    def set_underscoreFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = this.set("_", js.Any.fromFunction4(value))
    
    @scala.inline
    def set_underscore(value: String | Double | FunctionColumnRender): Self = this.set("_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_underscore: Self = this.set("_", js.undefined)
    
    @scala.inline
    def setDisplayFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = this.set("display", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDisplay(value: String | Double | FunctionColumnRender): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setFilterFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = this.set("filter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFilter(value: String | Double | FunctionColumnRender): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setSortFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = this.set("sort", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSort(value: String | Double | FunctionColumnRender): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setTypeFunction4(
      value: (/* data */ js.Any, /* type */ js.Any, /* row */ js.Any, /* meta */ CellMetaSettings) => js.Any
    ): Self = this.set("type", js.Any.fromFunction4(value))
    
    @scala.inline
    def setType(value: String | Double | FunctionColumnRender): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
