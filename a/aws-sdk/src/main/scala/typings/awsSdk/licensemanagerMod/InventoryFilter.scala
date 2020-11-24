package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryFilter extends js.Object {
  
  /**
    * Condition of the filter.
    */
  var Condition: InventoryFilterCondition = js.native
  
  /**
    * Name of the filter.
    */
  var Name: String = js.native
  
  /**
    * Value of the filter.
    */
  var Value: js.UndefOr[String] = js.native
}
object InventoryFilter {
  
  @scala.inline
  def apply(Condition: InventoryFilterCondition, Name: String): InventoryFilter = {
    val __obj = js.Dynamic.literal(Condition = Condition.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
  
  @scala.inline
  implicit class InventoryFilterOps[Self <: InventoryFilter] (val x: Self) extends AnyVal {
    
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
    def setCondition(value: InventoryFilterCondition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
