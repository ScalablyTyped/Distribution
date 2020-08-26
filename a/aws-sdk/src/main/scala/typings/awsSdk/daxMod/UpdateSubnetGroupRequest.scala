package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSubnetGroupRequest extends js.Object {
  /**
    * A description of the subnet group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the subnet group.
    */
  var SubnetGroupName: String = js.native
  /**
    * A list of subnet IDs in the subnet group.
    */
  var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.native
}

object UpdateSubnetGroupRequest {
  @scala.inline
  def apply(SubnetGroupName: String): UpdateSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSubnetGroupRequest]
  }
  @scala.inline
  implicit class UpdateSubnetGroupRequestOps[Self <: UpdateSubnetGroupRequest] (val x: Self) extends AnyVal {
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
    def setSubnetGroupName(value: String): Self = this.set("SubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
  }
  
}

