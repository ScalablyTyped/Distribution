package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDescribeMergeConflictsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * A list of conflicts for each file, including the conflict metadata and the hunks of the differences between the files.
    */
  var conflicts: Conflicts = js.native
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  /**
    * A list of any errors returned while describing the merge conflicts for each file.
    */
  var errors: js.UndefOr[BatchDescribeMergeConflictsErrors] = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}

object BatchDescribeMergeConflictsOutput {
  @scala.inline
  def apply(
    conflicts: Conflicts,
    destinationCommitId: ObjectId,
    sourceCommitId: ObjectId,
    baseCommitId: ObjectId = null,
    errors: BatchDescribeMergeConflictsErrors = null,
    nextToken: NextToken = null
  ): BatchDescribeMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    if (baseCommitId != null) __obj.updateDynamic("baseCommitId")(baseCommitId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeMergeConflictsOutput]
  }
}

