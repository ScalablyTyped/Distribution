package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestinationBackup extends js.Object {
  /**
    * The date and time when both the source backup was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier (ID) of the source backup from which the new backup was copied.
    */
  var SourceBackup: js.UndefOr[BackupId] = js.native
  /**
    * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
    */
  var SourceCluster: js.UndefOr[ClusterId] = js.native
  /**
    * The AWS region that contains the source backup from which the new backup was copied.
    */
  var SourceRegion: js.UndefOr[Region] = js.native
}

object DestinationBackup {
  @scala.inline
  def apply(): DestinationBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationBackup]
  }
  @scala.inline
  implicit class DestinationBackupOps[Self <: DestinationBackup] (val x: Self) extends AnyVal {
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
    def setCreateTimestamp(value: Timestamp): Self = this.set("CreateTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTimestamp: Self = this.set("CreateTimestamp", js.undefined)
    @scala.inline
    def setSourceBackup(value: BackupId): Self = this.set("SourceBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceBackup: Self = this.set("SourceBackup", js.undefined)
    @scala.inline
    def setSourceCluster(value: ClusterId): Self = this.set("SourceCluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceCluster: Self = this.set("SourceCluster", js.undefined)
    @scala.inline
    def setSourceRegion(value: Region): Self = this.set("SourceRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRegion: Self = this.set("SourceRegion", js.undefined)
  }
  
}

