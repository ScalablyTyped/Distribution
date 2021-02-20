package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsRequest extends StObject {
  
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to retrieve.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The IDs of the findings that you want to retrieve.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds = js.native
  
  /**
    * Represents the criteria used for sorting findings.
    */
  var SortCriteria: js.UndefOr[typings.awsSdk.guarddutyMod.SortCriteria] = js.native
}
object GetFindingsRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds): GetFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsRequest]
  }
  
  @scala.inline
  implicit class GetFindingsRequestMutableBuilder[Self <: GetFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIds(value: FindingIds): Self = StObject.set(x, "FindingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "FindingIds", js.Array(value :_*))
    
    @scala.inline
    def setSortCriteria(value: SortCriteria): Self = StObject.set(x, "SortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "SortCriteria", js.undefined)
  }
}
