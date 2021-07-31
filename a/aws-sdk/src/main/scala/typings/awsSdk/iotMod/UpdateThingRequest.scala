package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingRequest extends StObject {
  
  /**
    * A list of thing attributes, a JSON string containing name-value pairs. For example:  {\"attributes\":{\"name1\":\"value2\"}}  This data is used to add new attributes or update existing attributes.
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.undefined
  
  /**
    * The expected version of the thing record in the registry. If the version of the record in the registry does not match the expected version specified in the request, the UpdateThing request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * Remove a thing type association. If true, the association is removed.
    */
  var removeThingType: js.UndefOr[RemoveThingType] = js.undefined
  
  /**
    * The name of the thing to update. You can't change a thing's name. To change a thing's name, you must create a new thing, give it the new name, and then delete the old thing.
    */
  var thingName: ThingName
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}
object UpdateThingRequest {
  
  @scala.inline
  def apply(thingName: ThingName): UpdateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingRequest]
  }
  
  @scala.inline
  implicit class UpdateThingRequestMutableBuilder[Self <: UpdateThingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributePayload(value: AttributePayload): Self = StObject.set(x, "attributePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributePayloadUndefined: Self = StObject.set(x, "attributePayload", js.undefined)
    
    @scala.inline
    def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    @scala.inline
    def setRemoveThingType(value: RemoveThingType): Self = StObject.set(x, "removeThingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveThingTypeUndefined: Self = StObject.set(x, "removeThingType", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
  }
}
