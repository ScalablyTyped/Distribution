package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Greengrass extends js.Object {
  /**
    * The ARN of the Greengrass group. For more information about how to find a group's ARN, see ListGroups and GetGroup in the AWS IoT Greengrass API Reference.
    */
  var groupArn: ARN = js.native
}

object Greengrass {
  @scala.inline
  def apply(groupArn: ARN): Greengrass = {
    val __obj = js.Dynamic.literal(groupArn = groupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Greengrass]
  }
  @scala.inline
  implicit class GreengrassOps[Self <: Greengrass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupArn(value: ARN): Self = this.set("groupArn", value.asInstanceOf[js.Any])
  }
  
}

