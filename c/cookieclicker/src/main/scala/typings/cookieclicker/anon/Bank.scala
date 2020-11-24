package typings.cookieclicker.anon

import typings.cookieclicker.Game.GardenMinigame
import typings.cookieclicker.Game.GrimoireMinigame
import typings.cookieclicker.Game.MinigameObject
import typings.cookieclicker.Game.PantheonMinigame
import typings.cookieclicker.Game.StocksMinigame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bank extends js.Object {
  
  var Bank: MinigameObject[StocksMinigame] = js.native
  
  var Farm: MinigameObject[GardenMinigame] = js.native
  
  var Temple: MinigameObject[PantheonMinigame] = js.native
  
  var `Wizard tower`: MinigameObject[GrimoireMinigame] = js.native
}
object Bank {
  
  @scala.inline
  def apply(
    Bank: MinigameObject[StocksMinigame],
    Farm: MinigameObject[GardenMinigame],
    Temple: MinigameObject[PantheonMinigame],
    `Wizard tower`: MinigameObject[GrimoireMinigame]
  ): Bank = {
    val __obj = js.Dynamic.literal(Bank = Bank.asInstanceOf[js.Any], Farm = Farm.asInstanceOf[js.Any], Temple = Temple.asInstanceOf[js.Any])
    __obj.updateDynamic("Wizard tower")((`Wizard tower`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Bank]
  }
  
  @scala.inline
  implicit class BankOps[Self <: Bank] (val x: Self) extends AnyVal {
    
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
    def setBank(value: MinigameObject[StocksMinigame]): Self = this.set("Bank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFarm(value: MinigameObject[GardenMinigame]): Self = this.set("Farm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemple(value: MinigameObject[PantheonMinigame]): Self = this.set("Temple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setWizard tower`(value: MinigameObject[GrimoireMinigame]): Self = this.set("Wizard tower", value.asInstanceOf[js.Any])
  }
}
