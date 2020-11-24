package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrinklerSave extends js.Object {
  
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
  implicit class WrinklerSaveOps[Self <: WrinklerSave] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountShinies(value: Double): Self = this.set("amountShinies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShinies(value: Double): Self = this.set("shinies", value.asInstanceOf[js.Any])
  }
}
