package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagOptionDetail extends js.Object {
  
  /**
    * The TagOption active state.
    */
  var Active: js.UndefOr[TagOptionActive] = js.native
  
  /**
    * The TagOption identifier.
    */
  var Id: js.UndefOr[TagOptionId] = js.native
  
  /**
    * The TagOption key.
    */
  var Key: js.UndefOr[TagOptionKey] = js.native
  
  /**
    * The TagOption value.
    */
  var Value: js.UndefOr[TagOptionValue] = js.native
}
object TagOptionDetail {
  
  @scala.inline
  def apply(): TagOptionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptionDetail]
  }
  
  @scala.inline
  implicit class TagOptionDetailOps[Self <: TagOptionDetail] (val x: Self) extends AnyVal {
    
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
    def setActive(value: TagOptionActive): Self = this.set("Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("Active", js.undefined)
    
    @scala.inline
    def setId(value: TagOptionId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setKey(value: TagOptionKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    
    @scala.inline
    def setValue(value: TagOptionValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
