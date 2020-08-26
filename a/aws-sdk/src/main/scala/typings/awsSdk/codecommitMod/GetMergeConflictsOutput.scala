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
    sourceCommitId: ObjectId
  ): GetMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflictMetadataList = conflictMetadataList.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMergeConflictsOutput]
  }
  @scala.inline
  implicit class GetMergeConflictsOutputOps[Self <: GetMergeConflictsOutput] (val x: Self) extends AnyVal {
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
    def setConflictMetadataListVarargs(value: ConflictMetadata*): Self = this.set("conflictMetadataList", js.Array(value :_*))
    @scala.inline
    def setConflictMetadataList(value: ConflictMetadataList): Self = this.set("conflictMetadataList", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationCommitId(value: ObjectId): Self = this.set("destinationCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeable(value: IsMergeable): Self = this.set("mergeable", value.asInstanceOf[js.Any])
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

