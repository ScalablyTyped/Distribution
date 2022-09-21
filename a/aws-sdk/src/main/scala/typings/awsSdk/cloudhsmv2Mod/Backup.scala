package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backup extends StObject {
  
  /**
    * The identifier (ID) of the backup.
    */
  var BackupId: typings.awsSdk.cloudhsmv2Mod.BackupId
  
  /**
    * The state of the backup.
    */
  var BackupState: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.BackupState] = js.undefined
  
  /**
    * The identifier (ID) of the cluster that was backed up.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.ClusterId] = js.undefined
  
  /**
    * The date and time when the backup was copied from a source backup.
    */
  var CopyTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the backup was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the backup will be permanently deleted.
    */
  var DeleteTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies whether the service should exempt a backup from the retention policy for the cluster. True exempts a backup from the retention policy. False means the service applies the backup retention policy defined at the cluster.
    */
  var NeverExpires: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier (ID) of the source backup from which the new backup was copied.
    */
  var SourceBackup: js.UndefOr[BackupId] = js.undefined
  
  /**
    * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
    */
  var SourceCluster: js.UndefOr[ClusterId] = js.undefined
  
  /**
    * The AWS Region that contains the source backup from which the new backup was copied.
    */
  var SourceRegion: js.UndefOr[Region] = js.undefined
  
  /**
    * The list of tags for the backup.
    */
  var TagList: js.UndefOr[typings.awsSdk.cloudhsmv2Mod.TagList] = js.undefined
}
object Backup {
  
  inline def apply(BackupId: BackupId): Backup = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backup]
  }
  
  extension [Self <: Backup](x: Self) {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    inline def setBackupState(value: BackupState): Self = StObject.set(x, "BackupState", value.asInstanceOf[js.Any])
    
    inline def setBackupStateUndefined: Self = StObject.set(x, "BackupState", js.undefined)
    
    inline def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdUndefined: Self = StObject.set(x, "ClusterId", js.undefined)
    
    inline def setCopyTimestamp(value: js.Date): Self = StObject.set(x, "CopyTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCopyTimestampUndefined: Self = StObject.set(x, "CopyTimestamp", js.undefined)
    
    inline def setCreateTimestamp(value: js.Date): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    inline def setDeleteTimestamp(value: js.Date): Self = StObject.set(x, "DeleteTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimestampUndefined: Self = StObject.set(x, "DeleteTimestamp", js.undefined)
    
    inline def setNeverExpires(value: Boolean): Self = StObject.set(x, "NeverExpires", value.asInstanceOf[js.Any])
    
    inline def setNeverExpiresUndefined: Self = StObject.set(x, "NeverExpires", js.undefined)
    
    inline def setSourceBackup(value: BackupId): Self = StObject.set(x, "SourceBackup", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupUndefined: Self = StObject.set(x, "SourceBackup", js.undefined)
    
    inline def setSourceCluster(value: ClusterId): Self = StObject.set(x, "SourceCluster", value.asInstanceOf[js.Any])
    
    inline def setSourceClusterUndefined: Self = StObject.set(x, "SourceCluster", js.undefined)
    
    inline def setSourceRegion(value: Region): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    inline def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    inline def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    inline def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value*))
  }
}
