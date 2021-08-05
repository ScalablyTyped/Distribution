package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrinklerSave extends StObject {
  
  var amount: Double
  
  var amountShinies: Double
  
  var number: Double
  
  var shinies: Double
}
object WrinklerSave {
  
  inline def apply(amount: Double, amountShinies: Double, number: Double, shinies: Double): WrinklerSave = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amountShinies = amountShinies.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], shinies = shinies.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrinklerSave]
  }
  
  extension [Self <: WrinklerSave](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountShinies(value: Double): Self = StObject.set(x, "amountShinies", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setShinies(value: Double): Self = StObject.set(x, "shinies", value.asInstanceOf[js.Any])
  }
}
