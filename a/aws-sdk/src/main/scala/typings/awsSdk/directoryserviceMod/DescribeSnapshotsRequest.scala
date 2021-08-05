package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotsRequest extends StObject {
  
  /**
    * The identifier of the directory for which to retrieve snapshot information.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * The maximum number of objects to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.directoryserviceMod.Limit] = js.undefined
  
  /**
    * The DescribeSnapshotsResult.NextToken value from a previous call to DescribeSnapshots. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.directoryserviceMod.NextToken] = js.undefined
  
  /**
    * A list of identifiers of the snapshots to obtain the information for. If this member is null or empty, all snapshots are returned using the Limit and NextToken members.
    */
  var SnapshotIds: js.UndefOr[typings.awsSdk.directoryserviceMod.SnapshotIds] = js.undefined
}
object DescribeSnapshotsRequest {
  
  inline def apply(): DescribeSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsRequest]
  }
  
  extension [Self <: DescribeSnapshotsRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshotIds(value: SnapshotIds): Self = StObject.set(x, "SnapshotIds", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdsUndefined: Self = StObject.set(x, "SnapshotIds", js.undefined)
    
    inline def setSnapshotIdsVarargs(value: SnapshotId*): Self = StObject.set(x, "SnapshotIds", js.Array(value :_*))
  }
}
