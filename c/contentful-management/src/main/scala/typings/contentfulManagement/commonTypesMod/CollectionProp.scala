package typings.contentfulManagement.commonTypesMod

import typings.contentfulManagement.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionProp[TObj] extends js.Object {
  
  var items: js.Array[TObj] = js.native
  
  var limit: Double = js.native
  
  var skip: Double = js.native
  
  var sys: Type = js.native
  
  var total: Double = js.native
}
object CollectionProp {
  
  @scala.inline
  def apply[TObj](items: js.Array[TObj], limit: Double, skip: Double, sys: Type, total: Double): CollectionProp[TObj] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionProp[TObj]]
  }
  
  @scala.inline
  implicit class CollectionPropOps[Self <: CollectionProp[_], TObj] (val x: Self with CollectionProp[TObj]) extends AnyVal {
    
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
    def setItemsVarargs(value: TObj*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[TObj]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: Type): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
