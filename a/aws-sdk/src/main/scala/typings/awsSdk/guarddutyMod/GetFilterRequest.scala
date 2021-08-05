package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFilterRequest extends StObject {
  
  /**
    * The unique ID of the detector that the filter is associated with.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The name of the filter you want to get.
    */
  var FilterName: String
}
object GetFilterRequest {
  
  inline def apply(DetectorId: DetectorId, FilterName: String): GetFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFilterRequest]
  }
  
  extension [Self <: GetFilterRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFilterName(value: String): Self = StObject.set(x, "FilterName", value.asInstanceOf[js.Any])
  }
}
