package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offering extends js.Object {
  
  /**
    * A string that describes the offering.
    */
  var description: js.UndefOr[Message] = js.native
  
  /**
    * The ID that corresponds to a device offering.
    */
  var id: js.UndefOr[OfferingIdentifier] = js.native
  
  /**
    * The platform of the device (for example, ANDROID or IOS).
    */
  var platform: js.UndefOr[DevicePlatform] = js.native
  
  /**
    * Specifies whether there are recurring charges for the offering.
    */
  var recurringCharges: js.UndefOr[RecurringCharges] = js.native
  
  /**
    * The type of offering (for example, RECURRING) for a device.
    */
  var `type`: js.UndefOr[OfferingType] = js.native
}
object Offering {
  
  @scala.inline
  def apply(): Offering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offering]
  }
  
  @scala.inline
  implicit class OfferingOps[Self <: Offering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: Message): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setId(value: OfferingIdentifier): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPlatform(value: DevicePlatform): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = this.set("recurringCharges", js.Array(value :_*))
    
    @scala.inline
    def setRecurringCharges(value: RecurringCharges): Self = this.set("recurringCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurringCharges: Self = this.set("recurringCharges", js.undefined)
    
    @scala.inline
    def setType(value: OfferingType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
