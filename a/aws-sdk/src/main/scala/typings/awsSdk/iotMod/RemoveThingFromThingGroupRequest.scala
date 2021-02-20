package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveThingFromThingGroupRequest extends StObject {
  
  /**
    * The ARN of the thing to remove from the group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.native
  
  /**
    * The group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.native
  
  /**
    * The group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.native
  
  /**
    * The name of the thing to remove from the group.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}
object RemoveThingFromThingGroupRequest {
  
  @scala.inline
  def apply(): RemoveThingFromThingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveThingFromThingGroupRequest]
  }
  
  @scala.inline
  implicit class RemoveThingFromThingGroupRequestMutableBuilder[Self <: RemoveThingFromThingGroupRequest] (val x: Self) extends AnyVal {
    
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
