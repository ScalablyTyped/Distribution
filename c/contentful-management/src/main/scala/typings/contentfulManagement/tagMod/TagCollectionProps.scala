package typings.contentfulManagement.tagMod

import typings.contentfulManagement.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagCollectionProps extends js.Object {
  
  var items: js.Array[TagProps] = js.native
  
  var sys: Type = js.native
  
  var total: Double = js.native
}
object TagCollectionProps {
  
  @scala.inline
  def apply(items: js.Array[TagProps], sys: Type, total: Double): TagCollectionProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagCollectionProps]
  }
  
  @scala.inline
  implicit class TagCollectionPropsOps[Self <: TagCollectionProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: TagProps*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[TagProps]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: Type): Self = this.set("sys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
}
