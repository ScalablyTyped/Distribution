package typings.awsSdkClientDynamodbBrowser.typesCapacityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capacity extends js.Object {
  /**
    * <p>The total number of capacity units consumed on a table or an index.</p>
    */
  var CapacityUnits: js.UndefOr[Double] = js.undefined
}

object Capacity {
  @scala.inline
  def apply(CapacityUnits: Int | Double = null): Capacity = {
    val __obj = js.Dynamic.literal()
    if (CapacityUnits != null) __obj.updateDynamic("CapacityUnits")(CapacityUnits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capacity]
  }
}

