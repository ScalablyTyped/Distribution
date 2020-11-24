package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RightsizingRecommendation extends js.Object {
  
  /**
    * The account that this recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  
  /**
    *  Context regarding the current instance.
    */
  var CurrentInstance: js.UndefOr[typings.awsSdk.costexplorerMod.CurrentInstance] = js.native
  
  /**
    *  Details for modification recommendations. 
    */
  var ModifyRecommendationDetail: js.UndefOr[typings.awsSdk.costexplorerMod.ModifyRecommendationDetail] = js.native
  
  /**
    * Recommendation to either terminate or modify the resource.
    */
  var RightsizingType: js.UndefOr[typings.awsSdk.costexplorerMod.RightsizingType] = js.native
  
  /**
    * Details for termination recommendations.
    */
  var TerminateRecommendationDetail: js.UndefOr[typings.awsSdk.costexplorerMod.TerminateRecommendationDetail] = js.native
}
object RightsizingRecommendation {
  
  @scala.inline
  def apply(): RightsizingRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RightsizingRecommendation]
  }
  
  @scala.inline
  implicit class RightsizingRecommendationOps[Self <: RightsizingRecommendation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: GenericString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setCurrentInstance(value: CurrentInstance): Self = this.set("CurrentInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentInstance: Self = this.set("CurrentInstance", js.undefined)
    
    @scala.inline
    def setModifyRecommendationDetail(value: ModifyRecommendationDetail): Self = this.set("ModifyRecommendationDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifyRecommendationDetail: Self = this.set("ModifyRecommendationDetail", js.undefined)
    
    @scala.inline
    def setRightsizingType(value: RightsizingType): Self = this.set("RightsizingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightsizingType: Self = this.set("RightsizingType", js.undefined)
    
    @scala.inline
    def setTerminateRecommendationDetail(value: TerminateRecommendationDetail): Self = this.set("TerminateRecommendationDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminateRecommendationDetail: Self = this.set("TerminateRecommendationDetail", js.undefined)
  }
}
