package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetCommitsOutput extends StObject {
  
  /**
    * An array of commit data type objects, each of which contains information about a specified commit.
    */
  var commits: js.UndefOr[CommitObjectsList] = js.undefined
  
  /**
    * Returns any commit IDs for which information could not be found. For example, if one of the commit IDs was a shortened SHA ID or that commit was not found in the specified repository, the ID returns an error object with more information.
    */
  var errors: js.UndefOr[BatchGetCommitsErrorsList] = js.undefined
}
object BatchGetCommitsOutput {
  
  @scala.inline
  def apply(): BatchGetCommitsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetCommitsOutput]
  }
  
  @scala.inline
  implicit class BatchGetCommitsOutputMutableBuilder[Self <: BatchGetCommitsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommits(value: CommitObjectsList): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitsUndefined: Self = StObject.set(x, "commits", js.undefined)
    
    @scala.inline
    def setCommitsVarargs(value: Commit*): Self = StObject.set(x, "commits", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: BatchGetCommitsErrorsList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: BatchGetCommitsError*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
