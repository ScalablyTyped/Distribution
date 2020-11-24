package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backup extends js.Object {
  
  /**
    * The identifier (ID) of the backup.
    */
  var BackupId: typings.awsSdk.cloudhsmv2Mod.BackupId = js.native
  
  /**
    * The state of the backup.
    */
  var BackupState: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.BackupState] = js.native
  
  /**
    * The identifier (ID) of the cluster that was backed up.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.ClusterId] = js.native
  
  /**
    * The date and time when the backup was copied from a source backup.
    */
  var CopyTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time when the backup was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time when the backup will be permanently deleted.
    */
  var DeleteTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * Specifies whether the service should exempt a backup from the retention policy for the cluster. True exempts a backup from the retention policy. False means the service applies the backup retention policy defined at the cluster.
    */
  var NeverExpires: js.UndefOr[Boolean] = js.native
  
  /**
    * The identifier (ID) of the source backup from which the new backup was copied.
    */
  var SourceBackup: js.UndefOr[BackupId] = js.native
  
  /**
    * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
    */
  var SourceCluster: js.UndefOr[ClusterId] = js.native
  
  /**
    * The AWS Region that contains the source backup from which the new backup was copied.
    */
  var SourceRegion: js.UndefOr[Region] = js.native
  
  /**
    * The list of tags for the backup.
    */
  var TagList: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.TagList] = js.native
}
object Backup {
  
  @scala.inline
  def apply(BackupId: BackupId): Backup = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
  
  @scala.inline
  implicit class BackupOps[Self <: Backup] (val x: Self) extends AnyVal {
    
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
    def setBackupState(value: BackupState): Self = this.set("BackupState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupState: Self = this.set("BackupState", js.undefined)
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterId: Self = this.set("ClusterId", js.undefined)
    
    @scala.inline
    def setCopyTimestamp(value: Timestamp): Self = this.set("CopyTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTimestamp: Self = this.set("CopyTimestamp", js.undefined)
    
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = this.set("CreateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTimestamp: Self = this.set("CreateTimestamp", js.undefined)
    
    @scala.inline
    def setDeleteTimestamp(value: Timestamp): Self = this.set("DeleteTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTimestamp: Self = this.set("DeleteTimestamp", js.undefined)
    
    @scala.inline
    def setNeverExpires(value: Boolean): Self = this.set("NeverExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeverExpires: Self = this.set("NeverExpires", js.undefined)
    
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
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagList: Self = this.set("TagList", js.undefined)
  }
}
