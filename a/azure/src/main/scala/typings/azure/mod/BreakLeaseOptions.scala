package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakLeaseOptions extends AccessConditionsOptions {
  
  var leaseBreakPeriod: js.UndefOr[Double] = js.native
}
object BreakLeaseOptions {
  
  @scala.inline
  def apply(): BreakLeaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreakLeaseOptions]
  }
  
  @scala.inline
  implicit class BreakLeaseOptionsMutableBuilder[Self <: BreakLeaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeaseBreakPeriod(value: Double): Self = StObject.set(x, "leaseBreakPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaseBreakPeriodUndefined: Self = StObject.set(x, "leaseBreakPeriod", js.undefined)
  }
}
