package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewBillingRequest extends js.Object {
  /**
    * The end date and time for the time period for which you want a list of billing records. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
    */
  var End: js.UndefOr[Timestamp] = js.native
  /**
    * For an initial request for a list of billing records, omit this element. If the number of billing records that are associated with the current AWS account during the specified period is greater than the value that you specified for MaxItems, you can use Marker to return additional billing records. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.  Constraints: The marker must match the value of NextPageMarker that was returned in the previous response.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  /**
    * The number of billing records to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * The beginning date and time for the time period for which you want a list of billing records. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
    */
  var Start: js.UndefOr[Timestamp] = js.native
}

object ViewBillingRequest {
  @scala.inline
  def apply(): ViewBillingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewBillingRequest]
  }
  @scala.inline
  implicit class ViewBillingRequestOps[Self <: ViewBillingRequest] (val x: Self) extends AnyVal {
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
    def setEnd(value: Timestamp): Self = this.set("End", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("End", js.undefined)
    @scala.inline
    def setMarker(value: PageMarker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    @scala.inline
    def setStart(value: Timestamp): Self = this.set("Start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("Start", js.undefined)
  }
  
}

