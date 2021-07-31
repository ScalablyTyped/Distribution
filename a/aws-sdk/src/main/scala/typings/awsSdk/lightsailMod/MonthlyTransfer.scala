package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonthlyTransfer extends StObject {
  
  /**
    * The amount allocated per month (in GB).
    */
  var gbPerMonthAllocated: js.UndefOr[integer] = js.undefined
}
object MonthlyTransfer {
  
  @scala.inline
  def apply(): MonthlyTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonthlyTransfer]
  }
  
  @scala.inline
  implicit class MonthlyTransferMutableBuilder[Self <: MonthlyTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGbPerMonthAllocated(value: integer): Self = StObject.set(x, "gbPerMonthAllocated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGbPerMonthAllocatedUndefined: Self = StObject.set(x, "gbPerMonthAllocated", js.undefined)
  }
}
