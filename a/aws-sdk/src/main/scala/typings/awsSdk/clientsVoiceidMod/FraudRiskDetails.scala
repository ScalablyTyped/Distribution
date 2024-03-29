package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FraudRiskDetails extends StObject {
  
  /**
    * The details resulting from 'Known Fraudster Risk' analysis of the speaker.
    */
  var KnownFraudsterRisk: typings.awsSdk.clientsVoiceidMod.KnownFraudsterRisk
  
  /**
    * The details resulting from 'Voice Spoofing Risk' analysis of the speaker.
    */
  var VoiceSpoofingRisk: typings.awsSdk.clientsVoiceidMod.VoiceSpoofingRisk
}
object FraudRiskDetails {
  
  inline def apply(KnownFraudsterRisk: KnownFraudsterRisk, VoiceSpoofingRisk: VoiceSpoofingRisk): FraudRiskDetails = {
    val __obj = js.Dynamic.literal(KnownFraudsterRisk = KnownFraudsterRisk.asInstanceOf[js.Any], VoiceSpoofingRisk = VoiceSpoofingRisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[FraudRiskDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FraudRiskDetails] (val x: Self) extends AnyVal {
    
    inline def setKnownFraudsterRisk(value: KnownFraudsterRisk): Self = StObject.set(x, "KnownFraudsterRisk", value.asInstanceOf[js.Any])
    
    inline def setVoiceSpoofingRisk(value: VoiceSpoofingRisk): Self = StObject.set(x, "VoiceSpoofingRisk", value.asInstanceOf[js.Any])
  }
}
