package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShippingDetails extends js.Object {
  
  /**
    * The Status and TrackingNumber values for a Snow device being returned to AWS for a particular job.
    */
  var InboundShipment: js.UndefOr[Shipment] = js.native
  
  /**
    * The Status and TrackingNumber values for a Snow device being delivered to the address that you specified for a particular job.
    */
  var OutboundShipment: js.UndefOr[Shipment] = js.native
  
  /**
    * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snow device from the job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional shipping speeds are as follows:   In Australia, you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day.   In the European Union (EU), you have access to express shipping. Typically, Snow devices shipped express are delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically takes less than a week, one way.   In India, Snow device are delivered in one to seven days.   In the United States of America (US), you have access to one-day shipping and two-day shipping.  
    */
  var ShippingOption: js.UndefOr[typings.awsSdk.snowballMod.ShippingOption] = js.native
}
object ShippingDetails {
  
  @scala.inline
  def apply(): ShippingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingDetails]
  }
  
  @scala.inline
  implicit class ShippingDetailsOps[Self <: ShippingDetails] (val x: Self) extends AnyVal {
    
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
    def setInboundShipment(value: Shipment): Self = this.set("InboundShipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboundShipment: Self = this.set("InboundShipment", js.undefined)
    
    @scala.inline
    def setOutboundShipment(value: Shipment): Self = this.set("OutboundShipment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutboundShipment: Self = this.set("OutboundShipment", js.undefined)
    
    @scala.inline
    def setShippingOption(value: ShippingOption): Self = this.set("ShippingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingOption: Self = this.set("ShippingOption", js.undefined)
  }
}
