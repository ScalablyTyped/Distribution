package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalNodeGroup extends js.Object {
  /**
    * The name of the global node group
    */
  var GlobalNodeGroupId: js.UndefOr[String] = js.native
  /**
    * The keyspace for this node group
    */
  var Slots: js.UndefOr[String] = js.native
}

object GlobalNodeGroup {
  @scala.inline
  def apply(GlobalNodeGroupId: String = null, Slots: String = null): GlobalNodeGroup = {
    val __obj = js.Dynamic.literal()
    if (GlobalNodeGroupId != null) __obj.updateDynamic("GlobalNodeGroupId")(GlobalNodeGroupId.asInstanceOf[js.Any])
    if (Slots != null) __obj.updateDynamic("Slots")(Slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalNodeGroup]
  }
}

