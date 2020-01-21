package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExportSnapshotRecordsRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get export snapshot records request.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object GetExportSnapshotRecordsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetExportSnapshotRecordsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExportSnapshotRecordsRequest]
  }
}

