package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSubnetGroupRequest extends js.Object {
  /**
    * The name of the subnet group to delete.
    */
  var SubnetGroupName: String = js.native
}

object DeleteSubnetGroupRequest {
  @scala.inline
  def apply(SubnetGroupName: String): DeleteSubnetGroupRequest = {
    val __obj = js.Dynamic.literal(SubnetGroupName = SubnetGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSubnetGroupRequest]
  }
}

