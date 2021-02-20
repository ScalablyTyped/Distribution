package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationSnapshotsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.NextToken] = js.native
  
  /**
    * A collection of objects containing information about the application snapshots.
    */
  var SnapshotSummaries: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.SnapshotSummaries] = js.native
}
object ListApplicationSnapshotsResponse {
  
  @scala.inline
  def apply(): ListApplicationSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationSnapshotsResponse]
  }
  
  @scala.inline
  implicit class ListApplicationSnapshotsResponseMutableBuilder[Self <: ListApplicationSnapshotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSnapshotSummaries(value: SnapshotSummaries): Self = StObject.set(x, "SnapshotSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotSummariesUndefined: Self = StObject.set(x, "SnapshotSummaries", js.undefined)
    
    @scala.inline
    def setSnapshotSummariesVarargs(value: SnapshotDetails*): Self = StObject.set(x, "SnapshotSummaries", js.Array(value :_*))
  }
}
