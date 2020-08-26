package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubnetGroupRequest extends js.Object {
  /**
    * A description for the subnet group
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * A name for the subnet group. This value is stored as a lowercase string. 
    */
  var SubnetGroupName: String = js.native
  /**
    * A list of VPC subnet IDs for the subnet group.
    */
  var SubnetIds: SubnetIdentifierList = js.native
}

object CreateSubnetGroupRequest {
  @scala.inline
  def apply(SubnetGroupName: String, SubnetIds: SubnetIdentifierList): CreateSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubnetGroupRequest]
  }
  @scala.inline
  implicit class CreateSubnetGroupRequestOps[Self <: CreateSubnetGroupRequest] (val x: Self) extends AnyVal {
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
    def setSubnetIdsVarargs(value: String*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetIdentifierList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

