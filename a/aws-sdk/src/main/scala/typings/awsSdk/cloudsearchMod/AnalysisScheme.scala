package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalysisScheme extends js.Object {
  
  var AnalysisOptions: js.UndefOr[typings.awsSdk.cloudsearchMod.AnalysisOptions] = js.native
  
  var AnalysisSchemeLanguage: typings.awsSdk.cloudsearchMod.AnalysisSchemeLanguage = js.native
  
  var AnalysisSchemeName: StandardName = js.native
}
object AnalysisScheme {
  
  @scala.inline
  def apply(AnalysisSchemeLanguage: AnalysisSchemeLanguage, AnalysisSchemeName: StandardName): AnalysisScheme = {
    val __obj = js.Dynamic.literal(AnalysisSchemeLanguage = AnalysisSchemeLanguage.asInstanceOf[js.Any], AnalysisSchemeName = AnalysisSchemeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalysisScheme]
  }
  
  @scala.inline
  implicit class AnalysisSchemeOps[Self <: AnalysisScheme] (val x: Self) extends AnyVal {
    
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
    def setAnalysisSchemeLanguage(value: AnalysisSchemeLanguage): Self = this.set("AnalysisSchemeLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisSchemeName(value: StandardName): Self = this.set("AnalysisSchemeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisOptions(value: AnalysisOptions): Self = this.set("AnalysisOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalysisOptions: Self = this.set("AnalysisOptions", js.undefined)
  }
}
