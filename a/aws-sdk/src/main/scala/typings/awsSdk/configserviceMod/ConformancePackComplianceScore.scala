package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformancePackComplianceScore extends StObject {
  
  /**
    * The name of the conformance pack.
    */
  var ConformancePackName: js.UndefOr[typings.awsSdk.configserviceMod.ConformancePackName] = js.undefined
  
  /**
    * The time that the conformance pack compliance score was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Compliance score for the conformance pack. Conformance packs with no evaluation results will have a compliance score of INSUFFICIENT_DATA.
    */
  var Score: js.UndefOr[ComplianceScore] = js.undefined
}
object ConformancePackComplianceScore {
  
  inline def apply(): ConformancePackComplianceScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConformancePackComplianceScore]
  }
  
  extension [Self <: ConformancePackComplianceScore](x: Self) {
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setConformancePackNameUndefined: Self = StObject.set(x, "ConformancePackName", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setScore(value: ComplianceScore): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
