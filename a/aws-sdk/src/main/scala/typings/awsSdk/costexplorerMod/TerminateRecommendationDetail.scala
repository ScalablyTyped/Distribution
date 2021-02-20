package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateRecommendationDetail extends StObject {
  
  /**
    *  The currency code that AWS used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  
  /**
    *  Estimated savings resulting from modification, on a monthly basis.
    */
  var EstimatedMonthlySavings: js.UndefOr[GenericString] = js.native
}
object TerminateRecommendationDetail {
  
  @scala.inline
  def apply(): TerminateRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateRecommendationDetail]
  }
  
  @scala.inline
  implicit class TerminateRecommendationDetailMutableBuilder[Self <: TerminateRecommendationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: GenericString): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setEstimatedMonthlySavings(value: GenericString): Self = StObject.set(x, "EstimatedMonthlySavings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedMonthlySavingsUndefined: Self = StObject.set(x, "EstimatedMonthlySavings", js.undefined)
  }
}
