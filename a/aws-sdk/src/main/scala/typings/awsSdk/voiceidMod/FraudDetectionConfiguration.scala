package typings.awsSdk.voiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FraudDetectionConfiguration extends StObject {
  
  /**
    * Threshold value for determining whether the speaker is a fraudster. If the detected risk score calculated by Voice ID is higher than the threshold, the speaker is considered a fraudster.
    */
  var RiskThreshold: Score
}
object FraudDetectionConfiguration {
  
  inline def apply(RiskThreshold: Score): FraudDetectionConfiguration = {
    val __obj = js.Dynamic.literal(RiskThreshold = RiskThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[FraudDetectionConfiguration]
  }
  
  extension [Self <: FraudDetectionConfiguration](x: Self) {
    
    inline def setRiskThreshold(value: Score): Self = StObject.set(x, "RiskThreshold", value.asInstanceOf[js.Any])
  }
}
