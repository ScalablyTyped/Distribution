package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitDiffSourceCodeType extends js.Object {
  /**
    *  Destination Commit SHA 
    */
  var DestinationCommit: js.UndefOr[CommitId] = js.native
  /**
    *  Source Commit SHA. 
    */
  var SourceCommit: js.UndefOr[CommitId] = js.native
}

object CommitDiffSourceCodeType {
  @scala.inline
  def apply(DestinationCommit: CommitId = null, SourceCommit: CommitId = null): CommitDiffSourceCodeType = {
    val __obj = js.Dynamic.literal()
    if (DestinationCommit != null) __obj.updateDynamic("DestinationCommit")(DestinationCommit.asInstanceOf[js.Any])
    if (SourceCommit != null) __obj.updateDynamic("SourceCommit")(SourceCommit.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitDiffSourceCodeType]
  }
}

