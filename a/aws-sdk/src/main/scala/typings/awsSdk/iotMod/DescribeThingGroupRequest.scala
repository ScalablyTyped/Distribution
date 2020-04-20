package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingGroupRequest extends js.Object {
  /**
    * The name of the thing group.
    */
  var thingGroupName: ThingGroupName = js.native
}

object DescribeThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName): DescribeThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingGroupRequest]
  }
}

