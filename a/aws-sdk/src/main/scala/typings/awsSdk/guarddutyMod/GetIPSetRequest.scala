package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIPSetRequest extends StObject {
  
  /**
    * The unique ID of the detector that the IPSet is associated with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The unique ID of the IPSet to retrieve.
    */
  var IpSetId: String
}
object GetIPSetRequest {
  
  inline def apply(DetectorId: DetectorId, IpSetId: String): GetIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIPSetRequest]
  }
  
  extension [Self <: GetIPSetRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setIpSetId(value: String): Self = StObject.set(x, "IpSetId", value.asInstanceOf[js.Any])
  }
}
