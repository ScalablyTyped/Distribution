package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFieldLevelEncryptionProfilesRequest extends js.Object {
  /**
    * Use this when paginating results to indicate where to begin in your list of profiles. The results include profiles in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last profile on that page). 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of field-level encryption profiles you want in the response body. 
    */
  var MaxItems: js.UndefOr[String] = js.native
}

object ListFieldLevelEncryptionProfilesRequest {
  @scala.inline
  def apply(Marker: String = null, MaxItems: String = null): ListFieldLevelEncryptionProfilesRequest = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFieldLevelEncryptionProfilesRequest]
  }
}

