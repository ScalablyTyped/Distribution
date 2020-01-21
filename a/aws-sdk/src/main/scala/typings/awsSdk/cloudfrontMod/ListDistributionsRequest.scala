package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDistributionsRequest extends js.Object {
  /**
    * Use this when paginating results to indicate where to begin in your list of distributions. The results include distributions in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last distribution on that page).
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of distributions you want in the response body.
    */
  var MaxItems: js.UndefOr[String] = js.native
}

object ListDistributionsRequest {
  @scala.inline
  def apply(Marker: String = null, MaxItems: String = null): ListDistributionsRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsRequest]
  }
}

