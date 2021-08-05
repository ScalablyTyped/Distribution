package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingGroupProperties extends StObject {
  
  /**
    * The thing group attributes in JSON format.
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.undefined
  
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined
}
object ThingGroupProperties {
  
  inline def apply(): ThingGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupProperties]
  }
  
  extension [Self <: ThingGroupProperties](x: Self) {
    
    inline def setAttributePayload(value: AttributePayload): Self = StObject.set(x, "attributePayload", value.asInstanceOf[js.Any])
    
    inline def setAttributePayloadUndefined: Self = StObject.set(x, "attributePayload", js.undefined)
    
    inline def setThingGroupDescription(value: ThingGroupDescription): Self = StObject.set(x, "thingGroupDescription", value.asInstanceOf[js.Any])
    
    inline def setThingGroupDescriptionUndefined: Self = StObject.set(x, "thingGroupDescription", js.undefined)
  }
}
