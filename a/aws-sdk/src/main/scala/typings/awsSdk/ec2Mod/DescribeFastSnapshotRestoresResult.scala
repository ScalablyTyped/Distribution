package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFastSnapshotRestoresResult extends js.Object {
  /**
    * Information about the state of fast snapshot restores.
    */
  var FastSnapshotRestores: js.UndefOr[DescribeFastSnapshotRestoreSuccessSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}

object DescribeFastSnapshotRestoresResult {
  @scala.inline
  def apply(FastSnapshotRestores: DescribeFastSnapshotRestoreSuccessSet = null, NextToken: NextToken = null): DescribeFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    if (FastSnapshotRestores != null) __obj.updateDynamic("FastSnapshotRestores")(FastSnapshotRestores.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFastSnapshotRestoresResult]
  }
}

