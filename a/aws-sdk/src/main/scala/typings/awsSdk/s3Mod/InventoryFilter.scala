package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryFilter extends js.Object {
  /**
    * The prefix that an object must have to be included in the inventory results.
    */
  var Prefix: typings.awsSdk.s3Mod.Prefix = js.native
}

object InventoryFilter {
  @scala.inline
  def apply(Prefix: Prefix): InventoryFilter = {
    val __obj = js.Dynamic.literal(Prefix = Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventoryFilter]
  }
}

