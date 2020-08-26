package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyBackupToRegionRequest extends js.Object {
  /**
    * The ID of the backup that will be copied to the destination region. 
    */
  var BackupId: typings.awsSdk.cloudhsmv2Mod.BackupId = js.native
  /**
    * The AWS region that will contain your copied CloudHSM cluster backup.
    */
  var DestinationRegion: Region = js.native
  /**
    * Tags to apply to the destination backup during creation. If you specify tags, only these tags will be applied to the destination backup. If you do not specify tags, the service copies tags from the source backup to the destination backup.
    */
  var TagList: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.TagList] = js.native
}

object CopyBackupToRegionRequest {
  @scala.inline
  def apply(BackupId: BackupId, DestinationRegion: Region): CopyBackupToRegionRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], DestinationRegion = DestinationRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyBackupToRegionRequest]
  }
  @scala.inline
  implicit class CopyBackupToRegionRequestOps[Self <: CopyBackupToRegionRequest] (val x: Self) extends AnyVal {
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
    def setBackupId(value: BackupId): Self = this.set("BackupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationRegion(value: Region): Self = this.set("DestinationRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
  }
  
}

