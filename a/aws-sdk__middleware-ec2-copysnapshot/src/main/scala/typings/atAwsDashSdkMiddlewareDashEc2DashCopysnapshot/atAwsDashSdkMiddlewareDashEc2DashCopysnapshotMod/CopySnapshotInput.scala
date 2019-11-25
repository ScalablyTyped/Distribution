package typings.atAwsDashSdkMiddlewareDashEc2DashCopysnapshot.atAwsDashSdkMiddlewareDashEc2DashCopysnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySnapshotInput extends js.Object {
  var DestinationRegion: js.UndefOr[String] = js.undefined
  var PresignedUrl: js.UndefOr[String] = js.undefined
  var SourceRegion: String
}

object CopySnapshotInput {
  @scala.inline
  def apply(SourceRegion: String, DestinationRegion: String = null, PresignedUrl: String = null): CopySnapshotInput = {
    val __obj = js.Dynamic.literal(SourceRegion = SourceRegion.asInstanceOf[js.Any])
    if (DestinationRegion != null) __obj.updateDynamic("DestinationRegion")(DestinationRegion.asInstanceOf[js.Any])
    if (PresignedUrl != null) __obj.updateDynamic("PresignedUrl")(PresignedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotInput]
  }
}

