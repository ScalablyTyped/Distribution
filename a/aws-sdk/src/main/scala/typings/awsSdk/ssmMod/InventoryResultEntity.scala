package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InventoryResultEntity extends StObject {
  
  /**
    * The data section in the inventory result entity JSON.
    */
  var Data: js.UndefOr[InventoryResultItemMap] = js.undefined
  
  /**
    * ID of the inventory result entity. For example, for managed instance inventory the result will be the managed instance ID. For EC2 instance inventory, the result will be the instance ID. 
    */
  var Id: js.UndefOr[InventoryResultEntityId] = js.undefined
}
object InventoryResultEntity {
  
  @scala.inline
  def apply(): InventoryResultEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryResultEntity]
  }
  
  @scala.inline
  implicit class InventoryResultEntityMutableBuilder[Self <: InventoryResultEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: InventoryResultItemMap): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    @scala.inline
    def setId(value: InventoryResultEntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
