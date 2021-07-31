package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightsizingRecommendation extends StObject {
  
  /**
    * The account that this recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.undefined
  
  /**
    *  Context regarding the current instance.
    */
  var CurrentInstance: js.UndefOr[typings.awsSdk.costexplorerMod.CurrentInstance] = js.undefined
  
  /**
    *  Details for modification recommendations. 
    */
  var ModifyRecommendationDetail: js.UndefOr[typings.awsSdk.costexplorerMod.ModifyRecommendationDetail] = js.undefined
  
  /**
    * Recommendation to either terminate or modify the resource.
    */
  var RightsizingType: js.UndefOr[typings.awsSdk.costexplorerMod.RightsizingType] = js.undefined
  
  /**
    * Details for termination recommendations.
    */
  var TerminateRecommendationDetail: js.UndefOr[typings.awsSdk.costexplorerMod.TerminateRecommendationDetail] = js.undefined
}
object RightsizingRecommendation {
  
  @scala.inline
  def apply(): RightsizingRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendation]
  }
  
  @scala.inline
  implicit class RightsizingRecommendationMutableBuilder[Self <: RightsizingRecommendation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: GenericString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    @scala.inline
    def setCurrentInstance(value: CurrentInstance): Self = StObject.set(x, "CurrentInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentInstanceUndefined: Self = StObject.set(x, "CurrentInstance", js.undefined)
    
    @scala.inline
    def setModifyRecommendationDetail(value: ModifyRecommendationDetail): Self = StObject.set(x, "ModifyRecommendationDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyRecommendationDetailUndefined: Self = StObject.set(x, "ModifyRecommendationDetail", js.undefined)
    
    @scala.inline
    def setRightsizingType(value: RightsizingType): Self = StObject.set(x, "RightsizingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightsizingTypeUndefined: Self = StObject.set(x, "RightsizingType", js.undefined)
    
    @scala.inline
    def setTerminateRecommendationDetail(value: TerminateRecommendationDetail): Self = StObject.set(x, "TerminateRecommendationDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateRecommendationDetailUndefined: Self = StObject.set(x, "TerminateRecommendationDetail", js.undefined)
  }
}
