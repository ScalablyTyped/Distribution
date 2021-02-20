package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAnalysisSchemesResponse extends StObject {
  
  /**
    * The analysis scheme descriptions.
    */
  var AnalysisSchemes: AnalysisSchemeStatusList = js.native
}
object DescribeAnalysisSchemesResponse {
  
  @scala.inline
  def apply(AnalysisSchemes: AnalysisSchemeStatusList): DescribeAnalysisSchemesResponse = {
    val __obj = js.Dynamic.literal(AnalysisSchemes = AnalysisSchemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnalysisSchemesResponse]
  }
  
  @scala.inline
  implicit class DescribeAnalysisSchemesResponseMutableBuilder[Self <: DescribeAnalysisSchemesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisSchemes(value: AnalysisSchemeStatusList): Self = StObject.set(x, "AnalysisSchemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisSchemesVarargs(value: AnalysisSchemeStatus*): Self = StObject.set(x, "AnalysisSchemes", js.Array(value :_*))
  }
}
