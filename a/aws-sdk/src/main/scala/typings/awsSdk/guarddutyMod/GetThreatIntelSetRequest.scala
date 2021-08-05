package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetThreatIntelSetRequest extends StObject {
  
  /**
    * The unique ID of the detector that the threatIntelSet is associated with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The unique ID of the threatIntelSet that you want to get.
    */
  var ThreatIntelSetId: String
}
object GetThreatIntelSetRequest {
  
  inline def apply(DetectorId: DetectorId, ThreatIntelSetId: String): GetThreatIntelSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], ThreatIntelSetId = ThreatIntelSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThreatIntelSetRequest]
  }
  
  extension [Self <: GetThreatIntelSetRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelSetId(value: String): Self = StObject.set(x, "ThreatIntelSetId", value.asInstanceOf[js.Any])
  }
}
