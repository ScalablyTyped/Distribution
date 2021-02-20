package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fee extends StObject {
  
  /**
    * Amount associated to this fee
    */
  var amount: MoneyHash = js.native
  
  /**
    * Fee beneficiary ("bank", "coinbase", ...)
    */
  var `type`: String = js.native
}
object Fee {
  
  @scala.inline
  def apply(amount: MoneyHash, `type`: String): Fee = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fee]
  }
  
  @scala.inline
  implicit class FeeMutableBuilder[Self <: Fee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: MoneyHash): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
