package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyBackupToRegionResponse extends js.Object {
  /**
    * Information on the backup that will be copied to the destination region, including CreateTimestamp, SourceBackup, SourceCluster, and Source Region. CreateTimestamp of the destination backup will be the same as that of the source backup. You will need to use the sourceBackupID returned in this operation to use the DescribeBackups operation on the backup that will be copied to the destination region.
    */
  var DestinationBackup: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.DestinationBackup] = js.native
}

object CopyBackupToRegionResponse {
  @scala.inline
  def apply(): CopyBackupToRegionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyBackupToRegionResponse]
  }
  @scala.inline
  implicit class CopyBackupToRegionResponseOps[Self <: CopyBackupToRegionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationBackup(value: DestinationBackup): Self = this.set("DestinationBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationBackup: Self = this.set("DestinationBackup", js.undefined)
  }
  
}

