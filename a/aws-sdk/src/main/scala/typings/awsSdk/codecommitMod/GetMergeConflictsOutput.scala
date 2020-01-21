package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMergeConflictsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * A list of metadata for any conflicting files. If the specified merge strategy is FAST_FORWARD_MERGE, this list is always empty.
    */
  var conflictMetadataList: ConflictMetadataList = js.native
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  /**
    * A Boolean value that indicates whether the code is mergeable by the specified merge option.
    */
  var mergeable: IsMergeable = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}

object GetMergeConflictsOutput {
  @scala.inline
  def apply(
    conflictMetadataList: ConflictMetadataList,
    destinationCommitId: ObjectId,
    mergeable: IsMergeable,
    sourceCommitId: ObjectId,
    baseCommitId: ObjectId = null,
    nextToken: NextToken = null
  ): GetMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflictMetadataList = conflictMetadataList.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    if (baseCommitId != null) __obj.updateDynamic("baseCommitId")(baseCommitId.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeConflictsOutput]
  }
}

