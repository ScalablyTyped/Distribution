package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryResultEntity extends js.Object {
  
  /**
    * The data section in the inventory result entity JSON.
    */
  var Data: js.UndefOr[InventoryResultItemMap] = js.native
  
  /**
    * ID of the inventory result entity. For example, for managed instance inventory the result will be the managed instance ID. For EC2 instance inventory, the result will be the instance ID. 
    */
  var Id: js.UndefOr[InventoryResultEntityId] = js.native
}
object InventoryResultEntity {
  
  @scala.inline
  def apply(): InventoryResultEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryResultEntity]
  }
  
  @scala.inline
  implicit class InventoryResultEntityOps[Self <: InventoryResultEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: InventoryResultItemMap): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setId(value: InventoryResultEntityId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
}
