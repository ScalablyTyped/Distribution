package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.DiscountUri
import typings.consumerDataStandards.anon.Features
import typings.consumerDataStandards.anon.IncentiveUri
import typings.consumerDataStandards.anon.MinimumValue
import typings.consumerDataStandards.anon.PlanUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoProductDetail
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Bundles the product can be part of
    */
  var bundles: js.UndefOr[js.Array[Features] | Null] = js.undefined
  
  /**
    * Discounts associated to the product
    */
  var discounts: js.UndefOr[js.Array[DiscountUri] | Null] = js.undefined
  
  /**
    * Incentives associated to the product
    */
  var incentives: js.UndefOr[js.Array[IncentiveUri] | Null] = js.undefined
  
  /**
    * Charges for metering included in the plan
    */
  var meteringCharges: js.UndefOr[js.Array[MinimumValue] | Null] = js.undefined
  
  /**
    * Plans associated to the product
    */
  var plans: js.UndefOr[js.Array[PlanUri] | Null] = js.undefined
}
object TelcoProductDetail {
  
  inline def apply(): TelcoProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelcoProductDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoProductDetail] (val x: Self) extends AnyVal {
    
    inline def setBundles(value: js.Array[Features]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesNull: Self = StObject.set(x, "bundles", null)
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setBundlesVarargs(value: Features*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setDiscounts(value: js.Array[DiscountUri]): Self = StObject.set(x, "discounts", value.asInstanceOf[js.Any])
    
    inline def setDiscountsNull: Self = StObject.set(x, "discounts", null)
    
    inline def setDiscountsUndefined: Self = StObject.set(x, "discounts", js.undefined)
    
    inline def setDiscountsVarargs(value: DiscountUri*): Self = StObject.set(x, "discounts", js.Array(value*))
    
    inline def setIncentives(value: js.Array[IncentiveUri]): Self = StObject.set(x, "incentives", value.asInstanceOf[js.Any])
    
    inline def setIncentivesNull: Self = StObject.set(x, "incentives", null)
    
    inline def setIncentivesUndefined: Self = StObject.set(x, "incentives", js.undefined)
    
    inline def setIncentivesVarargs(value: IncentiveUri*): Self = StObject.set(x, "incentives", js.Array(value*))
    
    inline def setMeteringCharges(value: js.Array[MinimumValue]): Self = StObject.set(x, "meteringCharges", value.asInstanceOf[js.Any])
    
    inline def setMeteringChargesNull: Self = StObject.set(x, "meteringCharges", null)
    
    inline def setMeteringChargesUndefined: Self = StObject.set(x, "meteringCharges", js.undefined)
    
    inline def setMeteringChargesVarargs(value: MinimumValue*): Self = StObject.set(x, "meteringCharges", js.Array(value*))
    
    inline def setPlans(value: js.Array[PlanUri]): Self = StObject.set(x, "plans", value.asInstanceOf[js.Any])
    
    inline def setPlansNull: Self = StObject.set(x, "plans", null)
    
    inline def setPlansUndefined: Self = StObject.set(x, "plans", js.undefined)
    
    inline def setPlansVarargs(value: PlanUri*): Self = StObject.set(x, "plans", js.Array(value*))
  }
}
