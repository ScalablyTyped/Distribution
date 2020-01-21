package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetDetails extends js.Object {
  var S3SnapshotAsset: js.UndefOr[typings.awsSdk.dataexchangeMod.S3SnapshotAsset] = js.native
}

object AssetDetails {
  @scala.inline
  def apply(S3SnapshotAsset: S3SnapshotAsset = null): AssetDetails = {
    val __obj = js.Dynamic.literal()
    if (S3SnapshotAsset != null) __obj.updateDynamic("S3SnapshotAsset")(S3SnapshotAsset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetDetails]
  }
}

