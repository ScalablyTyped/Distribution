package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationDisruptionCompliance extends StObject {
  
  /**
    * The expected compliance status after applying the recommended configuration change.
    */
  var expectedComplianceStatus: ComplianceStatus
  
  /**
    * The expected Recovery Point Objective (RPO) description after applying the recommended configuration change.
    */
  var expectedRpoDescription: js.UndefOr[String500] = js.undefined
  
  /**
    * The expected RPO after applying the recommended configuration change.
    */
  var expectedRpoInSecs: js.UndefOr[Seconds] = js.undefined
  
  /**
    * The expected Recovery Time Objective (RTO) description after applying the recommended configuration change.
    */
  var expectedRtoDescription: js.UndefOr[String500] = js.undefined
  
  /**
    * The expected RTO after applying the recommended configuration change.
    */
  var expectedRtoInSecs: js.UndefOr[Seconds] = js.undefined
}
object RecommendationDisruptionCompliance {
  
  inline def apply(expectedComplianceStatus: ComplianceStatus): RecommendationDisruptionCompliance = {
    val __obj = js.Dynamic.literal(expectedComplianceStatus = expectedComplianceStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationDisruptionCompliance]
  }
  
  extension [Self <: RecommendationDisruptionCompliance](x: Self) {
    
    inline def setExpectedComplianceStatus(value: ComplianceStatus): Self = StObject.set(x, "expectedComplianceStatus", value.asInstanceOf[js.Any])
    
    inline def setExpectedRpoDescription(value: String500): Self = StObject.set(x, "expectedRpoDescription", value.asInstanceOf[js.Any])
    
    inline def setExpectedRpoDescriptionUndefined: Self = StObject.set(x, "expectedRpoDescription", js.undefined)
    
    inline def setExpectedRpoInSecs(value: Seconds): Self = StObject.set(x, "expectedRpoInSecs", value.asInstanceOf[js.Any])
    
    inline def setExpectedRpoInSecsUndefined: Self = StObject.set(x, "expectedRpoInSecs", js.undefined)
    
    inline def setExpectedRtoDescription(value: String500): Self = StObject.set(x, "expectedRtoDescription", value.asInstanceOf[js.Any])
    
    inline def setExpectedRtoDescriptionUndefined: Self = StObject.set(x, "expectedRtoDescription", js.undefined)
    
    inline def setExpectedRtoInSecs(value: Seconds): Self = StObject.set(x, "expectedRtoInSecs", value.asInstanceOf[js.Any])
    
    inline def setExpectedRtoInSecsUndefined: Self = StObject.set(x, "expectedRtoInSecs", js.undefined)
  }
}
