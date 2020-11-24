package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryAnalysis extends js.Object {
  
  /**
    *  A  SourceCodeType  that specifies the tip of a branch in an associated repository. 
    */
  var RepositoryHead: RepositoryHeadSourceCodeType = js.native
}
object RepositoryAnalysis {
  
  @scala.inline
  def apply(RepositoryHead: RepositoryHeadSourceCodeType): RepositoryAnalysis = {
    val __obj = js.Dynamic.literal(RepositoryHead = RepositoryHead.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryAnalysis]
  }
  
  @scala.inline
  implicit class RepositoryAnalysisOps[Self <: RepositoryAnalysis] (val x: Self) extends AnyVal {
    
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
    def setRepositoryHead(value: RepositoryHeadSourceCodeType): Self = this.set("RepositoryHead", value.asInstanceOf[js.Any])
  }
}
