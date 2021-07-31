package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArchiveFindingsRequest extends StObject {
  
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to archive.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The IDs of the findings that you want to archive.
    */
  var FindingIds: typings.awsSdk.guarddutyMod.FindingIds
}
object ArchiveFindingsRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, FindingIds: FindingIds): ArchiveFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingIds = FindingIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveFindingsRequest]
  }
  
  @scala.inline
  implicit class ArchiveFindingsRequestMutableBuilder[Self <: ArchiveFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIds(value: FindingIds): Self = StObject.set(x, "FindingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "FindingIds", js.Array(value :_*))
  }
}
