package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeBranchesByFastForwardOutput extends js.Object {
  /**
    * The commit ID of the merge in the destination or target branch.
    */
  var commitId: js.UndefOr[ObjectId] = js.native
  /**
    * The tree ID of the merge in the destination or target branch.
    */
  var treeId: js.UndefOr[ObjectId] = js.native
}

object MergeBranchesByFastForwardOutput {
  @scala.inline
  def apply(commitId: ObjectId = null, treeId: ObjectId = null): MergeBranchesByFastForwardOutput = {
    val __obj = js.Dynamic.literal()
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    if (treeId != null) __obj.updateDynamic("treeId")(treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeBranchesByFastForwardOutput]
  }
}

