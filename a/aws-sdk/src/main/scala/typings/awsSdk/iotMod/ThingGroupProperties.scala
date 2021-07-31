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
  
  @scala.inline
  def apply(): ThingGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingGroupProperties]
  }
  
  @scala.inline
  implicit class ThingGroupPropertiesMutableBuilder[Self <: ThingGroupProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributePayload(value: AttributePayload): Self = StObject.set(x, "attributePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributePayloadUndefined: Self = StObject.set(x, "attributePayload", js.undefined)
    
    @scala.inline
    def setThingGroupDescription(value: ThingGroupDescription): Self = StObject.set(x, "thingGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingGroupDescriptionUndefined: Self = StObject.set(x, "thingGroupDescription", js.undefined)
  }
}
