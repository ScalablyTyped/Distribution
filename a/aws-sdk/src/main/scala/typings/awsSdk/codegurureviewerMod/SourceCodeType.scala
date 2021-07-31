package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCodeType extends StObject {
  
  /**
    *  A  SourceCodeType  that specifies a commit diff created by a pull request on an associated repository. 
    */
  var CommitDiff: js.UndefOr[CommitDiffSourceCodeType] = js.undefined
  
  var RepositoryHead: js.UndefOr[RepositoryHeadSourceCodeType] = js.undefined
}
object SourceCodeType {
  
  @scala.inline
  def apply(): SourceCodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCodeType]
  }
  
  @scala.inline
  implicit class SourceCodeTypeMutableBuilder[Self <: SourceCodeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitDiff(value: CommitDiffSourceCodeType): Self = StObject.set(x, "CommitDiff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitDiffUndefined: Self = StObject.set(x, "CommitDiff", js.undefined)
    
    @scala.inline
    def setRepositoryHead(value: RepositoryHeadSourceCodeType): Self = StObject.set(x, "RepositoryHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryHeadUndefined: Self = StObject.set(x, "RepositoryHead", js.undefined)
  }
}
