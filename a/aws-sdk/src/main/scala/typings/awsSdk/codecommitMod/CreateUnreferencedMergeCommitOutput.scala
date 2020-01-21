package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUnreferencedMergeCommitOutput extends js.Object {
  /**
    * The full commit ID of the commit that contains your merge results.
    */
  var commitId: js.UndefOr[ObjectId] = js.native
  /**
    * The full SHA-1 pointer of the tree information for the commit that contains the merge results.
    */
  var treeId: js.UndefOr[ObjectId] = js.native
}

object CreateUnreferencedMergeCommitOutput {
  @scala.inline
  def apply(commitId: ObjectId = null, treeId: ObjectId = null): CreateUnreferencedMergeCommitOutput = {
    val __obj = js.Dynamic.literal()
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    if (treeId != null) __obj.updateDynamic("treeId")(treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUnreferencedMergeCommitOutput]
  }
}

