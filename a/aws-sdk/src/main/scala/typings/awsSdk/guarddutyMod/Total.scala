package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Total extends StObject {
  
  /**
    * The total usage.
    */
  var Amount: js.UndefOr[String] = js.native
  
  /**
    * The currency unit that the amount is given in.
    */
  var Unit: js.UndefOr[String] = js.native
}
object Total {
  
  @scala.inline
  def apply(): Total = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Total]
  }
  
  @scala.inline
  implicit class TotalMutableBuilder[Self <: Total] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
