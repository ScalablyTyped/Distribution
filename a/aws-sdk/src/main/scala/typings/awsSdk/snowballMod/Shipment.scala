package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shipment extends StObject {
  
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
  implicit class ShipmentMutableBuilder[Self <: Shipment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTrackingNumber(value: String): Self = StObject.set(x, "TrackingNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingNumberUndefined: Self = StObject.set(x, "TrackingNumber", js.undefined)
  }
}
