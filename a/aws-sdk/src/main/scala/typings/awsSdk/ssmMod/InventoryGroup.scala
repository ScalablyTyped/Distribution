package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryGroup extends js.Object {
  
  /**
    * Filters define the criteria for the group. The matchingCount field displays the number of resources that match the criteria. The notMatchingCount field displays the number of resources that don't match the criteria. 
    */
  var Filters: InventoryFilterList = js.native
  
  /**
    * The name of the group.
    */
  var Name: InventoryGroupName = js.native
}
object InventoryGroup {
  
  @scala.inline
  def apply(Filters: InventoryFilterList, Name: InventoryGroupName): InventoryGroup = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryGroup]
  }
  
  @scala.inline
  implicit class InventoryGroupOps[Self <: InventoryGroup] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: InventoryFilter*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: InventoryFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: InventoryGroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
