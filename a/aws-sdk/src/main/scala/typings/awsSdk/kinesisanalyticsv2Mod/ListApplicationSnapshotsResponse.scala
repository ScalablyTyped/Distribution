package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationSnapshotsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.NextToken] = js.undefined
  
  /**
    * A collection of objects containing information about the application snapshots.
    */
  var SnapshotSummaries: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SnapshotSummaries] = js.undefined
}
object ListApplicationSnapshotsResponse {
  
  inline def apply(): ListApplicationSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationSnapshotsResponse]
  }
  
  extension [Self <: ListApplicationSnapshotsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshotSummaries(value: SnapshotSummaries): Self = StObject.set(x, "SnapshotSummaries", value.asInstanceOf[js.Any])
    
    inline def setSnapshotSummariesUndefined: Self = StObject.set(x, "SnapshotSummaries", js.undefined)
    
    inline def setSnapshotSummariesVarargs(value: SnapshotDetails*): Self = StObject.set(x, "SnapshotSummaries", js.Array(value*))
  }
}
