package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddThingToThingGroupRequest extends StObject {
  
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
  implicit class AddThingToThingGroupRequestMutableBuilder[Self <: AddThingToThingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrideDynamicGroups(value: OverrideDynamicGroups): Self = StObject.set(x, "overrideDynamicGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideDynamicGroupsUndefined: Self = StObject.set(x, "overrideDynamicGroups", js.undefined)
    
    @scala.inline
    def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    @scala.inline
    def setThingGroupArn(value: ThingGroupArn): Self = StObject.set(x, "thingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupArnUndefined: Self = StObject.set(x, "thingGroupArn", js.undefined)
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupNameUndefined: Self = StObject.set(x, "thingGroupName", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
