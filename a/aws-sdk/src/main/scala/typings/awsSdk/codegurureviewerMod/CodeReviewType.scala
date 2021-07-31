package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeReviewType extends StObject {
  
  /**
    *  A code review that analyzes all code under a specified branch in an associated respository. The assocated repository is specified using its ARN in  CreateCodeReview . 
    */
  var RepositoryAnalysis: typings.awsSdk.codegurureviewerMod.RepositoryAnalysis
}
object CodeReviewType {
  
  @scala.inline
  def apply(RepositoryAnalysis: RepositoryAnalysis): CodeReviewType = {
    val __obj = js.Dynamic.literal(RepositoryAnalysis = RepositoryAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeReviewType]
  }
  
  @scala.inline
  implicit class CodeReviewTypeMutableBuilder[Self <: CodeReviewType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryAnalysis(value: RepositoryAnalysis): Self = StObject.set(x, "RepositoryAnalysis", value.asInstanceOf[js.Any])
  }
}
