package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDescribeMergeConflictsOutput extends StObject {
  
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
  implicit class BatchDescribeMergeConflictsOutputMutableBuilder[Self <: BatchDescribeMergeConflictsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseCommitId(value: ObjectId): Self = StObject.set(x, "baseCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseCommitIdUndefined: Self = StObject.set(x, "baseCommitId", js.undefined)
    
    @scala.inline
    def setConflicts(value: Conflicts): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsVarargs(value: Conflict*): Self = StObject.set(x, "conflicts", js.Array(value :_*))
    
    @scala.inline
    def setDestinationCommitId(value: ObjectId): Self = StObject.set(x, "destinationCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: BatchDescribeMergeConflictsErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: BatchDescribeMergeConflictsError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSourceCommitId(value: ObjectId): Self = StObject.set(x, "sourceCommitId", value.asInstanceOf[js.Any])
  }
}
