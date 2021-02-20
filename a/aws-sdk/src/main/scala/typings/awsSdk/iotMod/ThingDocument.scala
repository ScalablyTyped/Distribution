package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThingDocument extends StObject {
  
  /**
    * The attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  
  /**
    * Indicates whether the thing is connected to the AWS IoT service.
    */
  var connectivity: js.UndefOr[ThingConnectivity] = js.native
  
  /**
    * The shadow.
    */
  var shadow: js.UndefOr[JsonDocument] = js.native
  
  /**
    * Thing group names.
    */
  var thingGroupNames: js.UndefOr[ThingGroupNameList] = js.native
  
  /**
    * The thing ID.
    */
  var thingId: js.UndefOr[ThingId] = js.native
  
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.native
  
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}
object ThingDocument {
  
  @scala.inline
  def apply(): ThingDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingDocument]
  }
  
  @scala.inline
  implicit class ThingDocumentMutableBuilder[Self <: ThingDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setConnectivity(value: ThingConnectivity): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectivityUndefined: Self = StObject.set(x, "connectivity", js.undefined)
    
    @scala.inline
    def setShadow(value: JsonDocument): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setThingGroupNames(value: ThingGroupNameList): Self = StObject.set(x, "thingGroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupNamesUndefined: Self = StObject.set(x, "thingGroupNames", js.undefined)
    
    @scala.inline
    def setThingGroupNamesVarargs(value: ThingGroupName*): Self = StObject.set(x, "thingGroupNames", js.Array(value :_*))
    
    @scala.inline
    def setThingId(value: ThingId): Self = StObject.set(x, "thingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingIdUndefined: Self = StObject.set(x, "thingId", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
  }
}
