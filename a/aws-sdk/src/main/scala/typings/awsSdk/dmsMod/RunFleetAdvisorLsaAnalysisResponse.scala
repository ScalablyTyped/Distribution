package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunFleetAdvisorLsaAnalysisResponse extends StObject {
  
  /**
    * The ID of the LSA analysis run.
    */
  var LsaAnalysisId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the LSA analysis, for example COMPLETED.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object RunFleetAdvisorLsaAnalysisResponse {
  
  inline def apply(): RunFleetAdvisorLsaAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunFleetAdvisorLsaAnalysisResponse]
  }
  
  extension [Self <: RunFleetAdvisorLsaAnalysisResponse](x: Self) {
    
    inline def setLsaAnalysisId(value: String): Self = StObject.set(x, "LsaAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setLsaAnalysisIdUndefined: Self = StObject.set(x, "LsaAnalysisId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
