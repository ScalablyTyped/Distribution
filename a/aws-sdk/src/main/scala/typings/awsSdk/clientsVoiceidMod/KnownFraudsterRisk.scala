package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownFraudsterRisk extends StObject {
  
  /**
    * The identifier of the fraudster that is the closest match to the speaker. If there are no fraudsters registered in a given domain, or if there are no fraudsters with a non-zero RiskScore, this value is null.
    */
  var GeneratedFraudsterId: js.UndefOr[typings.awsSdk.clientsVoiceidMod.GeneratedFraudsterId] = js.undefined
  
  /**
    * The score indicating the likelihood the speaker is a known fraudster.
    */
  var RiskScore: Score
}
object KnownFraudsterRisk {
  
  inline def apply(RiskScore: Score): KnownFraudsterRisk = {
    val __obj = js.Dynamic.literal(RiskScore = RiskScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownFraudsterRisk]
  }
  
  extension [Self <: KnownFraudsterRisk](x: Self) {
    
    inline def setGeneratedFraudsterId(value: GeneratedFraudsterId): Self = StObject.set(x, "GeneratedFraudsterId", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFraudsterIdUndefined: Self = StObject.set(x, "GeneratedFraudsterId", js.undefined)
    
    inline def setRiskScore(value: Score): Self = StObject.set(x, "RiskScore", value.asInstanceOf[js.Any])
  }
}
