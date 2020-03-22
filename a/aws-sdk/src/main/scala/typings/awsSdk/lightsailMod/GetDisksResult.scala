package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDisksResult extends js.Object {
  /**
    * An array of objects containing information about all block storage disks.
    */
  var disks: js.UndefOr[DiskList] = js.native
  /**
    * The token to advance to the next page of resutls from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDisks request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object GetDisksResult {
  @scala.inline
  def apply(disks: DiskList = null, nextPageToken: String = null): GetDisksResult = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDisksResult]
  }
}

