package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDynamicThingGroupRequest extends StObject {
  
  /**
    * The expected version of the dynamic thing group to delete.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.native
  
  /**
    * The name of the dynamic thing group to delete.
    */
  var thingGroupName: ThingGroupName = js.native
}
object DeleteDynamicThingGroupRequest {
  
  @scala.inline
  def apply(thingGroupName: ThingGroupName): DeleteDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDynamicThingGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteDynamicThingGroupRequestMutableBuilder[Self <: DeleteDynamicThingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
  }
}
