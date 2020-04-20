package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

