package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAnalysisSchemesResponse extends js.Object {
  
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
  implicit class DescribeAnalysisSchemesResponseOps[Self <: DescribeAnalysisSchemesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalysisSchemesVarargs(value: AnalysisSchemeStatus*): Self = this.set("AnalysisSchemes", js.Array(value :_*))
    
    @scala.inline
    def setAnalysisSchemes(value: AnalysisSchemeStatusList): Self = this.set("AnalysisSchemes", value.asInstanceOf[js.Any])
  }
}
