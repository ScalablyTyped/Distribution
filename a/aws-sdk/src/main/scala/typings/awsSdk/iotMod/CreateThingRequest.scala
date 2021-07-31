package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateThingRequest extends StObject {
  
  /**
    * The attribute payload, which consists of up to three name/value pairs in a JSON document. For example:  {\"attributes\":{\"string1\":\"string2\"}} 
    */
  var attributePayload: js.UndefOr[AttributePayload] = js.undefined
  
  /**
    * The name of the billing group the thing will be added to.
    */
  var billingGroupName: js.UndefOr[BillingGroupName] = js.undefined
  
  /**
    * The name of the thing to create. You can't change a thing's name after you create it. To change a thing's name, you must create a new thing, give it the new name, and then delete the old thing.
    */
  var thingName: ThingName
  
  /**
    * The name of the thing type associated with the new thing.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.undefined
}
object CreateThingRequest {
  
  @scala.inline
  def apply(thingName: ThingName): CreateThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingRequest]
  }
  
  @scala.inline
  implicit class CreateThingRequestMutableBuilder[Self <: CreateThingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributePayload(value: AttributePayload): Self = StObject.set(x, "attributePayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributePayloadUndefined: Self = StObject.set(x, "attributePayload", js.undefined)
    
    @scala.inline
    def setBillingGroupName(value: BillingGroupName): Self = StObject.set(x, "billingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingGroupNameUndefined: Self = StObject.set(x, "billingGroupName", js.undefined)
    
    @scala.inline
    def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
  }
}
