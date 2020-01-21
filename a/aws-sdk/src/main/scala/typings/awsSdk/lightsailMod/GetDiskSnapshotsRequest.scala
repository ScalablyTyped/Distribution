package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskSnapshotsRequest extends js.Object {
  /**
    * A token used for advancing to the next page of results from your GetDiskSnapshots request.
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

