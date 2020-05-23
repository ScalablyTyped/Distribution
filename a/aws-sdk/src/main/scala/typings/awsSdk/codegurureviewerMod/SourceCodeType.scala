package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceCodeType extends js.Object {
  /**
    *  The commit diff for the pull request. 
    */
  var CommitDiff: js.UndefOr[CommitDiffSourceCodeType] = js.native
}

object SourceCodeType {
  @scala.inline
  def apply(CommitDiff: CommitDiffSourceCodeType = null): SourceCodeType = {
    val __obj = js.Dynamic.literal()
    if (CommitDiff != null) __obj.updateDynamic("CommitDiff")(CommitDiff.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceCodeType]
  }
}

