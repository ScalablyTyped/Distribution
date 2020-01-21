package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewBillingResponse extends js.Object {
  /**
    * A summary of billing records.
    */
  var BillingRecords: js.UndefOr[typings.awsSdk.route53domainsMod.BillingRecords] = js.native
  /**
    * If there are more billing records than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.native
}

object ViewBillingResponse {
  @scala.inline
  def apply(BillingRecords: BillingRecords = null, NextPageMarker: PageMarker = null): ViewBillingResponse = {
    val __obj = js.Dynamic.literal()
    if (BillingRecords != null) __obj.updateDynamic("BillingRecords")(BillingRecords.asInstanceOf[js.Any])
    if (NextPageMarker != null) __obj.updateDynamic("NextPageMarker")(NextPageMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBillingResponse]
  }
}

