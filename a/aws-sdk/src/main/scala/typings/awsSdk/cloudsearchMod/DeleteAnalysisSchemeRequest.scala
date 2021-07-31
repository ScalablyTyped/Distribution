package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnalysisSchemeRequest extends StObject {
  
  /**
    * The name of the analysis scheme you want to delete.
    */
  var AnalysisSchemeName: StandardName
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
}
object DeleteAnalysisSchemeRequest {
  
  @scala.inline
  def apply(AnalysisSchemeName: StandardName, DomainName: DomainName): DeleteAnalysisSchemeRequest = {
    val __obj = js.Dynamic.literal(AnalysisSchemeName = AnalysisSchemeName.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysisSchemeRequest]
  }
  
  @scala.inline
  implicit class DeleteAnalysisSchemeRequestMutableBuilder[Self <: DeleteAnalysisSchemeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisSchemeName(value: StandardName): Self = StObject.set(x, "AnalysisSchemeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
