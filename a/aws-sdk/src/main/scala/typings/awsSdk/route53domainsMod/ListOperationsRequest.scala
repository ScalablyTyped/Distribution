package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOperationsRequest extends js.Object {
  /**
    * For an initial request for a list of operations, omit this element. If the number of operations that are not yet complete is greater than the value that you specified for MaxItems, you can use Marker to return additional operations. Get the value of NextPageMarker from the previous response, and submit another request that includes the value of NextPageMarker in the Marker element.
    */
  var Marker: js.UndefOr[PageMarker] = js.native
  /**
    * Number of domains to be returned. Default: 20
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  /**
    * An optional parameter that lets you get information about all the operations that you submitted after a specified date and time. Specify the date and time in Unix time format and Coordinated Universal time (UTC).
    */
  var SubmittedSince: js.UndefOr[Timestamp] = js.native
}

object ListOperationsRequest {
  @scala.inline
  def apply(): ListOperationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOperationsRequest]
  }
  @scala.inline
  implicit class ListOperationsRequestOps[Self <: ListOperationsRequest] (val x: Self) extends AnyVal {
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
    def setMarker(value: PageMarker): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    @scala.inline
    def setSubmittedSince(value: Timestamp): Self = this.set("SubmittedSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmittedSince: Self = this.set("SubmittedSince", js.undefined)
  }
  
}

