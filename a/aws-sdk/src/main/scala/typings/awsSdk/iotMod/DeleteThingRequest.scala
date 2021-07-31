package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteThingRequest extends StObject {
  
  /**
    * The expected version of the thing record in the registry. If the version of the record in the registry does not match the expected version specified in the request, the DeleteThing request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * The name of the thing to delete.
    */
  var thingName: ThingName
}
object DeleteThingRequest {
  
  @scala.inline
  def apply(thingName: ThingName): DeleteThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingRequest]
  }
  
  @scala.inline
  implicit class DeleteThingRequestMutableBuilder[Self <: DeleteThingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
