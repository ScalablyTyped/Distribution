package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMergeConflictsOutput extends js.Object {
  /**
    * The commit ID of the merge base.
    */
  var baseCommitId: js.UndefOr[ObjectId] = js.native
  /**
    * Contains metadata about the conflicts found in the merge.
    */
  var conflictMetadata: ConflictMetadata = js.native
  /**
    * The commit ID of the destination commit specifier that was used in the merge evaluation.
    */
  var destinationCommitId: ObjectId = js.native
  /**
    * A list of merge hunks of the differences between the files or lines.
    */
  var mergeHunks: MergeHunks = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The commit ID of the source commit specifier that was used in the merge evaluation.
    */
  var sourceCommitId: ObjectId = js.native
}

object DescribeMergeConflictsOutput {
  @scala.inline
  def apply(
    conflictMetadata: ConflictMetadata,
    destinationCommitId: ObjectId,
    mergeHunks: MergeHunks,
    sourceCommitId: ObjectId
  ): DescribeMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflictMetadata = conflictMetadata.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeHunks = mergeHunks.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMergeConflictsOutput]
  }
  @scala.inline
  implicit class DescribeMergeConflictsOutputOps[Self <: DescribeMergeConflictsOutput] (val x: Self) extends AnyVal {
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
    def setConflictMetadata(value: ConflictMetadata): Self = this.set("conflictMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationCommitId(value: ObjectId): Self = this.set("destinationCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeHunksVarargs(value: MergeHunk*): Self = this.set("mergeHunks", js.Array(value :_*))
    @scala.inline
    def setMergeHunks(value: MergeHunks): Self = this.set("mergeHunks", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = this.set("sourceCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseCommitId(value: ObjectId): Self = this.set("baseCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseCommitId: Self = this.set("baseCommitId", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

