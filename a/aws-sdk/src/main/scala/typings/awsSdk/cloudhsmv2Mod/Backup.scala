package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Backup extends StObject {
  
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
  implicit class BackupMutableBuilder[Self <: Backup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupState(value: BackupState): Self = StObject.set(x, "BackupState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupStateUndefined: Self = StObject.set(x, "BackupState", js.undefined)
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    @scala.inline
    def setCopyTimestamp(value: Timestamp): Self = StObject.set(x, "CopyTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTimestampUndefined: Self = StObject.set(x, "CopyTimestamp", js.undefined)
    
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    @scala.inline
    def setDeleteTimestamp(value: Timestamp): Self = StObject.set(x, "DeleteTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTimestampUndefined: Self = StObject.set(x, "DeleteTimestamp", js.undefined)
    
    @scala.inline
    def setNeverExpires(value: Boolean): Self = StObject.set(x, "NeverExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverExpiresUndefined: Self = StObject.set(x, "NeverExpires", js.undefined)
    
    @scala.inline
    def setSourceBackup(value: BackupId): Self = StObject.set(x, "SourceBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBackupUndefined: Self = StObject.set(x, "SourceBackup", js.undefined)
    
    @scala.inline
    def setSourceCluster(value: ClusterId): Self = StObject.set(x, "SourceCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceClusterUndefined: Self = StObject.set(x, "SourceCluster", js.undefined)
    
    @scala.inline
    def setSourceRegion(value: Region): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
  }
}
