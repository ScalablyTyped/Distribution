package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuotaPeriod extends StObject {
  
  /**
    * The time unit of a period.
    */
  var PeriodUnit: js.UndefOr[typings.awsSdk.servicequotasMod.PeriodUnit] = js.native
  
  /**
    * The value of a period.
    */
  var PeriodValue: js.UndefOr[typings.awsSdk.servicequotasMod.PeriodValue] = js.native
}
object QuotaPeriod {
  
  @scala.inline
  def apply(): QuotaPeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaPeriod]
  }
  
  @scala.inline
  implicit class QuotaPeriodMutableBuilder[Self <: QuotaPeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPeriodUnit(value: PeriodUnit): Self = StObject.set(x, "PeriodUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodUnitUndefined: Self = StObject.set(x, "PeriodUnit", js.undefined)
    
    @scala.inline
    def setPeriodValue(value: PeriodValue): Self = StObject.set(x, "PeriodValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodValueUndefined: Self = StObject.set(x, "PeriodValue", js.undefined)
  }
}
