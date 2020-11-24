package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFilterRequest extends js.Object {
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: js.UndefOr[FilterAction] = js.native
  
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.native
  
  /**
    * The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId = js.native
  
  /**
    * The name of the filter.
    */
  var FilterName: String = js.native
  
  /**
    * Represents the criteria to be used in the filter for querying findings.
    */
  var FindingCriteria: js.UndefOr[typings.awsSdk.guarddutyMod.FindingCriteria] = js.native
  
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.native
}
object UpdateFilterRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): UpdateFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterRequest]
  }
  
  @scala.inline
  implicit class UpdateFilterRequestOps[Self <: UpdateFilterRequest] (val x: Self) extends AnyVal {
    
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
    def setFilterName(value: String): Self = this.set("FilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction(value: FilterAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setDescription(value: FilterDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = this.set("FindingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingCriteria: Self = this.set("FindingCriteria", js.undefined)
    
    @scala.inline
    def setRank(value: FilterRank): Self = this.set("Rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("Rank", js.undefined)
  }
}
