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
  @scala.inline
  implicit class DescribeThingGroupRequestOps[Self <: DescribeThingGroupRequest] (val x: Self) extends AnyVal {
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
    def setThingGroupName(value: ThingGroupName): Self = this.set("thingGroupName", value.asInstanceOf[js.Any])
  }
  
}

