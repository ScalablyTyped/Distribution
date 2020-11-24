package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetFindingsStatisticsRequest extends js.Object {
  
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * Represents the criteria that is used for querying findings.
    */
  var FindingCriteria: js.UndefOr[typings.awsSdk.guarddutyMod.FindingCriteria] = js.native
  
  /**
    * The types of finding statistics to retrieve.
    */
  var FindingStatisticTypes: typings.awsSdk.guarddutyMod.FindingStatisticTypes = js.native
}
object GetFindingsStatisticsRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, FindingStatisticTypes: FindingStatisticTypes): GetFindingsStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingStatisticTypes = FindingStatisticTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsRequest]
  }
  
  @scala.inline
  implicit class GetFindingsStatisticsRequestOps[Self <: GetFindingsStatisticsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = this.set("DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingStatisticTypesVarargs(value: FindingStatisticType*): Self = this.set("FindingStatisticTypes", js.Array(value :_*))
    
    @scala.inline
    def setFindingStatisticTypes(value: FindingStatisticTypes): Self = this.set("FindingStatisticTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = this.set("FindingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingCriteria: Self = this.set("FindingCriteria", js.undefined)
  }
}
