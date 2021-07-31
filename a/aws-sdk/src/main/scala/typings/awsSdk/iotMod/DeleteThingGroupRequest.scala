package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThingGroupRequest extends StObject {
  
  /**
    * The expected version of the thing group to delete.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * The name of the thing group to delete.
    */
  var thingGroupName: ThingGroupName
}
object DeleteThingGroupRequest {
  
  @scala.inline
  def apply(thingGroupName: ThingGroupName): DeleteThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteThingGroupRequestMutableBuilder[Self <: DeleteThingGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    @scala.inline
    def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
  }
}
