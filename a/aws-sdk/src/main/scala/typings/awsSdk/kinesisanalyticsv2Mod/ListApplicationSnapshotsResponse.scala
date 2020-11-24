package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationSnapshotsResponse extends js.Object {
  
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
  implicit class ListApplicationSnapshotsResponseOps[Self <: ListApplicationSnapshotsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSnapshotSummariesVarargs(value: SnapshotDetails*): Self = this.set("SnapshotSummaries", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotSummaries(value: SnapshotSummaries): Self = this.set("SnapshotSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotSummaries: Self = this.set("SnapshotSummaries", js.undefined)
  }
}
