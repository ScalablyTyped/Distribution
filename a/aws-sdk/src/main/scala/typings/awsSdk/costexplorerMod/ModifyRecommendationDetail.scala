package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyRecommendationDetail extends StObject {
  
  /**
    * Identifies whether this instance type is the AWS default recommendation.
    */
  var TargetInstances: js.UndefOr[TargetInstancesList] = js.undefined
}
object ModifyRecommendationDetail {
  
  @scala.inline
  def apply(): ModifyRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyRecommendationDetail]
  }
  
  @scala.inline
  implicit class ModifyRecommendationDetailMutableBuilder[Self <: ModifyRecommendationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetInstances(value: TargetInstancesList): Self = StObject.set(x, "TargetInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetInstancesUndefined: Self = StObject.set(x, "TargetInstances", js.undefined)
    
    @scala.inline
    def setTargetInstancesVarargs(value: TargetInstance*): Self = StObject.set(x, "TargetInstances", js.Array(value :_*))
  }
}
