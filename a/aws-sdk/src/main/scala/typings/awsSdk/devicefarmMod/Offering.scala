package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offering extends StObject {
  
  /**
    * A string that describes the offering.
    */
  var description: js.UndefOr[Message] = js.undefined
  
  /**
    * The ID that corresponds to a device offering.
    */
  var id: js.UndefOr[OfferingIdentifier] = js.undefined
  
  /**
    * The platform of the device (for example, ANDROID or IOS).
    */
  var platform: js.UndefOr[DevicePlatform] = js.undefined
  
  /**
    * Specifies whether there are recurring charges for the offering.
    */
  var recurringCharges: js.UndefOr[RecurringCharges] = js.undefined
  
  /**
    * The type of offering (for example, RECURRING) for a device.
    */
  var `type`: js.UndefOr[OfferingType] = js.undefined
}
object Offering {
  
  @scala.inline
  def apply(): Offering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offering]
  }
  
  @scala.inline
  implicit class OfferingMutableBuilder[Self <: Offering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Message): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: OfferingIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPlatform(value: DevicePlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setRecurringCharges(value: RecurringCharges): Self = StObject.set(x, "recurringCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurringChargesUndefined: Self = StObject.set(x, "recurringCharges", js.undefined)
    
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "recurringCharges", js.Array(value :_*))
    
    @scala.inline
    def setType(value: OfferingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
