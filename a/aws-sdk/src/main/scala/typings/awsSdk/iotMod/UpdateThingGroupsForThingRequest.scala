package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateThingGroupsForThingRequest extends js.Object {
  
  /**
    * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.native
  
  /**
    * The groups to which the thing will be added.
    */
  var thingGroupsToAdd: js.UndefOr[ThingGroupList] = js.native
  
  /**
    * The groups from which the thing will be removed.
    */
  var thingGroupsToRemove: js.UndefOr[ThingGroupList] = js.native
  
  /**
    * The thing whose group memberships will be updated.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}
object UpdateThingGroupsForThingRequest {
  
  @scala.inline
  def apply(): UpdateThingGroupsForThingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThingGroupsForThingRequest]
  }
  
  @scala.inline
  implicit class UpdateThingGroupsForThingRequestOps[Self <: UpdateThingGroupsForThingRequest] (val x: Self) extends AnyVal {
    
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
    def setThingGroupsToAddVarargs(value: ThingGroupName*): Self = this.set("thingGroupsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setThingGroupsToAdd(value: ThingGroupList): Self = this.set("thingGroupsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingGroupsToAdd: Self = this.set("thingGroupsToAdd", js.undefined)
    
    @scala.inline
    def setThingGroupsToRemoveVarargs(value: ThingGroupName*): Self = this.set("thingGroupsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setThingGroupsToRemove(value: ThingGroupList): Self = this.set("thingGroupsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingGroupsToRemove: Self = this.set("thingGroupsToRemove", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = this.set("thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingName: Self = this.set("thingName", js.undefined)
  }
}
