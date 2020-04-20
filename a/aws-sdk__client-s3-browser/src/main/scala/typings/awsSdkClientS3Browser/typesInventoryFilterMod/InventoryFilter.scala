package typings.awsSdkClientS3Browser.typesInventoryFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryFilter extends js.Object {
  /**
    * <p>The prefix that an object must have to be included in the inventory results.</p>
    */
  var Prefix: String
}

object InventoryFilter {
  @scala.inline
  def apply(Prefix: String): InventoryFilter = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
}

