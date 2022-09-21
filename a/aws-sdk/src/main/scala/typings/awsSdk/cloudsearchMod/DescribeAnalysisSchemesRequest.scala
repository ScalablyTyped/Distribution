package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAnalysisSchemesRequest extends StObject {
  
  /**
    * The analysis schemes you want to describe.
    */
  var AnalysisSchemeNames: js.UndefOr[StandardNameList] = js.undefined
  
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName
}
object DescribeAnalysisSchemesRequest {
  
  inline def apply(DomainName: DomainName): DescribeAnalysisSchemesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAnalysisSchemesRequest]
  }
  
  extension [Self <: DescribeAnalysisSchemesRequest](x: Self) {
    
    inline def setAnalysisSchemeNames(value: StandardNameList): Self = StObject.set(x, "AnalysisSchemeNames", value.asInstanceOf[js.Any])
    
    inline def setAnalysisSchemeNamesUndefined: Self = StObject.set(x, "AnalysisSchemeNames", js.undefined)
    
    inline def setAnalysisSchemeNamesVarargs(value: StandardName*): Self = StObject.set(x, "AnalysisSchemeNames", js.Array(value*))
    
    inline def setDeployed(value: Boolean): Self = StObject.set(x, "Deployed", value.asInstanceOf[js.Any])
    
    inline def setDeployedUndefined: Self = StObject.set(x, "Deployed", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
