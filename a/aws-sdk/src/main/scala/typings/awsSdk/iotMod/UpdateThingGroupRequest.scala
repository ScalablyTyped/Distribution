package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingGroupRequest extends StObject {
  
  /**
    * The expected version of the thing group. If this does not match the version of the thing group being updated, the update will fail.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * The thing group to update.
    */
  var thingGroupName: ThingGroupName
  
  /**
    * The thing group properties.
    */
  var thingGroupProperties: ThingGroupProperties
}
object UpdateThingGroupRequest {
  
  inline def apply(thingGroupName: ThingGroupName, thingGroupProperties: ThingGroupProperties): UpdateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any], thingGroupProperties = thingGroupProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingGroupRequest]
  }
  
  extension [Self <: UpdateThingGroupRequest](x: Self) {
    
    inline def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    inline def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    inline def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    inline def setThingGroupProperties(value: ThingGroupProperties): Self = StObject.set(x, "thingGroupProperties", value.asInstanceOf[js.Any])
  }
}
