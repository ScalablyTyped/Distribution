package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingDocument extends StObject {
  
  /**
    * The attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * Indicates whether the thing is connected to the AWS IoT service.
    */
  var connectivity: js.UndefOr[ThingConnectivity] = js.undefined
  
  /**
    * The shadow.
    */
  var shadow: js.UndefOr[JsonDocument] = js.undefined
  
  /**
    * Thing group names.
    */
  var thingGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined
  
  /**
    * The thing ID.
    */
  var thingId: js.UndefOr[ThingId] = js.undefined
  
  /**
    * The thing name.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
  
  /**
    * The thing type name.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}
object ThingDocument {
  
  inline def apply(): ThingDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingDocument]
  }
  
  extension [Self <: ThingDocument](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setConnectivity(value: ThingConnectivity): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    inline def setConnectivityUndefined: Self = StObject.set(x, "connectivity", js.undefined)
    
    inline def setShadow(value: JsonDocument): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setThingGroupNames(value: ThingGroupNameList): Self = StObject.set(x, "thingGroupNames", value.asInstanceOf[js.Any])
    
    inline def setThingGroupNamesUndefined: Self = StObject.set(x, "thingGroupNames", js.undefined)
    
    inline def setThingGroupNamesVarargs(value: ThingGroupName*): Self = StObject.set(x, "thingGroupNames", js.Array(value :_*))
    
    inline def setThingId(value: ThingId): Self = StObject.set(x, "thingId", value.asInstanceOf[js.Any])
    
    inline def setThingIdUndefined: Self = StObject.set(x, "thingId", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
    
    inline def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    inline def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
  }
}
