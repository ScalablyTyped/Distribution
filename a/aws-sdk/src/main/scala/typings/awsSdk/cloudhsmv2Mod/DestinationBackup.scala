package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationBackup extends StObject {
  
  /**
    * The date and time when both the source backup was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The identifier (ID) of the source backup from which the new backup was copied.
    */
  var SourceBackup: js.UndefOr[BackupId] = js.undefined
  
  /**
    * The identifier (ID) of the cluster containing the source backup from which the new backup was copied.
    */
  var SourceCluster: js.UndefOr[ClusterId] = js.undefined
  
  /**
    * The AWS region that contains the source backup from which the new backup was copied.
    */
  var SourceRegion: js.UndefOr[Region] = js.undefined
}
object DestinationBackup {
  
  inline def apply(): DestinationBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationBackup]
  }
  
  extension [Self <: DestinationBackup](x: Self) {
    
    inline def setCreateTimestamp(value: Timestamp): Self = StObject.set(x, "CreateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreateTimestampUndefined: Self = StObject.set(x, "CreateTimestamp", js.undefined)
    
    inline def setSourceBackup(value: BackupId): Self = StObject.set(x, "SourceBackup", value.asInstanceOf[js.Any])
    
    inline def setSourceBackupUndefined: Self = StObject.set(x, "SourceBackup", js.undefined)
    
    inline def setSourceCluster(value: ClusterId): Self = StObject.set(x, "SourceCluster", value.asInstanceOf[js.Any])
    
    inline def setSourceClusterUndefined: Self = StObject.set(x, "SourceCluster", js.undefined)
    
    inline def setSourceRegion(value: Region): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
  }
}
