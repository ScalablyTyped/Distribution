package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DestinationBackup extends StObject {
  
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
  implicit class DestinationBackupMutableBuilder[Self <: DestinationBackup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTimestamp(value: Timestamp): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
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
  }
}
