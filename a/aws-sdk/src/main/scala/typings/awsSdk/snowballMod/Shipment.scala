package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shipment extends js.Object {
  /**
    * Status information for a shipment.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The tracking number for this job. Using this tracking number with your region's carrier's website, you can track a Snowball as the carrier transports it. For India, the carrier is Amazon Logistics. For all other regions, UPS is the carrier.
    */
  var TrackingNumber: js.UndefOr[String] = js.native
}

object Shipment {
  @scala.inline
  def apply(Status: String = null, TrackingNumber: String = null): Shipment = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TrackingNumber != null) __obj.updateDynamic("TrackingNumber")(TrackingNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shipment]
  }
}

