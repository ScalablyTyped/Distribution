package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeReviewType extends StObject {
  
  /**
    * They types of analysis performed during a repository analysis or a pull request review. You can specify either Security, CodeQuality, or both.
    */
  var AnalysisTypes: js.UndefOr[typings.awsSdk.codegurureviewerMod.AnalysisTypes] = js.undefined
  
  /**
    * A code review that analyzes all code under a specified branch in an associated repository. The associated repository is specified using its ARN in CreateCodeReview.
    */
  var RepositoryAnalysis: typings.awsSdk.codegurureviewerMod.RepositoryAnalysis
}
object CodeReviewType {
  
  inline def apply(RepositoryAnalysis: RepositoryAnalysis): CodeReviewType = {
    val __obj = js.Dynamic.literal(RepositoryAnalysis = RepositoryAnalysis.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeReviewType]
  }
  
  extension [Self <: CodeReviewType](x: Self) {
    
    inline def setAnalysisTypes(value: AnalysisTypes): Self = StObject.set(x, "AnalysisTypes", value.asInstanceOf[js.Any])
    
    inline def setAnalysisTypesUndefined: Self = StObject.set(x, "AnalysisTypes", js.undefined)
    
    inline def setAnalysisTypesVarargs(value: AnalysisType*): Self = StObject.set(x, "AnalysisTypes", js.Array(value*))
    
    inline def setRepositoryAnalysis(value: RepositoryAnalysis): Self = StObject.set(x, "RepositoryAnalysis", value.asInstanceOf[js.Any])
  }
}
