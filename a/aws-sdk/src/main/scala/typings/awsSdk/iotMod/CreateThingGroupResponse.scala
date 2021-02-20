package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateThingGroupResponse extends StObject {
  
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
  implicit class CreateThingGroupResponseMutableBuilder[Self <: CreateThingGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingGroupArn(value: ThingGroupArn): Self = StObject.set(x, "thingGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupArnUndefined: Self = StObject.set(x, "thingGroupArn", js.undefined)
    
    @scala.inline
    def setThingGroupId(value: ThingGroupId): Self = StObject.set(x, "thingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupIdUndefined: Self = StObject.set(x, "thingGroupId", js.undefined)
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupNameUndefined: Self = StObject.set(x, "thingGroupName", js.undefined)
  }
}
