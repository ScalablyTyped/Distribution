package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskSnapshotsRequest extends js.Object {
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetDiskSnapshots request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetDiskSnapshotsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetDiskSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDiskSnapshotsRequest]
  }
}

