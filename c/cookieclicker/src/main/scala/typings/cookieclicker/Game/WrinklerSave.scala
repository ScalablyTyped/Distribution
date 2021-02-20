package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrinklerSave extends StObject {
  
  var amount: Double = js.native
  
  var amountShinies: Double = js.native
  
  var number: Double = js.native
  
  var shinies: Double = js.native
}
object WrinklerSave {
  
  @scala.inline
  def apply(amount: Double, amountShinies: Double, number: Double, shinies: Double): WrinklerSave = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amountShinies = amountShinies.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], shinies = shinies.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrinklerSave]
  }
  
  @scala.inline
  implicit class WrinklerSaveMutableBuilder[Self <: WrinklerSave] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountShinies(value: Double): Self = StObject.set(x, "amountShinies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShinies(value: Double): Self = StObject.set(x, "shinies", value.asInstanceOf[js.Any])
  }
}
