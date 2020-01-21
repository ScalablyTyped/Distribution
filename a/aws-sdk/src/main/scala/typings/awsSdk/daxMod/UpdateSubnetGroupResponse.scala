package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubnetGroupResponse extends js.Object {
  /**
    * The subnet group that has been modified.
    */
  var SubnetGroup: js.UndefOr[typings.awsSdk.daxMod.SubnetGroup] = js.native
}

object UpdateSubnetGroupResponse {
  @scala.inline
  def apply(SubnetGroup: SubnetGroup = null): UpdateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (SubnetGroup != null) __obj.updateDynamic("SubnetGroup")(SubnetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubnetGroupResponse]
  }
}

