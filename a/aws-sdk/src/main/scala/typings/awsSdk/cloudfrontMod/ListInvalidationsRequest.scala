package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvalidationsRequest extends js.Object {
  /**
    * The distribution's ID.
    */
  var DistributionId: String = js.native
  /**
    * Use this parameter when paginating results to indicate where to begin in your list of invalidation batches. Because the results are returned in decreasing order from most recent to oldest, the most recent results are on the first page, the second page will contain earlier results, and so on. To get the next page of results, set Marker to the value of the NextMarker from the current page's response. This value is the same as the ID of the last invalidation batch on that page. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of invalidation batches that you want in the response body.
    */
  var MaxItems: js.UndefOr[String] = js.native
}

object ListInvalidationsRequest {
  @scala.inline
  def apply(DistributionId: String, Marker: String = null, MaxItems: String = null): ListInvalidationsRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInvalidationsRequest]
  }
}

