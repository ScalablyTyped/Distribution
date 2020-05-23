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
}

