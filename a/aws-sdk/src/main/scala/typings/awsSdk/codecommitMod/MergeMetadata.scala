package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeMetadata extends js.Object {
  /**
    * A Boolean value indicating whether the merge has been made.
    */
  var isMerged: js.UndefOr[IsMerged] = js.native
  /**
    * The commit ID for the merge commit, if any.
    */
  var mergeCommitId: js.UndefOr[CommitId] = js.native
  /**
    * The merge strategy used in the merge.
    */
  var mergeOption: js.UndefOr[MergeOptionTypeEnum] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user who merged the branches.
    */
  var mergedBy: js.UndefOr[Arn] = js.native
}

object MergeMetadata {
  @scala.inline
  def apply(
    isMerged: js.UndefOr[Boolean] = js.undefined,
    mergeCommitId: CommitId = null,
    mergeOption: MergeOptionTypeEnum = null,
    mergedBy: Arn = null
  ): MergeMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isMerged)) __obj.updateDynamic("isMerged")(isMerged.asInstanceOf[js.Any])
    if (mergeCommitId != null) __obj.updateDynamic("mergeCommitId")(mergeCommitId.asInstanceOf[js.Any])
    if (mergeOption != null) __obj.updateDynamic("mergeOption")(mergeOption.asInstanceOf[js.Any])
    if (mergedBy != null) __obj.updateDynamic("mergedBy")(mergedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeMetadata]
  }
}

