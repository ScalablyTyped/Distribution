package typings.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGroupInput extends js.Object {
  /**
    * The name of the resource group to delete.
    */
  var GroupName: typings.awsSdk.resourcegroupsMod.GroupName = js.native
}

object DeleteGroupInput {
  @scala.inline
  def apply(GroupName: GroupName): DeleteGroupInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteGroupInput]
  }
}

