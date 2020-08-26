package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingGroupResponse extends js.Object {
  /**
    * The thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.native
  /**
    * The thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
}

object CreateThingGroupResponse {
  @scala.inline
  def apply(): CreateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThingGroupResponse]
  }
  @scala.inline
  implicit class CreateThingGroupResponseOps[Self <: CreateThingGroupResponse] (val x: Self) extends AnyVal {
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
    def setThingGroupArn(value: ThingGroupArn): Self = this.set("thingGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupArn: Self = this.set("thingGroupArn", js.undefined)
    @scala.inline
    def setThingGroupId(value: ThingGroupId): Self = this.set("thingGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupId: Self = this.set("thingGroupId", js.undefined)
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = this.set("thingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThingGroupName: Self = this.set("thingGroupName", js.undefined)
  }
  
}

