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
  
  inline def apply(): SourceCodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCodeType]
  }
  
  extension [Self <: SourceCodeType](x: Self) {
    
    inline def setCommitDiff(value: CommitDiffSourceCodeType): Self = StObject.set(x, "CommitDiff", value.asInstanceOf[js.Any])
    
    inline def setCommitDiffUndefined: Self = StObject.set(x, "CommitDiff", js.undefined)
    
    inline def setRepositoryHead(value: RepositoryHeadSourceCodeType): Self = StObject.set(x, "RepositoryHead", value.asInstanceOf[js.Any])
    
    inline def setRepositoryHeadUndefined: Self = StObject.set(x, "RepositoryHead", js.undefined)
  }
}
