package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnalysisSchemeResponse extends StObject {
  
  /**
    * The status of the analysis scheme being deleted.
    */
  var AnalysisScheme: AnalysisSchemeStatus
}
object DeleteAnalysisSchemeResponse {
  
  @scala.inline
  def apply(AnalysisScheme: AnalysisSchemeStatus): DeleteAnalysisSchemeResponse = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysisSchemeResponse]
  }
  
  @scala.inline
  implicit class DeleteAnalysisSchemeResponseMutableBuilder[Self <: DeleteAnalysisSchemeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisScheme(value: AnalysisSchemeStatus): Self = StObject.set(x, "AnalysisScheme", value.asInstanceOf[js.Any])
  }
}
