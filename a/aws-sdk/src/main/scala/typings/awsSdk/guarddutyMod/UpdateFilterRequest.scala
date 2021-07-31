package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFilterRequest extends StObject {
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: js.UndefOr[FilterAction] = js.undefined
  
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.undefined
  
  /**
    * The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
    */
  var DetectorId: typings.awsSdk.guarddutyMod.DetectorId
  
  /**
    * The name of the filter.
    */
  var FilterName: String
  
  /**
    * Represents the criteria to be used in the filter for querying findings.
    */
  var FindingCriteria: js.UndefOr[typings.awsSdk.guarddutyMod.FindingCriteria] = js.undefined
  
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.undefined
}
object UpdateFilterRequest {
  
  @scala.inline
  def apply(DetectorId: DetectorId, FilterName: String): UpdateFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FilterName = FilterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterRequest]
  }
  
  @scala.inline
  implicit class UpdateFilterRequestMutableBuilder[Self <: UpdateFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: FilterAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setDescription(value: FilterDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterName(value: String): Self = StObject.set(x, "FilterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "FindingCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingCriteriaUndefined: Self = StObject.set(x, "FindingCriteria", js.undefined)
    
    @scala.inline
    def setRank(value: FilterRank): Self = StObject.set(x, "Rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "Rank", js.undefined)
  }
}
