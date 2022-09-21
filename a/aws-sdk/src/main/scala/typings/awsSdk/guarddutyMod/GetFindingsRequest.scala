package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsRequest extends StObject {
  
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to retrieve.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The IDs of the findings that you want to retrieve.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds
  
  /**
    * Represents the criteria used for sorting findings.
    */
  var SortCriteria: js.UndefOr[typings.awsSdk.guarddutyMod.SortCriteria] = js.undefined
}
object GetFindingsRequest {
  
  inline def apply(DetectorId: DetectorId, FindingIds: FindingIds): GetFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
  
  extension [Self <: GetFindingsRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFindingIds(value: FindingIds): Self = StObject.set(x, "FindingIds", value.asInstanceOf[js.Any])
    
    inline def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "FindingIds", js.Array(value*))
    
    inline def setSortCriteria(value: SortCriteria): Self = StObject.set(x, "SortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "SortCriteria", js.undefined)
  }
}
