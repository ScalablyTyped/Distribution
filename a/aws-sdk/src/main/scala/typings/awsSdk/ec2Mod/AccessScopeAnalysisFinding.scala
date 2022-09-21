package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessScopeAnalysisFinding extends StObject {
  
  /**
    * The finding components.
    */
  var FindingComponents: js.UndefOr[PathComponentList] = js.undefined
  
  /**
    * The ID of the finding.
    */
  var FindingId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Network Access Scope analysis.
    */
  var NetworkInsightsAccessScopeAnalysisId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInsightsAccessScopeAnalysisId] = js.undefined
  
  /**
    * The ID of the Network Access Scope.
    */
  var NetworkInsightsAccessScopeId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInsightsAccessScopeId] = js.undefined
}
object AccessScopeAnalysisFinding {
  
  inline def apply(): AccessScopeAnalysisFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessScopeAnalysisFinding]
  }
  
  extension [Self <: AccessScopeAnalysisFinding](x: Self) {
    
    inline def setFindingComponents(value: PathComponentList): Self = StObject.set(x, "FindingComponents", value.asInstanceOf[js.Any])
    
    inline def setFindingComponentsUndefined: Self = StObject.set(x, "FindingComponents", js.undefined)
    
    inline def setFindingComponentsVarargs(value: PathComponent*): Self = StObject.set(x, "FindingComponents", js.Array(value*))
    
    inline def setFindingId(value: String): Self = StObject.set(x, "FindingId", value.asInstanceOf[js.Any])
    
    inline def setFindingIdUndefined: Self = StObject.set(x, "FindingId", js.undefined)
    
    inline def setNetworkInsightsAccessScopeAnalysisId(value: NetworkInsightsAccessScopeAnalysisId): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeAnalysisIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", js.undefined)
    
    inline def setNetworkInsightsAccessScopeId(value: NetworkInsightsAccessScopeId): Self = StObject.set(x, "NetworkInsightsAccessScopeId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeId", js.undefined)
  }
}
