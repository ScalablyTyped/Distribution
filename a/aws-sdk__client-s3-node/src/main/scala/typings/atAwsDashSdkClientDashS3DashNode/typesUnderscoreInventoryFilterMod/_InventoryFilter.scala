package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InventoryFilter extends js.Object {
  /**
    * <p>The prefix that an object must have to be included in the inventory results.</p>
    */
  var Prefix: String
}

object _InventoryFilter {
  @scala.inline
  def apply(Prefix: String): _InventoryFilter = {
    val __obj = js.Dynamic.literal(Prefix = Prefix)
  
    __obj.asInstanceOf[_InventoryFilter]
  }
}

