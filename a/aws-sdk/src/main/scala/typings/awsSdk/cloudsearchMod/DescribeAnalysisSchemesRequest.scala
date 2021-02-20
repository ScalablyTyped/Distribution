package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAnalysisSchemesRequest extends StObject {
  
  /**
    * The analysis schemes you want to describe.
    */
  var AnalysisSchemeNames: js.UndefOr[StandardNameList] = js.native
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}
object DescribeAnalysisSchemesRequest {
  
  @scala.inline
  def apply(DomainName: DomainName): DescribeAnalysisSchemesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnalysisSchemesRequest]
  }
  
  @scala.inline
  implicit class DescribeAnalysisSchemesRequestMutableBuilder[Self <: DescribeAnalysisSchemesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisSchemeNames(value: StandardNameList): Self = StObject.set(x, "AnalysisSchemeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisSchemeNamesUndefined: Self = StObject.set(x, "AnalysisSchemeNames", js.undefined)
    
    @scala.inline
    def setAnalysisSchemeNamesVarargs(value: StandardName*): Self = StObject.set(x, "AnalysisSchemeNames", js.Array(value :_*))
    
    @scala.inline
    def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
