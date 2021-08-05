package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnarchiveFindingsRequest extends StObject {
  
  /**
    * The ID of the detector associated with the findings to unarchive.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The IDs of the findings to unarchive.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds
}
object UnarchiveFindingsRequest {
  
  inline def apply(DetectorId: DetectorId, FindingIds: FindingIds): UnarchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnarchiveFindingsRequest]
  }
  
  extension [Self <: UnarchiveFindingsRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFindingIds(value: FindingIds): Self = StObject.set(x, "FindingIds", value.asInstanceOf[js.Any])
    
    inline def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "FindingIds", js.Array(value :_*))
  }
}
