package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shipment extends js.Object {
  
  /**
    * Status information for a shipment.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track a Snow device as the carrier transports it. For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
    */
  var TrackingNumber: js.UndefOr[String] = js.native
}
object Shipment {
  
  @scala.inline
  def apply(): Shipment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shipment]
  }
  
  @scala.inline
  implicit class ShipmentOps[Self <: Shipment] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setTrackingNumber(value: String): Self = this.set("TrackingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackingNumber: Self = this.set("TrackingNumber", js.undefined)
  }
}
