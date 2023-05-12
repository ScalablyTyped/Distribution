package typings.consumerDataStandards.telcoMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Charges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelcoAccountPlanDetail
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var planDetail: Charges
}
object TelcoAccountPlanDetail {
  
  inline def apply(planDetail: Charges): TelcoAccountPlanDetail = {
    val __obj = js.Dynamic.literal(planDetail = planDetail.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelcoAccountPlanDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelcoAccountPlanDetail] (val x: Self) extends AnyVal {
    
    inline def setPlanDetail(value: Charges): Self = StObject.set(x, "planDetail", value.asInstanceOf[js.Any])
  }
}
