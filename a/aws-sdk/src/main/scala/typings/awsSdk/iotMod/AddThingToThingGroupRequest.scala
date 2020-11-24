package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddThingToThingGroupRequest extends js.Object {
  
  /**
    * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.native
  
  /**
    * The ARN of the thing to add to a group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  
  /**
    * The ARN of the group to which you are adding a thing.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  
  /**
    * The name of the group to which you are adding a thing.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
  
  /**
    * The name of the thing to add to a group.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}
object AddThingToThingGroupRequest {
  
  @scala.inline
  def apply(): AddThingToThingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddThingToThingGroupRequest]
  }
  
  @scala.inline
  implicit class AddThingToThingGroupRequestOps[Self <: AddThingToThingGroupRequest] (val x: Self) extends AnyVal {
    
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
    def setOverrideDynamicGroups(value: OverrideDynamicGroups): Self = this.set("overrideDynamicGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideDynamicGroups: Self = this.set("overrideDynamicGroups", js.undefined)
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = this.set("thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingArn: Self = this.set("thingArn", js.undefined)
    
    @scala.inline
    def setThingGroupArn(value: ThingGroupArn): Self = this.set("thingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingGroupArn: Self = this.set("thingGroupArn", js.undefined)
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = this.set("thingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingGroupName: Self = this.set("thingGroupName", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
  }
}
