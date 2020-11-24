package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(conflicts: Conflicts, destinationCommitId: ObjectId, sourceCommitId: ObjectId): BatchDescribeMergeConflictsOutput = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], destinationCommitId = destinationCommitId.asInstanceOf[js.Any], sourceCommitId = sourceCommitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDescribeMergeConflictsOutput]
  }
  
  @scala.inline
  implicit class BatchDescribeMergeConflictsOutputOps[Self <: BatchDescribeMergeConflictsOutput] (val x: Self) extends AnyVal {
    
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
    def setConflictsVarargs(value: Conflict*): Self = this.set("conflicts", js.Array(value :_*))
    
    @scala.inline
    def setConflicts(value: Conflicts): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCommitId(value: ObjectId): Self = this.set("destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = this.set("sourceCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseCommitId(value: ObjectId): Self = this.set("baseCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseCommitId: Self = this.set("baseCommitId", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: BatchDescribeMergeConflictsError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: BatchDescribeMergeConflictsErrors): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
