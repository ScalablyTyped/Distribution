package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePublishingDestinationRequest extends StObject {
  
  /**
    * The ID of the publishing destination to retrieve.
    */
  var DestinationId: String
  
  /**
    * The unique ID of the detector associated with the publishing destination to retrieve.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
}
object DescribePublishingDestinationRequest {
  
  inline def apply(DestinationId: String, DetectorId: DetectorId): DescribePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePublishingDestinationRequest]
  }
  
  extension [Self <: DescribePublishingDestinationRequest](x: Self) {
    
    inline def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
