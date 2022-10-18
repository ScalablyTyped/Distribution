package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceSpoofingRisk extends StObject {
  
  /**
    * The score indicating the likelihood of speaker’s voice being spoofed.
    */
  var RiskScore: Score
}
object VoiceSpoofingRisk {
  
  inline def apply(RiskScore: Score): VoiceSpoofingRisk = {
    val __obj = js.Dynamic.literal(RiskScore = RiskScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSpoofingRisk]
  }
  
  extension [Self <: VoiceSpoofingRisk](x: Self) {
    
    inline def setRiskScore(value: Score): Self = StObject.set(x, "RiskScore", value.asInstanceOf[js.Any])
  }
}
