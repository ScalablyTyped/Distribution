package typings.cachefactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemInfo extends js.Object {
  
  var accessed: js.UndefOr[Double] = js.native
  
  var created: js.UndefOr[Double] = js.native
  
  var expires: js.UndefOr[Double] = js.native
  
  var isExpired: js.UndefOr[Boolean] = js.native
}
object ItemInfo {
  
  @scala.inline
  def apply(): ItemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemInfo]
  }
  
  @scala.inline
  implicit class ItemInfoOps[Self <: ItemInfo] (val x: Self) extends AnyVal {
    
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
    def setAccessed(value: Double): Self = this.set("accessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessed: Self = this.set("accessed", js.undefined)
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setIsExpired(value: Boolean): Self = this.set("isExpired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsExpired: Self = this.set("isExpired", js.undefined)
  }
}
