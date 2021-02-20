package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitDiffSourceCodeType extends StObject {
  
  /**
    *  The SHA of the destination commit used to generate a commit diff. 
    */
  var DestinationCommit: js.UndefOr[CommitId] = js.native
  
  /**
    *  The SHA of the source commit used to generate a commit diff. 
    */
  var SourceCommit: js.UndefOr[CommitId] = js.native
}
object CommitDiffSourceCodeType {
  
  @scala.inline
  def apply(): CommitDiffSourceCodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitDiffSourceCodeType]
  }
  
  @scala.inline
  implicit class CommitDiffSourceCodeTypeMutableBuilder[Self <: CommitDiffSourceCodeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationCommit(value: CommitId): Self = StObject.set(x, "DestinationCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationCommitUndefined: Self = StObject.set(x, "DestinationCommit", js.undefined)
    
    @scala.inline
    def setSourceCommit(value: CommitId): Self = StObject.set(x, "SourceCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCommitUndefined: Self = StObject.set(x, "SourceCommit", js.undefined)
  }
}
