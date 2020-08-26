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
  def apply(): UpdateSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSubnetGroupResponse]
  }
  @scala.inline
  implicit class UpdateSubnetGroupResponseOps[Self <: UpdateSubnetGroupResponse] (val x: Self) extends AnyVal {
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
    def setSubnetGroup(value: SubnetGroup): Self = this.set("SubnetGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetGroup: Self = this.set("SubnetGroup", js.undefined)
  }
  
}

