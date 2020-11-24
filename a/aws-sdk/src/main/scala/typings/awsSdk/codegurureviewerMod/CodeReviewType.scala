package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeReviewType extends js.Object {
  
  /**
    *  A code review that analyzes all code under a specified branch in an associated respository. The assocated repository is specified using its ARN in  CreateCodeReview . 
    */
  var RepositoryAnalysis: typings.awsSdk.codegurureviewerMod.RepositoryAnalysis = js.native
}
object CodeReviewType {
  
  @scala.inline
  def apply(RepositoryAnalysis: RepositoryAnalysis): CodeReviewType = {
    val __obj = js.Dynamic.literal(RepositoryAnalysis = RepositoryAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeReviewType]
  }
  
  @scala.inline
  implicit class CodeReviewTypeOps[Self <: CodeReviewType] (val x: Self) extends AnyVal {
    
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
    def setRepositoryAnalysis(value: RepositoryAnalysis): Self = this.set("RepositoryAnalysis", value.asInstanceOf[js.Any])
  }
}
