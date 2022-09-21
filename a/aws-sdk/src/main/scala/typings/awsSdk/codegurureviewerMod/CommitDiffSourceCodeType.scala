package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitDiffSourceCodeType extends StObject {
  
  /**
    * The SHA of the destination commit used to generate a commit diff. This field is required for a pull request code review.
    */
  var DestinationCommit: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The SHA of the merge base of a commit.
    */
  var MergeBaseCommit: js.UndefOr[CommitId] = js.undefined
  
  /**
    * The SHA of the source commit used to generate a commit diff. This field is required for a pull request code review.
    */
  var SourceCommit: js.UndefOr[CommitId] = js.undefined
}
object CommitDiffSourceCodeType {
  
  inline def apply(): CommitDiffSourceCodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitDiffSourceCodeType]
  }
  
  extension [Self <: CommitDiffSourceCodeType](x: Self) {
    
    inline def setDestinationCommit(value: CommitId): Self = StObject.set(x, "DestinationCommit", value.asInstanceOf[js.Any])
    
    inline def setDestinationCommitUndefined: Self = StObject.set(x, "DestinationCommit", js.undefined)
    
    inline def setMergeBaseCommit(value: CommitId): Self = StObject.set(x, "MergeBaseCommit", value.asInstanceOf[js.Any])
    
    inline def setMergeBaseCommitUndefined: Self = StObject.set(x, "MergeBaseCommit", js.undefined)
    
    inline def setSourceCommit(value: CommitId): Self = StObject.set(x, "SourceCommit", value.asInstanceOf[js.Any])
    
    inline def setSourceCommitUndefined: Self = StObject.set(x, "SourceCommit", js.undefined)
  }
}
