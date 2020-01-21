package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPublicKeysRequest extends js.Object {
  /**
    * Use this when paginating results to indicate where to begin in your list of public keys. The results include public keys in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last public key on that page). 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of public keys you want in the response body. 
    */
  var MaxItems: js.UndefOr[String] = js.native
}

object ListPublicKeysRequest {
  @scala.inline
  def apply(Marker: String = null, MaxItems: String = null): ListPublicKeysRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPublicKeysRequest]
  }
}

